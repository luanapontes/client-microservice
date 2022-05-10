package com.microservice.client.test.builder;

import com.microservice.client.clientmicroservice.Client;

public class ClientBuilder {

    public static Client.ClientBuilder createClient(){
        return Client.builder()
                .id(2L)
                .name("Test")
                .age(22)
                .contact("(xx) xxxxx-xxxx")
                .email("ex@email.com")
                .gender('F');
    }
}
