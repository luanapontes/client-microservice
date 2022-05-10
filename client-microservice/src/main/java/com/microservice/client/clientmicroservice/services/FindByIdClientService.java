package com.microservice.client.clientmicroservice.services;

import com.microservice.client.clientmicroservice.Client;

@FunctionalInterface
public interface FindByIdClientService {

    public Client findById(Long id);
}
