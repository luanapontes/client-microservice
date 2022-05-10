package com.microservice.client.clientmicroservice.services;

import com.microservice.client.clientmicroservice.Client;
import com.microservice.client.clientmicroservice.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ListAllClientServiceImpl implements ListAllClientService{

    private final ClientRepository clientRepository;

    @Override
    public List<Client> listAll(){
        return clientRepository.findAll();
    }
}
