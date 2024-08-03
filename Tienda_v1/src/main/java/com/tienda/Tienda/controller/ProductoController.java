package com.tienda.Tienda.controller;

import com.tienda.Tienda.domain.Producto;
import com.tienda.Tienda.service.ProductoService;
import com.tienda.Tienda.service.impl.FirebaseStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {         
        var productos = productoService.getProductos(false);        
        model.addAttribute("productos", productos);         
        model.addAttribute("totalProductos", productos.size());         
        return "/producto/listado";     
    }
    @GetMapping("/nuevo")
    public String productoNuevo(Producto producto){
        return "/producto/modifica";
    }
    
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping("/guardar")
    public String productoGuardar(Producto producto, @RequestParam("imagenFile")MultipartFile imagenFile){
        if (!imagenFile.isEmpty()) {
            productoService.save(producto);
            producto.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "producto", 
                            producto.getIdProducto()));
        }
        productoService.save(producto);
        return "redirect:/producto/listado";
    }
}