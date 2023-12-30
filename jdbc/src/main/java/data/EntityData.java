package data;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EntityData<T> implements RepositoryPattern<T> {
    private T table;
private boolean showSql =false;
    @Override
    public void add(T data) throws NoSuchFieldException, IllegalAccessException, SQLException {
        Connection con = JDBCInstance.getConnection();
        String query =
                "insert into " + data.getClass().getSimpleName() + " VALUES (default,";
        for (int i = 1; i < data.getClass().getDeclaredFields().length; i++) {
            Field field = data.getClass().getDeclaredField(data.getClass().getDeclaredFields()[i].getName());
            field.setAccessible(true);
            query += "\"" + field.get(data) + "\",";
        }
        query = query.substring(0, query.length() - 1);
        query += ")";
        if(showSql){
            System.out.println(query);

        }
        Statement statement = con.createStatement();
        statement.execute(query);
    }

    @Override
    public List<T> fillAll() throws SQLException {
//        Connection con = JDBCInstance.getConnection();
//        String query = "select * from " + table.getClass().getSimpleName();
//        List<T> result = new ArrayList<>();
//        Statement statement = con.createStatement();
//        ResultSet rs = statement.executeQuery(query);
//        while (rs.next()) {
//            Object ob = new Object();
//
//        }
//        return result;
        return null;
    }

    @Override
    public void delete(T data,int id) throws SQLException {
        Connection con = JDBCInstance.getConnection();
        String query =
                "delete from " + data.getClass().getSimpleName() +
                        " WHERE id =" + id;
        Statement statement = con.createStatement();
        statement.execute(query);

    }

    @Override
    public T update(T data) {
        return null;
    }
}
