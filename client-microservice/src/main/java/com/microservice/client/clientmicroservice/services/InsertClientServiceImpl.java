package com.microservice.client.clientmicroservice.services;

import com.microservice.client.clientmicroservice.Client;
import com.microservice.client.clientmicroservice.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class InsertClientServiceImpl implements InsertClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client insert(Client client){

        client.setSpecificID(UUID.randomUUID().toString());
        return clientRepository.save(client);
    }
}
