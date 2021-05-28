package br.com.bootcamp.controller;

import br.com.bootcamp.domain.MorseTranslate;
import br.com.bootcamp.domain.ToRoman;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld() {

        return "Hello World";
    }

    @RequestMapping("/roman/{number}")
    @ResponseBody
    public String intToRoman(@PathVariable int number) {
        String roman = ToRoman.toRoman(number);
        return roman;
    }

    @RequestMapping("/morse/{morse}")
    @ResponseBody
    public String morseTranslate(@PathVariable String morse) {
        String traducao = MorseTranslate.normal(morse);
        return traducao;
    }

}