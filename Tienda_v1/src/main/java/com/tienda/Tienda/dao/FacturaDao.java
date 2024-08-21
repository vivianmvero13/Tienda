
package com.tienda.Tienda.dao;

import com.tienda.Tienda.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDao extends JpaRepository <Factura,Long> {
    
}
