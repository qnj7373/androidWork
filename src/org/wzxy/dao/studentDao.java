package org.wzxy.dao;

import org.wzxy.model.entity.Student;
import org.wzxy.until.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 覃能健
 * @create 2020-02
 */
public class studentDao {
    private Student student = null;
    private static Connection connection = null;
    private static Statement statement = null;
    private static PreparedStatement PStatement = null;
    private static ResultSet result = null;

    public List<Student> getAll() {
        List<Student> list = new ArrayList<Student>();
        connection = DBUtil.getConnection();
        try {
            String sql = "SELECT * FROM student WHERE 1=1";
            statement = connection.createStatement();
            result = statement.executeQuery(sql);
            list.clear();
            while (result.next()) {
                student = resultBean(result);
                list.add(student);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtil.close(result, statement, connection);
        }
        return list;
    }


    public boolean add(Student t) {
        boolean ok = true;
        connection = DBUtil.getConnection();
        try {
            String sql = "insert into student(sNo, sName, sSex, sClass, sbirthday) "
                    + " value(?,?,?,?,?)";

            PStatement = connection.prepareStatement(sql);
            int parameterIndex = 1;
            PStatement.setInt(parameterIndex++, t.getsNo());
            PStatement.setString(parameterIndex++, t.getsName());
            PStatement.setString(parameterIndex++, t.getsSex());
            PStatement.setString(parameterIndex++, t.getsClass());
            PStatement.setDate(parameterIndex++, t.getSbirthday());
            PStatement.executeUpdate();
        } catch (SQLException e1) {
            ok = false;
            e1.printStackTrace();
        } finally {
            DBUtil.close(PStatement, connection);
        }
        return ok;
    }

    public boolean delete(Student t) {
        boolean ok = true;
        connection = DBUtil.getConnection();
        try {
            String sql = "delete from student where sNo = '"+t.getsNo()+"'";
                statement = connection.createStatement();
                statement.executeUpdate(sql);
        } catch (SQLException e) {
            ok = false;
            e.printStackTrace();
        } finally {
            DBUtil.close(statement, connection);
        }
        return ok;
    }

    public boolean edit(Student t) {
        boolean ok = true;
        connection = DBUtil.getConnection();
        try {
            String sql = "update student set sName = ?, sSex = ?, sClass = ?, sbirthday = ? WHERE sNo = ?";
            PStatement = connection.prepareStatement(sql);
            int parameterIndex = 1;
            PStatement.setString(parameterIndex++, t.getsName());
            PStatement.setString(parameterIndex++, t.getsSex());
            PStatement.setString(parameterIndex++, t.getsClass());
            PStatement.setDate(parameterIndex++,  t.getSbirthday());
            PStatement.setInt(parameterIndex++, t.getsNo());
            PStatement.executeUpdate();
        } catch (SQLException e) {
            ok = false;
            e.printStackTrace();
        } finally {
            DBUtil.close(PStatement, connection);
        }
        return ok;
    }

    public Student resultBean(ResultSet result) {
        Student student = new Student();
        try {
            student.setsNo(result.getInt("sNo"));
            student.setsName(result.getString("sName"));
            student.setsSex(result.getString("sSex"));
            student.setsClass(result.getString("sClass"));
            student.setSbirthday(result.getDate("sbirthday"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
}
