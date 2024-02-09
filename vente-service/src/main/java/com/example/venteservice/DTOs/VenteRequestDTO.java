package com.example.venteservice.DTOs;


import com.example.venteservice.models.Acheteur;
import com.example.venteservice.models.Produit;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class VenteRequestDTO {


    private Integer ida;
    private Integer idp;
    private Integer quantite;
    private Integer mois;
    private Integer annee;
    @Transient
    private Acheteur acheteur;
    @Transient
    private Produit produit;


}
