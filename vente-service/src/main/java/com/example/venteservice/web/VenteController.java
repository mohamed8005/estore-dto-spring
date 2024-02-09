package com.example.venteservice.web;

import com.example.venteservice.DTOs.VenteRequestDTO;
import com.example.venteservice.DTOs.VenteResponseDTO;
import com.example.venteservice.Produit.ProduitFindController;
import com.example.venteservice.Service.VenteService;
import com.example.venteservice.Service.VenteServiceInterface;
import com.example.venteservice.acheteur.AcheteurFindController;
import com.example.venteservice.entities.Vente;
import com.example.venteservice.models.Acheteur;
import com.example.venteservice.models.Produit;
import com.example.venteservice.repositories.VenteRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class VenteController {

    @Autowired
    VenteRepository venteRepository;
    @Autowired
    AcheteurFindController acheteurFindController;
    @Autowired
    ProduitFindController produitFindController;

    @Autowired
    VenteServiceInterface venteServiceInterface;

    @GetMapping("/vente")
    public List<VenteResponseDTO> getAll(){



        return venteServiceInterface.listClient();
    }


    @PostMapping("/vente")
    public void add(@RequestBody VenteRequestDTO vente){
        venteServiceInterface.addClient(vente);
    }

    @PutMapping("/vente/{id}")
    public void save(@PathVariable ("id") Integer id, @RequestBody VenteRequestDTO a){


        venteServiceInterface.Update(id,a);
    }


    @DeleteMapping("/vente/{id}")
    public void supprimer(@PathVariable ("id") Integer id){
        venteServiceInterface.DeleteById(id);
    }


}
