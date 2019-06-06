package com.htp.prowork.repository;

import com.htp.prowork.domain.Client;

public interface ClientDao extends GenericDao<Client, Long> {

    Client findByName(String name);
}
