// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g 2012-06-04 23:36:01

	package grammardesc.co.edu.eafit.dis.st0270.PracticaCompiladoresMD.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class defANTLRPracticaCompiladoresMDParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIASA", "Fecha", "Hora", "LengTipo", "UbicacionC", "Int", "Bool", "String", "Comentarios", "NEWLINE", "WS", "'$'", "'.'", "'$$'", "'^-'", "'-^'", "'/'", "'..'", "'%'", "'°'", "'%%'", "':'", "'~'", "','", "'¿'", "'nombre'", "'?'", "'#'", "'<<'", "'>>'", "'##'", "'-'", "'||'", "'&&'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'+'", "'*'", "'//'", "'!'", "'('", "')'", "'%='", "'{'", "'}'", "'=%'", "'@'", "';'", "'else'", "'if'", "'while'"
    };
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


        public defANTLRPracticaCompiladoresMDParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public defANTLRPracticaCompiladoresMDParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return defANTLRPracticaCompiladoresMDParser.tokenNames; }
    public String getGrammarFileName() { return "/home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g"; }


        protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
        throws RecognitionException
        {
            throw new MismatchedTokenException(ttype, input);
        }




    // $ANTLR start "prog"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:27:1: prog : defANTLRPracticaCompiladoresMD EOF ;
    public final void prog() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:27:11: ( defANTLRPracticaCompiladoresMD EOF )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:27:19: defANTLRPracticaCompiladoresMD EOF
            {
            pushFollow(FOLLOW_defANTLRPracticaCompiladoresMD_in_prog70);
            defANTLRPracticaCompiladoresMD();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_prog72); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "defANTLRPracticaCompiladoresMD"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:28:1: defANTLRPracticaCompiladoresMD : ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+ ;
    public final void defANTLRPracticaCompiladoresMD() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:28:33: ( ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:28:35: ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:28:35: ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+
            int cnt1=0;
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt1=1;
                    }
                    break;
                case 22:
                    {
                    alt1=2;
                    }
                    break;
                case 28:
                    {
                    alt1=3;
                    }
                    break;
                case 50:
                    {
                    alt1=4;
                    }
                    break;
                case 31:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:28:37: listLengArchivo
            	    {
            	    pushFollow(FOLLOW_listLengArchivo_in_defANTLRPracticaCompiladoresMD82);
            	    listLengArchivo();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:28:55: listLengClases
            	    {
            	    pushFollow(FOLLOW_listLengClases_in_defANTLRPracticaCompiladoresMD86);
            	    listLengClases();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:28:72: listLengComandos
            	    {
            	    pushFollow(FOLLOW_listLengComandos_in_defANTLRPracticaCompiladoresMD90);
            	    listLengComandos();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:28:91: listLengFns
            	    {
            	    pushFollow(FOLLOW_listLengFns_in_defANTLRPracticaCompiladoresMD94);
            	    listLengFns();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:28:105: listLengApp
            	    {
            	    pushFollow(FOLLOW_listLengApp_in_defANTLRPracticaCompiladoresMD98);
            	    listLengApp();

            	    state._fsp--;


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


            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "defANTLRPracticaCompiladoresMD"


    // $ANTLR start "listLengArchivo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:37:1: listLengArchivo : '$' ALIASA '.' ALIASA opcionesA '$$' ;
    public final void listLengArchivo() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:37:18: ( '$' ALIASA '.' ALIASA opcionesA '$$' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:37:20: '$' ALIASA '.' ALIASA opcionesA '$$'
            {
            match(input,15,FOLLOW_15_in_listLengArchivo117); 
            match(input,ALIASA,FOLLOW_ALIASA_in_listLengArchivo119); 
            match(input,16,FOLLOW_16_in_listLengArchivo121); 
            match(input,ALIASA,FOLLOW_ALIASA_in_listLengArchivo123); 
            pushFollow(FOLLOW_opcionesA_in_listLengArchivo125);
            opcionesA();

            state._fsp--;

            match(input,17,FOLLOW_17_in_listLengArchivo127); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "listLengArchivo"


    // $ANTLR start "opcionesA"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:1: opcionesA : '^-' ( ubicacionA | ) ( Fecha | ) ( Hora | ) '-^' ;
    public final void opcionesA() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:12: ( '^-' ( ubicacionA | ) ( Fecha | ) ( Hora | ) '-^' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:14: '^-' ( ubicacionA | ) ( Fecha | ) ( Hora | ) '-^'
            {
            match(input,18,FOLLOW_18_in_opcionesA135); 
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:19: ( ubicacionA | )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16||(LA2_0>=20 && LA2_0<=21)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=Fecha && LA2_0<=Hora)||LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:20: ubicacionA
                    {
                    pushFollow(FOLLOW_ubicacionA_in_opcionesA138);
                    ubicacionA();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:33: 
                    {
                    }
                    break;

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:35: ( Fecha | )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Fecha) ) {
                alt3=1;
            }
            else if ( (LA3_0==Hora||LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:36: Fecha
                    {
                    match(input,Fecha,FOLLOW_Fecha_in_opcionesA145); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:44: 
                    {
                    }
                    break;

            }

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:46: ( Hora | )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Hora) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:47: Hora
                    {
                    match(input,Hora,FOLLOW_Hora_in_opcionesA152); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:38:54: 
                    {
                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_opcionesA158); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "opcionesA"


    // $ANTLR start "ubicacionA"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:39:1: ubicacionA : ( relativa | ( '/' ALIASA )+ );
    public final void ubicacionA() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:39:13: ( relativa | ( '/' ALIASA )+ )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16||LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:39:15: relativa
                    {
                    pushFollow(FOLLOW_relativa_in_ubicacionA166);
                    relativa();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:39:26: ( '/' ALIASA )+
                    {
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:39:26: ( '/' ALIASA )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:39:27: '/' ALIASA
                    	    {
                    	    match(input,20,FOLLOW_20_in_ubicacionA171); 
                    	    match(input,ALIASA,FOLLOW_ALIASA_in_ubicacionA172); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "ubicacionA"


    // $ANTLR start "relativa"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:41:1: relativa : ( '.' ( '/' ALIASA )+ | '..' ( '/' ALIASA )+ );
    public final void relativa() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:41:11: ( '.' ( '/' ALIASA )+ | '..' ( '/' ALIASA )+ )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:41:13: '.' ( '/' ALIASA )+
                    {
                    match(input,16,FOLLOW_16_in_relativa183); 
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:41:16: ( '/' ALIASA )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:41:17: '/' ALIASA
                    	    {
                    	    match(input,20,FOLLOW_20_in_relativa185); 
                    	    match(input,ALIASA,FOLLOW_ALIASA_in_relativa186); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:41:31: '..' ( '/' ALIASA )+
                    {
                    match(input,21,FOLLOW_21_in_relativa192); 
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:41:35: ( '/' ALIASA )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:41:36: '/' ALIASA
                    	    {
                    	    match(input,20,FOLLOW_20_in_relativa194); 
                    	    match(input,ALIASA,FOLLOW_ALIASA_in_relativa195); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "relativa"


    // $ANTLR start "listLengClases"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:48:1: listLengClases : '%' ALIASA '°' ALIASA '°' propiedad '%%' ;
    public final void listLengClases() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:48:17: ( '%' ALIASA '°' ALIASA '°' propiedad '%%' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:48:19: '%' ALIASA '°' ALIASA '°' propiedad '%%'
            {
            match(input,22,FOLLOW_22_in_listLengClases307); 
            match(input,ALIASA,FOLLOW_ALIASA_in_listLengClases309); 
            match(input,23,FOLLOW_23_in_listLengClases311); 
            match(input,ALIASA,FOLLOW_ALIASA_in_listLengClases313); 
            match(input,23,FOLLOW_23_in_listLengClases315); 
            pushFollow(FOLLOW_propiedad_in_listLengClases317);
            propiedad();

            state._fsp--;

            match(input,24,FOLLOW_24_in_listLengClases319); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "listLengClases"


    // $ANTLR start "propiedad"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:50:1: propiedad : ( tripleta )+ ;
    public final void propiedad() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:50:12: ( ( tripleta )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:50:14: ( tripleta )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:50:14: ( tripleta )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==LengTipo) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:50:15: tripleta
            	    {
            	    pushFollow(FOLLOW_tripleta_in_propiedad329);
            	    tripleta();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "propiedad"


    // $ANTLR start "tripleta"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:51:1: tripleta : LengTipo ':' ALIASA '~' expresion ',' ;
    public final void tripleta() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:51:11: ( LengTipo ':' ALIASA '~' expresion ',' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:51:13: LengTipo ':' ALIASA '~' expresion ','
            {
            match(input,LengTipo,FOLLOW_LengTipo_in_tripleta339); 
            match(input,25,FOLLOW_25_in_tripleta341); 
            match(input,ALIASA,FOLLOW_ALIASA_in_tripleta343); 
            match(input,26,FOLLOW_26_in_tripleta345); 
            pushFollow(FOLLOW_expresion_in_tripleta347);
            expresion();

            state._fsp--;

            match(input,27,FOLLOW_27_in_tripleta349); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "tripleta"


    // $ANTLR start "listLengComandos"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:55:1: listLengComandos : '¿' 'nombre' '~' ALIASA '~' UbicacionC '?' ;
    public final void listLengComandos() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:55:18: ( '¿' 'nombre' '~' ALIASA '~' UbicacionC '?' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:55:20: '¿' 'nombre' '~' ALIASA '~' UbicacionC '?'
            {
            match(input,28,FOLLOW_28_in_listLengComandos359); 
            match(input,29,FOLLOW_29_in_listLengComandos361); 
            match(input,26,FOLLOW_26_in_listLengComandos363); 
            match(input,ALIASA,FOLLOW_ALIASA_in_listLengComandos365); 
            match(input,26,FOLLOW_26_in_listLengComandos367); 
            match(input,UbicacionC,FOLLOW_UbicacionC_in_listLengComandos369); 
            match(input,30,FOLLOW_30_in_listLengComandos371); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "listLengComandos"


    // $ANTLR start "listLengApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:60:1: listLengApp : '#' Int ALIASA '<<' argumentoIN '<<' '>>' argumentoOUT '>>' opcionesApp '°' descripcionApp '°' '##' ;
    public final void listLengApp() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:60:14: ( '#' Int ALIASA '<<' argumentoIN '<<' '>>' argumentoOUT '>>' opcionesApp '°' descripcionApp '°' '##' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:60:16: '#' Int ALIASA '<<' argumentoIN '<<' '>>' argumentoOUT '>>' opcionesApp '°' descripcionApp '°' '##'
            {
            match(input,31,FOLLOW_31_in_listLengApp395); 
            match(input,Int,FOLLOW_Int_in_listLengApp397); 
            match(input,ALIASA,FOLLOW_ALIASA_in_listLengApp401); 
            match(input,32,FOLLOW_32_in_listLengApp403); 
            pushFollow(FOLLOW_argumentoIN_in_listLengApp405);
            argumentoIN();

            state._fsp--;

            match(input,32,FOLLOW_32_in_listLengApp407); 
            match(input,33,FOLLOW_33_in_listLengApp409); 
            pushFollow(FOLLOW_argumentoOUT_in_listLengApp411);
            argumentoOUT();

            state._fsp--;

            match(input,33,FOLLOW_33_in_listLengApp413); 
            pushFollow(FOLLOW_opcionesApp_in_listLengApp415);
            opcionesApp();

            state._fsp--;

            match(input,23,FOLLOW_23_in_listLengApp417); 
            pushFollow(FOLLOW_descripcionApp_in_listLengApp419);
            descripcionApp();

            state._fsp--;

            match(input,23,FOLLOW_23_in_listLengApp421); 
            match(input,34,FOLLOW_34_in_listLengApp423); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "listLengApp"


    // $ANTLR start "argumentoIN"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:61:1: argumentoIN : ( archivo | ALIASA | archivo argumentoIN | ALIASA argumentoIN );
    public final void argumentoIN() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:61:14: ( archivo | ALIASA | archivo argumentoIN | ALIASA argumentoIN )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ALIASA) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==ALIASA) ) {
                        int LA11_5 = input.LA(4);

                        if ( (LA11_5==32) ) {
                            alt11=1;
                        }
                        else if ( (LA11_5==ALIASA) ) {
                            alt11=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 32:
                    {
                    alt11=2;
                    }
                    break;
                case ALIASA:
                    {
                    alt11=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:61:16: archivo
                    {
                    pushFollow(FOLLOW_archivo_in_argumentoIN431);
                    archivo();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:61:36: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_argumentoIN437); 

                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:61:45: archivo argumentoIN
                    {
                    pushFollow(FOLLOW_archivo_in_argumentoIN441);
                    archivo();

                    state._fsp--;

                    pushFollow(FOLLOW_argumentoIN_in_argumentoIN443);
                    argumentoIN();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:61:77: ALIASA argumentoIN
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_argumentoIN449); 
                    pushFollow(FOLLOW_argumentoIN_in_argumentoIN451);
                    argumentoIN();

                    state._fsp--;


                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "argumentoIN"


    // $ANTLR start "archivo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:62:1: archivo : ALIASA '.' ALIASA ;
    public final void archivo() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:62:11: ( ALIASA '.' ALIASA )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:62:14: ALIASA '.' ALIASA
            {
            match(input,ALIASA,FOLLOW_ALIASA_in_archivo461); 
            match(input,16,FOLLOW_16_in_archivo463); 
            match(input,ALIASA,FOLLOW_ALIASA_in_archivo465); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "archivo"


    // $ANTLR start "argumentoOUT"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:63:1: argumentoOUT : ( archivo | ALIASA );
    public final void argumentoOUT() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:63:15: ( archivo | ALIASA )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ALIASA) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==16) ) {
                    alt12=1;
                }
                else if ( (LA12_1==33) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:63:17: archivo
                    {
                    pushFollow(FOLLOW_archivo_in_argumentoOUT473);
                    archivo();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:63:37: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_argumentoOUT479); 

                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "argumentoOUT"


    // $ANTLR start "opcionesApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:64:1: opcionesApp : ( '-' ALIASA opcionesApp | '-' ALIASA );
    public final void opcionesApp() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:64:14: ( '-' ALIASA opcionesApp | '-' ALIASA )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==ALIASA) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==35) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==23) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:64:16: '-' ALIASA opcionesApp
                    {
                    match(input,35,FOLLOW_35_in_opcionesApp488); 
                    match(input,ALIASA,FOLLOW_ALIASA_in_opcionesApp490); 
                    pushFollow(FOLLOW_opcionesApp_in_opcionesApp492);
                    opcionesApp();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:64:41: '-' ALIASA
                    {
                    match(input,35,FOLLOW_35_in_opcionesApp496); 
                    match(input,ALIASA,FOLLOW_ALIASA_in_opcionesApp498); 

                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "opcionesApp"


    // $ANTLR start "descripcionApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:65:1: descripcionApp : ( ALIASA | );
    public final void descripcionApp() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:65:17: ( ALIASA | )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ALIASA) ) {
                alt14=1;
            }
            else if ( (LA14_0==23) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:65:19: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_descripcionApp506); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:65:28: 
                    {
                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "descripcionApp"


    // $ANTLR start "expresion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:68:1: expresion : conjuncion ( expresionP | ) ;
    public final void expresion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:68:12: ( conjuncion ( expresionP | ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:68:14: conjuncion ( expresionP | )
            {
            pushFollow(FOLLOW_conjuncion_in_expresion519);
            conjuncion();

            state._fsp--;

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:68:25: ( expresionP | )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            else if ( (LA15_0==27||LA15_0==49||LA15_0==55) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:68:26: expresionP
                    {
                    pushFollow(FOLLOW_expresionP_in_expresion522);
                    expresionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:68:39: 
                    {
                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "expresion"


    // $ANTLR start "expresionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:69:1: expresionP : '||' conjuncion ( expresionP | ) ;
    public final void expresionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:69:13: ( '||' conjuncion ( expresionP | ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:69:15: '||' conjuncion ( expresionP | )
            {
            match(input,36,FOLLOW_36_in_expresionP534); 
            pushFollow(FOLLOW_conjuncion_in_expresionP536);
            conjuncion();

            state._fsp--;

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:69:31: ( expresionP | )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            else if ( (LA16_0==27||LA16_0==49||LA16_0==55) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:69:32: expresionP
                    {
                    pushFollow(FOLLOW_expresionP_in_expresionP539);
                    expresionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:69:45: 
                    {
                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "expresionP"


    // $ANTLR start "conjuncion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:70:1: conjuncion : relacion ( conjuncionP | ) ;
    public final void conjuncion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:70:13: ( relacion ( conjuncionP | ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:70:15: relacion ( conjuncionP | )
            {
            pushFollow(FOLLOW_relacion_in_conjuncion551);
            relacion();

            state._fsp--;

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:70:24: ( conjuncionP | )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            else if ( (LA17_0==27||LA17_0==36||LA17_0==49||LA17_0==55) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:70:25: conjuncionP
                    {
                    pushFollow(FOLLOW_conjuncionP_in_conjuncion554);
                    conjuncionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:70:39: 
                    {
                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "conjuncion"


    // $ANTLR start "conjuncionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:71:1: conjuncionP : '&&' relacion ( conjuncionP | ) ;
    public final void conjuncionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:71:14: ( '&&' relacion ( conjuncionP | ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:71:16: '&&' relacion ( conjuncionP | )
            {
            match(input,37,FOLLOW_37_in_conjuncionP566); 
            pushFollow(FOLLOW_relacion_in_conjuncionP568);
            relacion();

            state._fsp--;

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:71:30: ( conjuncionP | )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            else if ( (LA18_0==27||LA18_0==36||LA18_0==49||LA18_0==55) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:71:31: conjuncionP
                    {
                    pushFollow(FOLLOW_conjuncionP_in_conjuncionP571);
                    conjuncionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:71:45: 
                    {
                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "conjuncionP"


    // $ANTLR start "relacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:72:1: relacion : adicion ( relacionP | ) ;
    public final void relacion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:72:11: ( adicion ( relacionP | ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:72:13: adicion ( relacionP | )
            {
            pushFollow(FOLLOW_adicion_in_relacion583);
            adicion();

            state._fsp--;

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:72:21: ( relacionP | )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=38 && LA19_0<=43)) ) {
                alt19=1;
            }
            else if ( (LA19_0==27||(LA19_0>=36 && LA19_0<=37)||LA19_0==49||LA19_0==55) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:72:22: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacion586);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:72:34: 
                    {
                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "relacion"


    // $ANTLR start "relacionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:1: relacionP : ( '<' adicion ( relacionP | ) | '<=' adicion ( relacionP | ) | '>' adicion ( relacionP | ) | '>=' adicion ( relacionP | ) | '==' adicion ( relacionP | ) | '!=' adicion ( relacionP | ) );
    public final void relacionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:12: ( '<' adicion ( relacionP | ) | '<=' adicion ( relacionP | ) | '>' adicion ( relacionP | ) | '>=' adicion ( relacionP | ) | '==' adicion ( relacionP | ) | '!=' adicion ( relacionP | ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt26=1;
                }
                break;
            case 39:
                {
                alt26=2;
                }
                break;
            case 40:
                {
                alt26=3;
                }
                break;
            case 41:
                {
                alt26=4;
                }
                break;
            case 42:
                {
                alt26=5;
                }
                break;
            case 43:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:14: '<' adicion ( relacionP | )
                    {
                    match(input,38,FOLLOW_38_in_relacionP598); 
                    pushFollow(FOLLOW_adicion_in_relacionP600);
                    adicion();

                    state._fsp--;

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:26: ( relacionP | )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=38 && LA20_0<=43)) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==27||(LA20_0>=36 && LA20_0<=37)||LA20_0==49||LA20_0==55) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:27: relacionP
                            {
                            pushFollow(FOLLOW_relacionP_in_relacionP603);
                            relacionP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:39: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:43: '<=' adicion ( relacionP | )
                    {
                    match(input,39,FOLLOW_39_in_relacionP611); 
                    pushFollow(FOLLOW_adicion_in_relacionP613);
                    adicion();

                    state._fsp--;

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:56: ( relacionP | )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=38 && LA21_0<=43)) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==27||(LA21_0>=36 && LA21_0<=37)||LA21_0==49||LA21_0==55) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:57: relacionP
                            {
                            pushFollow(FOLLOW_relacionP_in_relacionP616);
                            relacionP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:69: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:73: '>' adicion ( relacionP | )
                    {
                    match(input,40,FOLLOW_40_in_relacionP624); 
                    pushFollow(FOLLOW_adicion_in_relacionP626);
                    adicion();

                    state._fsp--;

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:85: ( relacionP | )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=38 && LA22_0<=43)) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==27||(LA22_0>=36 && LA22_0<=37)||LA22_0==49||LA22_0==55) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:86: relacionP
                            {
                            pushFollow(FOLLOW_relacionP_in_relacionP629);
                            relacionP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:98: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:102: '>=' adicion ( relacionP | )
                    {
                    match(input,41,FOLLOW_41_in_relacionP637); 
                    pushFollow(FOLLOW_adicion_in_relacionP639);
                    adicion();

                    state._fsp--;

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:115: ( relacionP | )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=38 && LA23_0<=43)) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==27||(LA23_0>=36 && LA23_0<=37)||LA23_0==49||LA23_0==55) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:116: relacionP
                            {
                            pushFollow(FOLLOW_relacionP_in_relacionP642);
                            relacionP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:73:128: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:74:7: '==' adicion ( relacionP | )
                    {
                    match(input,42,FOLLOW_42_in_relacionP654); 
                    pushFollow(FOLLOW_adicion_in_relacionP656);
                    adicion();

                    state._fsp--;

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:74:20: ( relacionP | )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=38 && LA24_0<=43)) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==27||(LA24_0>=36 && LA24_0<=37)||LA24_0==49||LA24_0==55) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:74:21: relacionP
                            {
                            pushFollow(FOLLOW_relacionP_in_relacionP659);
                            relacionP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:74:33: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:74:37: '!=' adicion ( relacionP | )
                    {
                    match(input,43,FOLLOW_43_in_relacionP667); 
                    pushFollow(FOLLOW_adicion_in_relacionP669);
                    adicion();

                    state._fsp--;

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:74:50: ( relacionP | )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=38 && LA25_0<=43)) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==27||(LA25_0>=36 && LA25_0<=37)||LA25_0==49||LA25_0==55) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:74:51: relacionP
                            {
                            pushFollow(FOLLOW_relacionP_in_relacionP672);
                            relacionP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:74:63: 
                            {
                            }
                            break;

                    }


                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "relacionP"


    // $ANTLR start "adicion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:75:1: adicion : termino ( adicionP | ) ;
    public final void adicion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:75:11: ( termino ( adicionP | ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:75:13: termino ( adicionP | )
            {
            pushFollow(FOLLOW_termino_in_adicion685);
            termino();

            state._fsp--;

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:75:21: ( adicionP | )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35||LA27_0==44) ) {
                alt27=1;
            }
            else if ( (LA27_0==27||(LA27_0>=36 && LA27_0<=43)||LA27_0==49||LA27_0==55) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:75:22: adicionP
                    {
                    pushFollow(FOLLOW_adicionP_in_adicion688);
                    adicionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:75:33: 
                    {
                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "adicion"


    // $ANTLR start "adicionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:76:1: adicionP : ( '+' termino ( adicionP | ) | '-' termino ( adicionP | ) );
    public final void adicionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:76:11: ( '+' termino ( adicionP | ) | '-' termino ( adicionP | ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            else if ( (LA30_0==35) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:76:13: '+' termino ( adicionP | )
                    {
                    match(input,44,FOLLOW_44_in_adicionP700); 
                    pushFollow(FOLLOW_termino_in_adicionP702);
                    termino();

                    state._fsp--;

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:76:25: ( adicionP | )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==35||LA28_0==44) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==27||(LA28_0>=36 && LA28_0<=43)||LA28_0==49||LA28_0==55) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:76:26: adicionP
                            {
                            pushFollow(FOLLOW_adicionP_in_adicionP705);
                            adicionP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:76:37: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:76:41: '-' termino ( adicionP | )
                    {
                    match(input,35,FOLLOW_35_in_adicionP713); 
                    pushFollow(FOLLOW_termino_in_adicionP715);
                    termino();

                    state._fsp--;

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:76:53: ( adicionP | )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==35||LA29_0==44) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==27||(LA29_0>=36 && LA29_0<=43)||LA29_0==49||LA29_0==55) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:76:54: adicionP
                            {
                            pushFollow(FOLLOW_adicionP_in_adicionP718);
                            adicionP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:76:65: 
                            {
                            }
                            break;

                    }


                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "adicionP"


    // $ANTLR start "termino"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:77:1: termino : negacion ( terminoP | ) ;
    public final void termino() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:77:11: ( negacion ( terminoP | ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:77:13: negacion ( terminoP | )
            {
            pushFollow(FOLLOW_negacion_in_termino731);
            negacion();

            state._fsp--;

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:77:22: ( terminoP | )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=45 && LA31_0<=46)) ) {
                alt31=1;
            }
            else if ( (LA31_0==27||(LA31_0>=35 && LA31_0<=44)||LA31_0==49||LA31_0==55) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:77:23: terminoP
                    {
                    pushFollow(FOLLOW_terminoP_in_termino734);
                    terminoP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:77:34: 
                    {
                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "termino"


    // $ANTLR start "terminoP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:78:1: terminoP : ( '*' negacion ( terminoP | ) | '//' negacion ( terminoP | ) );
    public final void terminoP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:78:11: ( '*' negacion ( terminoP | ) | '//' negacion ( terminoP | ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            else if ( (LA34_0==46) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:78:13: '*' negacion ( terminoP | )
                    {
                    match(input,45,FOLLOW_45_in_terminoP746); 
                    pushFollow(FOLLOW_negacion_in_terminoP748);
                    negacion();

                    state._fsp--;

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:78:26: ( terminoP | )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=45 && LA32_0<=46)) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==27||(LA32_0>=35 && LA32_0<=44)||LA32_0==49||LA32_0==55) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:78:27: terminoP
                            {
                            pushFollow(FOLLOW_terminoP_in_terminoP751);
                            terminoP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:78:38: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:78:42: '//' negacion ( terminoP | )
                    {
                    match(input,46,FOLLOW_46_in_terminoP759); 
                    pushFollow(FOLLOW_negacion_in_terminoP761);
                    negacion();

                    state._fsp--;

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:78:56: ( terminoP | )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=45 && LA33_0<=46)) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==27||(LA33_0>=35 && LA33_0<=44)||LA33_0==49||LA33_0==55) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:78:57: terminoP
                            {
                            pushFollow(FOLLOW_terminoP_in_terminoP764);
                            terminoP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:78:68: 
                            {
                            }
                            break;

                    }


                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "terminoP"


    // $ANTLR start "negacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:79:1: negacion : ( factor | '!' factor );
    public final void negacion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:79:11: ( factor | '!' factor )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=ALIASA && LA35_0<=LengTipo)||(LA35_0>=Int && LA35_0<=String)||LA35_0==16||(LA35_0>=20 && LA35_0<=22)||LA35_0==48) ) {
                alt35=1;
            }
            else if ( (LA35_0==47) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:79:13: factor
                    {
                    pushFollow(FOLLOW_factor_in_negacion776);
                    factor();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:79:22: '!' factor
                    {
                    match(input,47,FOLLOW_47_in_negacion780); 
                    pushFollow(FOLLOW_factor_in_negacion781);
                    factor();

                    state._fsp--;


                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "negacion"


    // $ANTLR start "factor"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:80:1: factor : ( ALIASA | tripleta | literal | '(' expresion ')' );
    public final void factor() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:80:10: ( ALIASA | tripleta | literal | '(' expresion ')' )
            int alt36=4;
            switch ( input.LA(1) ) {
            case ALIASA:
                {
                alt36=1;
                }
                break;
            case LengTipo:
                {
                alt36=2;
                }
                break;
            case Fecha:
            case Hora:
            case Int:
            case Bool:
            case String:
            case 16:
            case 20:
            case 21:
            case 22:
                {
                alt36=3;
                }
                break;
            case 48:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:80:12: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_factor790); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:80:21: tripleta
                    {
                    pushFollow(FOLLOW_tripleta_in_factor794);
                    tripleta();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:80:32: literal
                    {
                    pushFollow(FOLLOW_literal_in_factor798);
                    literal();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:80:42: '(' expresion ')'
                    {
                    match(input,48,FOLLOW_48_in_factor802); 
                    pushFollow(FOLLOW_expresion_in_factor804);
                    expresion();

                    state._fsp--;

                    match(input,49,FOLLOW_49_in_factor807); 

                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "factor"


    // $ANTLR start "listLengFns"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:84:1: listLengFns : '%=' ALIASA '(' ALIASA ( ',' ALIASA )* ')' '{' z '}' '=%' ;
    public final void listLengFns() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:84:14: ( '%=' ALIASA '(' ALIASA ( ',' ALIASA )* ')' '{' z '}' '=%' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:84:16: '%=' ALIASA '(' ALIASA ( ',' ALIASA )* ')' '{' z '}' '=%'
            {
            match(input,50,FOLLOW_50_in_listLengFns818); 
            match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns820); 
            match(input,48,FOLLOW_48_in_listLengFns822); 
            match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns824); 
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:84:39: ( ',' ALIASA )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==27) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:84:40: ',' ALIASA
            	    {
            	    match(input,27,FOLLOW_27_in_listLengFns827); 
            	    match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns828); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            match(input,49,FOLLOW_49_in_listLengFns832); 
            match(input,51,FOLLOW_51_in_listLengFns834); 
            pushFollow(FOLLOW_z_in_listLengFns836);
            z();

            state._fsp--;

            match(input,52,FOLLOW_52_in_listLengFns838); 
            match(input,53,FOLLOW_53_in_listLengFns840); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "listLengFns"


    // $ANTLR start "literal"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:85:1: literal : ( Int | Bool | Fecha | Hora | ubicacionA | listLengClases | String );
    public final void literal() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:85:11: ( Int | Bool | Fecha | Hora | ubicacionA | listLengClases | String )
            int alt38=7;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt38=1;
                }
                break;
            case Bool:
                {
                alt38=2;
                }
                break;
            case Fecha:
                {
                alt38=3;
                }
                break;
            case Hora:
                {
                alt38=4;
                }
                break;
            case 16:
            case 20:
            case 21:
                {
                alt38=5;
                }
                break;
            case 22:
                {
                alt38=6;
                }
                break;
            case String:
                {
                alt38=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:85:13: Int
                    {
                    match(input,Int,FOLLOW_Int_in_literal849); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:85:19: Bool
                    {
                    match(input,Bool,FOLLOW_Bool_in_literal853); 

                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:85:26: Fecha
                    {
                    match(input,Fecha,FOLLOW_Fecha_in_literal857); 

                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:85:34: Hora
                    {
                    match(input,Hora,FOLLOW_Hora_in_literal861); 

                    }
                    break;
                case 5 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:85:41: ubicacionA
                    {
                    pushFollow(FOLLOW_ubicacionA_in_literal865);
                    ubicacionA();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:85:54: listLengClases
                    {
                    pushFollow(FOLLOW_listLengClases_in_literal869);
                    listLengClases();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:85:71: String
                    {
                    match(input,String,FOLLOW_String_in_literal873); 

                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "literal"


    // $ANTLR start "z"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:92:1: z : ( listVariables listInstrucciones | );
    public final void z() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:92:5: ( listVariables listInstrucciones | )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            else if ( (LA39_0==52) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:92:7: listVariables listInstrucciones
                    {
                    pushFollow(FOLLOW_listVariables_in_z1077);
                    listVariables();

                    state._fsp--;

                    pushFollow(FOLLOW_listInstrucciones_in_z1079);
                    listInstrucciones();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:92:41: 
                    {
                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "z"


    // $ANTLR start "listVariables"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:93:1: listVariables : ( lengVar )+ ;
    public final void listVariables() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:93:16: ( ( lengVar )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:93:18: ( lengVar )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:93:18: ( lengVar )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==54) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:93:19: lengVar
            	    {
            	    pushFollow(FOLLOW_lengVar_in_listVariables1091);
            	    lengVar();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "listVariables"


    // $ANTLR start "lengVar"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:94:1: lengVar : '@' ALIASA ';' ;
    public final void lengVar() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:94:11: ( '@' ALIASA ';' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:94:13: '@' ALIASA ';'
            {
            match(input,54,FOLLOW_54_in_lengVar1102); 
            match(input,ALIASA,FOLLOW_ALIASA_in_lengVar1104); 
            match(input,55,FOLLOW_55_in_lengVar1106); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "lengVar"


    // $ANTLR start "listInstrucciones"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:95:1: listInstrucciones : ( ( instrucciones )+ | );
    public final void listInstrucciones() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:95:20: ( ( instrucciones )+ | )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ALIASA||(LA42_0>=57 && LA42_0<=58)) ) {
                alt42=1;
            }
            else if ( (LA42_0==52) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:95:22: ( instrucciones )+
                    {
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:95:22: ( instrucciones )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==ALIASA||(LA41_0>=57 && LA41_0<=58)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:95:23: instrucciones
                    	    {
                    	    pushFollow(FOLLOW_instrucciones_in_listInstrucciones1115);
                    	    instrucciones();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:95:41: 
                    {
                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "listInstrucciones"


    // $ANTLR start "instrucciones"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:96:1: instrucciones : ( asignacion | ciclo | condicion );
    public final void instrucciones() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:96:16: ( asignacion | ciclo | condicion )
            int alt43=3;
            switch ( input.LA(1) ) {
            case ALIASA:
                {
                alt43=1;
                }
                break;
            case 58:
                {
                alt43=2;
                }
                break;
            case 57:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:96:19: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_instrucciones1129);
                    asignacion();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:96:32: ciclo
                    {
                    pushFollow(FOLLOW_ciclo_in_instrucciones1133);
                    ciclo();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:96:40: condicion
                    {
                    pushFollow(FOLLOW_condicion_in_instrucciones1137);
                    condicion();

                    state._fsp--;


                    }
                    break;

            }
        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "instrucciones"


    // $ANTLR start "condicion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:97:1: condicion : condicionP ( 'else' '{' listInstrucciones '}' | ) ;
    public final void condicion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:97:12: ( condicionP ( 'else' '{' listInstrucciones '}' | ) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:97:14: condicionP ( 'else' '{' listInstrucciones '}' | )
            {
            pushFollow(FOLLOW_condicionP_in_condicion1145);
            condicionP();

            state._fsp--;

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:97:25: ( 'else' '{' listInstrucciones '}' | )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            else if ( (LA44_0==ALIASA||LA44_0==52||(LA44_0>=57 && LA44_0<=58)) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:97:26: 'else' '{' listInstrucciones '}'
                    {
                    match(input,56,FOLLOW_56_in_condicion1148); 
                    match(input,51,FOLLOW_51_in_condicion1150); 
                    pushFollow(FOLLOW_listInstrucciones_in_condicion1152);
                    listInstrucciones();

                    state._fsp--;

                    match(input,52,FOLLOW_52_in_condicion1154); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:97:61: 
                    {
                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "condicion"


    // $ANTLR start "condicionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:98:1: condicionP : 'if' '(' expresion ')' '{' listInstrucciones '}' ;
    public final void condicionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:98:13: ( 'if' '(' expresion ')' '{' listInstrucciones '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:98:15: 'if' '(' expresion ')' '{' listInstrucciones '}'
            {
            match(input,57,FOLLOW_57_in_condicionP1166); 
            match(input,48,FOLLOW_48_in_condicionP1168); 
            pushFollow(FOLLOW_expresion_in_condicionP1170);
            expresion();

            state._fsp--;

            match(input,49,FOLLOW_49_in_condicionP1172); 
            match(input,51,FOLLOW_51_in_condicionP1174); 
            pushFollow(FOLLOW_listInstrucciones_in_condicionP1176);
            listInstrucciones();

            state._fsp--;

            match(input,52,FOLLOW_52_in_condicionP1178); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "condicionP"


    // $ANTLR start "ciclo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:99:1: ciclo : 'while' '(' expresion ')' '{' listInstrucciones '}' ;
    public final void ciclo() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:99:9: ( 'while' '(' expresion ')' '{' listInstrucciones '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:99:11: 'while' '(' expresion ')' '{' listInstrucciones '}'
            {
            match(input,58,FOLLOW_58_in_ciclo1187); 
            match(input,48,FOLLOW_48_in_ciclo1189); 
            pushFollow(FOLLOW_expresion_in_ciclo1191);
            expresion();

            state._fsp--;

            match(input,49,FOLLOW_49_in_ciclo1193); 
            match(input,51,FOLLOW_51_in_ciclo1195); 
            pushFollow(FOLLOW_listInstrucciones_in_ciclo1197);
            listInstrucciones();

            state._fsp--;

            match(input,52,FOLLOW_52_in_ciclo1199); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "ciclo"


    // $ANTLR start "asignacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:100:1: asignacion : ALIASA '~' expresion ';' ;
    public final void asignacion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:100:14: ( ALIASA '~' expresion ';' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/grammardesc/defANTLRPracticaCompiladoresMD.g:100:16: ALIASA '~' expresion ';'
            {
            match(input,ALIASA,FOLLOW_ALIASA_in_asignacion1208); 
            match(input,26,FOLLOW_26_in_asignacion1210); 
            pushFollow(FOLLOW_expresion_in_asignacion1212);
            expresion();

            state._fsp--;

            match(input,55,FOLLOW_55_in_asignacion1214); 

            }

        }

            catch (RecognitionException e) 
                {
                    throw e;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end "asignacion"

    // Delegated rules


 

    public static final BitSet FOLLOW_defANTLRPracticaCompiladoresMD_in_prog70 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLengArchivo_in_defANTLRPracticaCompiladoresMD82 = new BitSet(new long[]{0x0004000090408002L});
    public static final BitSet FOLLOW_listLengClases_in_defANTLRPracticaCompiladoresMD86 = new BitSet(new long[]{0x0004000090408002L});
    public static final BitSet FOLLOW_listLengComandos_in_defANTLRPracticaCompiladoresMD90 = new BitSet(new long[]{0x0004000090408002L});
    public static final BitSet FOLLOW_listLengFns_in_defANTLRPracticaCompiladoresMD94 = new BitSet(new long[]{0x0004000090408002L});
    public static final BitSet FOLLOW_listLengApp_in_defANTLRPracticaCompiladoresMD98 = new BitSet(new long[]{0x0004000090408002L});
    public static final BitSet FOLLOW_15_in_listLengArchivo117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengArchivo119 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_listLengArchivo121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengArchivo123 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_opcionesA_in_listLengArchivo125 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_listLengArchivo127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_opcionesA135 = new BitSet(new long[]{0x0000000000390060L});
    public static final BitSet FOLLOW_ubicacionA_in_opcionesA138 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_Fecha_in_opcionesA145 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_Hora_in_opcionesA152 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_opcionesA158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativa_in_ubicacionA166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ubicacionA171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_ubicacionA172 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16_in_relativa183 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_relativa185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_relativa186 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21_in_relativa192 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_relativa194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_relativa195 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_22_in_listLengClases307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengClases309 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_listLengClases311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengClases313 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_listLengClases315 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_propiedad_in_listLengClases317 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_listLengClases319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tripleta_in_propiedad329 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LengTipo_in_tripleta339 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_tripleta341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_tripleta343 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_tripleta345 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_expresion_in_tripleta347 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_tripleta349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_listLengComandos359 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_listLengComandos361 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_listLengComandos363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengComandos365 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_listLengComandos367 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_UbicacionC_in_listLengComandos369 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_listLengComandos371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_listLengApp395 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Int_in_listLengApp397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengApp401 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_listLengApp403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_listLengApp405 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_listLengApp407 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_listLengApp409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoOUT_in_listLengApp411 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_listLengApp413 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_opcionesApp_in_listLengApp415 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_listLengApp417 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_descripcionApp_in_listLengApp419 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_listLengApp421 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_listLengApp423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoIN431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoIN437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoIN441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_argumentoIN443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoIN449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_argumentoIN451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_archivo461 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_archivo463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_archivo465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoOUT473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoOUT479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_opcionesApp488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_opcionesApp490 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_opcionesApp_in_opcionesApp492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_opcionesApp496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_opcionesApp498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_descripcionApp506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjuncion_in_expresion519 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_expresionP_in_expresion522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_expresionP534 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_conjuncion_in_expresionP536 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_expresionP_in_expresionP539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relacion_in_conjuncion551 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_conjuncionP_in_conjuncion554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_conjuncionP566 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_relacion_in_conjuncionP568 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_conjuncionP_in_conjuncionP571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adicion_in_relacion583 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacion586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_relacionP598 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_adicion_in_relacionP600 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacionP603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_relacionP611 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_adicion_in_relacionP613 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacionP616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_relacionP624 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_adicion_in_relacionP626 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacionP629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_relacionP637 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_adicion_in_relacionP639 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacionP642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_relacionP654 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_adicion_in_relacionP656 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacionP659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_relacionP667 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_adicion_in_relacionP669 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacionP672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termino_in_adicion685 = new BitSet(new long[]{0x0000100800000002L});
    public static final BitSet FOLLOW_adicionP_in_adicion688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_adicionP700 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_termino_in_adicionP702 = new BitSet(new long[]{0x0000100800000002L});
    public static final BitSet FOLLOW_adicionP_in_adicionP705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_adicionP713 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_termino_in_adicionP715 = new BitSet(new long[]{0x0000100800000002L});
    public static final BitSet FOLLOW_adicionP_in_adicionP718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negacion_in_termino731 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_terminoP_in_termino734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_terminoP746 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_negacion_in_terminoP748 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_terminoP_in_terminoP751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_terminoP759 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_negacion_in_terminoP761 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_terminoP_in_terminoP764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_negacion776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_negacion780 = new BitSet(new long[]{0x0001000000710EF0L});
    public static final BitSet FOLLOW_factor_in_negacion781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_factor790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tripleta_in_factor794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_factor802 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_expresion_in_factor804 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_factor807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_listLengFns818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns820 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_listLengFns822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns824 = new BitSet(new long[]{0x0002000008000000L});
    public static final BitSet FOLLOW_27_in_listLengFns827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns828 = new BitSet(new long[]{0x0002000008000000L});
    public static final BitSet FOLLOW_49_in_listLengFns832 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_listLengFns834 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_z_in_listLengFns836 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_listLengFns838 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_listLengFns840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Int_in_literal849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_literal853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fecha_in_literal857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Hora_in_literal861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ubicacionA_in_literal865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLengClases_in_literal869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_literal873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listVariables_in_z1077 = new BitSet(new long[]{0x0600000000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_z1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lengVar_in_listVariables1091 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_lengVar1102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_lengVar1104 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_lengVar1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucciones_in_listInstrucciones1115 = new BitSet(new long[]{0x0600000000000012L});
    public static final BitSet FOLLOW_asignacion_in_instrucciones1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ciclo_in_instrucciones1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicion_in_instrucciones1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicionP_in_condicion1145 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_condicion1148 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_condicion1150 = new BitSet(new long[]{0x0610000000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_condicion1152 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_condicion1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_condicionP1166 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_condicionP1168 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_expresion_in_condicionP1170 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_condicionP1172 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_condicionP1174 = new BitSet(new long[]{0x0610000000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_condicionP1176 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_condicionP1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ciclo1187 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ciclo1189 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_expresion_in_ciclo1191 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ciclo1193 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ciclo1195 = new BitSet(new long[]{0x0610000000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_ciclo1197 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ciclo1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_asignacion1208 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_asignacion1210 = new BitSet(new long[]{0x0001800000710EF0L});
    public static final BitSet FOLLOW_expresion_in_asignacion1212 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_asignacion1214 = new BitSet(new long[]{0x0000000000000002L});

}