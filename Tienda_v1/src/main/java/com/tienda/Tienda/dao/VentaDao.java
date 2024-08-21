package com.tienda.Tienda.dao;

import com.tienda.Tienda.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao  extends JpaRepository <Venta,Long>{
    
}
