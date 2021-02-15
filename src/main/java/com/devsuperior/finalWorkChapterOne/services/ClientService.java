package com.devsuperior.finalWorkChapterOne.services;

import com.devsuperior.finalWorkChapterOne.dto.ClientDTO;
import com.devsuperior.finalWorkChapterOne.entities.Client;
import com.devsuperior.finalWorkChapterOne.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
        Page<Client> list = repository.findAll(pageRequest);
        return list.map(x -> new ClientDTO(x));
    }
}
