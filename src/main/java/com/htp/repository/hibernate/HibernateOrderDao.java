package com.htp.repository.hibernate;

import com.htp.domain.hibernate.HibOrder;
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
    public List<HibOrder> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select tu from HibernateOrder tu", HibOrder.class).getResultList();
        }
    }

    @Override
    public HibOrder findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.find(HibOrder.class, id);
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
    public HibOrder save(HibOrder entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            Long newOrderID = (Long) session.save(entity);
            transaction.commit();
            return session.find(HibOrder.class, newOrderID);
        }
    }

    @Override
    public HibOrder update(HibOrder entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.saveOrUpdate(entity);
            transaction.commit();
            return session.find(HibOrder.class, entity.getId());
        }
    }
}
