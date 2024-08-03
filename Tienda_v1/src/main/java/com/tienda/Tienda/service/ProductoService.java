package com.tienda.Tienda.service;
import com.tienda.Tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
    //Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);
    //Se obtiene una producto por medio de ID
    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
}
