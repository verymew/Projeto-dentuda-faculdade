package com.br.dentuda.dentuda.model.dao.impl;

import com.br.dentuda.dentuda.model.Usuario;
import com.br.dentuda.dentuda.model.dao.UsuarioDao;

import java.sql.SQLException;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {
    @Override
    public Usuario get(int id) throws SQLException {
        Usuario user = new Usuario();
        return user.;
    }

    @Override
    public List<Usuario> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(Usuario usuario) throws SQLException {
        return 0;
    }

    @Override
    public int update(Usuario usuario) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Usuario usuario) throws SQLException {
        return 0;
    }
}
