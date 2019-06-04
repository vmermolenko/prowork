package com.htp.repository.hibernate;

import com.htp.domain.hibernate.HibernateOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
        try (Session session = sessionFactory.openSession()) {
            return session.find(HibernateOrder.class, id);
        }
    }

    @Override
    public void delete(Long id) {
        try (Session session = sessionFactory.openSession()) {


            Transaction tx = session.beginTransaction();
            session.delete(findById(id));
            System.out.println("Object Deleted successfully.....!!");
            tx.commit();
        }

    }

    @Override
    public HibernateOrder save(HibernateOrder entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            Long newOrderID = (Long) session.save(entity);
            transaction.commit();
            return session.find(HibernateOrder.class, newOrderID);
        }
    }

    @Override
    public HibernateOrder update(HibernateOrder entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.saveOrUpdate(entity);
            transaction.commit();
            return session.find(HibernateOrder.class, entity.getId());
        }
    }
}
