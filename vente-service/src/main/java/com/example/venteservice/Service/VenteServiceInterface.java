package com.example.venteservice.Service;


import com.example.venteservice.DTOs.VenteRequestDTO;
import com.example.venteservice.DTOs.VenteResponseDTO;

import java.util.List;

public interface VenteServiceInterface {

    public void addClient(VenteRequestDTO clientRequestDTO);

    public List<VenteResponseDTO> listClient();

    public VenteResponseDTO ClientById(Integer id);

    public void Update (Integer id , VenteRequestDTO clientRequestDTO);
    public void DeleteById (Integer id);
}
