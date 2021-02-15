package com.devsuperior.finalWorkChapterOne.repository;

import com.devsuperior.finalWorkChapterOne.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
