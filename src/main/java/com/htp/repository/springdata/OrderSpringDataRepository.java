package com.htp.repository.springdata;

import com.htp.domain.hibernate.HibOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderSpringDataRepository extends JpaRepository<HibOrder,Long>, CrudRepository<HibOrder,Long>, PagingAndSortingRepository<HibOrder,Long> {

    List<HibOrder> findByAddress(String address);

    @Query("select u from HibOrder u")
    List<HibOrder> getAllOrders();


    @Query("select u from HibOrder u where u.id = :orderid")
    HibOrder getOrderSpringDataById(@Param("orderid") Long orderId);
}
