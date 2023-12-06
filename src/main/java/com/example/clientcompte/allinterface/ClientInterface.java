package com.example.clientcompte.allinterface;

import com.example.clientcompte.entity.Client;

import java.util.List;

public interface ClientInterface {

    Client saveclient(Client client);
    List<Client> listerclient();
}
