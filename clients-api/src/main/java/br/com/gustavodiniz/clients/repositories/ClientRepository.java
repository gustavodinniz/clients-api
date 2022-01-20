package br.com.gustavodiniz.clients.repositories;

import br.com.gustavodiniz.clients.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
