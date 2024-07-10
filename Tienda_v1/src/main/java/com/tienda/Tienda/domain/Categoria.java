package com.tienda.Tienda.domain;
import lombok.Data;
import java.io.Serializable;
@Data 
@Entity 
@Table (name="categoria")

public class Categoria implements Serializable{
  
    private static final long serialVersionUID=1L;
    @Id
  @GeneratedValue (strategy=GenerationType.IDENTITY)
  @Column(name="id_categoria")
    
    id_categoria INT NOT NULL AUTO_INCREMENT,
  private String VARCHAR(30);
  private String ruta_imagen;
  private boolean activo;
}
