package com.mis.peliculas.favoritas.pelis.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mis.peliculas.favoritas.pelis.Services.IImdbService;

@RestController
public class ImdbController {

    @Autowired
    private IImdbService service;

    @GetMapping("/v1/search")
    public String getMedia() {
        return service.getMedia();
    }
}