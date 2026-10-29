package com.mis.peliculas.favoritas.pelis.Services;

import com.mis.peliculas.favoritas.pelis.dto.SearchResponseDto;

public interface IImdbService {

    public SearchResponseDto getMedia(String text);


}