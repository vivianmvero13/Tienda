package com.tienda.Tienda.service.impl;

import com.tienda.Tienda.dao.CategoriaDao;

import com.tienda.Tienda.service.CategoriaService;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;
import com.tienda.Tienda.domain.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    @Autowired
    private CategoriaDao categoriaDao;
    @Override
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(boolean activos){
        var lista=categoriaDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    @Override
    @Transactional(readOnly=true)
    public Categoria getCategoria(Categoria categoria){
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }
    @Override
    @Transactional
    public void save(Categoria categoria){
        categoriaDao.save(categoria);
    }
    @Override
    @Transactional
    public void delete(Categoria categoria){
        categoriaDao.delete(categoria);
    }
}
