package ru.rrozhkov.lib.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;

import ru.rrozhkov.lib.convert.IConverter;

public interface IDBManager {

	public abstract int nextId(String tableName) throws SQLException;

	public abstract <T> Collection<T> select(String select,
			IConverter<ResultSet, T> converter) throws SQLException;
	
	int insert(String sql, Map<String, Object> map)  throws SQLException;
	
	int update(String sql, Map<String, Object> map)  throws SQLException;

	public abstract ResultSet executeQuery(String query) throws SQLException;

	public abstract int executeUpdate(String query) throws SQLException;

}