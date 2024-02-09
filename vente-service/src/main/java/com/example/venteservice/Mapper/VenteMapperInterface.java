package com.example.venteservice.Mapper;


import com.example.venteservice.DTOs.VenteRequestDTO;
import com.example.venteservice.DTOs.VenteResponseDTO;
import com.example.venteservice.entities.Vente;

public interface VenteMapperInterface {
    public Vente FromClientRequestDTO_2_Client (VenteRequestDTO clientRequestDTO);
    public VenteResponseDTO FromClient_2_ClientResponseDTO(Vente client);
}
