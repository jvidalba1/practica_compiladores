#GramaticaMD = {

	V =	{ListLengArchivo, ListLengClases, ListLengComandos, ListLengFn, ListLengApp, ListLengArchivo,
	 	ListLengArchivo, LenA, Nombre, Extencion }

	∑ = {}

	S = {LenguajeTotal}

	P = { 
=============================================================================================================
		LenguajeTotal	 	--> ListLengArchivo ListLengClases ListLengComandos ListLengFns ListLengApp
=============================================================================================================
		ListLengArchivo 	--> LenA ListLengArchivo | ε
		LenA 				--> '$' Nombre Extension OpcionesA '$$'
		Nombre 				--> 'nombre' '~' AliasA
		Extension 			--> 'ext' '~' AliasE
		AliasA				--> ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])*
		AliasE				--> ([a-z]|[A-Z]|[0-9])*
		Opciones			--> '{' UbicacionA FechaCreacion FechaEdit HoraCreacion HoraEdit '}'
		UbicacionA			--> Relativa | Absoluta | ε
		Absoluta			--> 'dir' '~' ('/'AliasA)+
		Relativa			--> 'dir' '~' '.'(/AliasA)+ | 'dir' '~' '..'(/AliasA)+
		FechaCreacion		--> 'fechaC' '~' ([0-9]{2} '/' [0-9]{2} '/' [0-9]{2} [0-9]{2}) | ε
		FechaEdit			--> 'fechaM' '~' ([0-9]{2} '/' [0-9]{2} '/' [0-9]{2} [0-9]{2}) | ε
		HoraCreacion		--> 'HoraC' '~' DD ':' DD ':' DD | ε
		HoraEdit			--> 'HoraM' '~' DD ':' DD ':' DD | ε	
=============================================================================================================
		ListLengClases		--> LenClases ListLengClases | ε
		LenClases			--> 'class' Identificador Descripcion Propiedades Caracteristicas '/class'
		Identificador		--> 'Identidicador' '~' ([a-z]|[A-Z]|[ ])
		DescripcionClases	--> 'Descri' '~' ([a-z]|[A-Z]|[ ]|[0-9])+
		Propiedades			--> Tripleta(','Tripleta)*
		Tripleta			--> LengTipo AliasA "~" Expresion
		CaracteristicasC	--> 
=============================================================================================================
		ListLengComandos	--> LenC ListLengComandos | LenC
		LenC				--> '>' 'nombre' '~' AliasA 'dir' '~' UbicacionC '<'
		UbicacionC			--> (/AliasA)+/
=============================================================================================================			
		ListLengApp			--> LenApp ListLengApp | LenApp
		LenApp				--> '#' Id Comando ArgumentoIN ArgumentoOUT Opciones Descripcion '##'
		Id					--> ([0-9])+
		Comando				--> AliasA
		ArgumentoIN			--> Archivo | Clase | Archivo ArgumentoIN | Clase ArgumentoIN
		Archivo				--> AliasA '.' AliasE
		Clase				--> AliasA
		ArgumentoOUT		--> Archivo | Clase 
		OpcionesApp			--> '-' AliasA OpcionesApp | '-' AliasA
		DescripcionApp		--> '"' AliasA  '"' | ε
=============================================================================================================
		Expresion			--> Conjuncion | Expresion || Conjuncion
		Conjuncion			--> Relacion | Conjuncion && Relacion
		Relacion			--> Adicion | Relacion < Adicion 
								| Relacion <= Adicion | Relacion > Adicion 
								| Relacion >= Adicion | Relacion == Adicion
								| Relacion != Adicion
		Adicion				--> Termino | Adicion + Termino | Adicion | Termino
		Termino				--> Negacion | Termino * Negacion | Temino / Negacion 						  			Negacion			--> Factor | !Factor
		Factor				--> Identificador | Propiedad | Literal | (Expresion)
=============================================================================================================
		ListLengFns			--> LenFn ListLengFns | LenFn
		LenFn				--> '%=' 'def' LengTipo AliasA '(' LengTipo AliasA (','(LengTipo AliasA))* 									')' '{' Instrucciones '}' '=%'
		LengTipo			--> 'int' | 'bool' | 'date' | 'hour' | 'file' | 'classFile' | 'string'
		Instrucciones		--> ListVariables RestoInstrucciones | ε
		ListVariables		--> LenVar ListVariables | LenVar
		LengVar				--> LengTipo AliasA ';'
		RestoInstrucciones 	--> ListCondicionales RestoInstrucciones | ListCiclos RestoInstrucciones | 									ListAsignaciones RestoInstrucciones | ε
		ListCondicionales	--> 'if''('Expresion')' '{'RestoInstrucciones'}' | 									'if''('Expresion')' '{'RestoInstrucciones'}' 'else' 								'{'RestoInstrucciones'}'
		ListCiclos			--> 'while' '(' Expresion ')' '{' RestoInstrucciones '}'
		ListAsignaciones	--> LenAsignacion ListAsignaciones | LenAsignacion
		LenAsignacion 		--> AliasA '~' LengExpresiones ';'

	}
=============================================================================================================

#}

#Keys:
	V -> No Terminales
	∑ -> Terminales
	S -> Axioma
	P -> Reglas sintácticas
