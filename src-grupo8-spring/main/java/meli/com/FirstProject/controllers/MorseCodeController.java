package meli.com.FirstProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MorseCodeController {

    @GetMapping("/morse/{code}")
    public String convertMorse(@PathVariable String code) {

        String texto = Morse.normal(code);
        return "Tradução: " + texto;
    }


}
