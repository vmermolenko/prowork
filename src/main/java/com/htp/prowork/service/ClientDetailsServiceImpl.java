package com.htp.prowork.service;

import com.htp.prowork.domain.Client;
import com.htp.prowork.domain.Role;
import com.htp.prowork.repository.ClientDao;
import com.htp.prowork.repository.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "clientDetailsServiceImpl")
public class ClientDetailsServiceImpl implements UserDetailsService {
    @Autowired
    @Qualifier("clientDaoImpl")
    private ClientDao clientDao;

    @Autowired
    private RoleDao roleDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            Client client = clientDao.findByName(username);
            List<Role> roles = roleDao.getRolesByUserId(client.getId());
            if (client.getId() == null) {
                throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
            } else {
                return new org.springframework.security.core.userdetails.User(
                        client.getName(),
                        client.getPassword(),
                        AuthorityUtils.commaSeparatedStringToAuthorityList(roles.get(0).getRoleName())
                );
            }
        } catch (Exception e) {
            throw new UsernameNotFoundException("User with this login not found");
        }
    }
}
