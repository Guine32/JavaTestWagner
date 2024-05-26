package br.com.sigabemfrete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sigabemfrete.dto.FreteRequest;
import br.com.sigabemfrete.dto.FreteResponse;
import br.com.sigabemfrete.service.FreteService;

@RestController
@RequestMapping("/api/frete")
public class FreteController {

    @Autowired
    private FreteService freteService;

    @PostMapping("/calcular")
    public FreteResponse calcularFrete (@RequestBody FreteRequest request) {
        return freteService.calcularFrete(request);
    }

}
