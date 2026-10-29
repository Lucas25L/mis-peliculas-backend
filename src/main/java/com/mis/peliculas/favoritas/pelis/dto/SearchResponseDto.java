package com.mis.peliculas.favoritas.pelis.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SearchResponseDto {

    @JsonProperty("Search")
    private List<SearchResultDto> search;

    @JsonProperty("totalResults")
    private String totalResults;

    @JsonProperty("Response")
    private String response;
}