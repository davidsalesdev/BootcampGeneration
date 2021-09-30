programa
{
    inclua biblioteca Matematica --> mat
    funcao inicio()
    {
        inteiro num

        escreva("Digite um número: ");
        leia(num)

        se (num%2 == 0) {
            escreva("Seu número é par.");
        }

        senao {
            escreva("Seu número é ímpar.");
        }

        se (num >= 0) {
            escreva("Seu número é positivo.");
        }

        senao {
            escreva("\nSeu número é negativo.");
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */