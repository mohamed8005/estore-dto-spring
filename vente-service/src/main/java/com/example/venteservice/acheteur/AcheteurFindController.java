package com.example.venteservice.acheteur;


import com.example.venteservice.models.Acheteur;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="ACHETEUR-SERVICE")
public interface AcheteurFindController {

    @GetMapping("/api/acheteurs")
    public List<Acheteur> getAll();

    @GetMapping("/api/acheteurs/{idP}")
    public Acheteur getById(@PathVariable Integer idP);
}
