package com.htp.repository.hibernate;

import com.htp.domain.hibernate.HibernateOrder;
import com.htp.domain.hibernate.TestUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("hibernateOrderDao")
public class HibernateOrderDao implements HibernateOrderIntarface {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;


    @Override
    public List<HibernateOrder> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select tu from HibernateOrder tu", HibernateOrder.class).getResultList();
        }
    }

    @Override
    public HibernateOrder findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public HibernateOrder save(HibernateOrder entity) {
        return null;
    }

    @Override
    public HibernateOrder update(HibernateOrder entity) {
        return null;
    }
}
