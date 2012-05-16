grammar md;

prog    		:       md EOF;
md			:	(listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp)+;

//Elementos comunes
ALIASA		:	(['a'..'z'] | ['A'..'Z'])(['a'..'z'] | ['A'..'Z'] | ['0'..'9'])*;
ALIASE		: 	(['a'..'z'] | ['A'..'Z'] | ['0'..'9'])*;

//Lenguaje de archivos

listLengArchivo		:	lenA listLengArchivo | ;
lenA 			:	'$' ALIASA '.' ALIASE opcionesA '$$';
opcionesA		:	'{' ubicacionA FechaCreacion FechaEdit HoraCreacion HoraEdit '}';
ubicacionA		:	relativa | absoluta | ;
absoluta		:	('/'ALIASA)+;
relativa		:	'.'('/'ALIASA)+ | '..'('/'ALIASA)+;
FechaCreacion		:	([0-9]{2} '/' [0-9]{2} '/' [0-9]{4}) | ;
FechaEdit		:	([0-9]{2} '/' [0-9]{2} '/' [0-9]{4}) | ;
HoraCreacion		:	[0-9]{2}':'[0-9]{2}':'[0-9]{2} | ;
HoraEdit		:	[0-9]{2}':'[0-9]{2}':'[0-9]{2} | ;

//Lenguaje de clases
listLengClases		:	lenClases listLengClases | ;
lenClases		:	'class' ALIASA DescripcionClases propiedad '/class';
DescripcionClases	:	(['a'..'z'] | ['A'..'Z'] | ['0'..'9'])+;
propiedad		:	tripleta(','tripleta)*;
tripleta		:	LengTipo ':' ALIASA '~' expresion;

//Lenguaje de comandos
listLengComandos	:	lenC listLengComandos | lenC;
lenC			:	'+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++';
UbicacionC		:	('/'ALIASA)+'/';

//Lenguaje de aplicación 
listLengApp		:	lenApp listLengApp | lenApp;
lenApp			:	'#' Id /*Comandos*/ ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##';
Id			:	(['0'..'9'])+;
argumentoIN		:	archivo | /*Clase*/ ALIASA | archivo argumentoIN | /*Clase*/ ALIASA argumentoIN;
archivo			: 	ALIASA '.' ALIASE;
argumentoOUT		:	archivo | /*Clase*/ ALIASA; 
opcionesApp		:	'-' ALIASA opcionesApp | '-' ALIASA;
descripcionApp		:	ALIASA | ;

//Lenguaje de expresiones
Expresion			--> Conjuncion | Expresion || Conjuncion
Conjuncion			--> Relacion | Conjuncion && Relacion
Relacion			--> Adicion | Relacion < Adicion 
						| Relacion <= Adicion | Relacion > Adicion 
						| Relacion >= Adicion | Relacion == Adicion
						| Relacion != Adicion
Adicion				--> Termino | Adicion + Termino | Adicion | Termino
Termino				--> Negacion | Termino * Negacion | Temino / Negacion
Negacion			--> Factor | !Factor
Factor				--> Identificador | Propiedad | Literal | '(' Expresion ')'
