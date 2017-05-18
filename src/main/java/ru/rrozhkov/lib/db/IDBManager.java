package ru.rrozhkov.lib.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;

import ru.rrozhkov.lib.convert.IConverter;

public interface IDBManager<A, B> {

	int nextId(String tableName) throws SQLException;

	<T> Collection<T> select(String select,
			IConverter<A, T> converter) throws SQLException;
	
	int insert(String sql, B map)  throws SQLException;
	
	int update(String sql, B map)  throws SQLException;
}