package data;

import java.sql.SQLException;
import java.util.List;

public interface RepositoryPattern<T> {
    public void add(T data) throws NoSuchFieldException, IllegalAccessException, SQLException;

    public List<T> fillAll() throws SQLException;

    public void delete(T data, int id) throws SQLException;

    public T update(T data);
}
