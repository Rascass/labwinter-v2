package com.solvd.lab.v2.automation.sshukalovich.domain.button;


import com.solvd.lab.v2.automation.sshukalovich.domain.base.BaseUIComponent;
import com.solvd.lab.v2.automation.sshukalovich.domain.coordinate.Point;
import com.solvd.lab.v2.automation.sshukalovich.domain.interfaces.Button;

import java.io.Serializable;

public final class RegularButton extends BaseUIComponent implements Button, Serializable {
    private int width;
    private int height;

//    public RegularButton() {
//        super();
//    }

    public RegularButton(int color, Point coordinates, String text, int width, int height) {
        super(color, coordinates, text);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void click() {

    }
}
