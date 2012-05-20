// $ANTLR 3.4 /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g 2012-05-19 20:52:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class mdParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIASA", "Bool", "Fecha", "Hora", "Int", "LengTipo", "String", "UbicacionC", "'!'", "'!='", "'##'", "'#'", "'$$'", "'$'", "'%='", "'&&'", "'('", "')'", "'*'", "'+'", "'++'", "','", "'-'", "'.'", "'..'", "'/'", "'//'", "'/class'", "'/in'", "'/out'", "':'", "';'", "'<'", "'<='", "'=%'", "'=='", "'>'", "'>='", "'class'", "'dir'", "'else'", "'if'", "'in'", "'nombre'", "'out'", "'while'", "'{'", "'||'", "'}'", "'~'"
    };

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
    public static final int ALIASA=4;
    public static final int Bool=5;
    public static final int Fecha=6;
    public static final int Hora=7;
    public static final int Int=8;
    public static final int LengTipo=9;
    public static final int String=10;
    public static final int UbicacionC=11;

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

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return mdParser.tokenNames; }
    public String getGrammarFileName() { return "/home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g"; }


    protected void mismatch(IntStream input, int ttype, BitSet follow)
        throws RecognitionException
    {
        throw new MismatchedTokenException(ttype, input);
    }

    public Object recoverFromMismatchedSet(IntStream input,
                                         RecognitionException e,
                                         BitSet follow)
        throws RecognitionException
    {
        throw e;
    }
            

    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:32:1: prog : md EOF ;
    public final mdParser.prog_return prog() throws RecognitionException {
        mdParser.prog_return retval = new mdParser.prog_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        mdParser.md_return md1 =null;


        Object EOF2_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:32:11: ( md EOF )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:32:19: md EOF
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_md_in_prog79);
            md1=md();

            state._fsp--;

            adaptor.addChild(root_0, md1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog81); 
            EOF2_tree = 
            (Object)adaptor.create(EOF2)
            ;
            adaptor.addChild(root_0, EOF2_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class md_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "md"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:1: md : ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+ ;
    public final mdParser.md_return md() throws RecognitionException {
        mdParser.md_return retval = new mdParser.md_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.listLengArchivo_return listLengArchivo3 =null;

        mdParser.listLengClases_return listLengClases4 =null;

        mdParser.listLengComandos_return listLengComandos5 =null;

        mdParser.listLengFns_return listLengFns6 =null;

        mdParser.listLengApp_return listLengApp7 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:6: ( ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:8: ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:8: ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+
            int cnt1=0;
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    alt1=1;
                    }
                    break;
                case 42:
                    {
                    alt1=2;
                    }
                    break;
                case 23:
                    {
                    alt1=3;
                    }
                    break;
                case 18:
                    {
                    alt1=4;
                    }
                    break;
                case 15:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:9: listLengArchivo
            	    {
            	    pushFollow(FOLLOW_listLengArchivo_in_md91);
            	    listLengArchivo3=listLengArchivo();

            	    state._fsp--;

            	    adaptor.addChild(root_0, listLengArchivo3.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:27: listLengClases
            	    {
            	    pushFollow(FOLLOW_listLengClases_in_md95);
            	    listLengClases4=listLengClases();

            	    state._fsp--;

            	    adaptor.addChild(root_0, listLengClases4.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:44: listLengComandos
            	    {
            	    pushFollow(FOLLOW_listLengComandos_in_md99);
            	    listLengComandos5=listLengComandos();

            	    state._fsp--;

            	    adaptor.addChild(root_0, listLengComandos5.getTree());

            	    }
            	    break;
            	case 4 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:63: listLengFns
            	    {
            	    pushFollow(FOLLOW_listLengFns_in_md103);
            	    listLengFns6=listLengFns();

            	    state._fsp--;

            	    adaptor.addChild(root_0, listLengFns6.getTree());

            	    }
            	    break;
            	case 5 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:33:77: listLengApp
            	    {
            	    pushFollow(FOLLOW_listLengApp_in_md107);
            	    listLengApp7=listLengApp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, listLengApp7.getTree());

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

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "md"


    public static class listLengArchivo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listLengArchivo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:42:1: listLengArchivo : '$' ALIASA '.' ALIASA opcionesA '$$' ;
    public final mdParser.listLengArchivo_return listLengArchivo() throws RecognitionException {
        mdParser.listLengArchivo_return retval = new mdParser.listLengArchivo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal8=null;
        Token ALIASA9=null;
        Token char_literal10=null;
        Token ALIASA11=null;
        Token string_literal13=null;
        mdParser.opcionesA_return opcionesA12 =null;


        Object char_literal8_tree=null;
        Object ALIASA9_tree=null;
        Object char_literal10_tree=null;
        Object ALIASA11_tree=null;
        Object string_literal13_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:42:18: ( '$' ALIASA '.' ALIASA opcionesA '$$' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:42:20: '$' ALIASA '.' ALIASA opcionesA '$$'
            {
            root_0 = (Object)adaptor.nil();


            char_literal8=(Token)match(input,17,FOLLOW_17_in_listLengArchivo155); 
            char_literal8_tree = 
            (Object)adaptor.create(char_literal8)
            ;
            adaptor.addChild(root_0, char_literal8_tree);


            ALIASA9=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_listLengArchivo157); 
            ALIASA9_tree = 
            (Object)adaptor.create(ALIASA9)
            ;
            adaptor.addChild(root_0, ALIASA9_tree);


            char_literal10=(Token)match(input,27,FOLLOW_27_in_listLengArchivo159); 
            char_literal10_tree = 
            (Object)adaptor.create(char_literal10)
            ;
            adaptor.addChild(root_0, char_literal10_tree);


            ALIASA11=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_listLengArchivo161); 
            ALIASA11_tree = 
            (Object)adaptor.create(ALIASA11)
            ;
            adaptor.addChild(root_0, ALIASA11_tree);


            pushFollow(FOLLOW_opcionesA_in_listLengArchivo163);
            opcionesA12=opcionesA();

            state._fsp--;

            adaptor.addChild(root_0, opcionesA12.getTree());

            string_literal13=(Token)match(input,16,FOLLOW_16_in_listLengArchivo165); 
            string_literal13_tree = 
            (Object)adaptor.create(string_literal13)
            ;
            adaptor.addChild(root_0, string_literal13_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listLengArchivo"


    public static class opcionesA_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opcionesA"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:1: opcionesA : '{' ( ubicacionA |) ( Fecha |) ( Hora |) '}' ;
    public final mdParser.opcionesA_return opcionesA() throws RecognitionException {
        mdParser.opcionesA_return retval = new mdParser.opcionesA_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal14=null;
        Token Fecha16=null;
        Token Hora17=null;
        Token char_literal18=null;
        mdParser.ubicacionA_return ubicacionA15 =null;


        Object char_literal14_tree=null;
        Object Fecha16_tree=null;
        Object Hora17_tree=null;
        Object char_literal18_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:12: ( '{' ( ubicacionA |) ( Fecha |) ( Hora |) '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:14: '{' ( ubicacionA |) ( Fecha |) ( Hora |) '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal14=(Token)match(input,50,FOLLOW_50_in_opcionesA173); 
            char_literal14_tree = 
            (Object)adaptor.create(char_literal14)
            ;
            adaptor.addChild(root_0, char_literal14_tree);


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:18: ( ubicacionA |)
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 27 && LA2_0 <= 29)) ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= Fecha && LA2_0 <= Hora)||LA2_0==52) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:19: ubicacionA
                    {
                    pushFollow(FOLLOW_ubicacionA_in_opcionesA176);
                    ubicacionA15=ubicacionA();

                    state._fsp--;

                    adaptor.addChild(root_0, ubicacionA15.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:32: 
                    {
                    }
                    break;

            }


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:34: ( Fecha |)
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Fecha) ) {
                alt3=1;
            }
            else if ( (LA3_0==Hora||LA3_0==52) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:35: Fecha
                    {
                    Fecha16=(Token)match(input,Fecha,FOLLOW_Fecha_in_opcionesA183); 
                    Fecha16_tree = 
                    (Object)adaptor.create(Fecha16)
                    ;
                    adaptor.addChild(root_0, Fecha16_tree);


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:43: 
                    {
                    }
                    break;

            }


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:45: ( Hora |)
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Hora) ) {
                alt4=1;
            }
            else if ( (LA4_0==52) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:46: Hora
                    {
                    Hora17=(Token)match(input,Hora,FOLLOW_Hora_in_opcionesA190); 
                    Hora17_tree = 
                    (Object)adaptor.create(Hora17)
                    ;
                    adaptor.addChild(root_0, Hora17_tree);


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:43:53: 
                    {
                    }
                    break;

            }


            char_literal18=(Token)match(input,52,FOLLOW_52_in_opcionesA196); 
            char_literal18_tree = 
            (Object)adaptor.create(char_literal18)
            ;
            adaptor.addChild(root_0, char_literal18_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opcionesA"


    public static class ubicacionA_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ubicacionA"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:44:1: ubicacionA : ( relativa | absoluta );
    public final mdParser.ubicacionA_return ubicacionA() throws RecognitionException {
        mdParser.ubicacionA_return retval = new mdParser.ubicacionA_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.relativa_return relativa19 =null;

        mdParser.absoluta_return absoluta20 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:44:13: ( relativa | absoluta )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= 27 && LA5_0 <= 28)) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:44:15: relativa
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_relativa_in_ubicacionA204);
                    relativa19=relativa();

                    state._fsp--;

                    adaptor.addChild(root_0, relativa19.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:44:26: absoluta
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_absoluta_in_ubicacionA208);
                    absoluta20=absoluta();

                    state._fsp--;

                    adaptor.addChild(root_0, absoluta20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ubicacionA"


    public static class absoluta_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "absoluta"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:45:1: absoluta : ( '/' ALIASA )+ ;
    public final mdParser.absoluta_return absoluta() throws RecognitionException {
        mdParser.absoluta_return retval = new mdParser.absoluta_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal21=null;
        Token ALIASA22=null;

        Object char_literal21_tree=null;
        Object ALIASA22_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:45:11: ( ( '/' ALIASA )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:45:13: ( '/' ALIASA )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:45:13: ( '/' ALIASA )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:45:14: '/' ALIASA
            	    {
            	    char_literal21=(Token)match(input,29,FOLLOW_29_in_absoluta217); 
            	    char_literal21_tree = 
            	    (Object)adaptor.create(char_literal21)
            	    ;
            	    adaptor.addChild(root_0, char_literal21_tree);


            	    ALIASA22=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_absoluta218); 
            	    ALIASA22_tree = 
            	    (Object)adaptor.create(ALIASA22)
            	    ;
            	    adaptor.addChild(root_0, ALIASA22_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "absoluta"


    public static class relativa_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relativa"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:1: relativa : ( '.' ( '/' ALIASA )+ | '..' ( '/' ALIASA )* );
    public final mdParser.relativa_return relativa() throws RecognitionException {
        mdParser.relativa_return retval = new mdParser.relativa_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal23=null;
        Token char_literal24=null;
        Token ALIASA25=null;
        Token string_literal26=null;
        Token char_literal27=null;
        Token ALIASA28=null;

        Object char_literal23_tree=null;
        Object char_literal24_tree=null;
        Object ALIASA25_tree=null;
        Object string_literal26_tree=null;
        Object char_literal27_tree=null;
        Object ALIASA28_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:11: ( '.' ( '/' ALIASA )+ | '..' ( '/' ALIASA )* )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:13: '.' ( '/' ALIASA )+
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal23=(Token)match(input,27,FOLLOW_27_in_relativa228); 
                    char_literal23_tree = 
                    (Object)adaptor.create(char_literal23)
                    ;
                    adaptor.addChild(root_0, char_literal23_tree);


                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:16: ( '/' ALIASA )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==29) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:17: '/' ALIASA
                    	    {
                    	    char_literal24=(Token)match(input,29,FOLLOW_29_in_relativa230); 
                    	    char_literal24_tree = 
                    	    (Object)adaptor.create(char_literal24)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal24_tree);


                    	    ALIASA25=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_relativa231); 
                    	    ALIASA25_tree = 
                    	    (Object)adaptor.create(ALIASA25)
                    	    ;
                    	    adaptor.addChild(root_0, ALIASA25_tree);


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
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:31: '..' ( '/' ALIASA )*
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal26=(Token)match(input,28,FOLLOW_28_in_relativa237); 
                    string_literal26_tree = 
                    (Object)adaptor.create(string_literal26)
                    ;
                    adaptor.addChild(root_0, string_literal26_tree);


                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:35: ( '/' ALIASA )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==29) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:46:36: '/' ALIASA
                    	    {
                    	    char_literal27=(Token)match(input,29,FOLLOW_29_in_relativa239); 
                    	    char_literal27_tree = 
                    	    (Object)adaptor.create(char_literal27)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal27_tree);


                    	    ALIASA28=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_relativa240); 
                    	    ALIASA28_tree = 
                    	    (Object)adaptor.create(ALIASA28)
                    	    ;
                    	    adaptor.addChild(root_0, ALIASA28_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relativa"


    public static class listLengClases_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listLengClases"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:53:1: listLengClases : 'class' ALIASA ( ALIASA )+ propiedad '/class' ;
    public final mdParser.listLengClases_return listLengClases() throws RecognitionException {
        mdParser.listLengClases_return retval = new mdParser.listLengClases_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal29=null;
        Token ALIASA30=null;
        Token ALIASA31=null;
        Token string_literal33=null;
        mdParser.propiedad_return propiedad32 =null;


        Object string_literal29_tree=null;
        Object ALIASA30_tree=null;
        Object ALIASA31_tree=null;
        Object string_literal33_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:53:17: ( 'class' ALIASA ( ALIASA )+ propiedad '/class' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:53:19: 'class' ALIASA ( ALIASA )+ propiedad '/class'
            {
            root_0 = (Object)adaptor.nil();


            string_literal29=(Token)match(input,42,FOLLOW_42_in_listLengClases352); 
            string_literal29_tree = 
            (Object)adaptor.create(string_literal29)
            ;
            adaptor.addChild(root_0, string_literal29_tree);


            ALIASA30=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_listLengClases354); 
            ALIASA30_tree = 
            (Object)adaptor.create(ALIASA30)
            ;
            adaptor.addChild(root_0, ALIASA30_tree);


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:53:34: ( ALIASA )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ALIASA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:53:35: ALIASA
            	    {
            	    ALIASA31=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_listLengClases357); 
            	    ALIASA31_tree = 
            	    (Object)adaptor.create(ALIASA31)
            	    ;
            	    adaptor.addChild(root_0, ALIASA31_tree);


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


            pushFollow(FOLLOW_propiedad_in_listLengClases361);
            propiedad32=propiedad();

            state._fsp--;

            adaptor.addChild(root_0, propiedad32.getTree());

            string_literal33=(Token)match(input,31,FOLLOW_31_in_listLengClases363); 
            string_literal33_tree = 
            (Object)adaptor.create(string_literal33)
            ;
            adaptor.addChild(root_0, string_literal33_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listLengClases"


    public static class propiedad_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propiedad"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:55:1: propiedad : ( tripleta )+ ;
    public final mdParser.propiedad_return propiedad() throws RecognitionException {
        mdParser.propiedad_return retval = new mdParser.propiedad_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.tripleta_return tripleta34 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:55:12: ( ( tripleta )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:55:14: ( tripleta )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:55:14: ( tripleta )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LengTipo) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:55:15: tripleta
            	    {
            	    pushFollow(FOLLOW_tripleta_in_propiedad373);
            	    tripleta34=tripleta();

            	    state._fsp--;

            	    adaptor.addChild(root_0, tripleta34.getTree());

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


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "propiedad"


    public static class tripleta_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tripleta"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:1: tripleta : LengTipo ':' ALIASA '~' expresion ',' ;
    public final mdParser.tripleta_return tripleta() throws RecognitionException {
        mdParser.tripleta_return retval = new mdParser.tripleta_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LengTipo35=null;
        Token char_literal36=null;
        Token ALIASA37=null;
        Token char_literal38=null;
        Token char_literal40=null;
        mdParser.expresion_return expresion39 =null;


        Object LengTipo35_tree=null;
        Object char_literal36_tree=null;
        Object ALIASA37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal40_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:11: ( LengTipo ':' ALIASA '~' expresion ',' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:56:13: LengTipo ':' ALIASA '~' expresion ','
            {
            root_0 = (Object)adaptor.nil();


            LengTipo35=(Token)match(input,LengTipo,FOLLOW_LengTipo_in_tripleta383); 
            LengTipo35_tree = 
            (Object)adaptor.create(LengTipo35)
            ;
            adaptor.addChild(root_0, LengTipo35_tree);


            char_literal36=(Token)match(input,34,FOLLOW_34_in_tripleta385); 
            char_literal36_tree = 
            (Object)adaptor.create(char_literal36)
            ;
            adaptor.addChild(root_0, char_literal36_tree);


            ALIASA37=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_tripleta387); 
            ALIASA37_tree = 
            (Object)adaptor.create(ALIASA37)
            ;
            adaptor.addChild(root_0, ALIASA37_tree);


            char_literal38=(Token)match(input,53,FOLLOW_53_in_tripleta389); 
            char_literal38_tree = 
            (Object)adaptor.create(char_literal38)
            ;
            adaptor.addChild(root_0, char_literal38_tree);


            pushFollow(FOLLOW_expresion_in_tripleta391);
            expresion39=expresion();

            state._fsp--;

            adaptor.addChild(root_0, expresion39.getTree());

            char_literal40=(Token)match(input,25,FOLLOW_25_in_tripleta393); 
            char_literal40_tree = 
            (Object)adaptor.create(char_literal40)
            ;
            adaptor.addChild(root_0, char_literal40_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tripleta"


    public static class listLengComandos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listLengComandos"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:60:1: listLengComandos : '+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++' ;
    public final mdParser.listLengComandos_return listLengComandos() throws RecognitionException {
        mdParser.listLengComandos_return retval = new mdParser.listLengComandos_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal41=null;
        Token string_literal42=null;
        Token char_literal43=null;
        Token ALIASA44=null;
        Token string_literal45=null;
        Token char_literal46=null;
        Token UbicacionC47=null;
        Token string_literal48=null;

        Object char_literal41_tree=null;
        Object string_literal42_tree=null;
        Object char_literal43_tree=null;
        Object ALIASA44_tree=null;
        Object string_literal45_tree=null;
        Object char_literal46_tree=null;
        Object UbicacionC47_tree=null;
        Object string_literal48_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:60:18: ( '+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:60:20: '+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++'
            {
            root_0 = (Object)adaptor.nil();


            char_literal41=(Token)match(input,23,FOLLOW_23_in_listLengComandos403); 
            char_literal41_tree = 
            (Object)adaptor.create(char_literal41)
            ;
            adaptor.addChild(root_0, char_literal41_tree);


            string_literal42=(Token)match(input,47,FOLLOW_47_in_listLengComandos405); 
            string_literal42_tree = 
            (Object)adaptor.create(string_literal42)
            ;
            adaptor.addChild(root_0, string_literal42_tree);


            char_literal43=(Token)match(input,53,FOLLOW_53_in_listLengComandos407); 
            char_literal43_tree = 
            (Object)adaptor.create(char_literal43)
            ;
            adaptor.addChild(root_0, char_literal43_tree);


            ALIASA44=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_listLengComandos409); 
            ALIASA44_tree = 
            (Object)adaptor.create(ALIASA44)
            ;
            adaptor.addChild(root_0, ALIASA44_tree);


            string_literal45=(Token)match(input,43,FOLLOW_43_in_listLengComandos411); 
            string_literal45_tree = 
            (Object)adaptor.create(string_literal45)
            ;
            adaptor.addChild(root_0, string_literal45_tree);


            char_literal46=(Token)match(input,53,FOLLOW_53_in_listLengComandos413); 
            char_literal46_tree = 
            (Object)adaptor.create(char_literal46)
            ;
            adaptor.addChild(root_0, char_literal46_tree);


            UbicacionC47=(Token)match(input,UbicacionC,FOLLOW_UbicacionC_in_listLengComandos415); 
            UbicacionC47_tree = 
            (Object)adaptor.create(UbicacionC47)
            ;
            adaptor.addChild(root_0, UbicacionC47_tree);


            string_literal48=(Token)match(input,24,FOLLOW_24_in_listLengComandos417); 
            string_literal48_tree = 
            (Object)adaptor.create(string_literal48)
            ;
            adaptor.addChild(root_0, string_literal48_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listLengComandos"


    public static class listLengApp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listLengApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:65:1: listLengApp : '#' Int ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##' ;
    public final mdParser.listLengApp_return listLengApp() throws RecognitionException {
        mdParser.listLengApp_return retval = new mdParser.listLengApp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal49=null;
        Token Int50=null;
        Token ALIASA51=null;
        Token string_literal52=null;
        Token string_literal54=null;
        Token string_literal55=null;
        Token string_literal57=null;
        Token string_literal60=null;
        mdParser.argumentoIN_return argumentoIN53 =null;

        mdParser.argumentoOUT_return argumentoOUT56 =null;

        mdParser.opcionesApp_return opcionesApp58 =null;

        mdParser.descripcionApp_return descripcionApp59 =null;


        Object char_literal49_tree=null;
        Object Int50_tree=null;
        Object ALIASA51_tree=null;
        Object string_literal52_tree=null;
        Object string_literal54_tree=null;
        Object string_literal55_tree=null;
        Object string_literal57_tree=null;
        Object string_literal60_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:65:14: ( '#' Int ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:65:16: '#' Int ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##'
            {
            root_0 = (Object)adaptor.nil();


            char_literal49=(Token)match(input,15,FOLLOW_15_in_listLengApp441); 
            char_literal49_tree = 
            (Object)adaptor.create(char_literal49)
            ;
            adaptor.addChild(root_0, char_literal49_tree);


            Int50=(Token)match(input,Int,FOLLOW_Int_in_listLengApp443); 
            Int50_tree = 
            (Object)adaptor.create(Int50)
            ;
            adaptor.addChild(root_0, Int50_tree);


            ALIASA51=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_listLengApp447); 
            ALIASA51_tree = 
            (Object)adaptor.create(ALIASA51)
            ;
            adaptor.addChild(root_0, ALIASA51_tree);


            string_literal52=(Token)match(input,46,FOLLOW_46_in_listLengApp449); 
            string_literal52_tree = 
            (Object)adaptor.create(string_literal52)
            ;
            adaptor.addChild(root_0, string_literal52_tree);


            pushFollow(FOLLOW_argumentoIN_in_listLengApp451);
            argumentoIN53=argumentoIN();

            state._fsp--;

            adaptor.addChild(root_0, argumentoIN53.getTree());

            string_literal54=(Token)match(input,32,FOLLOW_32_in_listLengApp453); 
            string_literal54_tree = 
            (Object)adaptor.create(string_literal54)
            ;
            adaptor.addChild(root_0, string_literal54_tree);


            string_literal55=(Token)match(input,48,FOLLOW_48_in_listLengApp455); 
            string_literal55_tree = 
            (Object)adaptor.create(string_literal55)
            ;
            adaptor.addChild(root_0, string_literal55_tree);


            pushFollow(FOLLOW_argumentoOUT_in_listLengApp457);
            argumentoOUT56=argumentoOUT();

            state._fsp--;

            adaptor.addChild(root_0, argumentoOUT56.getTree());

            string_literal57=(Token)match(input,33,FOLLOW_33_in_listLengApp459); 
            string_literal57_tree = 
            (Object)adaptor.create(string_literal57)
            ;
            adaptor.addChild(root_0, string_literal57_tree);


            pushFollow(FOLLOW_opcionesApp_in_listLengApp461);
            opcionesApp58=opcionesApp();

            state._fsp--;

            adaptor.addChild(root_0, opcionesApp58.getTree());

            pushFollow(FOLLOW_descripcionApp_in_listLengApp463);
            descripcionApp59=descripcionApp();

            state._fsp--;

            adaptor.addChild(root_0, descripcionApp59.getTree());

            string_literal60=(Token)match(input,14,FOLLOW_14_in_listLengApp465); 
            string_literal60_tree = 
            (Object)adaptor.create(string_literal60)
            ;
            adaptor.addChild(root_0, string_literal60_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listLengApp"


    public static class argumentoIN_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argumentoIN"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:66:1: argumentoIN : ( archivo | ALIASA | archivo argumentoIN | ALIASA argumentoIN );
    public final mdParser.argumentoIN_return argumentoIN() throws RecognitionException {
        mdParser.argumentoIN_return retval = new mdParser.argumentoIN_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ALIASA62=null;
        Token ALIASA65=null;
        mdParser.archivo_return archivo61 =null;

        mdParser.archivo_return archivo63 =null;

        mdParser.argumentoIN_return argumentoIN64 =null;

        mdParser.argumentoIN_return argumentoIN66 =null;


        Object ALIASA62_tree=null;
        Object ALIASA65_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:66:14: ( archivo | ALIASA | archivo argumentoIN | ALIASA argumentoIN )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ALIASA) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==ALIASA) ) {
                        int LA12_5 = input.LA(4);

                        if ( (LA12_5==32) ) {
                            alt12=1;
                        }
                        else if ( (LA12_5==ALIASA) ) {
                            alt12=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;

                    }
                    }
                    break;
                case 32:
                    {
                    alt12=2;
                    }
                    break;
                case ALIASA:
                    {
                    alt12=4;
                    }
                    break;
                default:
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
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:66:16: archivo
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_archivo_in_argumentoIN473);
                    archivo61=archivo();

                    state._fsp--;

                    adaptor.addChild(root_0, archivo61.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:66:36: ALIASA
                    {
                    root_0 = (Object)adaptor.nil();


                    ALIASA62=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_argumentoIN479); 
                    ALIASA62_tree = 
                    (Object)adaptor.create(ALIASA62)
                    ;
                    adaptor.addChild(root_0, ALIASA62_tree);


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:66:45: archivo argumentoIN
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_archivo_in_argumentoIN483);
                    archivo63=archivo();

                    state._fsp--;

                    adaptor.addChild(root_0, archivo63.getTree());

                    pushFollow(FOLLOW_argumentoIN_in_argumentoIN485);
                    argumentoIN64=argumentoIN();

                    state._fsp--;

                    adaptor.addChild(root_0, argumentoIN64.getTree());

                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:66:77: ALIASA argumentoIN
                    {
                    root_0 = (Object)adaptor.nil();


                    ALIASA65=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_argumentoIN491); 
                    ALIASA65_tree = 
                    (Object)adaptor.create(ALIASA65)
                    ;
                    adaptor.addChild(root_0, ALIASA65_tree);


                    pushFollow(FOLLOW_argumentoIN_in_argumentoIN493);
                    argumentoIN66=argumentoIN();

                    state._fsp--;

                    adaptor.addChild(root_0, argumentoIN66.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argumentoIN"


    public static class archivo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "archivo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:67:1: archivo : ALIASA '.' ALIASA ;
    public final mdParser.archivo_return archivo() throws RecognitionException {
        mdParser.archivo_return retval = new mdParser.archivo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ALIASA67=null;
        Token char_literal68=null;
        Token ALIASA69=null;

        Object ALIASA67_tree=null;
        Object char_literal68_tree=null;
        Object ALIASA69_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:67:11: ( ALIASA '.' ALIASA )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:67:14: ALIASA '.' ALIASA
            {
            root_0 = (Object)adaptor.nil();


            ALIASA67=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_archivo503); 
            ALIASA67_tree = 
            (Object)adaptor.create(ALIASA67)
            ;
            adaptor.addChild(root_0, ALIASA67_tree);


            char_literal68=(Token)match(input,27,FOLLOW_27_in_archivo505); 
            char_literal68_tree = 
            (Object)adaptor.create(char_literal68)
            ;
            adaptor.addChild(root_0, char_literal68_tree);


            ALIASA69=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_archivo507); 
            ALIASA69_tree = 
            (Object)adaptor.create(ALIASA69)
            ;
            adaptor.addChild(root_0, ALIASA69_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "archivo"


    public static class argumentoOUT_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argumentoOUT"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:68:1: argumentoOUT : ( archivo | ALIASA );
    public final mdParser.argumentoOUT_return argumentoOUT() throws RecognitionException {
        mdParser.argumentoOUT_return retval = new mdParser.argumentoOUT_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ALIASA71=null;
        mdParser.archivo_return archivo70 =null;


        Object ALIASA71_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:68:15: ( archivo | ALIASA )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ALIASA) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==27) ) {
                    alt13=1;
                }
                else if ( (LA13_1==33) ) {
                    alt13=2;
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
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:68:17: archivo
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_archivo_in_argumentoOUT515);
                    archivo70=archivo();

                    state._fsp--;

                    adaptor.addChild(root_0, archivo70.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:68:37: ALIASA
                    {
                    root_0 = (Object)adaptor.nil();


                    ALIASA71=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_argumentoOUT521); 
                    ALIASA71_tree = 
                    (Object)adaptor.create(ALIASA71)
                    ;
                    adaptor.addChild(root_0, ALIASA71_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argumentoOUT"


    public static class opcionesApp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opcionesApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:69:1: opcionesApp : ( '-' ALIASA opcionesApp | '-' ALIASA );
    public final mdParser.opcionesApp_return opcionesApp() throws RecognitionException {
        mdParser.opcionesApp_return retval = new mdParser.opcionesApp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal72=null;
        Token ALIASA73=null;
        Token char_literal75=null;
        Token ALIASA76=null;
        mdParser.opcionesApp_return opcionesApp74 =null;


        Object char_literal72_tree=null;
        Object ALIASA73_tree=null;
        Object char_literal75_tree=null;
        Object ALIASA76_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:69:14: ( '-' ALIASA opcionesApp | '-' ALIASA )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==ALIASA) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==26) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==ALIASA||LA14_2==14) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:69:16: '-' ALIASA opcionesApp
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal72=(Token)match(input,26,FOLLOW_26_in_opcionesApp530); 
                    char_literal72_tree = 
                    (Object)adaptor.create(char_literal72)
                    ;
                    adaptor.addChild(root_0, char_literal72_tree);


                    ALIASA73=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_opcionesApp532); 
                    ALIASA73_tree = 
                    (Object)adaptor.create(ALIASA73)
                    ;
                    adaptor.addChild(root_0, ALIASA73_tree);


                    pushFollow(FOLLOW_opcionesApp_in_opcionesApp534);
                    opcionesApp74=opcionesApp();

                    state._fsp--;

                    adaptor.addChild(root_0, opcionesApp74.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:69:41: '-' ALIASA
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal75=(Token)match(input,26,FOLLOW_26_in_opcionesApp538); 
                    char_literal75_tree = 
                    (Object)adaptor.create(char_literal75)
                    ;
                    adaptor.addChild(root_0, char_literal75_tree);


                    ALIASA76=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_opcionesApp540); 
                    ALIASA76_tree = 
                    (Object)adaptor.create(ALIASA76)
                    ;
                    adaptor.addChild(root_0, ALIASA76_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opcionesApp"


    public static class descripcionApp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "descripcionApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:70:1: descripcionApp : ( ALIASA |);
    public final mdParser.descripcionApp_return descripcionApp() throws RecognitionException {
        mdParser.descripcionApp_return retval = new mdParser.descripcionApp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ALIASA77=null;

        Object ALIASA77_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:70:17: ( ALIASA |)
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ALIASA) ) {
                alt15=1;
            }
            else if ( (LA15_0==14) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:70:19: ALIASA
                    {
                    root_0 = (Object)adaptor.nil();


                    ALIASA77=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_descripcionApp548); 
                    ALIASA77_tree = 
                    (Object)adaptor.create(ALIASA77)
                    ;
                    adaptor.addChild(root_0, ALIASA77_tree);


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:70:28: 
                    {
                    root_0 = (Object)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "descripcionApp"


    public static class expresion_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expresion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:1: expresion : conjuncion ( expresionP |) ;
    public final mdParser.expresion_return expresion() throws RecognitionException {
        mdParser.expresion_return retval = new mdParser.expresion_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.conjuncion_return conjuncion78 =null;

        mdParser.expresionP_return expresionP79 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:12: ( conjuncion ( expresionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:14: conjuncion ( expresionP |)
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conjuncion_in_expresion561);
            conjuncion78=conjuncion();

            state._fsp--;

            adaptor.addChild(root_0, conjuncion78.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:25: ( expresionP |)
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            else if ( (LA16_0==21||LA16_0==25||LA16_0==35) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:26: expresionP
                    {
                    pushFollow(FOLLOW_expresionP_in_expresion564);
                    expresionP79=expresionP();

                    state._fsp--;

                    adaptor.addChild(root_0, expresionP79.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:73:39: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expresion"


    public static class expresionP_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expresionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:74:1: expresionP : '||' conjuncion ( expresionP |) ;
    public final mdParser.expresionP_return expresionP() throws RecognitionException {
        mdParser.expresionP_return retval = new mdParser.expresionP_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal80=null;
        mdParser.conjuncion_return conjuncion81 =null;

        mdParser.expresionP_return expresionP82 =null;


        Object string_literal80_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:74:13: ( '||' conjuncion ( expresionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:74:15: '||' conjuncion ( expresionP |)
            {
            root_0 = (Object)adaptor.nil();


            string_literal80=(Token)match(input,51,FOLLOW_51_in_expresionP576); 
            string_literal80_tree = 
            (Object)adaptor.create(string_literal80)
            ;
            adaptor.addChild(root_0, string_literal80_tree);


            pushFollow(FOLLOW_conjuncion_in_expresionP578);
            conjuncion81=conjuncion();

            state._fsp--;

            adaptor.addChild(root_0, conjuncion81.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:74:31: ( expresionP |)
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==51) ) {
                alt17=1;
            }
            else if ( (LA17_0==21||LA17_0==25||LA17_0==35) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:74:32: expresionP
                    {
                    pushFollow(FOLLOW_expresionP_in_expresionP581);
                    expresionP82=expresionP();

                    state._fsp--;

                    adaptor.addChild(root_0, expresionP82.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:74:45: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expresionP"


    public static class conjuncion_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conjuncion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:75:1: conjuncion : relacion ( conjuncionP |) ;
    public final mdParser.conjuncion_return conjuncion() throws RecognitionException {
        mdParser.conjuncion_return retval = new mdParser.conjuncion_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.relacion_return relacion83 =null;

        mdParser.conjuncionP_return conjuncionP84 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:75:13: ( relacion ( conjuncionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:75:15: relacion ( conjuncionP |)
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relacion_in_conjuncion593);
            relacion83=relacion();

            state._fsp--;

            adaptor.addChild(root_0, relacion83.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:75:24: ( conjuncionP |)
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            else if ( (LA18_0==21||LA18_0==25||LA18_0==35||LA18_0==51) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:75:25: conjuncionP
                    {
                    pushFollow(FOLLOW_conjuncionP_in_conjuncion596);
                    conjuncionP84=conjuncionP();

                    state._fsp--;

                    adaptor.addChild(root_0, conjuncionP84.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:75:39: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conjuncion"


    public static class conjuncionP_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conjuncionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:76:1: conjuncionP : '&&' relacion ( conjuncionP |) ;
    public final mdParser.conjuncionP_return conjuncionP() throws RecognitionException {
        mdParser.conjuncionP_return retval = new mdParser.conjuncionP_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal85=null;
        mdParser.relacion_return relacion86 =null;

        mdParser.conjuncionP_return conjuncionP87 =null;


        Object string_literal85_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:76:14: ( '&&' relacion ( conjuncionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:76:16: '&&' relacion ( conjuncionP |)
            {
            root_0 = (Object)adaptor.nil();


            string_literal85=(Token)match(input,19,FOLLOW_19_in_conjuncionP608); 
            string_literal85_tree = 
            (Object)adaptor.create(string_literal85)
            ;
            adaptor.addChild(root_0, string_literal85_tree);


            pushFollow(FOLLOW_relacion_in_conjuncionP610);
            relacion86=relacion();

            state._fsp--;

            adaptor.addChild(root_0, relacion86.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:76:30: ( conjuncionP |)
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            else if ( (LA19_0==21||LA19_0==25||LA19_0==35||LA19_0==51) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:76:31: conjuncionP
                    {
                    pushFollow(FOLLOW_conjuncionP_in_conjuncionP613);
                    conjuncionP87=conjuncionP();

                    state._fsp--;

                    adaptor.addChild(root_0, conjuncionP87.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:76:45: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conjuncionP"


    public static class relacion_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:77:1: relacion : adicion ( relacionP |) ;
    public final mdParser.relacion_return relacion() throws RecognitionException {
        mdParser.relacion_return retval = new mdParser.relacion_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.adicion_return adicion88 =null;

        mdParser.relacionP_return relacionP89 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:77:11: ( adicion ( relacionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:77:13: adicion ( relacionP |)
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_adicion_in_relacion625);
            adicion88=adicion();

            state._fsp--;

            adaptor.addChild(root_0, adicion88.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:77:21: ( relacionP |)
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            else if ( (LA20_0==19||LA20_0==21||LA20_0==25||LA20_0==35||LA20_0==51) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:77:22: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacion628);
                    relacionP89=relacionP();

                    state._fsp--;

                    adaptor.addChild(root_0, relacionP89.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:77:34: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relacion"


    public static class relacionP_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relacionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:1: relacionP : '<' adicion ( relacionP |) '<=' adicion ( relacionP |) '>' adicion ( relacionP |) '>=' adicion ( relacionP |) '==' adicion ( relacionP |) '!=' adicion ( relacionP |) ;
    public final mdParser.relacionP_return relacionP() throws RecognitionException {
        mdParser.relacionP_return retval = new mdParser.relacionP_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal90=null;
        Token string_literal93=null;
        Token char_literal96=null;
        Token string_literal99=null;
        Token string_literal102=null;
        Token string_literal105=null;
        mdParser.adicion_return adicion91 =null;

        mdParser.relacionP_return relacionP92 =null;

        mdParser.adicion_return adicion94 =null;

        mdParser.relacionP_return relacionP95 =null;

        mdParser.adicion_return adicion97 =null;

        mdParser.relacionP_return relacionP98 =null;

        mdParser.adicion_return adicion100 =null;

        mdParser.relacionP_return relacionP101 =null;

        mdParser.adicion_return adicion103 =null;

        mdParser.relacionP_return relacionP104 =null;

        mdParser.adicion_return adicion106 =null;

        mdParser.relacionP_return relacionP107 =null;


        Object char_literal90_tree=null;
        Object string_literal93_tree=null;
        Object char_literal96_tree=null;
        Object string_literal99_tree=null;
        Object string_literal102_tree=null;
        Object string_literal105_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:12: ( '<' adicion ( relacionP |) '<=' adicion ( relacionP |) '>' adicion ( relacionP |) '>=' adicion ( relacionP |) '==' adicion ( relacionP |) '!=' adicion ( relacionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:14: '<' adicion ( relacionP |) '<=' adicion ( relacionP |) '>' adicion ( relacionP |) '>=' adicion ( relacionP |) '==' adicion ( relacionP |) '!=' adicion ( relacionP |)
            {
            root_0 = (Object)adaptor.nil();


            char_literal90=(Token)match(input,36,FOLLOW_36_in_relacionP640); 
            char_literal90_tree = 
            (Object)adaptor.create(char_literal90)
            ;
            adaptor.addChild(root_0, char_literal90_tree);


            pushFollow(FOLLOW_adicion_in_relacionP642);
            adicion91=adicion();

            state._fsp--;

            adaptor.addChild(root_0, adicion91.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:26: ( relacionP |)
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:27: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP645);
                    relacionP92=relacionP();

                    state._fsp--;

                    adaptor.addChild(root_0, relacionP92.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:39: 
                    {
                    }
                    break;

            }


            string_literal93=(Token)match(input,37,FOLLOW_37_in_relacionP650); 
            string_literal93_tree = 
            (Object)adaptor.create(string_literal93)
            ;
            adaptor.addChild(root_0, string_literal93_tree);


            pushFollow(FOLLOW_adicion_in_relacionP652);
            adicion94=adicion();

            state._fsp--;

            adaptor.addChild(root_0, adicion94.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:53: ( relacionP |)
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            else if ( (LA22_0==40) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:54: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP655);
                    relacionP95=relacionP();

                    state._fsp--;

                    adaptor.addChild(root_0, relacionP95.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:66: 
                    {
                    }
                    break;

            }


            char_literal96=(Token)match(input,40,FOLLOW_40_in_relacionP660); 
            char_literal96_tree = 
            (Object)adaptor.create(char_literal96)
            ;
            adaptor.addChild(root_0, char_literal96_tree);


            pushFollow(FOLLOW_adicion_in_relacionP662);
            adicion97=adicion();

            state._fsp--;

            adaptor.addChild(root_0, adicion97.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:79: ( relacionP |)
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            else if ( (LA23_0==41) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:80: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP665);
                    relacionP98=relacionP();

                    state._fsp--;

                    adaptor.addChild(root_0, relacionP98.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:92: 
                    {
                    }
                    break;

            }


            string_literal99=(Token)match(input,41,FOLLOW_41_in_relacionP670); 
            string_literal99_tree = 
            (Object)adaptor.create(string_literal99)
            ;
            adaptor.addChild(root_0, string_literal99_tree);


            pushFollow(FOLLOW_adicion_in_relacionP672);
            adicion100=adicion();

            state._fsp--;

            adaptor.addChild(root_0, adicion100.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:106: ( relacionP |)
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            else if ( (LA24_0==39) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:107: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP675);
                    relacionP101=relacionP();

                    state._fsp--;

                    adaptor.addChild(root_0, relacionP101.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:78:119: 
                    {
                    }
                    break;

            }


            string_literal102=(Token)match(input,39,FOLLOW_39_in_relacionP685); 
            string_literal102_tree = 
            (Object)adaptor.create(string_literal102)
            ;
            adaptor.addChild(root_0, string_literal102_tree);


            pushFollow(FOLLOW_adicion_in_relacionP687);
            adicion103=adicion();

            state._fsp--;

            adaptor.addChild(root_0, adicion103.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:79:18: ( relacionP |)
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            else if ( (LA25_0==13) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:79:19: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP690);
                    relacionP104=relacionP();

                    state._fsp--;

                    adaptor.addChild(root_0, relacionP104.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:79:31: 
                    {
                    }
                    break;

            }


            string_literal105=(Token)match(input,13,FOLLOW_13_in_relacionP695); 
            string_literal105_tree = 
            (Object)adaptor.create(string_literal105)
            ;
            adaptor.addChild(root_0, string_literal105_tree);


            pushFollow(FOLLOW_adicion_in_relacionP697);
            adicion106=adicion();

            state._fsp--;

            adaptor.addChild(root_0, adicion106.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:79:45: ( relacionP |)
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            else if ( (LA26_0==13||LA26_0==19||LA26_0==21||LA26_0==25||LA26_0==35||LA26_0==37||(LA26_0 >= 39 && LA26_0 <= 41)||LA26_0==51) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:79:46: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP700);
                    relacionP107=relacionP();

                    state._fsp--;

                    adaptor.addChild(root_0, relacionP107.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:79:58: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relacionP"


    public static class adicion_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "adicion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:80:1: adicion : termino ( adicionP |) ;
    public final mdParser.adicion_return adicion() throws RecognitionException {
        mdParser.adicion_return retval = new mdParser.adicion_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.termino_return termino108 =null;

        mdParser.adicionP_return adicionP109 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:80:11: ( termino ( adicionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:80:13: termino ( adicionP |)
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_termino_in_adicion713);
            termino108=termino();

            state._fsp--;

            adaptor.addChild(root_0, termino108.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:80:21: ( adicionP |)
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            else if ( (LA27_0==13||LA27_0==19||LA27_0==21||LA27_0==25||(LA27_0 >= 35 && LA27_0 <= 37)||(LA27_0 >= 39 && LA27_0 <= 41)||LA27_0==51) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:80:22: adicionP
                    {
                    pushFollow(FOLLOW_adicionP_in_adicion716);
                    adicionP109=adicionP();

                    state._fsp--;

                    adaptor.addChild(root_0, adicionP109.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:80:33: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "adicion"


    public static class adicionP_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "adicionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:81:1: adicionP : '+' termino ( adicionP |) '-' termino ( adicionP |) ;
    public final mdParser.adicionP_return adicionP() throws RecognitionException {
        mdParser.adicionP_return retval = new mdParser.adicionP_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal110=null;
        Token char_literal113=null;
        mdParser.termino_return termino111 =null;

        mdParser.adicionP_return adicionP112 =null;

        mdParser.termino_return termino114 =null;

        mdParser.adicionP_return adicionP115 =null;


        Object char_literal110_tree=null;
        Object char_literal113_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:81:11: ( '+' termino ( adicionP |) '-' termino ( adicionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:81:13: '+' termino ( adicionP |) '-' termino ( adicionP |)
            {
            root_0 = (Object)adaptor.nil();


            char_literal110=(Token)match(input,23,FOLLOW_23_in_adicionP728); 
            char_literal110_tree = 
            (Object)adaptor.create(char_literal110)
            ;
            adaptor.addChild(root_0, char_literal110_tree);


            pushFollow(FOLLOW_termino_in_adicionP730);
            termino111=termino();

            state._fsp--;

            adaptor.addChild(root_0, termino111.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:81:25: ( adicionP |)
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            else if ( (LA28_0==26) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:81:26: adicionP
                    {
                    pushFollow(FOLLOW_adicionP_in_adicionP733);
                    adicionP112=adicionP();

                    state._fsp--;

                    adaptor.addChild(root_0, adicionP112.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:81:37: 
                    {
                    }
                    break;

            }


            char_literal113=(Token)match(input,26,FOLLOW_26_in_adicionP739); 
            char_literal113_tree = 
            (Object)adaptor.create(char_literal113)
            ;
            adaptor.addChild(root_0, char_literal113_tree);


            pushFollow(FOLLOW_termino_in_adicionP741);
            termino114=termino();

            state._fsp--;

            adaptor.addChild(root_0, termino114.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:81:51: ( adicionP |)
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            else if ( (LA29_0==13||LA29_0==19||LA29_0==21||(LA29_0 >= 25 && LA29_0 <= 26)||(LA29_0 >= 35 && LA29_0 <= 37)||(LA29_0 >= 39 && LA29_0 <= 41)||LA29_0==51) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:81:52: adicionP
                    {
                    pushFollow(FOLLOW_adicionP_in_adicionP744);
                    adicionP115=adicionP();

                    state._fsp--;

                    adaptor.addChild(root_0, adicionP115.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:81:63: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "adicionP"


    public static class termino_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "termino"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:82:1: termino : negacion ( terminoP |) ;
    public final mdParser.termino_return termino() throws RecognitionException {
        mdParser.termino_return retval = new mdParser.termino_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.negacion_return negacion116 =null;

        mdParser.terminoP_return terminoP117 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:82:11: ( negacion ( terminoP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:82:13: negacion ( terminoP |)
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_negacion_in_termino757);
            negacion116=negacion();

            state._fsp--;

            adaptor.addChild(root_0, negacion116.getTree());

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:82:22: ( terminoP |)
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22||LA30_0==30) ) {
                alt30=1;
            }
            else if ( (LA30_0==13||LA30_0==19||LA30_0==21||LA30_0==23||(LA30_0 >= 25 && LA30_0 <= 26)||(LA30_0 >= 35 && LA30_0 <= 37)||(LA30_0 >= 39 && LA30_0 <= 41)||LA30_0==51) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:82:23: terminoP
                    {
                    pushFollow(FOLLOW_terminoP_in_termino760);
                    terminoP117=terminoP();

                    state._fsp--;

                    adaptor.addChild(root_0, terminoP117.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:82:34: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "termino"


    public static class terminoP_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "terminoP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:83:1: terminoP : ( '*' negacion ( terminoP |) | '//' negacion ( terminoP |) );
    public final mdParser.terminoP_return terminoP() throws RecognitionException {
        mdParser.terminoP_return retval = new mdParser.terminoP_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal118=null;
        Token string_literal121=null;
        mdParser.negacion_return negacion119 =null;

        mdParser.terminoP_return terminoP120 =null;

        mdParser.negacion_return negacion122 =null;

        mdParser.terminoP_return terminoP123 =null;


        Object char_literal118_tree=null;
        Object string_literal121_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:83:11: ( '*' negacion ( terminoP |) | '//' negacion ( terminoP |) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            else if ( (LA33_0==30) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:83:13: '*' negacion ( terminoP |)
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal118=(Token)match(input,22,FOLLOW_22_in_terminoP772); 
                    char_literal118_tree = 
                    (Object)adaptor.create(char_literal118)
                    ;
                    adaptor.addChild(root_0, char_literal118_tree);


                    pushFollow(FOLLOW_negacion_in_terminoP774);
                    negacion119=negacion();

                    state._fsp--;

                    adaptor.addChild(root_0, negacion119.getTree());

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:83:26: ( terminoP |)
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==22||LA31_0==30) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==13||LA31_0==19||LA31_0==21||LA31_0==23||(LA31_0 >= 25 && LA31_0 <= 26)||(LA31_0 >= 35 && LA31_0 <= 37)||(LA31_0 >= 39 && LA31_0 <= 41)||LA31_0==51) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;

                    }
                    switch (alt31) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:83:27: terminoP
                            {
                            pushFollow(FOLLOW_terminoP_in_terminoP777);
                            terminoP120=terminoP();

                            state._fsp--;

                            adaptor.addChild(root_0, terminoP120.getTree());

                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:83:38: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:83:42: '//' negacion ( terminoP |)
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal121=(Token)match(input,30,FOLLOW_30_in_terminoP785); 
                    string_literal121_tree = 
                    (Object)adaptor.create(string_literal121)
                    ;
                    adaptor.addChild(root_0, string_literal121_tree);


                    pushFollow(FOLLOW_negacion_in_terminoP787);
                    negacion122=negacion();

                    state._fsp--;

                    adaptor.addChild(root_0, negacion122.getTree());

                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:83:56: ( terminoP |)
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==22||LA32_0==30) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==13||LA32_0==19||LA32_0==21||LA32_0==23||(LA32_0 >= 25 && LA32_0 <= 26)||(LA32_0 >= 35 && LA32_0 <= 37)||(LA32_0 >= 39 && LA32_0 <= 41)||LA32_0==51) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }
                    switch (alt32) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:83:57: terminoP
                            {
                            pushFollow(FOLLOW_terminoP_in_terminoP790);
                            terminoP123=terminoP();

                            state._fsp--;

                            adaptor.addChild(root_0, terminoP123.getTree());

                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:83:68: 
                            {
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "terminoP"


    public static class negacion_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:84:1: negacion : ( factor | '!' factor );
    public final mdParser.negacion_return negacion() throws RecognitionException {
        mdParser.negacion_return retval = new mdParser.negacion_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal125=null;
        mdParser.factor_return factor124 =null;

        mdParser.factor_return factor126 =null;


        Object char_literal125_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:84:11: ( factor | '!' factor )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0 >= ALIASA && LA34_0 <= String)||LA34_0==20||(LA34_0 >= 27 && LA34_0 <= 29)||LA34_0==42) ) {
                alt34=1;
            }
            else if ( (LA34_0==12) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:84:13: factor
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_factor_in_negacion802);
                    factor124=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor124.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:84:22: '!' factor
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal125=(Token)match(input,12,FOLLOW_12_in_negacion806); 
                    char_literal125_tree = 
                    (Object)adaptor.create(char_literal125)
                    ;
                    adaptor.addChild(root_0, char_literal125_tree);


                    pushFollow(FOLLOW_factor_in_negacion807);
                    factor126=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor126.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "negacion"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:85:1: factor : ( ALIASA | tripleta | literal | '(' expresion ')' );
    public final mdParser.factor_return factor() throws RecognitionException {
        mdParser.factor_return retval = new mdParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ALIASA127=null;
        Token char_literal130=null;
        Token char_literal132=null;
        mdParser.tripleta_return tripleta128 =null;

        mdParser.literal_return literal129 =null;

        mdParser.expresion_return expresion131 =null;


        Object ALIASA127_tree=null;
        Object char_literal130_tree=null;
        Object char_literal132_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:85:10: ( ALIASA | tripleta | literal | '(' expresion ')' )
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
            case 27:
            case 28:
            case 29:
            case 42:
                {
                alt35=3;
                }
                break;
            case 20:
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
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:85:12: ALIASA
                    {
                    root_0 = (Object)adaptor.nil();


                    ALIASA127=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_factor816); 
                    ALIASA127_tree = 
                    (Object)adaptor.create(ALIASA127)
                    ;
                    adaptor.addChild(root_0, ALIASA127_tree);


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:85:21: tripleta
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_tripleta_in_factor820);
                    tripleta128=tripleta();

                    state._fsp--;

                    adaptor.addChild(root_0, tripleta128.getTree());

                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:85:32: literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_factor824);
                    literal129=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal129.getTree());

                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:85:42: '(' expresion ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal130=(Token)match(input,20,FOLLOW_20_in_factor828); 
                    char_literal130_tree = 
                    (Object)adaptor.create(char_literal130)
                    ;
                    adaptor.addChild(root_0, char_literal130_tree);


                    pushFollow(FOLLOW_expresion_in_factor830);
                    expresion131=expresion();

                    state._fsp--;

                    adaptor.addChild(root_0, expresion131.getTree());

                    char_literal132=(Token)match(input,21,FOLLOW_21_in_factor833); 
                    char_literal132_tree = 
                    (Object)adaptor.create(char_literal132)
                    ;
                    adaptor.addChild(root_0, char_literal132_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class listLengFns_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listLengFns"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:89:1: listLengFns : '%=' literal ALIASA '(' literal ALIASA ( ',' ( literal ALIASA ) )* ')' '{' instrucciones '}' '=%' ;
    public final mdParser.listLengFns_return listLengFns() throws RecognitionException {
        mdParser.listLengFns_return retval = new mdParser.listLengFns_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal133=null;
        Token ALIASA135=null;
        Token char_literal136=null;
        Token ALIASA138=null;
        Token char_literal139=null;
        Token ALIASA141=null;
        Token char_literal142=null;
        Token char_literal143=null;
        Token char_literal145=null;
        Token string_literal146=null;
        mdParser.literal_return literal134 =null;

        mdParser.literal_return literal137 =null;

        mdParser.literal_return literal140 =null;

        mdParser.instrucciones_return instrucciones144 =null;


        Object string_literal133_tree=null;
        Object ALIASA135_tree=null;
        Object char_literal136_tree=null;
        Object ALIASA138_tree=null;
        Object char_literal139_tree=null;
        Object ALIASA141_tree=null;
        Object char_literal142_tree=null;
        Object char_literal143_tree=null;
        Object char_literal145_tree=null;
        Object string_literal146_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:89:14: ( '%=' literal ALIASA '(' literal ALIASA ( ',' ( literal ALIASA ) )* ')' '{' instrucciones '}' '=%' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:89:16: '%=' literal ALIASA '(' literal ALIASA ( ',' ( literal ALIASA ) )* ')' '{' instrucciones '}' '=%'
            {
            root_0 = (Object)adaptor.nil();


            string_literal133=(Token)match(input,18,FOLLOW_18_in_listLengFns844); 
            string_literal133_tree = 
            (Object)adaptor.create(string_literal133)
            ;
            adaptor.addChild(root_0, string_literal133_tree);


            pushFollow(FOLLOW_literal_in_listLengFns846);
            literal134=literal();

            state._fsp--;

            adaptor.addChild(root_0, literal134.getTree());

            ALIASA135=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns848); 
            ALIASA135_tree = 
            (Object)adaptor.create(ALIASA135)
            ;
            adaptor.addChild(root_0, ALIASA135_tree);


            char_literal136=(Token)match(input,20,FOLLOW_20_in_listLengFns850); 
            char_literal136_tree = 
            (Object)adaptor.create(char_literal136)
            ;
            adaptor.addChild(root_0, char_literal136_tree);


            pushFollow(FOLLOW_literal_in_listLengFns852);
            literal137=literal();

            state._fsp--;

            adaptor.addChild(root_0, literal137.getTree());

            ALIASA138=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns854); 
            ALIASA138_tree = 
            (Object)adaptor.create(ALIASA138)
            ;
            adaptor.addChild(root_0, ALIASA138_tree);


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:89:55: ( ',' ( literal ALIASA ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==25) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:89:56: ',' ( literal ALIASA )
            	    {
            	    char_literal139=(Token)match(input,25,FOLLOW_25_in_listLengFns857); 
            	    char_literal139_tree = 
            	    (Object)adaptor.create(char_literal139)
            	    ;
            	    adaptor.addChild(root_0, char_literal139_tree);


            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:89:59: ( literal ALIASA )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:89:60: literal ALIASA
            	    {
            	    pushFollow(FOLLOW_literal_in_listLengFns859);
            	    literal140=literal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, literal140.getTree());

            	    ALIASA141=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns861); 
            	    ALIASA141_tree = 
            	    (Object)adaptor.create(ALIASA141)
            	    ;
            	    adaptor.addChild(root_0, ALIASA141_tree);


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            char_literal142=(Token)match(input,21,FOLLOW_21_in_listLengFns866); 
            char_literal142_tree = 
            (Object)adaptor.create(char_literal142)
            ;
            adaptor.addChild(root_0, char_literal142_tree);


            char_literal143=(Token)match(input,50,FOLLOW_50_in_listLengFns868); 
            char_literal143_tree = 
            (Object)adaptor.create(char_literal143)
            ;
            adaptor.addChild(root_0, char_literal143_tree);


            pushFollow(FOLLOW_instrucciones_in_listLengFns870);
            instrucciones144=instrucciones();

            state._fsp--;

            adaptor.addChild(root_0, instrucciones144.getTree());

            char_literal145=(Token)match(input,52,FOLLOW_52_in_listLengFns872); 
            char_literal145_tree = 
            (Object)adaptor.create(char_literal145)
            ;
            adaptor.addChild(root_0, char_literal145_tree);


            string_literal146=(Token)match(input,38,FOLLOW_38_in_listLengFns874); 
            string_literal146_tree = 
            (Object)adaptor.create(string_literal146)
            ;
            adaptor.addChild(root_0, string_literal146_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listLengFns"


    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:90:1: literal : ( Int | Bool | Fecha | Hora | file | listLengClases | String );
    public final mdParser.literal_return literal() throws RecognitionException {
        mdParser.literal_return retval = new mdParser.literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Int147=null;
        Token Bool148=null;
        Token Fecha149=null;
        Token Hora150=null;
        Token String153=null;
        mdParser.file_return file151 =null;

        mdParser.listLengClases_return listLengClases152 =null;


        Object Int147_tree=null;
        Object Bool148_tree=null;
        Object Fecha149_tree=null;
        Object Hora150_tree=null;
        Object String153_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:90:11: ( Int | Bool | Fecha | Hora | file | listLengClases | String )
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
            case 27:
            case 28:
            case 29:
                {
                alt37=5;
                }
                break;
            case 42:
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
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:90:13: Int
                    {
                    root_0 = (Object)adaptor.nil();


                    Int147=(Token)match(input,Int,FOLLOW_Int_in_literal883); 
                    Int147_tree = 
                    (Object)adaptor.create(Int147)
                    ;
                    adaptor.addChild(root_0, Int147_tree);


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:90:19: Bool
                    {
                    root_0 = (Object)adaptor.nil();


                    Bool148=(Token)match(input,Bool,FOLLOW_Bool_in_literal887); 
                    Bool148_tree = 
                    (Object)adaptor.create(Bool148)
                    ;
                    adaptor.addChild(root_0, Bool148_tree);


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:90:26: Fecha
                    {
                    root_0 = (Object)adaptor.nil();


                    Fecha149=(Token)match(input,Fecha,FOLLOW_Fecha_in_literal891); 
                    Fecha149_tree = 
                    (Object)adaptor.create(Fecha149)
                    ;
                    adaptor.addChild(root_0, Fecha149_tree);


                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:90:34: Hora
                    {
                    root_0 = (Object)adaptor.nil();


                    Hora150=(Token)match(input,Hora,FOLLOW_Hora_in_literal895); 
                    Hora150_tree = 
                    (Object)adaptor.create(Hora150)
                    ;
                    adaptor.addChild(root_0, Hora150_tree);


                    }
                    break;
                case 5 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:90:41: file
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_file_in_literal899);
                    file151=file();

                    state._fsp--;

                    adaptor.addChild(root_0, file151.getTree());

                    }
                    break;
                case 6 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:90:48: listLengClases
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_listLengClases_in_literal903);
                    listLengClases152=listLengClases();

                    state._fsp--;

                    adaptor.addChild(root_0, listLengClases152.getTree());

                    }
                    break;
                case 7 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:90:65: String
                    {
                    root_0 = (Object)adaptor.nil();


                    String153=(Token)match(input,String,FOLLOW_String_in_literal907); 
                    String153_tree = 
                    (Object)adaptor.create(String153)
                    ;
                    adaptor.addChild(root_0, String153_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "file"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:94:1: file : ( relativa | absoluta );
    public final mdParser.file_return file() throws RecognitionException {
        mdParser.file_return retval = new mdParser.file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.relativa_return relativa154 =null;

        mdParser.absoluta_return absoluta155 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:94:8: ( relativa | absoluta )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0 >= 27 && LA38_0 <= 28)) ) {
                alt38=1;
            }
            else if ( (LA38_0==29) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:94:10: relativa
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_relativa_in_file995);
                    relativa154=relativa();

                    state._fsp--;

                    adaptor.addChild(root_0, relativa154.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:94:21: absoluta
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_absoluta_in_file999);
                    absoluta155=absoluta();

                    state._fsp--;

                    adaptor.addChild(root_0, absoluta155.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "file"


    public static class z_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "z"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:96:1: z : ( listVariables listInstrucciones |);
    public final mdParser.z_return z() throws RecognitionException {
        mdParser.z_return retval = new mdParser.z_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.listVariables_return listVariables156 =null;

        mdParser.listInstrucciones_return listInstrucciones157 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:96:5: ( listVariables listInstrucciones |)
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==LengTipo) ) {
                alt39=1;
            }
            else if ( (LA39_0==EOF) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:96:7: listVariables listInstrucciones
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_listVariables_in_z1036);
                    listVariables156=listVariables();

                    state._fsp--;

                    adaptor.addChild(root_0, listVariables156.getTree());

                    pushFollow(FOLLOW_listInstrucciones_in_z1038);
                    listInstrucciones157=listInstrucciones();

                    state._fsp--;

                    adaptor.addChild(root_0, listInstrucciones157.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:96:41: 
                    {
                    root_0 = (Object)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "z"


    public static class listVariables_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listVariables"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:97:1: listVariables : ( lengVar )+ ;
    public final mdParser.listVariables_return listVariables() throws RecognitionException {
        mdParser.listVariables_return retval = new mdParser.listVariables_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.lengVar_return lengVar158 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:97:16: ( ( lengVar )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:97:18: ( lengVar )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:97:18: ( lengVar )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LengTipo) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:97:19: lengVar
            	    {
            	    pushFollow(FOLLOW_lengVar_in_listVariables1050);
            	    lengVar158=lengVar();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lengVar158.getTree());

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

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listVariables"


    public static class lengVar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lengVar"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:98:1: lengVar : LengTipo ALIASA ';' ;
    public final mdParser.lengVar_return lengVar() throws RecognitionException {
        mdParser.lengVar_return retval = new mdParser.lengVar_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LengTipo159=null;
        Token ALIASA160=null;
        Token char_literal161=null;

        Object LengTipo159_tree=null;
        Object ALIASA160_tree=null;
        Object char_literal161_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:98:11: ( LengTipo ALIASA ';' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:98:13: LengTipo ALIASA ';'
            {
            root_0 = (Object)adaptor.nil();


            LengTipo159=(Token)match(input,LengTipo,FOLLOW_LengTipo_in_lengVar1061); 
            LengTipo159_tree = 
            (Object)adaptor.create(LengTipo159)
            ;
            adaptor.addChild(root_0, LengTipo159_tree);


            ALIASA160=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_lengVar1063); 
            ALIASA160_tree = 
            (Object)adaptor.create(ALIASA160)
            ;
            adaptor.addChild(root_0, ALIASA160_tree);


            char_literal161=(Token)match(input,35,FOLLOW_35_in_lengVar1065); 
            char_literal161_tree = 
            (Object)adaptor.create(char_literal161)
            ;
            adaptor.addChild(root_0, char_literal161_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lengVar"


    public static class listInstrucciones_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listInstrucciones"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:99:1: listInstrucciones : ( ( instrucciones )+ |);
    public final mdParser.listInstrucciones_return listInstrucciones() throws RecognitionException {
        mdParser.listInstrucciones_return retval = new mdParser.listInstrucciones_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.instrucciones_return instrucciones162 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:99:20: ( ( instrucciones )+ |)
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ALIASA||LA42_0==45||LA42_0==49) ) {
                alt42=1;
            }
            else if ( (LA42_0==EOF||LA42_0==52) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:99:22: ( instrucciones )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:99:22: ( instrucciones )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==ALIASA||LA41_0==45||LA41_0==49) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:99:23: instrucciones
                    	    {
                    	    pushFollow(FOLLOW_instrucciones_in_listInstrucciones1074);
                    	    instrucciones162=instrucciones();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, instrucciones162.getTree());

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
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:99:41: 
                    {
                    root_0 = (Object)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listInstrucciones"


    public static class instrucciones_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrucciones"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:100:1: instrucciones : ( asignacion | ciclo | condicion );
    public final mdParser.instrucciones_return instrucciones() throws RecognitionException {
        mdParser.instrucciones_return retval = new mdParser.instrucciones_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        mdParser.asignacion_return asignacion163 =null;

        mdParser.ciclo_return ciclo164 =null;

        mdParser.condicion_return condicion165 =null;



        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:100:16: ( asignacion | ciclo | condicion )
            int alt43=3;
            switch ( input.LA(1) ) {
            case ALIASA:
                {
                alt43=1;
                }
                break;
            case 49:
                {
                alt43=2;
                }
                break;
            case 45:
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
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:100:19: asignacion
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_asignacion_in_instrucciones1088);
                    asignacion163=asignacion();

                    state._fsp--;

                    adaptor.addChild(root_0, asignacion163.getTree());

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:100:32: ciclo
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ciclo_in_instrucciones1092);
                    ciclo164=ciclo();

                    state._fsp--;

                    adaptor.addChild(root_0, ciclo164.getTree());

                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:100:40: condicion
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_condicion_in_instrucciones1096);
                    condicion165=condicion();

                    state._fsp--;

                    adaptor.addChild(root_0, condicion165.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instrucciones"


    public static class condicion_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condicion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:101:1: condicion : condicionP 'else' '{' listInstrucciones '}' ;
    public final mdParser.condicion_return condicion() throws RecognitionException {
        mdParser.condicion_return retval = new mdParser.condicion_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal167=null;
        Token char_literal168=null;
        Token char_literal170=null;
        mdParser.condicionP_return condicionP166 =null;

        mdParser.listInstrucciones_return listInstrucciones169 =null;


        Object string_literal167_tree=null;
        Object char_literal168_tree=null;
        Object char_literal170_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:101:12: ( condicionP 'else' '{' listInstrucciones '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:101:14: condicionP 'else' '{' listInstrucciones '}'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_condicionP_in_condicion1104);
            condicionP166=condicionP();

            state._fsp--;

            adaptor.addChild(root_0, condicionP166.getTree());

            string_literal167=(Token)match(input,44,FOLLOW_44_in_condicion1106); 
            string_literal167_tree = 
            (Object)adaptor.create(string_literal167)
            ;
            adaptor.addChild(root_0, string_literal167_tree);


            char_literal168=(Token)match(input,50,FOLLOW_50_in_condicion1108); 
            char_literal168_tree = 
            (Object)adaptor.create(char_literal168)
            ;
            adaptor.addChild(root_0, char_literal168_tree);


            pushFollow(FOLLOW_listInstrucciones_in_condicion1110);
            listInstrucciones169=listInstrucciones();

            state._fsp--;

            adaptor.addChild(root_0, listInstrucciones169.getTree());

            char_literal170=(Token)match(input,52,FOLLOW_52_in_condicion1112); 
            char_literal170_tree = 
            (Object)adaptor.create(char_literal170)
            ;
            adaptor.addChild(root_0, char_literal170_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condicion"


    public static class condicionP_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condicionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:102:1: condicionP : 'if' '(' expresion ')' '{' listInstrucciones '}' ;
    public final mdParser.condicionP_return condicionP() throws RecognitionException {
        mdParser.condicionP_return retval = new mdParser.condicionP_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal171=null;
        Token char_literal172=null;
        Token char_literal174=null;
        Token char_literal175=null;
        Token char_literal177=null;
        mdParser.expresion_return expresion173 =null;

        mdParser.listInstrucciones_return listInstrucciones176 =null;


        Object string_literal171_tree=null;
        Object char_literal172_tree=null;
        Object char_literal174_tree=null;
        Object char_literal175_tree=null;
        Object char_literal177_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:102:13: ( 'if' '(' expresion ')' '{' listInstrucciones '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:102:15: 'if' '(' expresion ')' '{' listInstrucciones '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal171=(Token)match(input,45,FOLLOW_45_in_condicionP1120); 
            string_literal171_tree = 
            (Object)adaptor.create(string_literal171)
            ;
            adaptor.addChild(root_0, string_literal171_tree);


            char_literal172=(Token)match(input,20,FOLLOW_20_in_condicionP1122); 
            char_literal172_tree = 
            (Object)adaptor.create(char_literal172)
            ;
            adaptor.addChild(root_0, char_literal172_tree);


            pushFollow(FOLLOW_expresion_in_condicionP1124);
            expresion173=expresion();

            state._fsp--;

            adaptor.addChild(root_0, expresion173.getTree());

            char_literal174=(Token)match(input,21,FOLLOW_21_in_condicionP1126); 
            char_literal174_tree = 
            (Object)adaptor.create(char_literal174)
            ;
            adaptor.addChild(root_0, char_literal174_tree);


            char_literal175=(Token)match(input,50,FOLLOW_50_in_condicionP1128); 
            char_literal175_tree = 
            (Object)adaptor.create(char_literal175)
            ;
            adaptor.addChild(root_0, char_literal175_tree);


            pushFollow(FOLLOW_listInstrucciones_in_condicionP1130);
            listInstrucciones176=listInstrucciones();

            state._fsp--;

            adaptor.addChild(root_0, listInstrucciones176.getTree());

            char_literal177=(Token)match(input,52,FOLLOW_52_in_condicionP1132); 
            char_literal177_tree = 
            (Object)adaptor.create(char_literal177)
            ;
            adaptor.addChild(root_0, char_literal177_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condicionP"


    public static class ciclo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ciclo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:103:1: ciclo : 'while' '(' expresion ')' '{' listInstrucciones '}' ;
    public final mdParser.ciclo_return ciclo() throws RecognitionException {
        mdParser.ciclo_return retval = new mdParser.ciclo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal178=null;
        Token char_literal179=null;
        Token char_literal181=null;
        Token char_literal182=null;
        Token char_literal184=null;
        mdParser.expresion_return expresion180 =null;

        mdParser.listInstrucciones_return listInstrucciones183 =null;


        Object string_literal178_tree=null;
        Object char_literal179_tree=null;
        Object char_literal181_tree=null;
        Object char_literal182_tree=null;
        Object char_literal184_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:103:9: ( 'while' '(' expresion ')' '{' listInstrucciones '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:103:11: 'while' '(' expresion ')' '{' listInstrucciones '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal178=(Token)match(input,49,FOLLOW_49_in_ciclo1141); 
            string_literal178_tree = 
            (Object)adaptor.create(string_literal178)
            ;
            adaptor.addChild(root_0, string_literal178_tree);


            char_literal179=(Token)match(input,20,FOLLOW_20_in_ciclo1143); 
            char_literal179_tree = 
            (Object)adaptor.create(char_literal179)
            ;
            adaptor.addChild(root_0, char_literal179_tree);


            pushFollow(FOLLOW_expresion_in_ciclo1145);
            expresion180=expresion();

            state._fsp--;

            adaptor.addChild(root_0, expresion180.getTree());

            char_literal181=(Token)match(input,21,FOLLOW_21_in_ciclo1147); 
            char_literal181_tree = 
            (Object)adaptor.create(char_literal181)
            ;
            adaptor.addChild(root_0, char_literal181_tree);


            char_literal182=(Token)match(input,50,FOLLOW_50_in_ciclo1149); 
            char_literal182_tree = 
            (Object)adaptor.create(char_literal182)
            ;
            adaptor.addChild(root_0, char_literal182_tree);


            pushFollow(FOLLOW_listInstrucciones_in_ciclo1151);
            listInstrucciones183=listInstrucciones();

            state._fsp--;

            adaptor.addChild(root_0, listInstrucciones183.getTree());

            char_literal184=(Token)match(input,52,FOLLOW_52_in_ciclo1153); 
            char_literal184_tree = 
            (Object)adaptor.create(char_literal184)
            ;
            adaptor.addChild(root_0, char_literal184_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ciclo"


    public static class asignacion_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "asignacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:104:1: asignacion : ALIASA '~' expresion ';' ;
    public final mdParser.asignacion_return asignacion() throws RecognitionException {
        mdParser.asignacion_return retval = new mdParser.asignacion_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ALIASA185=null;
        Token char_literal186=null;
        Token char_literal188=null;
        mdParser.expresion_return expresion187 =null;


        Object ALIASA185_tree=null;
        Object char_literal186_tree=null;
        Object char_literal188_tree=null;

        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:104:14: ( ALIASA '~' expresion ';' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/gramaticadesc/md.g:104:16: ALIASA '~' expresion ';'
            {
            root_0 = (Object)adaptor.nil();


            ALIASA185=(Token)match(input,ALIASA,FOLLOW_ALIASA_in_asignacion1162); 
            ALIASA185_tree = 
            (Object)adaptor.create(ALIASA185)
            ;
            adaptor.addChild(root_0, ALIASA185_tree);


            char_literal186=(Token)match(input,53,FOLLOW_53_in_asignacion1164); 
            char_literal186_tree = 
            (Object)adaptor.create(char_literal186)
            ;
            adaptor.addChild(root_0, char_literal186_tree);


            pushFollow(FOLLOW_expresion_in_asignacion1166);
            expresion187=expresion();

            state._fsp--;

            adaptor.addChild(root_0, expresion187.getTree());

            char_literal188=(Token)match(input,35,FOLLOW_35_in_asignacion1168); 
            char_literal188_tree = 
            (Object)adaptor.create(char_literal188)
            ;
            adaptor.addChild(root_0, char_literal188_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

                    catch (RecognitionException e) 
                    {
                        throw e;
                    }
                
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "asignacion"

    // Delegated rules


 

    public static final BitSet FOLLOW_md_in_prog79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLengArchivo_in_md91 = new BitSet(new long[]{0x0000040000868002L});
    public static final BitSet FOLLOW_listLengClases_in_md95 = new BitSet(new long[]{0x0000040000868002L});
    public static final BitSet FOLLOW_listLengComandos_in_md99 = new BitSet(new long[]{0x0000040000868002L});
    public static final BitSet FOLLOW_listLengFns_in_md103 = new BitSet(new long[]{0x0000040000868002L});
    public static final BitSet FOLLOW_listLengApp_in_md107 = new BitSet(new long[]{0x0000040000868002L});
    public static final BitSet FOLLOW_17_in_listLengArchivo155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengArchivo157 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_listLengArchivo159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengArchivo161 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_opcionesA_in_listLengArchivo163 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_listLengArchivo165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_opcionesA173 = new BitSet(new long[]{0x00100000380000C0L});
    public static final BitSet FOLLOW_ubicacionA_in_opcionesA176 = new BitSet(new long[]{0x00100000000000C0L});
    public static final BitSet FOLLOW_Fecha_in_opcionesA183 = new BitSet(new long[]{0x0010000000000080L});
    public static final BitSet FOLLOW_Hora_in_opcionesA190 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_opcionesA196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativa_in_ubicacionA204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_absoluta_in_ubicacionA208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_absoluta217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_absoluta218 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27_in_relativa228 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_relativa230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_relativa231 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28_in_relativa237 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_relativa239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_relativa240 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_42_in_listLengClases352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengClases354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengClases357 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_propiedad_in_listLengClases361 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_listLengClases363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tripleta_in_propiedad373 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_LengTipo_in_tripleta383 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_tripleta385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_tripleta387 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_tripleta389 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_expresion_in_tripleta391 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_tripleta393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_listLengComandos403 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_listLengComandos405 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_listLengComandos407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengComandos409 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_listLengComandos411 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_listLengComandos413 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_UbicacionC_in_listLengComandos415 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_listLengComandos417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_listLengApp441 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_Int_in_listLengApp443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengApp447 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_listLengApp449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_listLengApp451 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_listLengApp453 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_listLengApp455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoOUT_in_listLengApp457 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_listLengApp459 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_opcionesApp_in_listLengApp461 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_descripcionApp_in_listLengApp463 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_listLengApp465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoIN473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoIN479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoIN483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_argumentoIN485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoIN491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_argumentoIN493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_archivo503 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_archivo505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_archivo507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoOUT515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoOUT521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_opcionesApp530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_opcionesApp532 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_opcionesApp_in_opcionesApp534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_opcionesApp538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_opcionesApp540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_descripcionApp548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjuncion_in_expresion561 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_expresionP_in_expresion564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_expresionP576 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_conjuncion_in_expresionP578 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_expresionP_in_expresionP581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relacion_in_conjuncion593 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_conjuncionP_in_conjuncion596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_conjuncionP608 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_relacion_in_conjuncionP610 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_conjuncionP_in_conjuncionP613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adicion_in_relacion625 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacion628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_relacionP640 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP642 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP645 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_relacionP650 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP652 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP655 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_relacionP660 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP662 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP665 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_relacionP670 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP672 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP675 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_relacionP685 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP687 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP690 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_relacionP695 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP697 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacionP700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termino_in_adicion713 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_adicionP_in_adicion716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_adicionP728 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_termino_in_adicionP730 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_adicionP_in_adicionP733 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_adicionP739 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_termino_in_adicionP741 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_adicionP_in_adicionP744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negacion_in_termino757 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_terminoP_in_termino760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_terminoP772 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_negacion_in_terminoP774 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_terminoP_in_terminoP777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_terminoP785 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_negacion_in_terminoP787 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_terminoP_in_terminoP790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_negacion802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_negacion806 = new BitSet(new long[]{0x00000400381007F0L});
    public static final BitSet FOLLOW_factor_in_negacion807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_factor816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tripleta_in_factor820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_factor828 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_expresion_in_factor830 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_factor833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_listLengFns844 = new BitSet(new long[]{0x00000400380005E0L});
    public static final BitSet FOLLOW_literal_in_listLengFns846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns848 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_listLengFns850 = new BitSet(new long[]{0x00000400380005E0L});
    public static final BitSet FOLLOW_literal_in_listLengFns852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns854 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_listLengFns857 = new BitSet(new long[]{0x00000400380005E0L});
    public static final BitSet FOLLOW_literal_in_listLengFns859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns861 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_listLengFns866 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_listLengFns868 = new BitSet(new long[]{0x0002200000000010L});
    public static final BitSet FOLLOW_instrucciones_in_listLengFns870 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_listLengFns872 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_listLengFns874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Int_in_literal883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_literal887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fecha_in_literal891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Hora_in_literal895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_file_in_literal899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLengClases_in_literal903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_literal907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativa_in_file995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_absoluta_in_file999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listVariables_in_z1036 = new BitSet(new long[]{0x0002200000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_z1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lengVar_in_listVariables1050 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_LengTipo_in_lengVar1061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_lengVar1063 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_lengVar1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucciones_in_listInstrucciones1074 = new BitSet(new long[]{0x0002200000000012L});
    public static final BitSet FOLLOW_asignacion_in_instrucciones1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ciclo_in_instrucciones1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicion_in_instrucciones1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicionP_in_condicion1104 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_condicion1106 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_condicion1108 = new BitSet(new long[]{0x0012200000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_condicion1110 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_condicion1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_condicionP1120 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_condicionP1122 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_expresion_in_condicionP1124 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_condicionP1126 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_condicionP1128 = new BitSet(new long[]{0x0012200000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_condicionP1130 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_condicionP1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ciclo1141 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ciclo1143 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_expresion_in_ciclo1145 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ciclo1147 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ciclo1149 = new BitSet(new long[]{0x0012200000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_ciclo1151 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ciclo1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_asignacion1162 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_asignacion1164 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_expresion_in_asignacion1166 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_asignacion1168 = new BitSet(new long[]{0x0000000000000002L});

}