package org.wzxy.model.entity;


import java.sql.Date;

/**
 * @author 覃能健
 * @create 2020-02
 */
public class Student extends  Person {

    private int sAnd;
    private int sNo;
    private String sName;
    private String sSex;
    private String sClass;
    private Date sbirthday;

    public Student() {
        super();
    }

    public Student(int pNo, String pName, String pSex, int pAge, int sAnd) {
        super(pNo, pName, pSex, pAge);
        this.sAnd = sAnd;
    }

    public Student(int sNo, String sName, String sSex, String sClass, Date sbirthday) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sClass = sClass;
        this.sbirthday = sbirthday;
    }

    public Student(int sAnd) {
        this.sAnd = sAnd;
    }

    public int getsAnd() {
        return sAnd;
    }

    public void setsAnd(int sAnd) {
        this.sAnd = sAnd;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public Date getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    @Override
    public String toString() {
        return "Student{"+
                "pNo=" + this.getpNo() +
                ", pName='" + this.getpName() + '\'' +
                ", pSex='" + this.getpSex() + '\'' +
                ", pAge=" + this.getpAge() +
                ", sAnd=" + sAnd +
                '}'
                ;

    }


}
