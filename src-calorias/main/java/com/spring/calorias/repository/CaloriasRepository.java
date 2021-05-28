package com.spring.calorias.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.calorias.dto.CaloriasDTO;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public class CaloriasRepository {

    public CaloriasDTO findCaloriasByIngredient(String nome){
        List<CaloriasDTO> caloriasDTOS = null;
        caloriasDTOS = loadDataBase();
        CaloriasDTO result = null;
        if(caloriasDTOS != null){
            Optional<CaloriasDTO> item = caloriasDTOS
                                            .stream()
                                            .filter(caloria -> caloria.getNome().equals(nome))
                                            .findFirst();
            if(item.isPresent()) {
                result = item.get();
            }
        }
        return result;
    }

    private List<CaloriasDTO> loadDataBase(){
        File file = null;
        try{
            file = ResourceUtils.getFile("classpath:food.json");
            System.out.println(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<CaloriasDTO>> typeRef = new TypeReference<>() {};
        List<CaloriasDTO> caloriasDTOS = null;
        try {
            caloriasDTOS = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return caloriasDTOS;
    }
}
