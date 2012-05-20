// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g 2012-05-19 21:33:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class mdLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int LengTipo=4;
    public static final int ALIASA=5;
    public static final int Fecha=6;
    public static final int Hora=7;
    public static final int UbicacionC=8;
    public static final int Int=9;
    public static final int Bool=10;
    public static final int String=11;

    // delegates
    // delegators

    public mdLexer() {;} 
    public mdLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public mdLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:3:7: ( '$' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:3:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:4:7: ( '.' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:4:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:5:7: ( '$$' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:5:9: '$$'
            {
            match("$$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:6:7: ( '{' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:6:9: '{'
            {
            match('{'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:7:7: ( '}' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:7:9: '}'
            {
            match('}'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:8:7: ( '/' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:8:9: '/'
            {
            match('/'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:9:7: ( '..' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:9:9: '..'
            {
            match(".."); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:10:7: ( 'class' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:10:9: 'class'
            {
            match("class"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:11:7: ( '/class' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:11:9: '/class'
            {
            match("/class"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:12:7: ( ':' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:12:9: ':'
            {
            match(':'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:13:7: ( '~' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:13:9: '~'
            {
            match('~'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:14:7: ( ',' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:14:9: ','
            {
            match(','); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:15:7: ( '+' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:15:9: '+'
            {
            match('+'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:16:7: ( 'nombre' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:16:9: 'nombre'
            {
            match("nombre"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:17:7: ( 'dir' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:17:9: 'dir'
            {
            match("dir"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:18:7: ( '++' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:18:9: '++'
            {
            match("++"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:19:7: ( '#' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:19:9: '#'
            {
            match('#'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:20:7: ( 'in' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:20:9: 'in'
            {
            match("in"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:21:7: ( '/in' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:21:9: '/in'
            {
            match("/in"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:22:7: ( 'out' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:22:9: 'out'
            {
            match("out"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:23:7: ( '/out' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:23:9: '/out'
            {
            match("/out"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:24:7: ( '##' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:24:9: '##'
            {
            match("##"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:25:7: ( '-' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:25:9: '-'
            {
            match('-'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:26:7: ( '||' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:26:9: '||'
            {
            match("||"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:27:7: ( '&&' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:27:9: '&&'
            {
            match("&&"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:28:7: ( '<' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:28:9: '<'
            {
            match('<'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:29:7: ( '<=' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:29:9: '<='
            {
            match("<="); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:30:7: ( '>' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:30:9: '>'
            {
            match('>'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:31:7: ( '>=' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:31:9: '>='
            {
            match(">="); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:32:7: ( '==' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:32:9: '=='
            {
            match("=="); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:33:7: ( '!=' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:33:9: '!='
            {
            match("!="); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:34:7: ( '*' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:34:9: '*'
            {
            match('*'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:35:7: ( '//' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:35:9: '//'
            {
            match("//"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:36:7: ( '!' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:36:9: '!'
            {
            match('!'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:37:7: ( '(' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:37:9: '('
            {
            match('('); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:38:7: ( ')' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:38:9: ')'
            {
            match(')'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:39:7: ( '%=' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:39:9: '%='
            {
            match("%="); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:40:7: ( '=%' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:40:9: '=%'
            {
            match("=%"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:41:7: ( ';' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:41:9: ';'
            {
            match(';'); 

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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:42:7: ( 'else' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:42:9: 'else'
            {
            match("else"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:43:7: ( 'if' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:43:9: 'if'
            {
            match("if"); 


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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:44:7: ( 'while' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:44:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "LengTipo"
    public final void mLengTipo() throws RecognitionException {
        try {
            int _type = LengTipo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:37:10: ( 'int' | 'bool' | 'date' | 'hour' | 'file' | 'class' | 'string' )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'b':
                {
                alt1=2;
                }
                break;
            case 'd':
                {
                alt1=3;
                }
                break;
            case 'h':
                {
                alt1=4;
                }
                break;
            case 'f':
                {
                alt1=5;
                }
                break;
            case 'c':
                {
                alt1=6;
                }
                break;
            case 's':
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:37:12: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:37:20: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:37:29: 'date'
                    {
                    match("date"); 


                    }
                    break;
                case 4 :
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:37:38: 'hour'
                    {
                    match("hour"); 


                    }
                    break;
                case 5 :
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:37:47: 'file'
                    {
                    match("file"); 


                    }
                    break;
                case 6 :
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:37:56: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 7 :
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:37:66: 'string'
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

    // $ANTLR start "Fecha"
    public final void mFecha() throws RecognitionException {
        try {
            int _type = Fecha;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:9: ( ( ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ) )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:11: ( ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
            {
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:11: ( ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:12: ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) '/' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
            {
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:12: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:13: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:22: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            match('/'); 
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:37: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:38: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:47: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:48: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            match('/'); 
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:62: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:63: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:72: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:73: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:82: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:83: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:92: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:48:93: '0' .. '9'
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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:8: ( ( ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) ) )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:10: ( ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) )
            {
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:10: ( ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:11: ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' ) ':' ( '0' .. '9' ) ( '0' .. '9' )
            {
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:11: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:12: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:21: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:22: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            match(':'); 
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:34: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:35: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:44: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:45: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            match(':'); 
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:57: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:58: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:67: ( '0' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:49:68: '0' .. '9'
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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:61:13: ( ( '/' ALIASA )+ '/' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:61:15: ( '/' ALIASA )+ '/'
            {
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:61:15: ( '/' ALIASA )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='/') ) {
                    int LA2_1 = input.LA(2);

                    if ( ((LA2_1>='A' && LA2_1<='Z')||(LA2_1>='a' && LA2_1<='z')) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:61:16: '/' ALIASA
            	    {
            	    match('/'); 
            	    mALIASA(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:91:7: ( ( '1' .. '9' ) ( '0' .. '9' )* )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:91:9: ( '1' .. '9' ) ( '0' .. '9' )*
            {
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:91:9: ( '1' .. '9' )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:91:10: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:91:19: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:91:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:92:8: ( 'true' | 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='t') ) {
                alt4=1;
            }
            else if ( (LA4_0=='f') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:92:10: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:92:19: 'false'
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

    // $ANTLR start "ALIASA"
    public final void mALIASA() throws RecognitionException {
        try {
            int _type = ALIASA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:10: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:12: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:12: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
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
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:13: ( 'a' .. 'z' )
                    {
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:13: ( 'a' .. 'z' )
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:14: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:26: ( 'A' .. 'Z' )
                    {
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:26: ( 'A' .. 'Z' )
                    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:27: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;

            }

            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:37: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
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
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:38: ( 'a' .. 'z' )
            	    {
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:38: ( 'a' .. 'z' )
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:39: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:51: ( 'A' .. 'Z' )
            	    {
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:51: ( 'A' .. 'Z' )
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:52: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:64: ( '0' .. '9' )
            	    {
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:64: ( '0' .. '9' )
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:93:65: '0' .. '9'
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

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:10: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:12: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:12: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop7:
            do {
                int alt7=4;
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
                    alt7=1;
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
                    alt7=2;
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
                    alt7=3;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:13: ( 'a' .. 'z' )
            	    {
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:13: ( 'a' .. 'z' )
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:14: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:24: ( 'A' .. 'Z' )
            	    {
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:24: ( 'A' .. 'Z' )
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:25: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:35: ( '0' .. '9' )
            	    {
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:35: ( '0' .. '9' )
            	    // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:95:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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

    public void mTokens() throws RecognitionException {
        // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | LengTipo | Fecha | Hora | UbicacionC | Int | Bool | ALIASA | String )
        int alt8=50;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:262: LengTipo
                {
                mLengTipo(); 

                }
                break;
            case 44 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:271: Fecha
                {
                mFecha(); 

                }
                break;
            case 45 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:277: Hora
                {
                mHora(); 

                }
                break;
            case 46 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:282: UbicacionC
                {
                mUbicacionC(); 

                }
                break;
            case 47 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:293: Int
                {
                mInt(); 

                }
                break;
            case 48 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:297: Bool
                {
                mBool(); 

                }
                break;
            case 49 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:302: ALIASA
                {
                mALIASA(); 

                }
                break;
            case 50 :
                // /home/jvidalva/Documentos/practica_compiladores/src/gramaticadesc/md.g:1:309: String
                {
                mString(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\47\1\51\1\53\2\uffff\1\60\1\66\3\uffff\1\70\2\66\1\75\2\66\3"+
        "\uffff\1\102\1\104\1\uffff\1\110\5\uffff\6\66\1\121\1\47\3\66\13"+
        "\uffff\4\66\3\uffff\3\66\2\uffff\1\134\1\135\1\66\10\uffff\7\66"+
        "\1\121\1\uffff\1\47\1\66\1\uffff\1\153\1\uffff\2\66\1\157\1\66\1"+
        "\161\2\uffff\1\162\7\66\2\uffff\1\121\1\66\2\uffff\1\174\2\66\1"+
        "\uffff\1\161\2\uffff\1\177\1\66\3\161\2\66\1\u0083\2\uffff\1\u0085"+
        "\1\66\1\uffff\1\u0087\1\u0083\1\66\1\uffff\1\u0089\1\uffff\1\u008a"+
        "\1\uffff\1\161\2\uffff";
    static final String DFA8_eofS =
        "\u008b\uffff";
    static final String DFA8_minS =
        "\1\41\1\44\1\56\2\uffff\1\57\1\60\3\uffff\1\53\2\60\1\43\2\60\3"+
        "\uffff\2\75\1\45\1\75\5\uffff\13\60\5\uffff\3\57\3\uffff\4\60\3"+
        "\uffff\3\60\2\uffff\3\60\10\uffff\7\60\1\57\1\uffff\1\57\1\60\3"+
        "\57\5\60\2\uffff\10\60\2\uffff\2\60\1\57\1\uffff\1\57\2\60\1\uffff"+
        "\1\60\2\uffff\10\60\1\57\1\uffff\2\60\1\uffff\3\60\1\uffff\1\57"+
        "\1\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA8_maxS =
        "\1\176\1\44\1\56\2\uffff\2\172\3\uffff\1\53\2\172\1\43\2\172\3\uffff"+
        "\4\75\5\uffff\7\172\1\71\3\172\5\uffff\3\172\3\uffff\4\172\3\uffff"+
        "\3\172\2\uffff\3\172\10\uffff\10\172\1\uffff\1\72\11\172\2\uffff"+
        "\10\172\2\uffff\3\172\1\uffff\3\172\1\uffff\1\172\2\uffff\11\172"+
        "\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\172\2\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\1\4\1\5\2\uffff\1\12\1\13\1\14\6\uffff\1\27\1\30\1\31\4"+
        "\uffff\1\40\1\43\1\44\1\45\1\47\13\uffff\1\62\1\3\1\1\1\7\1\2\3"+
        "\uffff\1\41\1\6\1\56\4\uffff\1\61\1\20\1\15\3\uffff\1\26\1\21\3"+
        "\uffff\1\33\1\32\1\35\1\34\1\36\1\46\1\37\1\42\10\uffff\1\57\12"+
        "\uffff\1\22\1\51\10\uffff\1\54\1\55\3\uffff\1\23\3\uffff\1\17\1"+
        "\uffff\1\53\1\24\11\uffff\1\25\2\uffff\1\50\3\uffff\1\60\1\uffff"+
        "\1\10\1\uffff\1\52\1\uffff\1\11\1\16";
    static final String DFA8_specialS =
        "\u008b\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\26\1\uffff\1\15\1\1\1\32\1\22\1\uffff\1\30\1\31\1\27\1\12"+
            "\1\11\1\20\1\2\1\5\1\43\11\42\1\7\1\33\1\23\1\25\1\24\2\uffff"+
            "\32\46\6\uffff\1\45\1\36\1\6\1\14\1\34\1\40\1\45\1\37\1\16\4"+
            "\45\1\13\1\17\3\45\1\41\1\44\2\45\1\35\3\45\1\3\1\21\1\4\1\10",
            "\1\50",
            "\1\52",
            "",
            "",
            "\1\57\21\uffff\32\61\6\uffff\2\61\1\54\5\61\1\55\5\61\1\56"+
            "\13\61",
            "\12\65\7\uffff\32\64\6\uffff\13\63\1\62\16\63",
            "",
            "",
            "",
            "\1\67",
            "\12\65\7\uffff\32\64\6\uffff\16\63\1\71\13\63",
            "\12\65\7\uffff\32\64\6\uffff\1\73\7\63\1\72\21\63",
            "\1\74",
            "\12\65\7\uffff\32\64\6\uffff\5\63\1\77\7\63\1\76\14\63",
            "\12\65\7\uffff\32\64\6\uffff\24\63\1\100\5\63",
            "",
            "",
            "",
            "\1\101",
            "\1\103",
            "\1\106\27\uffff\1\105",
            "\1\107",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\64\6\uffff\13\63\1\111\16\63",
            "\12\65\7\uffff\32\64\6\uffff\7\63\1\112\22\63",
            "\12\65\7\uffff\32\64\6\uffff\16\63\1\113\13\63",
            "\12\65\7\uffff\32\64\6\uffff\16\63\1\114\13\63",
            "\12\65\7\uffff\32\64\6\uffff\1\116\7\63\1\115\21\63",
            "\12\65\7\uffff\32\64\6\uffff\23\63\1\117\6\63",
            "\12\120\7\uffff\32\47\6\uffff\32\47",
            "\12\122",
            "\12\65\7\uffff\32\64\6\uffff\21\63\1\123\10\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "",
            "",
            "",
            "",
            "",
            "\13\61\7\uffff\32\61\6\uffff\13\61\1\124\16\61",
            "\13\61\7\uffff\32\61\6\uffff\15\61\1\125\14\61",
            "\13\61\7\uffff\32\61\6\uffff\24\61\1\126\5\61",
            "",
            "",
            "",
            "\12\65\7\uffff\32\64\6\uffff\1\127\31\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "",
            "",
            "",
            "\12\65\7\uffff\32\64\6\uffff\14\63\1\130\15\63",
            "\12\65\7\uffff\32\64\6\uffff\21\63\1\131\10\63",
            "\12\65\7\uffff\32\64\6\uffff\23\63\1\132\6\63",
            "",
            "",
            "\12\65\7\uffff\32\64\6\uffff\23\63\1\133\6\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\23\63\1\136\6\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\64\6\uffff\22\63\1\137\7\63",
            "\12\65\7\uffff\32\64\6\uffff\10\63\1\140\21\63",
            "\12\65\7\uffff\32\64\6\uffff\16\63\1\141\13\63",
            "\12\65\7\uffff\32\64\6\uffff\24\63\1\142\5\63",
            "\12\65\7\uffff\32\64\6\uffff\13\63\1\143\16\63",
            "\12\65\7\uffff\32\64\6\uffff\13\63\1\144\16\63",
            "\12\65\7\uffff\32\64\6\uffff\21\63\1\145\10\63",
            "\1\146\12\150\1\147\6\uffff\32\47\6\uffff\32\47",
            "",
            "\1\146\12\uffff\1\147",
            "\12\65\7\uffff\32\64\6\uffff\24\63\1\151\5\63",
            "\13\61\7\uffff\32\61\6\uffff\1\152\31\61",
            "\13\61\7\uffff\32\61\6\uffff\32\61",
            "\13\61\7\uffff\32\61\6\uffff\23\61\1\154\6\61",
            "\12\65\7\uffff\32\64\6\uffff\22\63\1\155\7\63",
            "\12\65\7\uffff\32\64\6\uffff\1\63\1\156\30\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\4\63\1\160\25\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "",
            "",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\4\63\1\163\25\63",
            "\12\65\7\uffff\32\64\6\uffff\13\63\1\164\16\63",
            "\12\65\7\uffff\32\64\6\uffff\13\63\1\165\16\63",
            "\12\65\7\uffff\32\64\6\uffff\21\63\1\166\10\63",
            "\12\65\7\uffff\32\64\6\uffff\4\63\1\167\25\63",
            "\12\65\7\uffff\32\64\6\uffff\22\63\1\170\7\63",
            "\12\65\7\uffff\32\64\6\uffff\10\63\1\171\21\63",
            "",
            "",
            "\12\150\7\uffff\32\47\6\uffff\32\47",
            "\12\65\7\uffff\32\64\6\uffff\4\63\1\172\25\63",
            "\13\61\7\uffff\32\61\6\uffff\22\61\1\173\7\61",
            "",
            "\13\61\7\uffff\32\61\6\uffff\32\61",
            "\12\65\7\uffff\32\64\6\uffff\22\63\1\175\7\63",
            "\12\65\7\uffff\32\64\6\uffff\21\63\1\176\10\63",
            "",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "",
            "",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\4\63\1\u0080\25\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\4\63\1\u0081\25\63",
            "\12\65\7\uffff\32\64\6\uffff\15\63\1\u0082\14\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\13\61\7\uffff\32\61\6\uffff\22\61\1\u0084\7\61",
            "",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\4\63\1\u0086\25\63",
            "",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "\12\65\7\uffff\32\64\6\uffff\6\63\1\u0088\23\63",
            "",
            "\13\61\7\uffff\32\61\6\uffff\32\61",
            "",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "",
            "\12\65\7\uffff\32\64\6\uffff\32\63",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | LengTipo | Fecha | Hora | UbicacionC | Int | Bool | ALIASA | String );";
        }
    }
 

}