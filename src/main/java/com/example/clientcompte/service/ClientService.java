package com.example.clientcompte.service;



import com.example.clientcompte.entity.Client;
import com.example.clientcompte.allinterface.ClientInterface;
import com.example.clientcompte.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements ClientInterface {

    ClientRepository clientRepository;


    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Client saveclient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> listerclient() {
        return clientRepository.findAll();
    }

    public Client findbyidclient(int id) {
        return clientRepository.findClientById(id);
    }
}
