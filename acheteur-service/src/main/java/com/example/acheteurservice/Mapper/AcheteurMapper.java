package com.example.acheteurservice.Mapper;

import com.example.acheteurservice.DTOs.AcheteurRequestDTO;

import com.example.acheteurservice.DTOs.AcheteurResponseDTO;
import com.example.acheteurservice.entities.Acheteur;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AcheteurMapper implements AcheteurMapperInterface{
    @Override
    public Acheteur FromClientRequestDTO_2_Client(AcheteurRequestDTO clientRequestDTO) {
        Acheteur client =  new Acheteur();
        BeanUtils.copyProperties(clientRequestDTO,client);

        return client;
    }

    @Override
    public AcheteurResponseDTO FromClient_2_ClientResponseDTO(Acheteur client) {
        AcheteurResponseDTO clientResponseDTO = new AcheteurResponseDTO();
        BeanUtils.copyProperties(client,clientResponseDTO);


        return clientResponseDTO;
    }
}
