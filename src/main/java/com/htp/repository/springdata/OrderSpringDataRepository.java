package com.htp.repository.springdata;

import com.htp.domain.hibernate.HibernateOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderSpringDataRepository extends JpaRepository<HibernateOrder,Long>, CrudRepository<HibernateOrder,Long>, PagingAndSortingRepository<HibernateOrder,Long> {

    List<HibernateOrder> findByAddress(String address);

    @Query("select u from HibernateOrder u")
    List<HibernateOrder> getAllOrders();


    @Query("select u from HibernateOrder u where u.id = :orderid")
    HibernateOrder getOrderSpringDataById(@Param("orderid") Long orderId);
}
