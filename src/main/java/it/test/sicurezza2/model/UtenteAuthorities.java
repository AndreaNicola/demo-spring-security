package it.test.sicurezza2.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class UtenteAuthorities implements GrantedAuthority {

  @Id
  private Integer id;

  private String ruolo;

  @Override
  public String getAuthority() {
    return ruolo;
  }

}
