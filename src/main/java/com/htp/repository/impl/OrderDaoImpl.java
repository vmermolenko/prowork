package com.htp.repository.impl;

import com.htp.domain.Order;
import com.htp.repository.OrderDao;
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
import java.util.List;
import java.util.Objects;

@Repository
@Transactional
public class OrderDaoImpl implements OrderDao {

    public static final String ID = "id";
    public static final String TYPE = "type";
    public static final String DESCRIPTION = "description";
    public static final String ADDRESS = "address";
    public static final String LATITUDE = "latitude";
    public static final String LONGTITUDE = "longtitude";
    public static final String ID_CLIENT = "id_client";
    public static final String ID_WORKER = "id_worker";
    public static final String COUNT_WORKER = "count_worker";
    public static final String DATE_CREATE = "date_create";
    public static final String DATE_FROM_ORDER = "date_from_order";
    public static final String DATE_TO_ORDER = "date_to_order";
    public static final String ID_WORKER_DATE_TO = "id_worker_date_to";
    public static final String STATUS = "status";
    public static final String PRIORITET = "prioritet";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /*Read from Result Set by column name*/
    private Order getOrderRowMapper(ResultSet resultSet, int i) throws SQLException {
        Order order = new Order();
        order.setId(resultSet.getLong(ID));
        order.setType(resultSet.getLong(TYPE));
        order.setDescription(resultSet.getString(DESCRIPTION));
        order.setAddress(resultSet.getString(ADDRESS));
        order.setLatitude(resultSet.getDouble(LATITUDE));
        order.setLongtitude(resultSet.getDouble(LONGTITUDE));
        order.setIdClient(resultSet.getLong(ID_CLIENT));
        order.setIdWorker(resultSet.getLong(ID_WORKER));
        order.setCountWorker(resultSet.getLong(COUNT_WORKER));
        order.setDateCreate(resultSet.getTimestamp(DATE_CREATE));
        order.setDateFromOrder(resultSet.getTimestamp(DATE_FROM_ORDER));
        order.setDateToOrder(resultSet.getTimestamp(DATE_TO_ORDER));
        order.setIdWorkerDateTo(resultSet.getLong(ID_WORKER_DATE_TO));
        order.setStatus(resultSet.getLong(STATUS));
        order.setPrioritet(resultSet.getLong(PRIORITET));
        return order;
    }
    @Override
    public List<Order> findAll() {
        final String findAllQuery = "select * from prowork.order";
        return namedParameterJdbcTemplate.query(findAllQuery, this::getOrderRowMapper);
    }

    @Override
    public Order findById(Long id) {
        final String findById = "select * from prowork.order t where id = :orderid";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("orderid", id);

        return namedParameterJdbcTemplate.queryForObject(findById, params, this::getOrderRowMapper);

    }

    @Override
    public void delete(Long id) {
        final String delete = "delete from prowork.order where id = :orderid";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("orderid", id);

        namedParameterJdbcTemplate.update(delete, params);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.DEFAULT)
    public Order save(Order entity) {
        final String createQuery = "INSERT INTO prowork.order (type, description, address, latitude, longtitude, id_client, count_worker, date_create, date_from_order, status, prioritet) " +
                "VALUES (:type, :description, :address, :latitude, :longtitude, :idclient, :countworker, :datecreate, :datefromorder, :status, :prioritet)";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("type", entity.getType());
        params.addValue("description", entity.getDescription());
        params.addValue("address", entity.getAddress());
        params.addValue("latitude", entity.getLatitude());
        params.addValue("longtitude", entity.getLongtitude());
        params.addValue("idclient", entity.getIdClient());
        params.addValue("countworker", entity.getCountWorker());
        params.addValue("datecreate", Util.convertTimestampToString(entity.getDateCreate()));
        params.addValue("datefromorder", Util.convertTimestampToString(entity.getDateFromOrder()));
        params.addValue("status", entity.getStatus());
        params.addValue("prioritet", entity.getPrioritet());

        namedParameterJdbcTemplate.update(createQuery, params, keyHolder);

        long createdOrderId = Objects.requireNonNull(keyHolder.getKey()).longValue();

        return findById(createdOrderId);
    }

    @Override
    public Order update(Order entity) {
        final String createQuery = "UPDATE prowork.order SET type = :type, description = :description, address = :address, latitude = :latitude, longtitude = :longtitude, id_client = :id_client, count_worker = :count_worker, date_from_order = :date_from_order, status = :status, prioritet = :prioritet where id = :id";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", entity.getId());
        params.addValue("type", entity.getType());
        params.addValue("description", entity.getDescription());
        params.addValue("address", entity.getAddress());
        params.addValue("latitude", entity.getLatitude());
        params.addValue("longtitude", entity.getLongtitude());
        params.addValue("id_client", entity.getIdClient());
        params.addValue("count_worker", entity.getCountWorker());
        params.addValue("date_from_order", Util.convertTimestampToString(entity.getDateFromOrder()));
        params.addValue("status", entity.getStatus());
        params.addValue("prioritet", entity.getPrioritet());

        namedParameterJdbcTemplate.update(createQuery, params);
        return findById(entity.getId());
    }
}
