package org.wzxy.model.entity;

/**
 * @author 覃能健
 * @create 2020-02
 */
public class Triangle extends Polygon {
    private double SideA;
    private double SideB;
    private double SideC;
    private double p;

    @Override
    public double area() {
        if(SideA+SideB>SideC && SideA+SideC>SideB && SideB+SideC>SideA) {
            p=(SideA+SideB+SideC)/2;
            return Math.sqrt(p*((p-SideA)*(p-SideB)*(p-SideC)));
        }
        else {
            System.out.println("所输入数据条件不能构成三角形");
            return -1;
        }

    }

    public Triangle(double sideA, double sideB, double sideC, double p) {
        SideA = sideA;
        SideB = sideB;
        SideC = sideC;
        this.p = p;
    }

    public double getSideA() {
        return SideA;
    }

    public void setSideA(double sideA) {
        SideA = sideA;
    }

    public double getSideB() {
        return SideB;
    }

    public void setSideB(double sideB) {
        SideB = sideB;
    }

    public double getSideC() {
        return SideC;
    }

    public void setSideC(double sideC) {
        SideC = sideC;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }


}
