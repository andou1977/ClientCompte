package com.example.clientcompte.controller;


import com.example.clientcompte.entity.Client;
import com.example.clientcompte.entity.Compte;
import com.example.clientcompte.repository.ClientRepository;
import com.example.clientcompte.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {

    ClientRepository clientRepository;
    ClientService clientService;


    public ClientController(ClientRepository clientRepository, ClientService clientService) {
        this.clientRepository = clientRepository;
        this.clientService = clientService;
    }



    @PostMapping("/saveclient")
    public Client save(@RequestBody Client client){
        return  clientService.saveclient(client);
    }
    @GetMapping ("/listerclient")
    public List<Client> listerclient(){
        return  clientService.listerclient();
    }

    @GetMapping("/client/{id}")
    public Client listclient(int id){
        return clientService.findbyidclient(id);

    }
}
