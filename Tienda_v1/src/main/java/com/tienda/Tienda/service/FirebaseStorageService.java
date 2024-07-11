package com.tienda.Tienda.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-d913a.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-d913a-firebase-adminsdk-ngwq4-0bc9eb6cf2.json";
}
