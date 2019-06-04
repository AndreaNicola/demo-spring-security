package it.test.sicurezza2.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@Configuration
@RequiredArgsConstructor
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  private final UtenteSecurityService utenteSecurityService;

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(utenteSecurityService).passwordEncoder(NoOpPasswordEncoder.getInstance());
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.sessionManagement().and()
     .httpBasic()
     .and().authorizeRequests().antMatchers("/test1").permitAll()
     .antMatchers("/test2").authenticated();
  }
}
