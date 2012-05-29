// $ANTLR 3.4 /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g 2012-05-29 10:47:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class mdParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIASA", "Bool", "Comentarios", "Fecha", "Hora", "Int", "LengTipo", "NEWLINE", "String", "UbicacionC", "WS", "'!'", "'!='", "'\"'", "'##'", "'#'", "'$$'", "'$'", "'%='", "'&&'", "'('", "')'", "'*'", "'*/'", "'+'", "'++'", "','", "'-'", "'.'", "'..'", "'/'", "'/*'", "'//'", "'/in'", "'/out'", "':'", "';'", "'<'", "'<='", "'=%'", "'=='", "'>'", "'>='", "'dir'", "'else'", "'if'", "'in'", "'nombre'", "'out'", "'s'", "'ss'", "'while'", "'{'", "'||'", "'}'", "'~'"
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
    public static final int T__59=59;
    public static final int ALIASA=4;
    public static final int Bool=5;
    public static final int Comentarios=6;
    public static final int Fecha=7;
    public static final int Hora=8;
    public static final int Int=9;
    public static final int LengTipo=10;
    public static final int NEWLINE=11;
    public static final int String=12;
    public static final int UbicacionC=13;
    public static final int WS=14;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public mdParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public mdParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return mdParser.tokenNames; }
    public String getGrammarFileName() { return "/home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g"; }



    // $ANTLR start "prog"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:3:1: prog : md EOF ;
    public final void prog() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:3:11: ( md EOF )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:3:19: md EOF
            {
            pushFollow(FOLLOW_md_in_prog35);
            md();

            state._fsp--;


            match(input,EOF,FOLLOW_EOF_in_prog37); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "md"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:4:1: md : ( comments | listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+ ;
    public final void md() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:4:6: ( ( comments | listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:4:8: ( comments | listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:4:8: ( comments | listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+
            int cnt1=0;
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    alt1=1;
                    }
                    break;
                case 21:
                    {
                    alt1=2;
                    }
                    break;
                case 53:
                    {
                    alt1=3;
                    }
                    break;
                case 28:
                    {
                    alt1=4;
                    }
                    break;
                case 22:
                    {
                    alt1=5;
                    }
                    break;
                case 19:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:4:10: comments
            	    {
            	    pushFollow(FOLLOW_comments_in_md48);
            	    comments();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:4:21: listLengArchivo
            	    {
            	    pushFollow(FOLLOW_listLengArchivo_in_md52);
            	    listLengArchivo();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:4:39: listLengClases
            	    {
            	    pushFollow(FOLLOW_listLengClases_in_md56);
            	    listLengClases();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:4:56: listLengComandos
            	    {
            	    pushFollow(FOLLOW_listLengComandos_in_md60);
            	    listLengComandos();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:4:75: listLengFns
            	    {
            	    pushFollow(FOLLOW_listLengFns_in_md64);
            	    listLengFns();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:4:89: listLengApp
            	    {
            	    pushFollow(FOLLOW_listLengApp_in_md68);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "md"



    // $ANTLR start "comments"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:11:1: comments : '/*' Comentarios '*/' ;
    public final void comments() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:11:11: ( '/*' Comentarios '*/' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:11:13: '/*' Comentarios '*/'
            {
            match(input,35,FOLLOW_35_in_comments115); 

            match(input,Comentarios,FOLLOW_Comentarios_in_comments117); 

            match(input,27,FOLLOW_27_in_comments119); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "comments"



    // $ANTLR start "listLengArchivo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:15:1: listLengArchivo : '$' ALIASA '.' ALIASA opcionesA '$$' ;
    public final void listLengArchivo() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:15:18: ( '$' ALIASA '.' ALIASA opcionesA '$$' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:15:20: '$' ALIASA '.' ALIASA opcionesA '$$'
            {
            match(input,21,FOLLOW_21_in_listLengArchivo130); 

            match(input,ALIASA,FOLLOW_ALIASA_in_listLengArchivo132); 

            match(input,32,FOLLOW_32_in_listLengArchivo134); 

            match(input,ALIASA,FOLLOW_ALIASA_in_listLengArchivo136); 

            pushFollow(FOLLOW_opcionesA_in_listLengArchivo138);
            opcionesA();

            state._fsp--;


            match(input,20,FOLLOW_20_in_listLengArchivo140); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listLengArchivo"



    // $ANTLR start "opcionesA"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:1: opcionesA : '{' ( ubicacionA |) ( Fecha |) ( Hora |) '}' ;
    public final void opcionesA() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:12: ( '{' ( ubicacionA |) ( Fecha |) ( Hora |) '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:14: '{' ( ubicacionA |) ( Fecha |) ( Hora |) '}'
            {
            match(input,56,FOLLOW_56_in_opcionesA148); 

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:18: ( ubicacionA |)
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 32 && LA2_0 <= 34)) ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= Fecha && LA2_0 <= Hora)||LA2_0==58) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:19: ubicacionA
                    {
                    pushFollow(FOLLOW_ubicacionA_in_opcionesA151);
                    ubicacionA();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:32: 
                    {
                    }
                    break;

            }


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:34: ( Fecha |)
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Fecha) ) {
                alt3=1;
            }
            else if ( (LA3_0==Hora||LA3_0==58) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:35: Fecha
                    {
                    match(input,Fecha,FOLLOW_Fecha_in_opcionesA158); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:43: 
                    {
                    }
                    break;

            }


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:45: ( Hora |)
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Hora) ) {
                alt4=1;
            }
            else if ( (LA4_0==58) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:46: Hora
                    {
                    match(input,Hora,FOLLOW_Hora_in_opcionesA165); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:16:53: 
                    {
                    }
                    break;

            }


            match(input,58,FOLLOW_58_in_opcionesA171); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "opcionesA"



    // $ANTLR start "ubicacionA"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:17:1: ubicacionA : ( relativa | ( '/' ALIASA )+ );
    public final void ubicacionA() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:17:13: ( relativa | ( '/' ALIASA )+ )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= 32 && LA6_0 <= 33)) ) {
                alt6=1;
            }
            else if ( (LA6_0==34) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:17:15: relativa
                    {
                    pushFollow(FOLLOW_relativa_in_ubicacionA179);
                    relativa();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:17:26: ( '/' ALIASA )+
                    {
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:17:26: ( '/' ALIASA )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:17:27: '/' ALIASA
                    	    {
                    	    match(input,34,FOLLOW_34_in_ubicacionA184); 

                    	    match(input,ALIASA,FOLLOW_ALIASA_in_ubicacionA185); 

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ubicacionA"



    // $ANTLR start "relativa"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:19:1: relativa : ( '.' ( '/' ALIASA )+ | '..' ( '/' ALIASA )+ );
    public final void relativa() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:19:11: ( '.' ( '/' ALIASA )+ | '..' ( '/' ALIASA )+ )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:19:13: '.' ( '/' ALIASA )+
                    {
                    match(input,32,FOLLOW_32_in_relativa196); 

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:19:16: ( '/' ALIASA )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==34) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:19:17: '/' ALIASA
                    	    {
                    	    match(input,34,FOLLOW_34_in_relativa198); 

                    	    match(input,ALIASA,FOLLOW_ALIASA_in_relativa199); 

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
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:19:31: '..' ( '/' ALIASA )+
                    {
                    match(input,33,FOLLOW_33_in_relativa205); 

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:19:35: ( '/' ALIASA )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==34) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:19:36: '/' ALIASA
                    	    {
                    	    match(input,34,FOLLOW_34_in_relativa207); 

                    	    match(input,ALIASA,FOLLOW_ALIASA_in_relativa208); 

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relativa"



    // $ANTLR start "listLengClases"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:26:1: listLengClases : 's' ALIASA '\"' Comentarios '\"' propiedad 'ss' ;
    public final void listLengClases() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:26:17: ( 's' ALIASA '\"' Comentarios '\"' propiedad 'ss' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:26:19: 's' ALIASA '\"' Comentarios '\"' propiedad 'ss'
            {
            match(input,53,FOLLOW_53_in_listLengClases320); 

            match(input,ALIASA,FOLLOW_ALIASA_in_listLengClases322); 

            match(input,17,FOLLOW_17_in_listLengClases324); 

            match(input,Comentarios,FOLLOW_Comentarios_in_listLengClases325); 

            match(input,17,FOLLOW_17_in_listLengClases326); 

            pushFollow(FOLLOW_propiedad_in_listLengClases328);
            propiedad();

            state._fsp--;


            match(input,54,FOLLOW_54_in_listLengClases330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listLengClases"



    // $ANTLR start "propiedad"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:28:1: propiedad : ( tripleta )+ ;
    public final void propiedad() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:28:12: ( ( tripleta )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:28:14: ( tripleta )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:28:14: ( tripleta )+
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
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:28:15: tripleta
            	    {
            	    pushFollow(FOLLOW_tripleta_in_propiedad340);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "propiedad"



    // $ANTLR start "tripleta"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:29:1: tripleta : LengTipo ':' ALIASA '~' expresion ',' ;
    public final void tripleta() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:29:11: ( LengTipo ':' ALIASA '~' expresion ',' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:29:13: LengTipo ':' ALIASA '~' expresion ','
            {
            match(input,LengTipo,FOLLOW_LengTipo_in_tripleta350); 

            match(input,39,FOLLOW_39_in_tripleta352); 

            match(input,ALIASA,FOLLOW_ALIASA_in_tripleta354); 

            match(input,59,FOLLOW_59_in_tripleta356); 

            pushFollow(FOLLOW_expresion_in_tripleta358);
            expresion();

            state._fsp--;


            match(input,30,FOLLOW_30_in_tripleta360); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "tripleta"



    // $ANTLR start "listLengComandos"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:1: listLengComandos : '+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++' ;
    public final void listLengComandos() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:18: ( '+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:20: '+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++'
            {
            match(input,28,FOLLOW_28_in_listLengComandos370); 

            match(input,51,FOLLOW_51_in_listLengComandos372); 

            match(input,59,FOLLOW_59_in_listLengComandos374); 

            match(input,ALIASA,FOLLOW_ALIASA_in_listLengComandos376); 

            match(input,47,FOLLOW_47_in_listLengComandos378); 

            match(input,59,FOLLOW_59_in_listLengComandos380); 

            match(input,UbicacionC,FOLLOW_UbicacionC_in_listLengComandos382); 

            match(input,29,FOLLOW_29_in_listLengComandos384); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listLengComandos"



    // $ANTLR start "listLengApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:38:1: listLengApp : '#' Int ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##' ;
    public final void listLengApp() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:38:14: ( '#' Int ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:38:16: '#' Int ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##'
            {
            match(input,19,FOLLOW_19_in_listLengApp408); 

            match(input,Int,FOLLOW_Int_in_listLengApp410); 

            match(input,ALIASA,FOLLOW_ALIASA_in_listLengApp414); 

            match(input,50,FOLLOW_50_in_listLengApp416); 

            pushFollow(FOLLOW_argumentoIN_in_listLengApp418);
            argumentoIN();

            state._fsp--;


            match(input,37,FOLLOW_37_in_listLengApp420); 

            match(input,52,FOLLOW_52_in_listLengApp422); 

            pushFollow(FOLLOW_argumentoOUT_in_listLengApp424);
            argumentoOUT();

            state._fsp--;


            match(input,38,FOLLOW_38_in_listLengApp426); 

            pushFollow(FOLLOW_opcionesApp_in_listLengApp428);
            opcionesApp();

            state._fsp--;


            pushFollow(FOLLOW_descripcionApp_in_listLengApp430);
            descripcionApp();

            state._fsp--;


            match(input,18,FOLLOW_18_in_listLengApp432); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listLengApp"



    // $ANTLR start "argumentoIN"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:39:1: argumentoIN : ( archivo | ALIASA | archivo argumentoIN | ALIASA argumentoIN );
    public final void argumentoIN() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:39:14: ( archivo | ALIASA | archivo argumentoIN | ALIASA argumentoIN )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ALIASA) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==ALIASA) ) {
                        int LA11_5 = input.LA(4);

                        if ( (LA11_5==37) ) {
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
                case 37:
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
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:39:16: archivo
                    {
                    pushFollow(FOLLOW_archivo_in_argumentoIN440);
                    archivo();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:39:36: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_argumentoIN446); 

                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:39:45: archivo argumentoIN
                    {
                    pushFollow(FOLLOW_archivo_in_argumentoIN450);
                    archivo();

                    state._fsp--;


                    pushFollow(FOLLOW_argumentoIN_in_argumentoIN452);
                    argumentoIN();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:39:77: ALIASA argumentoIN
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_argumentoIN458); 

                    pushFollow(FOLLOW_argumentoIN_in_argumentoIN460);
                    argumentoIN();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "argumentoIN"



    // $ANTLR start "archivo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:40:1: archivo : ALIASA '.' ALIASA ;
    public final void archivo() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:40:11: ( ALIASA '.' ALIASA )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:40:14: ALIASA '.' ALIASA
            {
            match(input,ALIASA,FOLLOW_ALIASA_in_archivo470); 

            match(input,32,FOLLOW_32_in_archivo472); 

            match(input,ALIASA,FOLLOW_ALIASA_in_archivo474); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "archivo"



    // $ANTLR start "argumentoOUT"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:41:1: argumentoOUT : ( archivo | ALIASA );
    public final void argumentoOUT() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:41:15: ( archivo | ALIASA )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ALIASA) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==32) ) {
                    alt12=1;
                }
                else if ( (LA12_1==38) ) {
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
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:41:17: archivo
                    {
                    pushFollow(FOLLOW_archivo_in_argumentoOUT482);
                    archivo();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:41:37: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_argumentoOUT488); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "argumentoOUT"



    // $ANTLR start "opcionesApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:42:1: opcionesApp : ( '-' ALIASA opcionesApp | '-' ALIASA );
    public final void opcionesApp() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:42:14: ( '-' ALIASA opcionesApp | '-' ALIASA )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==ALIASA) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==31) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==ALIASA||LA13_2==18) ) {
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
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:42:16: '-' ALIASA opcionesApp
                    {
                    match(input,31,FOLLOW_31_in_opcionesApp497); 

                    match(input,ALIASA,FOLLOW_ALIASA_in_opcionesApp499); 

                    pushFollow(FOLLOW_opcionesApp_in_opcionesApp501);
                    opcionesApp();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:42:41: '-' ALIASA
                    {
                    match(input,31,FOLLOW_31_in_opcionesApp505); 

                    match(input,ALIASA,FOLLOW_ALIASA_in_opcionesApp507); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "opcionesApp"



    // $ANTLR start "descripcionApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:1: descripcionApp : ( ALIASA |);
    public final void descripcionApp() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:17: ( ALIASA |)
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ALIASA) ) {
                alt14=1;
            }
            else if ( (LA14_0==18) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:19: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_descripcionApp515); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:28: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "descripcionApp"



    // $ANTLR start "expresion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:1: expresion : conjuncion ( expresionP |) ;
    public final void expresion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:12: ( conjuncion ( expresionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:14: conjuncion ( expresionP |)
            {
            pushFollow(FOLLOW_conjuncion_in_expresion528);
            conjuncion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:25: ( expresionP |)
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==57) ) {
                alt15=1;
            }
            else if ( (LA15_0==25||LA15_0==30||LA15_0==40) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:26: expresionP
                    {
                    pushFollow(FOLLOW_expresionP_in_expresion531);
                    expresionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:39: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expresion"



    // $ANTLR start "expresionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:47:1: expresionP : '||' conjuncion ( expresionP |) ;
    public final void expresionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:47:13: ( '||' conjuncion ( expresionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:47:15: '||' conjuncion ( expresionP |)
            {
            match(input,57,FOLLOW_57_in_expresionP543); 

            pushFollow(FOLLOW_conjuncion_in_expresionP545);
            conjuncion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:47:31: ( expresionP |)
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==57) ) {
                alt16=1;
            }
            else if ( (LA16_0==25||LA16_0==30||LA16_0==40) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:47:32: expresionP
                    {
                    pushFollow(FOLLOW_expresionP_in_expresionP548);
                    expresionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:47:45: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expresionP"



    // $ANTLR start "conjuncion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:48:1: conjuncion : relacion ( conjuncionP |) ;
    public final void conjuncion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:48:13: ( relacion ( conjuncionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:48:15: relacion ( conjuncionP |)
            {
            pushFollow(FOLLOW_relacion_in_conjuncion560);
            relacion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:48:24: ( conjuncionP |)
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            else if ( (LA17_0==25||LA17_0==30||LA17_0==40||LA17_0==57) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:48:25: conjuncionP
                    {
                    pushFollow(FOLLOW_conjuncionP_in_conjuncion563);
                    conjuncionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:48:39: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "conjuncion"



    // $ANTLR start "conjuncionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:49:1: conjuncionP : '&&' relacion ( conjuncionP |) ;
    public final void conjuncionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:49:14: ( '&&' relacion ( conjuncionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:49:16: '&&' relacion ( conjuncionP |)
            {
            match(input,23,FOLLOW_23_in_conjuncionP575); 

            pushFollow(FOLLOW_relacion_in_conjuncionP577);
            relacion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:49:30: ( conjuncionP |)
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            else if ( (LA18_0==25||LA18_0==30||LA18_0==40||LA18_0==57) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:49:31: conjuncionP
                    {
                    pushFollow(FOLLOW_conjuncionP_in_conjuncionP580);
                    conjuncionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:49:45: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "conjuncionP"



    // $ANTLR start "relacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:50:1: relacion : adicion ( relacionP |) ;
    public final void relacion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:50:11: ( adicion ( relacionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:50:13: adicion ( relacionP |)
            {
            pushFollow(FOLLOW_adicion_in_relacion592);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:50:21: ( relacionP |)
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            else if ( (LA19_0==23||LA19_0==25||LA19_0==30||LA19_0==40||LA19_0==57) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:50:22: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacion595);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:50:34: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relacion"



    // $ANTLR start "relacionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:1: relacionP : '<' adicion ( relacionP |) '<=' adicion ( relacionP |) '>' adicion ( relacionP |) '>=' adicion ( relacionP |) '==' adicion ( relacionP |) '!=' adicion ( relacionP |) ;
    public final void relacionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:12: ( '<' adicion ( relacionP |) '<=' adicion ( relacionP |) '>' adicion ( relacionP |) '>=' adicion ( relacionP |) '==' adicion ( relacionP |) '!=' adicion ( relacionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:14: '<' adicion ( relacionP |) '<=' adicion ( relacionP |) '>' adicion ( relacionP |) '>=' adicion ( relacionP |) '==' adicion ( relacionP |) '!=' adicion ( relacionP |)
            {
            match(input,41,FOLLOW_41_in_relacionP607); 

            pushFollow(FOLLOW_adicion_in_relacionP609);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:26: ( relacionP |)
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            else if ( (LA20_0==42) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:27: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP612);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:39: 
                    {
                    }
                    break;

            }


            match(input,42,FOLLOW_42_in_relacionP617); 

            pushFollow(FOLLOW_adicion_in_relacionP619);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:53: ( relacionP |)
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            else if ( (LA21_0==45) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:54: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP622);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:66: 
                    {
                    }
                    break;

            }


            match(input,45,FOLLOW_45_in_relacionP627); 

            pushFollow(FOLLOW_adicion_in_relacionP629);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:79: ( relacionP |)
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            else if ( (LA22_0==46) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:80: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP632);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:92: 
                    {
                    }
                    break;

            }


            match(input,46,FOLLOW_46_in_relacionP637); 

            pushFollow(FOLLOW_adicion_in_relacionP639);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:106: ( relacionP |)
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            else if ( (LA23_0==44) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:107: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP642);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:51:119: 
                    {
                    }
                    break;

            }


            match(input,44,FOLLOW_44_in_relacionP652); 

            pushFollow(FOLLOW_adicion_in_relacionP654);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:52:18: ( relacionP |)
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            else if ( (LA24_0==16) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:52:19: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP657);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:52:31: 
                    {
                    }
                    break;

            }


            match(input,16,FOLLOW_16_in_relacionP662); 

            pushFollow(FOLLOW_adicion_in_relacionP664);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:52:45: ( relacionP |)
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            else if ( (LA25_0==16||LA25_0==23||LA25_0==25||LA25_0==30||LA25_0==40||LA25_0==42||(LA25_0 >= 44 && LA25_0 <= 46)||LA25_0==57) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:52:46: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP667);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:52:58: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relacionP"



    // $ANTLR start "adicion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:53:1: adicion : termino ( adicionP |) ;
    public final void adicion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:53:11: ( termino ( adicionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:53:13: termino ( adicionP |)
            {
            pushFollow(FOLLOW_termino_in_adicion680);
            termino();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:53:21: ( adicionP |)
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28||LA26_0==31) ) {
                alt26=1;
            }
            else if ( (LA26_0==16||LA26_0==23||LA26_0==25||LA26_0==30||(LA26_0 >= 40 && LA26_0 <= 42)||(LA26_0 >= 44 && LA26_0 <= 46)||LA26_0==57) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:53:22: adicionP
                    {
                    pushFollow(FOLLOW_adicionP_in_adicion683);
                    adicionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:53:33: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "adicion"



    // $ANTLR start "adicionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:54:1: adicionP : ( '+' termino ( adicionP |) | '-' termino ( adicionP |) );
    public final void adicionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:54:11: ( '+' termino ( adicionP |) | '-' termino ( adicionP |) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            else if ( (LA29_0==31) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:54:13: '+' termino ( adicionP |)
                    {
                    match(input,28,FOLLOW_28_in_adicionP695); 

                    pushFollow(FOLLOW_termino_in_adicionP697);
                    termino();

                    state._fsp--;


                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:54:25: ( adicionP |)
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==28||LA27_0==31) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==16||LA27_0==23||LA27_0==25||LA27_0==30||(LA27_0 >= 40 && LA27_0 <= 42)||(LA27_0 >= 44 && LA27_0 <= 46)||LA27_0==57) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }
                    switch (alt27) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:54:26: adicionP
                            {
                            pushFollow(FOLLOW_adicionP_in_adicionP700);
                            adicionP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:54:37: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:54:41: '-' termino ( adicionP |)
                    {
                    match(input,31,FOLLOW_31_in_adicionP708); 

                    pushFollow(FOLLOW_termino_in_adicionP710);
                    termino();

                    state._fsp--;


                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:54:53: ( adicionP |)
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==28||LA28_0==31) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==16||LA28_0==23||LA28_0==25||LA28_0==30||(LA28_0 >= 40 && LA28_0 <= 42)||(LA28_0 >= 44 && LA28_0 <= 46)||LA28_0==57) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;

                    }
                    switch (alt28) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:54:54: adicionP
                            {
                            pushFollow(FOLLOW_adicionP_in_adicionP713);
                            adicionP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:54:65: 
                            {
                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "adicionP"



    // $ANTLR start "termino"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:55:1: termino : negacion ( terminoP |) ;
    public final void termino() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:55:11: ( negacion ( terminoP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:55:13: negacion ( terminoP |)
            {
            pushFollow(FOLLOW_negacion_in_termino726);
            negacion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:55:22: ( terminoP |)
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26||LA30_0==36) ) {
                alt30=1;
            }
            else if ( (LA30_0==16||LA30_0==23||LA30_0==25||LA30_0==28||(LA30_0 >= 30 && LA30_0 <= 31)||(LA30_0 >= 40 && LA30_0 <= 42)||(LA30_0 >= 44 && LA30_0 <= 46)||LA30_0==57) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:55:23: terminoP
                    {
                    pushFollow(FOLLOW_terminoP_in_termino729);
                    terminoP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:55:34: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "termino"



    // $ANTLR start "terminoP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:1: terminoP : ( '*' negacion ( terminoP |) | '//' negacion ( terminoP |) );
    public final void terminoP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:11: ( '*' negacion ( terminoP |) | '//' negacion ( terminoP |) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            else if ( (LA33_0==36) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:13: '*' negacion ( terminoP |)
                    {
                    match(input,26,FOLLOW_26_in_terminoP741); 

                    pushFollow(FOLLOW_negacion_in_terminoP743);
                    negacion();

                    state._fsp--;


                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:26: ( terminoP |)
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==26||LA31_0==36) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==16||LA31_0==23||LA31_0==25||LA31_0==28||(LA31_0 >= 30 && LA31_0 <= 31)||(LA31_0 >= 40 && LA31_0 <= 42)||(LA31_0 >= 44 && LA31_0 <= 46)||LA31_0==57) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;

                    }
                    switch (alt31) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:27: terminoP
                            {
                            pushFollow(FOLLOW_terminoP_in_terminoP746);
                            terminoP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:38: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:42: '//' negacion ( terminoP |)
                    {
                    match(input,36,FOLLOW_36_in_terminoP754); 

                    pushFollow(FOLLOW_negacion_in_terminoP756);
                    negacion();

                    state._fsp--;


                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:56: ( terminoP |)
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==26||LA32_0==36) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==16||LA32_0==23||LA32_0==25||LA32_0==28||(LA32_0 >= 30 && LA32_0 <= 31)||(LA32_0 >= 40 && LA32_0 <= 42)||(LA32_0 >= 44 && LA32_0 <= 46)||LA32_0==57) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }
                    switch (alt32) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:57: terminoP
                            {
                            pushFollow(FOLLOW_terminoP_in_terminoP759);
                            terminoP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:68: 
                            {
                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "terminoP"



    // $ANTLR start "negacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:57:1: negacion : ( factor | '!' factor );
    public final void negacion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:57:11: ( factor | '!' factor )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0 >= ALIASA && LA34_0 <= Bool)||(LA34_0 >= Fecha && LA34_0 <= LengTipo)||LA34_0==String||LA34_0==24||(LA34_0 >= 32 && LA34_0 <= 34)||LA34_0==53) ) {
                alt34=1;
            }
            else if ( (LA34_0==15) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:57:13: factor
                    {
                    pushFollow(FOLLOW_factor_in_negacion771);
                    factor();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:57:22: '!' factor
                    {
                    match(input,15,FOLLOW_15_in_negacion775); 

                    pushFollow(FOLLOW_factor_in_negacion776);
                    factor();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "negacion"



    // $ANTLR start "factor"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:58:1: factor : ( ALIASA | tripleta | literal | '(' expresion ')' );
    public final void factor() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:58:10: ( ALIASA | tripleta | literal | '(' expresion ')' )
            int alt35=4;
            switch ( input.LA(1) ) {
            case ALIASA:
                {
                alt35=1;
                }
                break;
            case LengTipo:
                {
                alt35=2;
                }
                break;
            case Bool:
            case Fecha:
            case Hora:
            case Int:
            case String:
            case 32:
            case 33:
            case 34:
            case 53:
                {
                alt35=3;
                }
                break;
            case 24:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:58:12: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_factor785); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:58:21: tripleta
                    {
                    pushFollow(FOLLOW_tripleta_in_factor789);
                    tripleta();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:58:32: literal
                    {
                    pushFollow(FOLLOW_literal_in_factor793);
                    literal();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:58:42: '(' expresion ')'
                    {
                    match(input,24,FOLLOW_24_in_factor797); 

                    pushFollow(FOLLOW_expresion_in_factor799);
                    expresion();

                    state._fsp--;


                    match(input,25,FOLLOW_25_in_factor802); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "listLengFns"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:62:1: listLengFns : '%=' literal ALIASA '(' literal ALIASA ( ',' ( literal ALIASA ) )* ')' '{' instrucciones '}' '=%' ;
    public final void listLengFns() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:62:14: ( '%=' literal ALIASA '(' literal ALIASA ( ',' ( literal ALIASA ) )* ')' '{' instrucciones '}' '=%' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:62:16: '%=' literal ALIASA '(' literal ALIASA ( ',' ( literal ALIASA ) )* ')' '{' instrucciones '}' '=%'
            {
            match(input,22,FOLLOW_22_in_listLengFns813); 

            pushFollow(FOLLOW_literal_in_listLengFns815);
            literal();

            state._fsp--;


            match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns817); 

            match(input,24,FOLLOW_24_in_listLengFns819); 

            pushFollow(FOLLOW_literal_in_listLengFns821);
            literal();

            state._fsp--;


            match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns823); 

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:62:55: ( ',' ( literal ALIASA ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:62:56: ',' ( literal ALIASA )
            	    {
            	    match(input,30,FOLLOW_30_in_listLengFns826); 

            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:62:59: ( literal ALIASA )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:62:60: literal ALIASA
            	    {
            	    pushFollow(FOLLOW_literal_in_listLengFns828);
            	    literal();

            	    state._fsp--;


            	    match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns830); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            match(input,25,FOLLOW_25_in_listLengFns835); 

            match(input,56,FOLLOW_56_in_listLengFns837); 

            pushFollow(FOLLOW_instrucciones_in_listLengFns839);
            instrucciones();

            state._fsp--;


            match(input,58,FOLLOW_58_in_listLengFns841); 

            match(input,43,FOLLOW_43_in_listLengFns843); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listLengFns"



    // $ANTLR start "literal"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:63:1: literal : ( Int | Bool | Fecha | Hora | file | listLengClases | String );
    public final void literal() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:63:11: ( Int | Bool | Fecha | Hora | file | listLengClases | String )
            int alt37=7;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt37=1;
                }
                break;
            case Bool:
                {
                alt37=2;
                }
                break;
            case Fecha:
                {
                alt37=3;
                }
                break;
            case Hora:
                {
                alt37=4;
                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt37=5;
                }
                break;
            case 53:
                {
                alt37=6;
                }
                break;
            case String:
                {
                alt37=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:63:13: Int
                    {
                    match(input,Int,FOLLOW_Int_in_literal852); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:63:19: Bool
                    {
                    match(input,Bool,FOLLOW_Bool_in_literal856); 

                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:63:26: Fecha
                    {
                    match(input,Fecha,FOLLOW_Fecha_in_literal860); 

                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:63:34: Hora
                    {
                    match(input,Hora,FOLLOW_Hora_in_literal864); 

                    }
                    break;
                case 5 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:63:41: file
                    {
                    pushFollow(FOLLOW_file_in_literal868);
                    file();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:63:48: listLengClases
                    {
                    pushFollow(FOLLOW_listLengClases_in_literal872);
                    listLengClases();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:63:65: String
                    {
                    match(input,String,FOLLOW_String_in_literal876); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "literal"



    // $ANTLR start "file"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:68:1: file : ubicacionA ;
    public final void file() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:68:8: ( ubicacionA )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:68:10: ubicacionA
            {
            pushFollow(FOLLOW_ubicacionA_in_file1020);
            ubicacionA();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "file"



    // $ANTLR start "z"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:70:1: z : ( listVariables listInstrucciones |);
    public final void z() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:70:5: ( listVariables listInstrucciones |)
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==LengTipo) ) {
                alt38=1;
            }
            else if ( (LA38_0==EOF) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:70:7: listVariables listInstrucciones
                    {
                    pushFollow(FOLLOW_listVariables_in_z1057);
                    listVariables();

                    state._fsp--;


                    pushFollow(FOLLOW_listInstrucciones_in_z1059);
                    listInstrucciones();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:70:41: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "z"



    // $ANTLR start "listVariables"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:71:1: listVariables : ( lengVar )+ ;
    public final void listVariables() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:71:16: ( ( lengVar )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:71:18: ( lengVar )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:71:18: ( lengVar )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LengTipo) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:71:19: lengVar
            	    {
            	    pushFollow(FOLLOW_lengVar_in_listVariables1071);
            	    lengVar();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listVariables"



    // $ANTLR start "lengVar"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:72:1: lengVar : LengTipo ALIASA ';' ;
    public final void lengVar() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:72:11: ( LengTipo ALIASA ';' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:72:13: LengTipo ALIASA ';'
            {
            match(input,LengTipo,FOLLOW_LengTipo_in_lengVar1082); 

            match(input,ALIASA,FOLLOW_ALIASA_in_lengVar1084); 

            match(input,40,FOLLOW_40_in_lengVar1086); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lengVar"



    // $ANTLR start "listInstrucciones"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:1: listInstrucciones : ( ( instrucciones )+ |);
    public final void listInstrucciones() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:20: ( ( instrucciones )+ |)
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ALIASA||LA41_0==49||LA41_0==55) ) {
                alt41=1;
            }
            else if ( (LA41_0==EOF||LA41_0==58) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:22: ( instrucciones )+
                    {
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:22: ( instrucciones )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==ALIASA||LA40_0==49||LA40_0==55) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:23: instrucciones
                    	    {
                    	    pushFollow(FOLLOW_instrucciones_in_listInstrucciones1095);
                    	    instrucciones();

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
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:41: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listInstrucciones"



    // $ANTLR start "instrucciones"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:74:1: instrucciones : ( asignacion | ciclo | condicion );
    public final void instrucciones() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:74:16: ( asignacion | ciclo | condicion )
            int alt42=3;
            switch ( input.LA(1) ) {
            case ALIASA:
                {
                alt42=1;
                }
                break;
            case 55:
                {
                alt42=2;
                }
                break;
            case 49:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:74:19: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_instrucciones1109);
                    asignacion();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:74:32: ciclo
                    {
                    pushFollow(FOLLOW_ciclo_in_instrucciones1113);
                    ciclo();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:74:40: condicion
                    {
                    pushFollow(FOLLOW_condicion_in_instrucciones1117);
                    condicion();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "instrucciones"



    // $ANTLR start "condicion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:75:1: condicion : condicionP 'else' '{' listInstrucciones '}' ;
    public final void condicion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:75:12: ( condicionP 'else' '{' listInstrucciones '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:75:14: condicionP 'else' '{' listInstrucciones '}'
            {
            pushFollow(FOLLOW_condicionP_in_condicion1125);
            condicionP();

            state._fsp--;


            match(input,48,FOLLOW_48_in_condicion1127); 

            match(input,56,FOLLOW_56_in_condicion1129); 

            pushFollow(FOLLOW_listInstrucciones_in_condicion1131);
            listInstrucciones();

            state._fsp--;


            match(input,58,FOLLOW_58_in_condicion1133); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "condicion"



    // $ANTLR start "condicionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:76:1: condicionP : 'if' '(' expresion ')' '{' listInstrucciones '}' ;
    public final void condicionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:76:13: ( 'if' '(' expresion ')' '{' listInstrucciones '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:76:15: 'if' '(' expresion ')' '{' listInstrucciones '}'
            {
            match(input,49,FOLLOW_49_in_condicionP1141); 

            match(input,24,FOLLOW_24_in_condicionP1143); 

            pushFollow(FOLLOW_expresion_in_condicionP1145);
            expresion();

            state._fsp--;


            match(input,25,FOLLOW_25_in_condicionP1147); 

            match(input,56,FOLLOW_56_in_condicionP1149); 

            pushFollow(FOLLOW_listInstrucciones_in_condicionP1151);
            listInstrucciones();

            state._fsp--;


            match(input,58,FOLLOW_58_in_condicionP1153); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "condicionP"



    // $ANTLR start "ciclo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:77:1: ciclo : 'while' '(' expresion ')' '{' listInstrucciones '}' ;
    public final void ciclo() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:77:9: ( 'while' '(' expresion ')' '{' listInstrucciones '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:77:11: 'while' '(' expresion ')' '{' listInstrucciones '}'
            {
            match(input,55,FOLLOW_55_in_ciclo1162); 

            match(input,24,FOLLOW_24_in_ciclo1164); 

            pushFollow(FOLLOW_expresion_in_ciclo1166);
            expresion();

            state._fsp--;


            match(input,25,FOLLOW_25_in_ciclo1168); 

            match(input,56,FOLLOW_56_in_ciclo1170); 

            pushFollow(FOLLOW_listInstrucciones_in_ciclo1172);
            listInstrucciones();

            state._fsp--;


            match(input,58,FOLLOW_58_in_ciclo1174); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ciclo"



    // $ANTLR start "asignacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:1: asignacion : ALIASA '~' expresion ';' ;
    public final void asignacion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:14: ( ALIASA '~' expresion ';' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:16: ALIASA '~' expresion ';'
            {
            match(input,ALIASA,FOLLOW_ALIASA_in_asignacion1183); 

            match(input,59,FOLLOW_59_in_asignacion1185); 

            pushFollow(FOLLOW_expresion_in_asignacion1187);
            expresion();

            state._fsp--;


            match(input,40,FOLLOW_40_in_asignacion1189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "asignacion"

    // Delegated rules


 

    public static final BitSet FOLLOW_md_in_prog35 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comments_in_md48 = new BitSet(new long[]{0x0020000810680002L});
    public static final BitSet FOLLOW_listLengArchivo_in_md52 = new BitSet(new long[]{0x0020000810680002L});
    public static final BitSet FOLLOW_listLengClases_in_md56 = new BitSet(new long[]{0x0020000810680002L});
    public static final BitSet FOLLOW_listLengComandos_in_md60 = new BitSet(new long[]{0x0020000810680002L});
    public static final BitSet FOLLOW_listLengFns_in_md64 = new BitSet(new long[]{0x0020000810680002L});
    public static final BitSet FOLLOW_listLengApp_in_md68 = new BitSet(new long[]{0x0020000810680002L});
    public static final BitSet FOLLOW_35_in_comments115 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Comentarios_in_comments117 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_comments119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_listLengArchivo130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengArchivo132 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_listLengArchivo134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengArchivo136 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_opcionesA_in_listLengArchivo138 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_listLengArchivo140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_opcionesA148 = new BitSet(new long[]{0x0400000700000180L});
    public static final BitSet FOLLOW_ubicacionA_in_opcionesA151 = new BitSet(new long[]{0x0400000000000180L});
    public static final BitSet FOLLOW_Fecha_in_opcionesA158 = new BitSet(new long[]{0x0400000000000100L});
    public static final BitSet FOLLOW_Hora_in_opcionesA165 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_opcionesA171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativa_in_ubicacionA179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ubicacionA184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_ubicacionA185 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_32_in_relativa196 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_relativa198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_relativa199 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_33_in_relativa205 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_relativa207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_relativa208 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_53_in_listLengClases320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengClases322 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_listLengClases324 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Comentarios_in_listLengClases325 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_listLengClases326 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_propiedad_in_listLengClases328 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_listLengClases330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tripleta_in_propiedad340 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LengTipo_in_tripleta350 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_tripleta352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_tripleta354 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_tripleta356 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_expresion_in_tripleta358 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_tripleta360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_listLengComandos370 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_listLengComandos372 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_listLengComandos374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengComandos376 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_listLengComandos378 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_listLengComandos380 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_UbicacionC_in_listLengComandos382 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_listLengComandos384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_listLengApp408 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Int_in_listLengApp410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengApp414 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_listLengApp416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_listLengApp418 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_listLengApp420 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_listLengApp422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoOUT_in_listLengApp424 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_listLengApp426 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_opcionesApp_in_listLengApp428 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_descripcionApp_in_listLengApp430 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_listLengApp432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoIN440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoIN446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoIN450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_argumentoIN452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoIN458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_argumentoIN460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_archivo470 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_archivo472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_archivo474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoOUT482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoOUT488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_opcionesApp497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_opcionesApp499 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_opcionesApp_in_opcionesApp501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_opcionesApp505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_opcionesApp507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_descripcionApp515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjuncion_in_expresion528 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_expresionP_in_expresion531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_expresionP543 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_conjuncion_in_expresionP545 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_expresionP_in_expresionP548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relacion_in_conjuncion560 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_conjuncionP_in_conjuncion563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_conjuncionP575 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_relacion_in_conjuncionP577 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_conjuncionP_in_conjuncionP580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adicion_in_relacion592 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacion595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_relacionP607 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_adicion_in_relacionP609 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP612 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_relacionP617 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_adicion_in_relacionP619 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP622 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_relacionP627 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_adicion_in_relacionP629 = new BitSet(new long[]{0x0000420000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP632 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_relacionP637 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_adicion_in_relacionP639 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP642 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_relacionP652 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_adicion_in_relacionP654 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP657 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_relacionP662 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_adicion_in_relacionP664 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacionP667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termino_in_adicion680 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_adicionP_in_adicion683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_adicionP695 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_termino_in_adicionP697 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_adicionP_in_adicionP700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_adicionP708 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_termino_in_adicionP710 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_adicionP_in_adicionP713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negacion_in_termino726 = new BitSet(new long[]{0x0000001004000002L});
    public static final BitSet FOLLOW_terminoP_in_termino729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_terminoP741 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_negacion_in_terminoP743 = new BitSet(new long[]{0x0000001004000002L});
    public static final BitSet FOLLOW_terminoP_in_terminoP746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_terminoP754 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_negacion_in_terminoP756 = new BitSet(new long[]{0x0000001004000002L});
    public static final BitSet FOLLOW_terminoP_in_terminoP759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_negacion771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_negacion775 = new BitSet(new long[]{0x00200007010017B0L});
    public static final BitSet FOLLOW_factor_in_negacion776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_factor785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tripleta_in_factor789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_factor797 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_expresion_in_factor799 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_factor802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_listLengFns813 = new BitSet(new long[]{0x00200007000013A0L});
    public static final BitSet FOLLOW_literal_in_listLengFns815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns817 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_listLengFns819 = new BitSet(new long[]{0x00200007000013A0L});
    public static final BitSet FOLLOW_literal_in_listLengFns821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns823 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_30_in_listLengFns826 = new BitSet(new long[]{0x00200007000013A0L});
    public static final BitSet FOLLOW_literal_in_listLengFns828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns830 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_25_in_listLengFns835 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_listLengFns837 = new BitSet(new long[]{0x0082000000000010L});
    public static final BitSet FOLLOW_instrucciones_in_listLengFns839 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_listLengFns841 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_listLengFns843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Int_in_literal852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_literal856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fecha_in_literal860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Hora_in_literal864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_file_in_literal868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLengClases_in_literal872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_literal876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ubicacionA_in_file1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listVariables_in_z1057 = new BitSet(new long[]{0x0082000000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_z1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lengVar_in_listVariables1071 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LengTipo_in_lengVar1082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_lengVar1084 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_lengVar1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucciones_in_listInstrucciones1095 = new BitSet(new long[]{0x0082000000000012L});
    public static final BitSet FOLLOW_asignacion_in_instrucciones1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ciclo_in_instrucciones1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicion_in_instrucciones1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicionP_in_condicion1125 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_condicion1127 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_condicion1129 = new BitSet(new long[]{0x0482000000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_condicion1131 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_condicion1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_condicionP1141 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_condicionP1143 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_expresion_in_condicionP1145 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_condicionP1147 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_condicionP1149 = new BitSet(new long[]{0x0482000000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_condicionP1151 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_condicionP1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ciclo1162 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ciclo1164 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_expresion_in_ciclo1166 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ciclo1168 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ciclo1170 = new BitSet(new long[]{0x0482000000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_ciclo1172 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ciclo1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_asignacion1183 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_asignacion1185 = new BitSet(new long[]{0x00200007010097B0L});
    public static final BitSet FOLLOW_expresion_in_asignacion1187 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_asignacion1189 = new BitSet(new long[]{0x0000000000000002L});

}