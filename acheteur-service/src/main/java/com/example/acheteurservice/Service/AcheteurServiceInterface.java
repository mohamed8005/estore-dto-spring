package com.example.acheteurservice.Service;

import com.example.acheteurservice.DTOs.AcheteurRequestDTO;
import com.example.acheteurservice.DTOs.AcheteurResponseDTO;


import java.util.List;

public interface AcheteurServiceInterface {

    public void addClient(AcheteurRequestDTO clientRequestDTO);

    public List<AcheteurResponseDTO> listClient();

    public AcheteurResponseDTO ClientById(Integer id);

    public void Update (Integer id , AcheteurRequestDTO clientRequestDTO);
    public void DeleteById (Integer id);
}
