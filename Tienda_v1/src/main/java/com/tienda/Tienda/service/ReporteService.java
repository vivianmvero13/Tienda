package com.tienda.Tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;


public interface ReporteService {
    public ResponseEntity<Resource>
            generaReporte(String reporte, 
                    Map<String, Object> parametros, 
                    String tipo)throws IOException;
   
}
