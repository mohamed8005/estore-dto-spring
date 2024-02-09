package com.example.acheteurservice.Mapper;


import com.example.acheteurservice.DTOs.AcheteurRequestDTO;
import com.example.acheteurservice.DTOs.AcheteurResponseDTO;
import com.example.acheteurservice.entities.Acheteur;

public interface AcheteurMapperInterface {
    public Acheteur FromClientRequestDTO_2_Client (AcheteurRequestDTO clientRequestDTO);
    public AcheteurResponseDTO FromClient_2_ClientResponseDTO(Acheteur client);
}
