package com.spring.calorias.controller;

import com.spring.calorias.dto.CalculadoraDTO;
import com.spring.calorias.dto.PratoDTO;
import com.spring.calorias.service.CalculadoraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CalculadoraController {
    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @PostMapping
    @RequestMapping("/pratos")
    public ResponseEntity<CalculadoraDTO> show(@RequestBody PratoDTO prato){
        return new ResponseEntity(calculadoraService.calcule(prato), HttpStatus.OK);
    }
}
