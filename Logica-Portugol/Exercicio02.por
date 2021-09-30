programa
{
	inclua biblioteca Matematica 

	
	funcao inicio()
	{
		real cod,numeroHoras, salario, ex
		ex = 0

		
		escreva(" Quantas horas vc trabalhou nesta semana?")
		leia(numeroHoras)
		
		salario = numeroHoras * 10

		se (numeroHoras > 50){
			ex = numeroHoras - 50;
			
		}

		senao {
			escreva(" O funcionario n teve exc")
		}

			salario = salario + ( ex * 20)
			escreva(" O salario final é de ", salario, " reais.")	
			
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 96; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */