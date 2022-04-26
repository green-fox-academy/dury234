package com.gfa.webappdi.service.coloringaround;

import com.gfa.webappdi.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

    private Printer printer;

    @Autowired
    BlueColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is blue in color...");
    }
}
