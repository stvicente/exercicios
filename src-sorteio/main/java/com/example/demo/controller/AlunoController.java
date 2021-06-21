package com.example.demo.controller;

import com.example.demo.entity.AlunoEntity;
import com.example.demo.service.AlunoServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projeto")
public class AlunoController {

    private final AlunoServiceImp alunoService;

    public AlunoController(AlunoServiceImp alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping(path = "/healthcheck")
    public String healthCheck() {
        return "OK";
    }

    @PostMapping(path = "/alunos/create")
    public ResponseEntity<AlunoEntity> addAluno(@RequestBody AlunoEntity alunoEntity){
        return ResponseEntity.ok(alunoService.addAluno(alunoEntity));
    }

    @GetMapping(path = "/alunos/sorteados")
    public List<AlunoEntity> sorteiaAluno(){
        return alunoService.sorteiaAluno();
    }
}
