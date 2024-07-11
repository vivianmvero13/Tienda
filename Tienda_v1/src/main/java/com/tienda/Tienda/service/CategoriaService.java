package com.tienda.Tienda.service;
import com.tienda.Tienda.domain.Categoria;
import java.util.List;
import java.util.List;


public interface CategoriaService {
    //Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
    
}
