package com.microservice.client.clientmicroservice.services;

import com.microservice.client.clientmicroservice.ClientRepository;
import com.microservice.client.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeleteClientServiceImpl implements DeleteClientService{

    private final ClientRepository clientRepository;

    @Override
    public void delete(Long id){
        if(!clientRepository.existsById(id)){
            throw new ObjectNotFoundException("Object not found");
        }

        clientRepository.deleteById(id);
    }
}
