package com.gfa.webappdi.service.coloringaround;

import com.gfa.webappdi.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;

public class RedColor implements MyColor {
    private Printer printer;

    @Autowired
    RedColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is red in color...");
    }
}
