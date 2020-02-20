package org.wzxy.until;


import java.sql.*;

/**
 * @author 覃能健
 * @create 2020-02
 */
public class DBUtil {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/qnj?useUnicode=true&characterEncoding=utf8&useSSL=false";
    private static final String user = "root";
    private static final String password = "123456";

    private static Connection connection = null;

    public DBUtil() {

    }

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(url,user,password);
        } catch(SQLException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(Statement statement, Connection connection) {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(ResultSet result, Statement statement, Connection connection) {
        try {
            if (result != null) {
                result.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(PreparedStatement PStatement, Connection connection) {
        try {
            if (PStatement != null) {
                PStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void close(ResultSet result, PreparedStatement PStatement, Connection connection) {
        try {
            if (result != null) {
                result.close();
            }
            if (PStatement != null) {
                PStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

}
