package com.mis.peliculas.favoritas.pelis.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mis.peliculas.favoritas.pelis.RestClients.IImdbRestClient;

@Service
public class ImdbService implements IImdbService {

    @Autowired
    private IImdbRestClient client;

    @Override
    public String getMedia() {
        return client.getMedia();
    }
}