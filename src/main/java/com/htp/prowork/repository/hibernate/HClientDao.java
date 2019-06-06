package com.htp.prowork.repository.hibernate;

import com.htp.prowork.domain.hibernate.HibClient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("hibernateClientDao")
public class HClientDao implements HClientInterface {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;


    @Override
    public List<HibClient> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select tu from HibClient tu", HibClient.class).getResultList();
        }
    }

    @Override
    public HibClient findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.find(HibClient.class, id);
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
    public HibClient save(HibClient entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            Long newID = (Long) session.save(entity);
            transaction.commit();
            return session.find(HibClient.class, newID);
        }
    }

    @Override
    public HibClient update(HibClient entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.saveOrUpdate(entity);
            transaction.commit();
            return session.find(HibClient.class, entity.getId());
        }
    }
}
