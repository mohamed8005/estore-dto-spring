package com.example.venteservice.Service;


import com.example.venteservice.DTOs.VenteRequestDTO;
import com.example.venteservice.DTOs.VenteResponseDTO;
import com.example.venteservice.Mapper.VenteMapperInterface;
import com.example.venteservice.Produit.ProduitFindController;
import com.example.venteservice.acheteur.AcheteurFindController;
import com.example.venteservice.entities.Vente;
import com.example.venteservice.models.Acheteur;
import com.example.venteservice.models.Produit;
import com.example.venteservice.repositories.VenteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class VenteService implements VenteServiceInterface {

    @Autowired
    VenteMapperInterface clientMapperInterface;

    @Autowired
    VenteRepository clientRepository;

    @Autowired
    AcheteurFindController acheteurFindController;
    @Autowired
    ProduitFindController produitFindController;


    @Override
    public void addClient(VenteRequestDTO clientRequestDTO) {

        Vente client = clientMapperInterface.FromClientRequestDTO_2_Client(clientRequestDTO);
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
    public VenteResponseDTO ClientById(Integer id) {

        Vente client = clientRepository.findById(id).get();

        Acheteur a = acheteurFindController.getById(client.getIda());
        Produit b = produitFindController.getById(client.getIdp());
        client.setAcheteur(a);
        client.setProduit(b);
        VenteResponseDTO clientResponseDTO = clientMapperInterface.FromClient_2_ClientResponseDTO(client);
        return clientResponseDTO;
    }

    @Override
    public void Update(Integer id, VenteRequestDTO clientRequestDTO) {

        Vente client1 = clientRepository.findById(id).get();
        Vente client2 = clientMapperInterface.FromClientRequestDTO_2_Client(clientRequestDTO);

        client1.setIdp(client2.getIdp() != null ? client2.getIdp() : client1.getIdp());
        client1.setIda(client2.getIda() != null ? client2.getIda() : client1.getIda());
        client1.setQuantite(client2.getQuantite() != null ? client2.getQuantite() : client1.getQuantite());
        client1.setMois(client2.getMois() != null ? client2.getMois() : client1.getMois());
        client1.setAnnee(client2.getAnnee() != null ? client2.getAnnee() : client1.getAnnee());
        clientRepository.save(client1);

    }

    @Override
    public void DeleteById(Integer id) {
        clientRepository.deleteById(id);

    }

    @Override
    public List<VenteResponseDTO> listClient() {
        List<Vente> clientList = clientRepository.findAll();





        List<VenteResponseDTO> listR = new ArrayList<>();


        for (Vente c : clientList) {

            Acheteur a = acheteurFindController.getById(c.getIda());
            Produit b = produitFindController.getById(c.getIdp());
            c.setAcheteur(a);
            c.setProduit(b);
            VenteResponseDTO clientResponseDTO = clientMapperInterface.FromClient_2_ClientResponseDTO(c);

            listR.add(clientResponseDTO);
        }

        return listR;
    }
}