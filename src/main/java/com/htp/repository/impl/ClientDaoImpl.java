package com.htp.repository.impl;

import com.htp.domain.Client;
import com.htp.repository.ClientDao;
import com.htp.tools.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Repository
@Transactional
public class ClientDaoImpl implements ClientDao {

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String PHONE = "phone";
    public static final String MAIL = "mail";
    public static final String PASSWORD = "password";
    public static final String STATUS = "status";
    public static final String STATUSMAIL = "status_mail";
    public static final String DATEFROM = "date_from";
    public static final String DATETO = "date_to";
    public static final String HASH = "hash";
    public static final String PHONECODACTIVATION = "phone_cod_activation";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /*Read from Result Set by column name*/
    private Client getRowMapper(ResultSet resultSet, int i) throws SQLException {
        Client client = new Client();
        client.setId(resultSet.getLong(ID));
        client.setName(resultSet.getString(NAME));
        client.setPhone(resultSet.getString(PHONE));
        client.setMail(resultSet.getString(MAIL));
        client.setPassword(resultSet.getString(PASSWORD));
        client.setStatus(resultSet.getLong(STATUS));
        client.setStatusMail(resultSet.getLong(STATUSMAIL));
        client.setDateFrom(resultSet.getTimestamp(DATEFROM));
        client.setDateTo(resultSet.getTimestamp(DATETO));
        client.setHash(resultSet.getString(HASH));
        client.setPhoneCodActivation(resultSet.getString(PHONECODACTIVATION));
        return client;
    }

    @Override
    public List<Client> findAll() {
        final String findAllQuery = "select * from prowork.client";
        return namedParameterJdbcTemplate.query(findAllQuery, this::getRowMapper);
    }

    @Override
    public Client findById(Long id) {
        final String findById = "select * from prowork.client t where id = :id";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        return namedParameterJdbcTemplate.queryForObject(findById, params, this::getRowMapper);

    }

    @Override
    public void delete(Long id) {
        final String delete = "delete from prowork.client where id = :id";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        namedParameterJdbcTemplate.update(delete, params);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.DEFAULT)
    public Client save(Client entity) {
        final String createQuery = "INSERT INTO prowork.client (name, phone, mail, password, date_from) " +
                "VALUES (:name, :phone, :mail, :password, :date_from)";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", entity.getName());
        params.addValue("phone", entity.getPhone());
        params.addValue("mail", entity.getMail());
        params.addValue("password", entity.getPassword());
        params.addValue("date_from", Util.convertTimestampToString(entity.getDateFrom()));

        namedParameterJdbcTemplate.update(createQuery, params, keyHolder);

        long createdId = Objects.requireNonNull(keyHolder.getKey()).longValue();

        return findById(createdId);
    }

    @Override
    public Client update(Client entity) {
        final String createQuery = "UPDATE prowork.client SET name = :name, phone = :phone, mail = :mail, password = :password, date_from = :date_from where id = :id";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", entity.getId());
        params.addValue("name", entity.getName());
        params.addValue("phone", entity.getPhone());
        params.addValue("mail", entity.getMail());
        params.addValue("password", entity.getPassword());
        params.addValue("date_from", Util.convertTimestampToString(entity.getDateFrom()));


        namedParameterJdbcTemplate.update(createQuery, params);
        return findById(entity.getId());
    }
}
