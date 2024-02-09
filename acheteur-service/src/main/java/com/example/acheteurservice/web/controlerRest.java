package com.example.acheteurservice.web;



import com.example.acheteurservice.DTOs.AcheteurRequestDTO;
import com.example.acheteurservice.DTOs.AcheteurResponseDTO;
import com.example.acheteurservice.Service.AcheteurServiceInterface;
import com.example.acheteurservice.entities.Acheteur;
import com.example.acheteurservice.repositories.AcheteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api")
public class controlerRest {


    @Autowired
    AcheteurServiceInterface clientServiceInterface;

    @Autowired
    AcheteurRepository acheteurRepository;

    @GetMapping("/acheteurs")
    public List<AcheteurResponseDTO> getAll(){

        return clientServiceInterface.listClient();
    }

    @GetMapping("/acheteurs/{id}")
    public AcheteurResponseDTO getById(@PathVariable ("id") Integer id){

        return  clientServiceInterface.ClientById(id);
    }

    @PutMapping("/acheteurs/{id}")
    public void save(@PathVariable ("id") Integer id, @RequestBody AcheteurRequestDTO acheteurRequestDTO){
        clientServiceInterface.Update(id,acheteurRequestDTO);
    }

    @PostMapping("/acheteurs")
    public void add(@RequestBody AcheteurRequestDTO a){
        clientServiceInterface.addClient(a);
    }

    @DeleteMapping("/acheteurs/{id}")
    public void supprimer(@PathVariable ("id") Integer id){
        clientServiceInterface.DeleteById(id);
    }

}