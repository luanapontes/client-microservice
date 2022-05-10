package com.microservice.client.clientmicroservice.services;

import com.microservice.client.clientmicroservice.Client;
import com.microservice.client.clientmicroservice.ClientDTO;
import com.microservice.client.clientmicroservice.ClientRepository;
import com.microservice.client.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UpdateClientServiceImpl implements UpdateClientService{

    private final ClientRepository clientRepository;

    @Override
    public void update(ClientDTO clientDTO, Long id){
        Client clientSaved = clientRepository.findById(id).orElseThrow(() ->
                new ObjectNotFoundException("Object not found"));

        clientSaved.setName(clientDTO.getName());
        clientSaved.setAge(clientDTO.getAge());
        clientSaved.setEmail(clientDTO.getEmail());
        clientSaved.setContact(clientDTO.getContact());
        clientSaved.setGender(clientDTO.getGender());
        clientRepository.save(clientSaved);

    }
}
