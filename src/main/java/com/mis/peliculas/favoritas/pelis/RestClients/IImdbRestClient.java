package com.mis.peliculas.favoritas.pelis.RestClients;

import org.springframework.stereotype.Component;

@Component
public class IImdbRestClient {

    public String getMedia() {
        return "Respuesta desde IImdbRestClient";
    }
}