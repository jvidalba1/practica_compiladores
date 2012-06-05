// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g 2012-06-04 23:36:02

	package grammardesc.co.edu.eafit.dis.st0270.PracticaCompiladoresMD.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class defANTLRPracticaCompiladoresMDLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int ALIASA=4;
    public static final int Fecha=5;
    public static final int Hora=6;
    public static final int LengTipo=7;
    public static final int UbicacionC=8;
    public static final int Int=9;
    public static final int Bool=10;
    public static final int String=11;
    public static final int Comentarios=12;
    public static final int NEWLINE=13;
    public static final int WS=14;

    // delegates
    // delegators

    public defANTLRPracticaCompiladoresMDLexer() {;} 
    public defANTLRPracticaCompiladoresMDLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public defANTLRPracticaCompiladoresMDLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:7:7: ( '$' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:7:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:8:7: ( '.' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:8:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:9:7: ( '$$' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:9:9: '$$'
            {
            match("$$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:10:7: ( '^-' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:10:9: '^-'
            {
            match("^-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:11:7: ( '-^' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:11:9: '-^'
            {
            match("-^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:12:7: ( '/' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:12:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:13:7: ( '..' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:13:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:14:7: ( '%' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:14:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:15:7: ( '°' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:15:9: '°'
            {
            match('\u00B0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:16:7: ( '%%' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:16:9: '%%'
            {
            match("%%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:17:7: ( ':' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:18:7: ( '~' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:18:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:19:7: ( ',' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:20:7: ( '¿' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:20:9: '¿'
            {
            match('\u00BF'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:21:7: ( 'nombre' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:21:9: 'nombre'
            {
            match("nombre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:22:7: ( '?' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:22:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:23:7: ( '#' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:23:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:24:7: ( '<<' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:24:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:25:7: ( '>>' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:25:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:26:7: ( '##' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:26:9: '##'
            {
            match("##"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:27:7: ( '-' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:27:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:28:7: ( '||' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:28:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:29:7: ( '&&' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:29:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:30:7: ( '<' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:30:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:31:7: ( '<=' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:31:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:32:7: ( '>' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:32:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:33:7: ( '>=' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:33:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:34:7: ( '==' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:34:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:35:7: ( '!=' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:35:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:36:7: ( '+' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:36:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:37:7: ( '*' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:37:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:7: ( '//' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:9: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:39:7: ( '!' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:39:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:40:7: ( '(' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:40:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:41:7: ( ')' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:41:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:42:7: ( '%=' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:42:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:7: ( '{' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:7: ( '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:45:7: ( '=%' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:45:9: '=%'
            {
            match("=%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:46:7: ( '@' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:46:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:47:7: ( ';' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:47:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:48:7: ( 'else' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:48:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:49:7: ( 'if' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:49:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:50:7: ( 'while' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:50:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "Fecha"
    public final void mFecha() throws RecognitionException {
        try {
            int _type = Fecha;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:9: ( ( ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:11: ( ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:11: ( ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:12: ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:12: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:13: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:22: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            match('/'); 
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:37: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:38: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:47: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:48: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            match('/'); 
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:62: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:63: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:72: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:73: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:82: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:83: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:92: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:43:93: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fecha"

    // $ANTLR start "Hora"
    public final void mHora() throws RecognitionException {
        try {
            int _type = Hora;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:8: ( ( ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:10: ( ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) )
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:10: ( ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:11: ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' )
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:11: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:12: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:21: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:22: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            match(':'); 
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:34: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:35: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:44: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:45: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            match(':'); 
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:57: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:58: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:67: ( '0' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:44:68: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Hora"

    // $ANTLR start "UbicacionC"
    public final void mUbicacionC() throws RecognitionException {
        try {
            int _type = UbicacionC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:56:13: ( ( '/' ALIASA )+ '/' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:56:15: ( '/' ALIASA )+ '/'
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:56:15: ( '/' ALIASA )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='/') ) {
                    int LA1_1 = input.LA(2);

                    if ( ((LA1_1>='A' && LA1_1<='Z')||(LA1_1>='a' && LA1_1<='z')) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:56:16: '/' ALIASA
            	    {
            	    match('/'); 
            	    mALIASA(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UbicacionC"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:86:7: ( ( '1' .. '9' ) ( '0' .. '9' )* )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:86:9: ( '1' .. '9' ) ( '0' .. '9' )*
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:86:9: ( '1' .. '9' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:86:10: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:86:19: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:86:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:87:8: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:87:10: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:87:19: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "LengTipo"
    public final void mLengTipo() throws RecognitionException {
        try {
            int _type = LengTipo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:88:11: ( 'int' | 'bool' | 'date' | 'hour' | 'file' | 'class' | 'string' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt4=1;
                }
                break;
            case 'b':
                {
                alt4=2;
                }
                break;
            case 'd':
                {
                alt4=3;
                }
                break;
            case 'h':
                {
                alt4=4;
                }
                break;
            case 'f':
                {
                alt4=5;
                }
                break;
            case 'c':
                {
                alt4=6;
                }
                break;
            case 's':
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:88:13: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:88:21: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:88:30: 'date'
                    {
                    match("date"); 


                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:88:39: 'hour'
                    {
                    match("hour"); 


                    }
                    break;
                case 5 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:88:48: 'file'
                    {
                    match("file"); 


                    }
                    break;
                case 6 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:88:57: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 7 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:88:67: 'string'
                    {
                    match("string"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LengTipo"

    // $ANTLR start "ALIASA"
    public final void mALIASA() throws RecognitionException {
        try {
            int _type = ALIASA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:10: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:12: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:12: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='a' && LA5_0<='z')) ) {
                alt5=1;
            }
            else if ( ((LA5_0>='A' && LA5_0<='Z')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:13: ( 'a' .. 'z' )
                    {
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:13: ( 'a' .. 'z' )
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:14: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:26: ( 'A' .. 'Z' )
                    {
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:26: ( 'A' .. 'Z' )
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:27: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:37: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt6=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt6=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:38: ( 'a' .. 'z' )
            	    {
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:38: ( 'a' .. 'z' )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:39: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:51: ( 'A' .. 'Z' )
            	    {
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:51: ( 'A' .. 'Z' )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:52: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:64: ( '0' .. '9' )
            	    {
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:64: ( '0' .. '9' )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:89:65: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALIASA"

    // $ANTLR start "Comentarios"
    public final void mComentarios() throws RecognitionException {
        try {
            int _type = Comentarios;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:14: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | ( ' ' | '\\t' ) )* )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:16: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | ( ' ' | '\\t' ) )*
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:16: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='a' && LA7_0<='z')) ) {
                alt7=1;
            }
            else if ( ((LA7_0>='A' && LA7_0<='Z')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:17: ( 'a' .. 'z' )
                    {
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:17: ( 'a' .. 'z' )
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:18: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:30: ( 'A' .. 'Z' )
                    {
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:30: ( 'A' .. 'Z' )
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:31: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:42: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | ( ' ' | '\\t' ) )*
            loop8:
            do {
                int alt8=5;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt8=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt8=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt8=3;
                    }
                    break;
                case '\t':
                case ' ':
                    {
                    alt8=4;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:43: ( 'a' .. 'z' )
            	    {
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:43: ( 'a' .. 'z' )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:44: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:56: ( 'A' .. 'Z' )
            	    {
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:56: ( 'A' .. 'Z' )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:57: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:69: ( '0' .. '9' )
            	    {
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:69: ( '0' .. '9' )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:70: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 4 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:90:82: ( ' ' | '\\t' )
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comentarios"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:10: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:12: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:12: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt9=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt9=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt9=3;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:13: ( 'a' .. 'z' )
            	    {
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:13: ( 'a' .. 'z' )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:14: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:24: ( 'A' .. 'Z' )
            	    {
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:24: ( 'A' .. 'Z' )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:25: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:35: ( '0' .. '9' )
            	    {
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:35: ( '0' .. '9' )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:91:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:107:17: ( ( '\\r' )? ( '\\n' )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:107:25: ( '\\r' )? ( '\\n' )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:107:25: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:107:25: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:107:31: ( '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\n') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:107:31: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:109:17: ( ( ' ' | '\\t' )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:109:25: ( ' ' | '\\t' )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:109:25: ( ' ' | '\\t' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\t'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | Fecha | Hora | UbicacionC | Int | Bool | LengTipo | ALIASA | Comentarios | String | NEWLINE | WS )
        int alt13=55;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:274: Fecha
                {
                mFecha(); 

                }
                break;
            case 46 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:280: Hora
                {
                mHora(); 

                }
                break;
            case 47 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:285: UbicacionC
                {
                mUbicacionC(); 

                }
                break;
            case 48 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:296: Int
                {
                mInt(); 

                }
                break;
            case 49 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:300: Bool
                {
                mBool(); 

                }
                break;
            case 50 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:305: LengTipo
                {
                mLengTipo(); 

                }
                break;
            case 51 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:314: ALIASA
                {
                mALIASA(); 

                }
                break;
            case 52 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:321: Comentarios
                {
                mComentarios(); 

                }
                break;
            case 53 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:333: String
                {
                mString(); 

                }
                break;
            case 54 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:340: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 55 :
                // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:1:348: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\53\1\57\1\61\1\uffff\1\63\1\65\1\71\5\uffff\1\76\1\uffff\1\101"+
        "\1\104\1\107\3\uffff\1\113\10\uffff\3\76\1\121\1\53\11\76\17\uffff"+
        "\4\76\16\uffff\1\76\1\135\2\76\1\121\1\uffff\1\53\12\76\1\uffff"+
        "\1\155\1\76\2\uffff\1\121\11\76\1\170\1\uffff\1\76\1\172\1\76\4"+
        "\155\3\76\1\uffff\1\177\1\uffff\1\172\1\155\1\76\1\u0081\1\uffff"+
        "\1\155\1\uffff";
    static final String DFA13_eofS =
        "\u0082\uffff";
    static final String DFA13_minS =
        "\1\11\1\44\1\56\1\uffff\1\136\1\57\1\45\5\uffff\1\11\1\uffff\1\43"+
        "\1\74\1\75\2\uffff\1\45\1\75\10\uffff\3\11\2\60\11\11\17\uffff\4"+
        "\11\16\uffff\4\11\1\57\1\uffff\1\57\12\11\1\uffff\2\11\2\uffff\1"+
        "\60\12\11\1\uffff\12\11\1\uffff\1\11\1\uffff\4\11\1\uffff\1\11\1"+
        "\uffff";
    static final String DFA13_maxS =
        "\1\u00bf\1\44\1\56\1\uffff\1\136\1\172\1\75\5\uffff\1\172\1\uffff"+
        "\1\43\1\75\1\76\2\uffff\2\75\10\uffff\4\172\1\71\11\172\17\uffff"+
        "\4\172\16\uffff\5\172\1\uffff\1\72\12\172\1\uffff\2\172\2\uffff"+
        "\13\172\1\uffff\12\172\1\uffff\1\172\1\uffff\4\172\1\uffff\1\172"+
        "\1\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\4\3\uffff\1\11\1\13\1\14\1\15\1\16\1\uffff\1\20\3\uffff"+
        "\1\26\1\27\2\uffff\1\36\1\37\1\42\1\43\1\45\1\46\1\50\1\51\16\uffff"+
        "\1\65\1\66\1\67\1\3\1\1\1\7\1\2\1\5\1\25\1\40\1\6\1\57\1\12\1\44"+
        "\1\10\4\uffff\1\63\1\64\1\24\1\21\1\22\1\31\1\30\1\23\1\33\1\32"+
        "\1\34\1\47\1\35\1\41\5\uffff\1\60\13\uffff\1\53\2\uffff\1\55\1\56"+
        "\13\uffff\1\62\12\uffff\1\52\1\uffff\1\61\4\uffff\1\54\1\uffff\1"+
        "\17";
    static final String DFA13_specialS =
        "\u0082\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\55\1\54\2\uffff\1\54\22\uffff\1\55\1\24\1\uffff\1\16\1\1"+
            "\1\6\1\22\1\uffff\1\27\1\30\1\26\1\25\1\12\1\4\1\2\1\5\1\41"+
            "\11\40\1\10\1\34\1\17\1\23\1\20\1\15\1\33\32\52\3\uffff\1\3"+
            "\2\uffff\1\51\1\44\1\47\1\45\1\35\1\43\1\51\1\46\1\36\4\51\1"+
            "\14\4\51\1\50\1\42\2\51\1\37\3\51\1\31\1\21\1\32\1\11\61\uffff"+
            "\1\7\16\uffff\1\13",
            "\1\56",
            "\1\60",
            "",
            "\1\62",
            "\1\64\21\uffff\32\66\6\uffff\32\66",
            "\1\67\27\uffff\1\70",
            "",
            "",
            "",
            "",
            "",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\16"+
            "\73\1\72\13\73",
            "",
            "\1\100",
            "\1\102\1\103",
            "\1\106\1\105",
            "",
            "",
            "\1\111\27\uffff\1\110",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\13"+
            "\73\1\114\16\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\5"+
            "\73\1\115\7\73\1\116\14\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\7"+
            "\73\1\117\22\73",
            "\12\120\7\uffff\32\53\6\uffff\32\53",
            "\12\122",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\21"+
            "\73\1\123\10\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\1"+
            "\124\7\73\1\125\21\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\16"+
            "\73\1\126\13\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\1"+
            "\127\31\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\16"+
            "\73\1\130\13\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\13"+
            "\73\1\131\16\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\23"+
            "\73\1\132\6\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\14"+
            "\73\1\133\15\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\22"+
            "\73\1\134\7\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\23"+
            "\73\1\136\6\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\10"+
            "\73\1\137\21\73",
            "\1\140\12\142\1\141\6\uffff\32\53\6\uffff\32\53",
            "",
            "\1\140\12\uffff\1\141",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\24"+
            "\73\1\143\5\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\13"+
            "\73\1\144\16\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\13"+
            "\73\1\145\16\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\16"+
            "\73\1\146\13\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\23"+
            "\73\1\147\6\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\24"+
            "\73\1\150\5\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\1"+
            "\151\31\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\21"+
            "\73\1\152\10\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\1"+
            "\73\1\153\30\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\4"+
            "\73\1\154\25\73",
            "",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\13"+
            "\73\1\156\16\73",
            "",
            "",
            "\12\142\7\uffff\32\53\6\uffff\32\53",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\4"+
            "\73\1\157\25\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\22"+
            "\73\1\160\7\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\4"+
            "\73\1\161\25\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\13"+
            "\73\1\162\16\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\4"+
            "\73\1\163\25\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\21"+
            "\73\1\164\10\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\22"+
            "\73\1\165\7\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\10"+
            "\73\1\166\21\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\21"+
            "\73\1\167\10\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\4"+
            "\73\1\171\25\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\4"+
            "\73\1\173\25\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\22"+
            "\73\1\174\7\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\15"+
            "\73\1\175\14\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\4"+
            "\73\1\176\25\73",
            "",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\6"+
            "\73\1\u0080\23\73",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            "",
            "\1\77\26\uffff\1\77\17\uffff\12\75\7\uffff\32\74\6\uffff\32"+
            "\73",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | Fecha | Hora | UbicacionC | Int | Bool | LengTipo | ALIASA | Comentarios | String | NEWLINE | WS );";
        }
    }
 

}