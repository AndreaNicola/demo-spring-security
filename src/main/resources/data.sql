insert into utente_authorities (id, ruolo) values (1, 'USER');
insert into utente_authorities (id, ruolo) values (2, 'ADMIN');
insert into utente (username, password) values ('pippo', 'pluto');
insert into utente_ruoli(utente_username, ruoli_id) values ('pippo' , 1);
insert into utente_ruoli(utente_username, ruoli_id) values ('pippo' , 2);
