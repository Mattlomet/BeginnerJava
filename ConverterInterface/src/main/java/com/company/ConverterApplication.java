package com.company;

public class ConverterApplication {
    public static void main(String[] args) {

//        instantiate
        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();

//        working example
        converterIf.convertDay(1);
        converterIf.convertMonth(2);

        converterSwitch.convertDay(1);
        converterSwitch.convertMonth(2);

//        error message example
        converterIf.convertDay(14);
        converterIf.convertMonth(16);

        converterSwitch.convertDay(18);
        converterSwitch.convertMonth(20);

    }
}
