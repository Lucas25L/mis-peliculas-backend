package com.mis.peliculas.favoritas.pelis.RestClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mis.peliculas.favoritas.pelis.dto.SearchResponseDto;

@FeignClient(
    name = "IImdbRestClient",
    url = "${restclient.omdb.url}"
)
public interface IImdbRestClient {

    @GetMapping("/")
    public SearchResponseDto getMedia(
        @RequestParam ("s") String search,
        @RequestParam ("apikey") String key
    );
}