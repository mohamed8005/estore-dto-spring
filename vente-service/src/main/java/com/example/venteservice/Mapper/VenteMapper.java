package com.example.venteservice.Mapper;

import com.example.venteservice.DTOs.VenteRequestDTO;
import com.example.venteservice.DTOs.VenteResponseDTO;
import com.example.venteservice.entities.Vente;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class VenteMapper implements VenteMapperInterface {
    @Override
    public Vente FromClientRequestDTO_2_Client(VenteRequestDTO clientRequestDTO) {
        Vente client =  new Vente();
        BeanUtils.copyProperties(clientRequestDTO,client);

        return client;
    }

    @Override
    public VenteResponseDTO FromClient_2_ClientResponseDTO(Vente client) {
        VenteResponseDTO clientResponseDTO = new VenteResponseDTO();
        BeanUtils.copyProperties(client,clientResponseDTO);


        return clientResponseDTO;
    }
}
