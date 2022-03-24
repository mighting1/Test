package com.chinese;
/*
走不类
 */

import java.awt.Point;


public class MoveStep implements java.io.Serializable {
    public Point pStart, pEnd;

    public MoveStep(Point p1, Point p2) {
        pStart = p1;
        pEnd = p2;
    }
}