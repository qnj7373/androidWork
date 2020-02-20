package org.wzxy.main;

import org.wzxy.dao.studentDao;
import org.wzxy.model.entity.Person;
import org.wzxy.model.entity.Rectangle;
import org.wzxy.model.entity.Student;
import org.wzxy.model.entity.Triangle;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * @author 覃能健
 * @create 2020-02
 */
public class testMain {

    public static  List<Student> getFiveStudents() {
        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student(1, "张三", "男", 19, 96);
        Student student2 = new Student(2, "李四", "男", 20, 97);
        Student student3 = new Student(3, "王五", "男", 21, 98);
        Student student4 = new Student(4, "赵六", "男", 22, 99);
        Student student5 = new Student(5, "彭于晏", "男", 23, 100);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        return students;
    }


        public static  void outPut(List<Student> students){
            for (Student stu:
                    students) {
                System.out.println(stu);
            }
    }

    public static  void getaverage(List<Student> students){
        Double temp=0.0,average=0.0;
        for (Student stu:
        students) {
            temp+=stu.getsAnd();
        }
        average=temp/students.size();
        System.out.println("学生的平均成绩为"+average);

    }

    public static  void getMax(List<Student> students){
        int max=0,lap=0;
        for (Student stu:
                students) {
            if(lap==0){
                max=stu.getsAnd();
                lap=1;
            }
            if(stu.getsAnd()>max){
                max=stu.getsAnd();
            }

        }
        System.out.println("学生成绩中最大值为"+max);

    }

    public static  void getMin(List<Student> students){
        int min=0,lap=0;
        for (Student stu:
                students) {
            if(lap==0){
                min=stu.getsAnd();
                lap=1;
            }
            if(stu.getsAnd()<min){
                min=stu.getsAnd();
            }

        }
        System.out.println("学生成绩中最大值为"+min);

    }

    public static  void calculateRectangleAndTriangle(){
        Rectangle  rectangle = new Rectangle(10.0,10.0);
        Triangle  triangle = new Triangle(6.3,7.8,10.7,10);
        System.out.println("长方形的面积为 "+rectangle.area());
        System.out.println("三角形的面积为 "+triangle.area());
    }

    public static  void testMysql(){
        Date utilDate  =new Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        Student student = new Student(1, "石破天", "男", "一班", sqlDate);
        Student student2 = new Student(1, "石天", "女", "一班", sqlDate);
        studentDao stuDao = new studentDao();
        if( stuDao.add(student)){
            System.out.println("          ");
            System.out.println("增加成功！！！");
            System.out.println("下方查看信息:");
            for (Student stu:
            stuDao.getAll()) {
                System.out.println("学号 "+stu.getsNo());
                System.out.println("姓名 "+stu.getsName());
                System.out.println("姓名 "+stu.getsSex());
            }
        }
        if( stuDao.edit(student2)){
            System.out.println("          ");
            System.out.println("修改成功！！！");
            System.out.println("下方查看信息:");
            for (Student stu:
                    stuDao.getAll()) {
                System.out.println("学号 "+stu.getsNo());
                System.out.println("姓名 "+stu.getsName());
                System.out.println("姓名 "+stu.getsSex());
            }
        }
        if( stuDao.delete(student)){
            System.out.println("          ");
            System.out.println("删除成功！！！");
            System.out.println("下方查看信息:");
            for (Student stu:
                    stuDao.getAll()) {
                System.out.println("学号 "+stu.getsNo());
                System.out.println("姓名 "+stu.getsName());
                System.out.println("姓名 "+stu.getsSex());
            }
        }

    }

    public static  void testIO() throws IOException {
        //1.读取文件
        File file = new File("src\\work4.txt");
        InputStreamReader read = new InputStreamReader(new FileInputStream(file),"GBK");//考虑到编码格式
        BufferedReader bu = new BufferedReader(read);
        String lineText;
        String Text = "";
        JTextArea textarea=new JTextArea();
        while((lineText = bu.readLine()) != null){
            Text=Text+lineText+"\n";
        }
        //创建frame窗口
        textarea.setText(Text);
        JFrame jf = new JFrame("work4文本");
        Container conn = jf.getContentPane();    //得到窗口的容器
        conn.add(textarea);
        jf.setBounds(200, 200, 1800, 600); //设置窗口的属性 窗口位置以及窗口的大小
        jf.setVisible(true);//设置窗口可见
        jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //设置关闭方式 如果不设置的话 似乎关闭窗口之后不会退出程序
        read.close();
    }

    public static void main(String[] args) throws IOException {
        outPut(getFiveStudents());
        getaverage(getFiveStudents());
        getMax(getFiveStudents());
        getMin(getFiveStudents());
        System.out.println("        ");
        calculateRectangleAndTriangle();
        System.out.println("        ");
        testMysql();
        testIO();
    }
}
