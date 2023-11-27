package com.br.dentuda.models.dao;

import com.br.dentuda.models.Usuario;
import org.hibernate.SessionFactory;

public class UsuarioDao extends GenericDao<Usuario, Integer> {
    public UsuarioDao(Class persistentClass, SessionFactory sessionFactory) {
        super(persistentClass, sessionFactory);
    }
}
