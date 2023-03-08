package edu.br.femass.femassbank.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.br.femass.femassbank.controller.dto.Movimento;

@RestController
public class MovimentoController {
    

    @GetMapping("/")
    public List<Movimento> getTodos() {
        return Movimento.getMovimentos();
    }
}
