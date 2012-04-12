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
			LenA 				--> '$'Nombre Extension '$$'
			Nombre 				--> 'nombre' '=' AliasA
			Extension 			--> 'ext' '=' AliasE
			AliasA				--> ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])*
			AliasE				--> ([a-z]|[A-Z]|[0-9])*
=============================================================================================================
			ListLengComandos	--> LenC ListLengComandos | LenC
			LenC				--> '>' 'nombre' '=' AliasA 'dir' '=' UbicacionC '<'
			UbicacionC			--> (/AliasA)+/
			
			ListLengApp			--> LenApp ListLengApp | LenApp
			LenApp				--> '#' Id Comando ArgumentoIN ArgumentoOUT Opciones Descripcion '##'
			Id					--> ([0-9])+
			Comando				--> ([a-z]|[A-Z])+
			ArgumentoIN			--> NombreIN ExtencionIN ArgumentoIN | NombreIN ExtencionIN
			NombreIN			--> AliasA 
			ExtencionIN  		--> AliasE
			ArgumentoOUT		--> NombreOUT ExtencionOUT ArgumentoOUT | NombreOUT ExtencionOUT
			NombreOUT			--> AliasA
			ExtencionOUT		--> AliasE
			Opciones			--> '-' AliasA Opciones | '-' AliasA
			Descripcion			--> AliasA
=============================================================================================================
			Expresion			--> Conjuncion | Expresion || Conjuncion
			Conjuncion			--> Relacion | Conjuncion && Relacion
			Relacion			--> Adicion | Relacion < Adicion 
									| Relacion <= Adicion | Relacion > Adicion 
									| Relacion >= Adicion | Relacion == Adicion
									| Relacion != Adicion
			Adicion				--> Termino | Adicion + Termino | Adicion | Termino
			Termino				--> Negacion | Termino * Negacion | Temino / Negacion 						  				Negacion			--> Factor | !Factor
			Factor				--> Identificador | Propiedad | Literal | (Expresion)
=============================================================================================================
			ListLengFns			--> LenFn ListaLengFns | LenFn
			LenFn				--> '%=' 'def' LengTipo AliasA '(' LengTipo AliasA (','(LengTipo AliasA))* 										')' '{' Instrucciones '}' '=%'
			LengTipo			--> 'int' | 'bool' | 'date' | 'hour' | 'file' | 'classFile' | 'string'
			Instrucciones		--> ListVariables RestoInstrucciones | ε
			ListVariables		--> LenVar ListVVariables | LenVar
			LengVar				--> LengTipo AliasA ';'
			RestoInstrucciones 	--> ListCondicionales RestoInstrucciones | ListCiclos RestoInstrucciones | 										ListAsignaciones RestoInstrucciones | ε
			ListCondicionales	--> 'if''('Expresion')' '{'RestoInstrucciones'}' | 										'if''('Expresion')' '{'RestoInstrucciones'}' 'else' 										'{'RestoInstrucciones'}'
			ListCiclos			--> 'while' '(' Expresion ')' '{' RestoInstrucciones '}'
			ListAsignaciones	--> LenAsignacion ListAsignaciones | LenAsignacion
			LenAsignacion 		--> AliasA '=' LengExpresiones ';'
=============================================================================================================
			
		}

#}

#Keys:
	V -> No Terminales
	∑ -> Terminales
	S -> Axioma
	P -> Reglas sintácticas

