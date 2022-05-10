package com.microservice.client.clientmicroservice.services;

import com.microservice.client.clientmicroservice.Client;

@FunctionalInterface
public interface InsertClientService {

    public Client insert(Client obj);
}
