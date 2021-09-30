programa
{
	
	funcao inicio()
	{


	real peso, ex, multa = 4,  reg = 50

	escreva(" Digite o peso do peixe: ")
	leia(peso)


	ex = peso - reg


	se (ex > 0){
	
		multa = 4 * ex
		escreva(" O valor da multa é: ", multa, ".")
	}

	senao {
		escreva("O valor está dentro do reg.")
		
		}	

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 154; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */