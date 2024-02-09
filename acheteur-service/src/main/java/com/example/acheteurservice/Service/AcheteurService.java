package com.example.acheteurservice.Service;

import com.example.acheteurservice.DTOs.AcheteurRequestDTO;
import com.example.acheteurservice.DTOs.AcheteurResponseDTO;
import com.example.acheteurservice.Mapper.AcheteurMapperInterface;
import com.example.acheteurservice.entities.Acheteur;
import com.example.acheteurservice.repositories.AcheteurRepository;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AcheteurService implements AcheteurServiceInterface {

    @Autowired
    AcheteurMapperInterface clientMapperInterface;

    @Autowired
    AcheteurRepository clientRepository;



    @Override
    public void addClient(AcheteurRequestDTO clientRequestDTO) {

        Acheteur client = clientMapperInterface.FromClientRequestDTO_2_Client(clientRequestDTO);
        clientRepository.save(client);


    }

    /*@Override
    public List<ClientResponseDTO> listClient() {
        List<Client> clientList = clientRepository.findAll();

        List<ClientResponseDTO> listR = new ArrayList<>();

        for (Client  c : clientList)
        {
            ClientResponseDTO responseDTO = clientMapperInterface.FromClient_2_ClientResponseDTO(c);

            listR.add(responseDTO);
        }
        return listR;
    }*/

    @Override
    public AcheteurResponseDTO ClientById(Integer id) {

        Acheteur client = clientRepository.findById(id).get();


        AcheteurResponseDTO clientResponseDTO = clientMapperInterface.FromClient_2_ClientResponseDTO(client);
        return clientResponseDTO;
    }

    @Override
    public void Update(Integer id, AcheteurRequestDTO clientRequestDTO) {

        Acheteur client1 = clientRepository.findById(id).get();
        Acheteur client2 = clientMapperInterface.FromClientRequestDTO_2_Client(clientRequestDTO);

        client1.setNom(client2.getNom() != null ? client2.getNom() : client1.getNom());
        client1.setVille(client2.getVille() != null ? client2.getVille() : client1.getVille());

        clientRepository.save(client1);

    }

    @Override
    public void DeleteById(Integer id) {
        clientRepository.deleteById(id);

    }

    @Override
    public List<AcheteurResponseDTO> listClient() {
        List<Acheteur> clientList = clientRepository.findAll();





        List<AcheteurResponseDTO> listR = new ArrayList<>();


        for (Acheteur c : clientList) {



            AcheteurResponseDTO responseDTO = clientMapperInterface.FromClient_2_ClientResponseDTO(c);
            listR.add(responseDTO);
        }

        return listR;
    }
}