package com.calculadoraidade.calculadora.idade.controller;

import com.calculadoraidade.calculadora.idade.domain.Idade;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class IdadeController {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/idade/{dia}/{mes}/{ano}")
    @ResponseBody
    public int dataToIdade(@PathVariable String dia, @PathVariable String mes, @PathVariable String ano) throws ParseException {
        String data = dia+"/"+mes+"/"+ano;
        System.out.println(data);
        return Idade.resultadoIdade(data);
    }

}