package it.test.sicurezza2.security;

import it.test.sicurezza2.model.Utente;
import it.test.sicurezza2.repositories.UtenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UtenteSecurityService implements UserDetailsService {

  private final UtenteRepository utenteRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    Optional<Utente> optionalUser = utenteRepository.findById(username);

    if (optionalUser.isPresent()) {
      return optionalUser.get();

    } else {
      throw new UsernameNotFoundException(username);
    }

  }

}
