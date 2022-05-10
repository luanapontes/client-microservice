package com.microservice.client.clientmicroservice.services;

import com.microservice.client.clientmicroservice.Client;

import java.util.List;

@FunctionalInterface
public interface ListAllClientService {

    List<Client> listAll();
}
