package com.microservice.client.clientmicroservice.services;

import com.microservice.client.clientmicroservice.ClientDTO;

@FunctionalInterface
public interface UpdateClientService {

    public void update(ClientDTO clientDTO, Long id);
}
