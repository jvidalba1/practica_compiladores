import java_cup.runtime.Symbol;
import java_cup.runtime.Scanner;

%%

%class DefCupmdLexer
%unicode
%line
%column
%public
%cup 

DATE = [:digit:]{2}"/"[:digit:]{2}"/"[:digit:]{4}
HORA = [:digit:]{2} ":" [:digit:]{2} ":" [:digit:]{2}
TIPO = "int" | "bool" | "file" | "class" | "date" | "hour" | "string"
BOOL = "true" | "false"
OPCION = "-"([:jletterdigit:]|"_")+
ID = [:jletter:]([:jletterdigit:]|"_")*
EXT = "."([:jletterdigit:]|"_")*
INT = [:digit:]+

STRING = [:jletterdigit:]*
ALIASA = [:jletter:]([:jletterdigit:])*
UBICACIONABS = ("/"ALIASA)+
UBICACIONREL = ("."("/"ALIASA)+) | (".."("/"ALIASA)+)
UBICACIONC = ("/"ALIASA)+"/"
FILE = ALIASA "." ALIASA
COMENTARIOS = [:jletter:]([:jletterdigit:] | ([ \t\n]))*

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\n]

%%

/* ============================== Lenguaje de expresiones ===========================*/

"||"							{ return new Symbol(CupSymbol.OR); }
"&&"                  			{ return new Symbol(CupSymbol.AND); }
"<"                  			{ return new Symbol(CupSymbol.MENOR); }
"<="                  			{ return new Symbol(CupSymbol.MENORQUE); }
">"                  			{ return new Symbol(CupSymbol.MAYOR); }
">="                  			{ return new Symbol(CupSymbol.MAYORQUE); }
"=="                  			{ return new Symbol(CupSymbol.IGUALIGUAL); }
"!="                  			{ return new Symbol(CupSymbol.DIFERENTE); }
"!"                  			{ return new Symbol(CupSymbol.NEGACION); }
"("                  			{ return new Symbol(CupSymbol.LPAREN); }
")"                  			{ return new Symbol(CupSymbol.RPAREN); }
"+"                  			{ return new Symbol(CupSymbol.PLUS); }
"-"                 			{ return new Symbol(CupSymbol.MINUS); }
"*"                  			{ return new Symbol(CupSymbol.MUL); }
"//"                 			{ return new Symbol(CupSymbol.DIVIDE); }

/*==================================================================================*/

"/*"                  			{ return new Symbol(CupSymbol.LCOMMENT); }
"*/"                  			{ return new Symbol(CupSymbol.RCOMMENT); }
"$$"                  			{ return new Symbol(CupSymbol.RFILE); }
"$"                  			{ return new Symbol(CupSymbol.LFILE); }
"^-"                  			{ return new Symbol(CupSymbol.LOPCIONESFILE); }
"-^"                  			{ return new Symbol(CupSymbol.ROPCIONESFILE); }
"/"                  			{ return new Symbol(CupSymbol.DELDIR); }
"."                  			{ return new Symbol(CupSymbol.POINT); }
".."                  			{ return new Symbol(CupSymbol.PUNTODOBLE); }
"%"                  			{ return new Symbol(CupSymbol.LCLASS); }
"%%"                  			{ return new Symbol(CupSymbol.RCLASS); }
"'"                  			{ return new Symbol(CupSymbol.DESCRIPCION); }
":"                  			{ return new Symbol(CupSymbol.DOSPUNTOS); }
"~"                  			{ return new Symbol(CupSymbol.IGUAL); }
","                  			{ return new Symbol(CupSymbol.SEPARADOR); }
"¿"                  			{ return new Symbol(CupSymbol.LCOMMAND); }
"?"                  			{ return new Symbol(CupSymbol.RCOMMAND); }
"nombre"                  		{ return new Symbol(CupSymbol.NOMBRECOMMAND); }
"#"                  			{ return new Symbol(CupSymbol.LAPP); }
"##"                  			{ return new Symbol(CupSymbol.RAPP); }
"<<"                  			{ return new Symbol(CupSymbol.ARGIN); }
">>"                  			{ return new Symbol(CupSymbol.ARGOUT); }
","                  			{ return new Symbol(CupSymbol.SEPTRI); }
"%="                  			{ return new Symbol(CupSymbol.LFNS); }
"=%"                  			{ return new Symbol(CupSymbol.RFNS); }
"true"                  		{ return new Symbol(CupSymbol.BOOLTRUE); }
"false"                  		{ return new Symbol(CupSymbol.BOOLFALSE); }
"{"                  			{ return new Symbol(CupSymbol.LINSTRUCCIONES); }
"}"                  			{ return new Symbol(CupSymbol.RINSTRUCCIONES); }
";"                  			{ return new Symbol(CupSymbol.PUNTOYCOMA); }
"else"                  		{ return new Symbol(CupSymbol.ELSE); }
"if"                  			{ return new Symbol(CupSymbol.IF); }
"while"                  		{ return new Symbol(CupSymbol.WHILE); }

{DATE}                          {return new Symbol(CupSymbol.FECHA);}
{HORA}                          {return new Symbol(CupSymbol.HORA);}
{TIPO}                          {return new Symbol(CupSymbol.TIPO);}
{BOOL}                          {return new Symbol(CupSymbol.BOOL);}
{OPCION}                        {return new Symbol(CupSymbol.OPCION);}
{ID}                            {return new Symbol(CupSymbol.ID);}
{EXT}                           {return new Symbol(CupSymbol.EXT);}
{INT}                           {return new Symbol(CupSymbol.INT);}

{STRING}						{return new Symbol(CupSymbol.STRING);}
{ALIASA}						{return new Symbol(CupSymbol.ALIASA);}
{UBICACIONABS}					{return new Symbol(CupSymbol.UBICACIONABS);}
{UBICACIONREL}					{return new Symbol(CupSymbol.UBICACIONREL);}
{UBICACIONC}					{return new Symbol(CupSymbol.UBICACIONC);}
{FILE}							{return new Symbol(CupSymbol.FILE);}
{COMENTARIOS}					{return new Symbol(CupSymbol.COMENTARIO);}

{WhiteSpace}         { /* Ignore */ }

.|\n                 { throw new Error("Illegal character <" + 
                                       yytext() + "> at line: " + 
                                       (yyline + 1) + " column: " + 
                                       yycolumn); 
                     }

<<EOF>>              { return null; }
