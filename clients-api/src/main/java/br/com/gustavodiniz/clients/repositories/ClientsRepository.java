package br.com.gustavodiniz.clients.repositories;

import br.com.gustavodiniz.clients.entities.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long> {
}
