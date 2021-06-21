package com.example.demo.service;

import com.example.demo.entity.AlunoEntity;
import com.example.demo.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImp implements AlunoService{
    private final AlunoRepository alunoRepository;

    public AlunoServiceImp(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public AlunoEntity addAluno(AlunoEntity alunoEntity){
        return alunoRepository.save(alunoEntity);
    }

    public List<AlunoEntity> sorteiaAluno(){
        return alunoRepository.sorteiaAluno();
    }
}
