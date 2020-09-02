package com.company;

public class App {
    public static void main(String[] args) {

        CalculateObject myCalcObj = new CalculateObject();

        myCalcObj.addTwo(1,1);
        myCalcObj.subtractTwo(23,52);
        myCalcObj.multiplyTwo(34,2);
        myCalcObj.divideTwo(12,3);
        myCalcObj.divideTwo(12,7);


        myCalcObj.addTwo(3.4,2.3);
        myCalcObj.multiplyTwo(6.7,4.4);
        myCalcObj.subtractTwo(5.5,0.5);
        myCalcObj.divideTwo(10.8,2.2);

    }
}
