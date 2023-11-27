package com.br.dentuda.dentuda.model.dao;

import lombok.Data;
import org.hibernate.tool.schema.spi.SqlScriptException;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {
    T get(int id) throws SQLException;
    List<T> getAll() throws SQLException;
    int save(T t) throws SQLException;
    int update(T t) throws SQLException;
    int delete(T t) throws SQLException;
}
