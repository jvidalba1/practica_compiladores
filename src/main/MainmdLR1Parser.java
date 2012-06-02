import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void usage() {

        System.err.println("Uso: java MainExprCup expr");
        System.exit(1);
    }

    public static void main(String args[]) {

        if (args.length != 1) {
            usage();
        }

        try {
 CupParser parser = 
                new CupParser(new CupExprCompLexer(new ByteArrayInputStream((new StringBuffer(args[0])).toString().getBytes("UTF-8"))));

            parser.parse();

            System.out.println("Expresión válida: " + args[0]);

        } catch (Exception e) {

            System.err.println(e);
            System.exit(1);
        }
    }
}
