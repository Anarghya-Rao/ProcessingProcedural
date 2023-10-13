package org.example;

import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int FRAME_WIDTH = 1000;
    public static final int FRAME_HEIGHT = 700;
    public static final int DIAMETER = 10;
    public int circle1 = 0;
    public int circle2 = 0;
    public int circle3 = 0;
    public int circle4 = 0;


    public static void main(String[] args){
        PApplet.main("org.example.TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(FRAME_WIDTH, FRAME_HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        drawCircles();
    }

    private void drawCircles() {
        ellipse(circle1, FRAME_HEIGHT / 5, DIAMETER, DIAMETER);
        ellipse(circle2, (FRAME_HEIGHT / 5) * 2, DIAMETER, DIAMETER);
        ellipse(circle3, (FRAME_HEIGHT / 5) * 3, DIAMETER, DIAMETER);
        ellipse(circle4, (FRAME_HEIGHT / 5) * 4, DIAMETER, DIAMETER);

        circle1 += 1;
        circle2 += 2;
        circle3 += 3;
        circle4 += 4;
    }
}
