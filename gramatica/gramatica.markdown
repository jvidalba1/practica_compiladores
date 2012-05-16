#GramaticaMD = {

		V =	{LenguajeTotal, ListLengArchivo, ListLengClases, ListLengComandos, ListLengFn, ListLengApp, 			ListLengArchivo,ListLengArchivo, LenA, Nombre, Extencion }

		∑ = {}

		S = {LenguajeTotal}

		P = { 
=============================================================================================================
		LenguajeTotal	 	--> (ListLengArchivo | ListLengClases | ListLengComandos | ListLengFns | ListLengApp)+
=============================================================================================================
		ListLengArchivo 	--> LenA ListLengArchivo | ε
		LenA 				--> '$' AliasA '.' AliasE OpcionesA '$$'
		AliasA				--> ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])*
		AliasE				--> ([a-z]|[A-Z]|[0-9])*
		OpcionesA			--> '{' UbicacionA FechaCreacion FechaEdit HoraCreacion HoraEdit '}'
		UbicacionA			--> Relativa | Absoluta | ε
		Absoluta			--> ('/'AliasA)+
		Relativa			--> '.'(/AliasA)+ | '..'(/AliasA)+
		FechaCreacion		--> ([0-9]{2} '/' [0-9]{2} '/' [0-9]{4}) | ε
		FechaEdit			--> ([0-9]{2} '/' [0-9]{2} '/' [0-9]{4}) | ε
		HoraCreacion		--> [0-9]{2}':'[0-9]{2}':'[0-9]{2} | ε
		HoraEdit			--> [0-9]{2}':'[0-9]{2}':'[0-9]{2} | ε	
=============================================================================================================
		ListLengClases		--> LenClases ListLengClases | ε
		LenClases			--> 'class' AliasA Descripcion Propiedad '/class'
		DescripcionClases	--> ([a-z]|[A-Z]|[0-9])+
		Propiedad			--> Tripleta(','Tripleta)*
		Tripleta			--> LengTipo ':' AliasA '~' Expresion
=============================================================================================================
		ListLengComandos	--> LenC ListLengComandos | LenC
		LenC				--> '+' 'nombre' '~' AliasA 'dir' '~' UbicacionC '+'
		UbicacionC			--> (/AliasA)+/
=============================================================================================================			
		ListLengApp			--> LenApp ListLengApp | LenApp
		LenApp				--> '#' Id Comando 'in' ArgumentoIN '/in' 'out' ArgumentoOUT '/out' OpcionesApp Descripcion '##'
		Id					--> ([0-9])+
		Comando				--> AliasA
		ArgumentoIN			--> Archivo | Clase | Archivo ArgumentoIN | Clase ArgumentoIN
		Archivo				--> AliasA '.' AliasE
		Clase				--> AliasA
		ArgumentoOUT		--> Archivo | Clase 
		OpcionesApp			--> '-' AliasA OpcionesApp | '-' AliasA
		DescripcionApp		--> AliasA| ε
=============================================================================================================
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
=============================================================================================================
		ListLengFns			--> LenFn ListLengFns | LenFn
		LenFn				--> '%=' LengTipo AliasA '(' LengTipo AliasA (','(LengTipo AliasA))*
								')' '{' Instrucciones '}' '=%'
		Literal				--> Int | Bool | Date | Hour | File | LenClases | String
		Int					--> ([0-9]*) | Expresion
		Bool				--> 'true' | 'false' | Expresion
		Date				--> ([0-9]{2} '/' [0-9]{2} '/' [0-9]{4}) | Expresion
		Hour				--> [0-9]{2}':'[0-9]{2}':'[0-9]{2} | Expresion
		File				--> Relativa | Absoluta
		String				--> ([a-z]|[A-Z]|[0-9])*
		Instrucciones		--> ListVariables RestoInstrucciones | ε
		ListVariables		--> LenVar ListVariables | LenVar
		LengVar				--> LengTipo AliasA ';'
		RestoInstrucciones 	--> ListCondicionales RestoInstrucciones | ListCiclos RestoInstrucciones
								| ListAsignaciones RestoInstrucciones | ε
		ListCondicionales	--> 'if''('Expresion')' '{'RestoInstrucciones'}'
								| 'if''('Expresion')' '{'RestoInstrucciones'}' 'else'
								'{'RestoInstrucciones'}'
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
