package com.htp.repository.springdata;

import com.htp.domain.hibernate.HibernateOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface OrderSpringDataRepository extends JpaRepository<HibernateOrder,Long>, CrudRepository<HibernateOrder,Long>, PagingAndSortingRepository<HibernateOrder,Long> {

    List<HibernateOrder> findByAddress(String address);
    Optional<HibernateOrder> findById(Long id);
}
