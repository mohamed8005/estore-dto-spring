package com.example.acheteurservice.DTOs;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class AcheteurResponseDTO {

    private Integer idA;
    private String nom;
    private String  ville;



}
