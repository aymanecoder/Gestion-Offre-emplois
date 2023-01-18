package com.example.demo.controllers;

import com.example.demo.Entities.Scrapping;
import com.example.demo.Entities.User;
import com.example.demo.Repository.ScrappingRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.services.ScrapingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
//@RequestMapping()
//@CrossOrigin("*")
public class ScrappingController {

    @Autowired
    private ScrappingRepository scrapingRepository;



    @GetMapping("/webscraping")
    public List<Scrapping>  ScrppingByUrl() {
//        System.out.println("hi");
//        List<Scrapping> result= service.fetchScrapingList().stream().collect(Collectors.toList());
//        System.out.println(result);
      //  scrapingRepository.findAll().forEach(System.out::println);
        // return scrapingRepository.findAll();
            return  scrapingRepository.findAll();
    }

}
