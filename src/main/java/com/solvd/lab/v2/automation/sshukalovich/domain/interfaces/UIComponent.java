package com.solvd.lab.v2.automation.sshukalovich.domain.interfaces;


import com.solvd.lab.v2.automation.sshukalovich.domain.coordinate.Point;

public interface UIComponent {
    int getColor();
    void setColor(int color);
    void setCoordinates(Point coordinates);
    String getText();
    Point getCoordinates();
    void setText(String text);
}
