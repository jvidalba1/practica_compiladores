#GramaticaMD = 
#{
	####V =	{ListLengArchivo, ListLengClases, ListLengComandos, ListLengFn, ListLengApp, ListLengArchivo,
	#### 	ListLengArchivo, LenA, Nombre, Extencion }

	####∑ = 	{LenA, ε, Alias, nombre, ext, ~, ., ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])* }

	####S = {LenguajeTotal}

	####P = { 
			LenguajeTotal	 	--> ListLengArchivo ListLengClases ListLengComandos ListLengFns ListLengApp

			ListLengArchivo 	--> LenA ListaArchivos | ε
			LenA 				--> Nombre Extencion
			Nombre 				--> 'nombre' '=' Alias
			Extencion 			--> 'ext' '=' Alias
			Alias				--> ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])*	

	####	}

#}

#Keys:
####	V -> No Terminales
####	∑ -> Terminales
####	S -> Axioma
####	P -> Reglas sintácticas
