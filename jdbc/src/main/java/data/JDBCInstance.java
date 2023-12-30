package data;

import model.HocSinh;
import model.LopHoc;

import java.lang.reflect.Field;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JDBCInstance {

    public static final String HOSTNAME = "localhost";
    public static final String PORT = "3306";
    public static final String DBNAME = "test1";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "mvmvmv99";

    /**
     * Get connection to MSSQL Server
     *
     * @return Connection
     */
    public static Connection getConnection() {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/"
                + DBNAME;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
        } // Handle any errors that may have occurred.
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) throws SQLException, NoSuchFieldException, IllegalAccessException {
        HocSinh hs = new HocSinh();

        hs.setTenHocSinh("Hiền hâm");
        hs.setNgaySinh(LocalDateTime.now());
//        Field field =hs.getClass().getDeclaredField("tenHocSinh");
//        field.setAccessible(true);
//        System.out.println(field.get(hs));


        RepositoryPattern<HocSinh> hocSinhRepo = new EntityData<>();
//        hocSinhRepo.add(hs);
        hocSinhRepo.delete(hs,4);
        RepositoryPattern<LopHoc> lopHocRepo = new EntityData<>();
        //     lopHocRepo.add(new LopHoc(1,"Lớp của cô Hiền"));
//        hocSinhRepo.add(hs);


//        // tạo kết nối đến csdl
//        Connection con = JDBCInstance.getConnection();
//
//        // tạo query
//        String query = "Select * from hocsinh";
//        // tạo ngữ cảnh kết nối
//        Statement statement = con.createStatement();
//        // thực thi câu query
//        ResultSet rs = statement.executeQuery(query);
//        while (rs.next()) {
//            System.out.println(rs.getString(3));
//        }

//        getConnection();
    }
}
