package com.tienda.Tienda.dao;

import com.tienda.Tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto, Long>{
    
}
