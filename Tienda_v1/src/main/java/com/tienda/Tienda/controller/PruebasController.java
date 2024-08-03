package com.tienda.Tienda.controller;

import com.tienda.Tienda.domain.Categoria;
import com.tienda.Tienda.service.CategoriaService;
import com.tienda.Tienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pruebas")
public class PruebasController {
    
    @Autowired
    private ProductoService productoService;
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model) {         
        var productos = productoService.getProductos(false); 
        var categorias = categoriaService.getCategorias(false); 
        model.addAttribute("productos", productos);
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalProductos", productos.size());         
        return "/pruebas/listado";     
    }
    
    @GetMapping("/listado/{idCategoria}")
    public String listado(Model model, Categoria categoria) {         
        var productos = categoriaService.getCategoria(categoria).getProductos(); 
        var categorias = categoriaService.getCategorias(false); 
        model.addAttribute("productos", productos);
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalProductos", productos.size());         
        return "/pruebas/listado";     
    }
}
