package com.microservice.client.clientmicroservice.services;

import com.microservice.client.clientmicroservice.Client;
import com.microservice.client.clientmicroservice.ClientRepository;
import com.microservice.client.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetSpecificIdClientServiceImpl implements GetSpecificIdClientService {

    private final ClientRepository clientRepository;

   @Override
    public Client findBySpecificID(String specificID) {
       return clientRepository.findBySpecificID(specificID).orElseThrow(
               () -> new ObjectNotFoundException("Object not found"));

    }
}
