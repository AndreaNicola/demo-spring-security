package it.test.sicurezza2.repositories;

import it.test.sicurezza2.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UtenteRepository extends JpaRepository<Utente, String> {
}
