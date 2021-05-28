package com.calculadoram2.calculadoram2.controller;

import com.calculadoram2.calculadoram2.domain.Casa;
import com.calculadoram2.calculadoram2.domain.Info;
import com.calculadoram2.calculadoram2.service.InfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("casas")
public class InfoController {
    private final InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }
    @PostMapping
    public ResponseEntity<Info> show(@RequestBody Casa casa){
        return new ResponseEntity(infoService.showInfo(casa), HttpStatus.OK);
    }
}
