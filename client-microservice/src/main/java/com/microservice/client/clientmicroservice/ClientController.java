package com.microservice.client.clientmicroservice;

import com.microservice.client.clientmicroservice.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    private final DeleteClientService deleteClientService;
    private final FindByIdClientService findByIdService;
    private final InsertClientService insertClientService;
    private final ListAllClientService listAllClientService;
    private final UpdateClientService updateClientService;
    private final GetSpecificIdClientService getSpecificIdClientService;

    @GetMapping
    public List<ClientDTO> listAll(){
        return ClientDTO.fromAll(listAllClientService.listAll());
    }

    @GetMapping(value = "{id}")
    public ClientDTO findById(@PathVariable(value="id") Long id){
        return ClientDTO.from(findByIdService.findById(id));
    }

    @GetMapping(value = "/id/{specificID}")
    public ClientDTO findSpecificID(@PathVariable String specificID) {
        return ClientDTO.from(getSpecificIdClientService.findBySpecificID(specificID));
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public void insert(@RequestBody @Valid ClientDTO clientDTO) {
        insertClientService.insert(Client.to(clientDTO));
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PutMapping(value = "/{id}")
    public void update(@Valid @RequestBody ClientDTO clientDTO, @PathVariable Long id){
        updateClientService.update(clientDTO, id);
    }

    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        deleteClientService.delete(id);
    }
}
