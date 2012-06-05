package src.main;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

import grammardesc.co.edu.eafit.dis.st0270.PracticaCompiladoresMD.parser.DefCupPracticaCompiladoresMD;
import grammardesc.co.edu.eafit.dis.st0270.PracticaCompiladoresMD.lexer.DefJflexPracticaCompiladoresMD;

public class MainPracticaCompiladoresMDLR1Parser {

    public static void usage() {

        System.err.println("Uso: java MainExprCup expr");
        System.exit(1);
    }

    public static void main(String args[]) {

        if (args.length != 1) {
            usage();
        }

        try {
 DefCupPracticaCompiladoresMD parser = 
                new DefCupPracticaCompiladoresMD(new DefJflexPracticaCompiladoresMD(new FileInputStream(args[0])));

            parser.parse();

            System.out.println("Expresión válida: " + args[0]);

        } catch (Exception e) {

            System.err.println(e);
            System.exit(1);
        }
    }
}
