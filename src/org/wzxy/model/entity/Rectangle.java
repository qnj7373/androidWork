package org.wzxy.model.entity;

import com.sun.javafx.geom.Edge;

/**
 * @author 覃能健
 * @create 2020-02
 */
public class Rectangle  extends Polygon{
    private Double longEdge;
    private Double shortEdge;

    public Rectangle(Double longEdge, Double shortEdge) {
        this.longEdge = longEdge;
        this.shortEdge = shortEdge;
    }

    @Override
    public double area() {
        return longEdge*shortEdge;
    }

    public Double getLongEdge() {
        return longEdge;
    }

    public void setLongEdge(Double longEdge) {
        this.longEdge = longEdge;
    }

    public Double getShortEdge() {
        return shortEdge;
    }

    public void setShortEdge(Double shortEdge) {
        this.shortEdge = shortEdge;
    }
}