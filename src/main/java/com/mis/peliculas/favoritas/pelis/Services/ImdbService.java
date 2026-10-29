package com.mis.peliculas.favoritas.pelis.Services;

import org.springframework.stereotype.Service;

import com.mis.peliculas.favoritas.pelis.RestClients.IImdbRestClient;
import com.mis.peliculas.favoritas.pelis.dto.SearchResponseDto;

@Service
public class ImdbService implements IImdbService {

    // Atributo
    private IImdbRestClient client;

    // Constructor
    public ImdbService (IImdbRestClient client){
        this.client = client;
    }
    // Metodos
    @Override
    public SearchResponseDto getMedia(String text) {
            return client.getMedia(text, "d4560f32");
        };
}