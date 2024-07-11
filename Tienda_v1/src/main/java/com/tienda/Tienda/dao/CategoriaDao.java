package com.tienda.Tienda.dao;

import com.tienda.Tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria, Long>{
    
}
