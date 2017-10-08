package com.ascend.training.j4qa.basicsyntax.phone;

public interface SmartphoneInterface extends PhoneInterface {

    void touch(int posX, int posY);

    void swipe(int startPosX, int startPosY, int endPosX, int endPosY);

    void pinch(int startPosX1, int startPosY1, int startPosX2, int startPosY2,
               int endPosX1,   int endPosY1,   int endPosX2,   int endPosY2);

}
