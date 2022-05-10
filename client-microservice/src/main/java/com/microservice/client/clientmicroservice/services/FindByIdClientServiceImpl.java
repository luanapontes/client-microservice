package com.microservice.client.clientmicroservice.services;

import com.microservice.client.clientmicroservice.Client;
import com.microservice.client.clientmicroservice.ClientRepository;
import com.microservice.client.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FindByIdClientServiceImpl implements FindByIdClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client findById(Long id){
        return clientRepository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Object not found"));
    }
}
