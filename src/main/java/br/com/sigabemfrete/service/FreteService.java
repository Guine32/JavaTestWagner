package br.com.sigabemfrete.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.sigabemfrete.dto.CepResponse;
import br.com.sigabemfrete.dto.FreteRequest;
import br.com.sigabemfrete.dto.FreteResponse;
import br.com.sigabemfrete.entity.Frete;
import br.com.sigabemfrete.repository.FreteRepository;

@Service
public class FreteService {

    @Autowired
    private FreteRepository freteRepository;

    public FreteResponse calcularFrete (FreteRequest request){
        RestTemplate restTemplate = new RestTemplate();
        String urlOrigem = "https://viacep.com.br/ws/" + request.getCepOrigem() + "/json/";
        String urlDestino = "https://viacep.com.br/ws/" + request.getCepDestino() + "/json/";

        CepResponse cepOrigem = restTemplate.getForObject(urlOrigem, CepResponse.class);
        CepResponse cepDestino = restTemplate.getForObject(urlDestino, CepResponse.class);

        double valorFrete = request.getPeso();
        int diasEntrega = 10;

        if (cepOrigem.getDdd().equals(cepDestino.getDdd())) {
            valorFrete *= 0.5;
            diasEntrega = 1;
        } else if (cepOrigem.getUf().equals(cepDestino.getUf())){
            valorFrete *= 0.25;
            diasEntrega = 3;
        }

        LocalDateTime dataPrevistaEntrega = LocalDateTime.now().plusDays(diasEntrega);
        LocalDateTime dataConsulta = LocalDateTime.now();

        Frete frete = new Frete();
        frete.setPeso(request.getPeso());
        frete.setCepOrigem(request.getCepOrigem());
        frete.setCepDestino(request.getCepDestino());
        frete.setNomeDestinatario(request.getNomeDestinatario());
        frete.setVlTotalFrete(valorFrete);
        frete.setDataPrevistaEntrega(dataPrevistaEntrega);
        frete.setDataConsulta(dataConsulta);
        freteRepository.save(frete);

        return new FreteResponse(valorFrete, dataPrevistaEntrega, request.getCepOrigem(), request.getCepDestino());


    }
}
