package com.gfa.webappdi;

import com.gfa.webappdi.service.Printer;
import com.gfa.webappdi.service.coloringaround.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebAppDiApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor myColor;

    @Autowired
    WebAppDiApplication(Printer printer, MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(WebAppDiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("first message");
        myColor.printColor();
    }
}
