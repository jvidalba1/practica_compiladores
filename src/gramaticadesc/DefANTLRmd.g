grammar md;              

prog    		:       md EOF;
md			:	( comments | listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+;

//Elementos comunes

LengTipo	:	'int' | 'bool' | 'date' | 'hour' | 'file' | 'class' | 'string';

//Lenguaje de comentarios
comments		:	'/*' Comentarios '*/';

//Lenguaje de archivos

listLengArchivo		:	'$' ALIASA '.' ALIASA opcionesA '$$';
opcionesA		:	'{' (ubicacionA | ) (Fecha | ) (Hora | ) '}';
ubicacionA		:	relativa | ('/'ALIASA)+;
//absoluta		:	('/'ALIASA)+;
relativa		:	'.'('/'ALIASA)+ | '..'('/'ALIASA)+;
//relativaP		: 	'.' | '..';
Fecha			:	(('0'..'9')('0'..'9') '/' ('0'..'9')('0'..'9') '/' ('0'..'9')('0'..'9')('0'..'9')('0'..'9'));
Hora			:	(('0'..'9')('0'..'9')':'('0'..'9')('0'..'9')':'('0'..'9')('0'..'9'));

//Lenguaje de clases

listLengClases		:	'%' ALIASA '"' Comentarios '"' propiedad '%%';
//DescripcionClases	:	(('a'..'z') | ('A'..'Z') | ('0'..'9'))+;
propiedad		:	(tripleta)+;
tripleta		:	LengTipo ':' ALIASA '~' expresion ',';

//Lenguaje de comandos

listLengComandos	:	'+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++';
UbicacionC		:	('/'ALIASA)+'/';

//Lenguaje de aplicación 

listLengApp		:	'#' Int /*Comandos*/ ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##';
argumentoIN		:	archivo | /*Clase*/ ALIASA | archivo argumentoIN | /*Clase*/ ALIASA argumentoIN;
archivo			: 	ALIASA '.' ALIASA;
argumentoOUT		:	archivo | /*Clase*/ ALIASA; 
opcionesApp		:	'-' ALIASA opcionesApp | '-' ALIASA;
descripcionApp		:	ALIASA | ;

//Lenguaje de expresiones sin recursividad por la izquierda
expresion		:	conjuncion (expresionP | );
expresionP		:	'||' conjuncion (expresionP | );
conjuncion		:	relacion (conjuncionP | );
conjuncionP		:	'&&' relacion (conjuncionP | );
relacion		:	adicion (relacionP | );
relacionP		:	'<' adicion (relacionP | )'<=' adicion (relacionP | )'>' adicion (relacionP | )'>=' adicion (relacionP | )
				'==' adicion (relacionP | )'!=' adicion (relacionP | );
adicion			:	termino (adicionP | );
adicionP		:	'+' termino (adicionP | ) | '-' termino (adicionP | );
termino			:	negacion (terminoP | );
terminoP		:	'*' negacion (terminoP | ) | '//' negacion (terminoP | );
negacion		:	factor | '!'factor;
factor			:	ALIASA | tripleta | literal | '(' expresion  ')';

//Lenguaje de funciones

listLengFns		:	'%=' literal ALIASA '(' literal ALIASA (','(literal ALIASA))* ')' '{' instrucciones '}' '=%';
literal			:	Int | Bool | Fecha | Hora | file | listLengClases | String;
Int			:	('1'..'9')('0'..'9')*;
Bool			:	'true' | 'false';
ALIASA			:	(('a'..'z') | ('A'..'Z'))(('a'..'z') | ('A'..'Z') | ('0'..'9'))*;
Comentarios		:	(('a'..'z') | ('A'..'Z')) (('a'..'z') | ('A'..'Z') | ('0'..'9') | (' '|'\t'))* ;
file			:	ubicacionA;
String			:	(('a'..'z')|('A'..'Z')|('0'..'9'))*;
z			:	listVariables listInstrucciones | ;
listVariables		:	(lengVar)+;
lengVar			:	LengTipo ALIASA ';';
listInstrucciones 	:	(instrucciones)+ | ;
instrucciones		: 	asignacion | ciclo | condicion;
condicion		:	condicionP 'else' '{' listInstrucciones '}';
condicionP		:	'if' '(' expresion ')' '{' listInstrucciones '}';
ciclo			:	'while' '(' expresion ')' '{' listInstrucciones '}';
asignacion 		:	ALIASA '~' expresion ';';

//Id			:	(('0'..'9'))+;


//ALIASE		: 	(('a'..'z') | ('A'..'Z') | ('0'..'9'))*;
NEWLINE         :       '\r'? '\n'+{skip();} ;

WS              :       (' '|'\t')+ {skip();} ;

