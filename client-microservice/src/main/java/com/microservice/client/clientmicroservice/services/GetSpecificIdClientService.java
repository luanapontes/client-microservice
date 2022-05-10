package com.microservice.client.clientmicroservice.services;

import com.microservice.client.clientmicroservice.Client;

@FunctionalInterface
public interface GetSpecificIdClientService {
    Client findBySpecificID(String specificID);
}
