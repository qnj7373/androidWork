package org.wzxy.model.entity;

/**
 * @author 覃能健
 * @create 2020-02
 */
public class Person {

    private int pNo;
    private String pName;
    private String pSex;
    private int pAge;

    public Person() {
        super();
    }

    public Person(int pNo, String pName, String pSex, int pAge) {
        this.pNo = pNo;
        this.pName = pName;
        this.pSex = pSex;
        this.pAge = pAge;
    }

    public int getpNo() {
        return pNo;
    }

    public void setpNo(int pNo) {
        this.pNo = pNo;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex;
    }

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pNo=" + pNo +
                ", pName='" + pName + '\'' +
                ", pSex='" + pSex + '\'' +
                ", pAge=" + pAge +
                '}';
    }
}
