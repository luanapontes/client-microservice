package com.microservice.client.clientmicroservice;

import lombok.*;
import org.springframework.data.domain.Page;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDTO implements Serializable {

    private static final long SerialVersionUID = 1L;

    private Long id;

    @NotEmpty(message = "The client name cannot be empty")
    private String name;

    @NotNull(message = "The client age cannot be null")
    private Integer age;

    @NotEmpty(message = "The client contact cannot be empty")
    private String contact;

    @NotEmpty(message = "The client email cannot be empty")
    private String email;

    @NotNull(message = "The client gender cannot be null")
    private char gender;

    private String specificID;

    public static ClientDTO from(Client dto) {
        return ClientDTO
                .builder()
                .id(dto.getId())
                .name(dto.getName())
                .age(dto.getAge())
                .contact(dto.getContact())
                .email(dto.getEmail())
                .gender(dto.getGender())
                .specificID(dto.getSpecificID())
                .build();
    }

    public static List<ClientDTO> fromAll(List<Client> clients) {
        return clients.stream().map(ClientDTO::from).collect(Collectors.toList());
    }

    public static Page<ClientDTO> fromPage(Page<Client> pages) {
        return pages.map(ClientDTO::from);

    }
}
