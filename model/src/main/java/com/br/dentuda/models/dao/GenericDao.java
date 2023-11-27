package com.br.dentuda.models.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

public class GenericDao<T, ID extends Serializable> {
    private final Class<T> persistentClass;
    private final SessionFactory sessionFactory;

    public GenericDao(Class<T> persistentClass, SessionFactory sessionFactory) {
        this.persistentClass = persistentClass;
        this.sessionFactory = sessionFactory;
    }

    public void salvar(T entity) {
        try (Session session = sessionFactory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        }
    }

    public T buscarPorId(ID id) {
        try (Session session = sessionFactory.getCurrentSession()) {
            return session.get(persistentClass, id);
        }
    }

    public List<T> listarTodos() {
        try (Session session = sessionFactory.getCurrentSession()) {
            return session.createQuery("FROM " + persistentClass.getName(), persistentClass).list();
        }
    }

    public void atualizar(T entity) {
        try (Session session = sessionFactory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(entity);
            transaction.commit();
        }
    }

    public void deletar(ID id) {
        try (Session session = sessionFactory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            T entity = session.get(persistentClass, id);
            if (entity != null) {
                session.delete(entity);
            }
            transaction.commit();
        }
    }
}
