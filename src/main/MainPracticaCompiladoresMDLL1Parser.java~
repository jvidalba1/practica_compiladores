package src.main;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.ANTLRFileStream;

import grammardesc.co.edu.eafit.dis.st0270.PracticaCompiladoresMD.parser.defANTLRPracticaCompiladoresMDLexer;
import grammardesc.co.edu.eafit.dis.st0270.PracticaCompiladoresMD.parser.defANTLRPracticaCompiladoresMDParser;

public class MainPracticaCompiladoresMDLL1Parser {
    
    public static void usage() 
    {
        System.err.println("Uso: java MainExprAntrl expr");
        System.exit(1);
    }
    public static void main(String[] args) 
    {
        if (args.length != 1) 
        {
            usage();
        }       
        try 
        {          
            ANTLRFileStream input=new ANTLRFileStream(args[0]);
            defANTLRPracticaCompiladoresMDLexer lexer = new defANTLRPracticaCompiladoresMDLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            defANTLRPracticaCompiladoresMDParser parser = new defANTLRPracticaCompiladoresMDParser(tokens);
            parser.prog();

            System.out.println("Expresión válida: " + args[0]);

        } 
        catch (RecognitionException re) 
        {
            System.out.println("Expresión inválida: " + args[0] + 
                                " en la columna: " +re.c + " fila: " + re.line + " " + 
                                "token: " + re.token.getText()); 
            System.exit(1);
        } 
        catch (Exception e) 
        {

            System.err.println(e);
            System.exit(1);
        }
       
    }
}
