package com.tienda.Tienda.service.impl;

import com.tienda.Tienda.dao.ProductoDao;

import com.tienda.Tienda.service.ProductoService;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;
import com.tienda.Tienda.domain.Producto;
import org.springframework.data.repository.query.Param;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private ProductoDao productoDao;
    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos(boolean activos){
        var lista=productoDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    @Override
    @Transactional(readOnly=true)
    public Producto getProducto(Producto producto){
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }
    @Override
    @Transactional
    public void save(Producto producto){
        productoDao.save(producto);
    }
    @Override
    @Transactional
    public void delete(Producto producto){
        productoDao.delete(producto);
    }
    
    @Override
    @Transactional(readOnly=true)
     public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup){
       return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
     }
     
     @Override
    @Transactional(readOnly=true)
     public List<Producto> metodoJPQL(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup){
         return productoDao.metodoJPQL(precioInf, precioSup);
     }
     
    @Override
    @Transactional(readOnly=true)
     public List<Producto> metodoNativo(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup){
         return productoDao.metodoNativo(precioInf, precioSup);
     }
}
