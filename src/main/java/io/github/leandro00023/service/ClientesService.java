package io.github.leandro00023.service;

import io.github.leandro00023.model.Cliente;
import io.github.leandro00023.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    public ClientesService (ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarClinete(cliente);
         this.repository.persistir(cliente);
    }

    public  void validarClinete(Cliente cliente){
        //aplica validações

    }
}
