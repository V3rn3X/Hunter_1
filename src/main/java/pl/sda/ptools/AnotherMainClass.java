package pl.sda.ptools;

import org.slf4j.LoggerFactory;

public class AnotherMainClass {
    public static void main(String[] args) {
        LoggerFactory
                .getLogger(AnotherMainClass.class)
                .info("The application has started");

        System.out.println("Dziala?" + 1 + 1 );
        int a = 1;
        int b = 2;

        System.out.println(a+b);
    }

}


