package com.example.diploma.diploma.controller;

import com.example.diploma.diploma.domain.Aluno;
import com.example.diploma.diploma.domain.Diploma;
import com.example.diploma.diploma.service.DiplomaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("diplomas")
public class DiplomaController {
    private final DiplomaService diplomaService;

    public DiplomaController(DiplomaService diplomaService) {
        this.diplomaService = diplomaService;
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }
    @PostMapping
    public ResponseEntity<Diploma> show(@RequestBody Aluno aluno){
        return new ResponseEntity(diplomaService.showDiploma(aluno), HttpStatus.OK);
    }
}

