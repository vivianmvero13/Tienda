package com.tienda.Tienda.service;
import com.tienda.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    //Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
    //Se obtiene una categoria por medio de ID
    public Categoria getCategoria(Categoria categoria);
    
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);
}
