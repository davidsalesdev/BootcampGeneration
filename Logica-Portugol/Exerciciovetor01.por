programa
{
	inclua biblioteca Util --> u

    funcao inicio()
    {
        inteiro  vetor[5], maiorp=0,x

        
        para (x = 0; x < 5; x++){
            escreva("pontuação: ", x+1,":")
       	leia(vetor[x])
            se (maiorp<vetor[x])
            {
            
				maiorp = vetor[x]
			}

		}
		para( x=0; x < 5; x++){
			escreva("\n Pontuação ",vetor[x])
		}
		escreva("\n A maior pontuação foi : ", maiorp)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 7, 17, 5}-{maiorp, 7, 27, 6}-{x, 7, 36, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */