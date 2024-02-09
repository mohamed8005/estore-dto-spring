package com.example.acheteurservice;

import com.example.acheteurservice.entities.Acheteur;
import com.example.acheteurservice.repositories.AcheteurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AcheteurServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcheteurServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(AcheteurRepository acheteurRepository){
        return args -> {
            acheteurRepository.save(Acheteur.builder()
                    .nom("Ali Mohammed")
                    .ville("Rabat")
                    .build());

            acheteurRepository.save(Acheteur.builder()
                    .nom("Khaoula Jadimoussa")
                    .ville("Rabat")
                    .build());

            acheteurRepository.save(Acheteur.builder()
                    .nom("Salem salem")
                    .ville("Rabat")
                    .build());

            acheteurRepository.save(Acheteur.builder()
                    .nom("Aya aya")
                    .ville("Rabat")
                    .build());

            acheteurRepository.save(Acheteur.builder()
                    .nom("Jack Pattinson")
                    .ville("Rabat")
                    .build());

            acheteurRepository.save(Acheteur.builder()
                    .nom("Ahmad Khan")
                    .ville("Rabat")
                    .build());

            acheteurRepository.save(Acheteur.builder()
                    .nom("Michel Duchamps")
                    .ville("Rabat")
                    .build());

            acheteurRepository.save(Acheteur.builder()
                    .nom("Julia Robert")
                    .ville("Rabat")
                    .build());

            acheteurRepository.save(Acheteur.builder()
                    .nom("Djamel ALI")
                    .ville("Rabat")
                    .build());

            acheteurRepository.save(Acheteur.builder()
                    .nom("Luisa Clarck")
                    .ville("Rabat")
                    .build());

            List<Acheteur> liste = acheteurRepository.findAll();

            for (Acheteur a:liste){
                System.out.println("*************************");
                System.out.println(a.getNom());
                System.out.println(a.getVille());
            }

        };
    }

}
