package com.example.acheteurservice.DTOs;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AcheteurRequestDTO {

    private String nom;
    private String  ville;


}
