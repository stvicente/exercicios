package com.example.demo.repository;

import com.example.demo.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
    @Query(nativeQuery=true, value="SELECT *  FROM user ORDER BY RAND() LIMIT 10")
    List<AlunoEntity> sorteiaAluno();
}
