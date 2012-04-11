#GramaticaMD = {

	V =	{ListLengArchivo, ListLengClases, ListLengComandos, ListLengFn, ListLengApp, ListLengArchivo,
	 	ListLengArchivo, LenA, Nombre, Extencion }

	∑ = {LenA, ε, Alias, nombre, ext, ~, ., ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])* }

	S = {LenguajeTotal}

	P = { 
			LenguajeTotal	 	--> ListLengArchivo ListLengClases ListLengComandos ListLengFns ListLengApp

			ListLengArchivo 	--> LenA ListLengArchivo | ε
			LenA 				--> '$'Nombre Extension '$$'
			Nombre 				--> 'nombre' '=' AliasA
			Extension 			--> 'ext' '=' AliasE
			AliasA				--> ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])*
			AliasE				--> ([a-z]|[A-Z]|[0-9])*
			
			=> Lenguaje De Clases <=

			ListLengComandos	--> LenC ListLengComandos | LenC
			LenC				--> '>' 'nombre' '=' AliasA 'dir' '=' UbicacionC '<'
			UbicacionC			--> (/AliasA)+/
			
			=> Lenguaje De Funciones <=
			
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

		}

#}

#Keys:
	V -> No Terminales
	∑ -> Terminales
	S -> Axioma
	P -> Reglas sintácticas

