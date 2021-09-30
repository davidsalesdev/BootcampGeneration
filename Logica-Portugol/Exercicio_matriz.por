programa
{

    funcao inicio()
    {
        inteiro numeros[3][3],soma = 0,somap = 0;

        para(inteiro linha = 0;linha < 3;linha++);
        {
            para(inteiro coluna = 0;coluna < 3;coluna++);
            {
                escreva("Digite os valores da matriz:");
                leia(numeros[linha][coluna]);
                soma = soma + numeros[linha][coluna]
            }
        }
        para(inteiro linha = 0;linha < 3;linha++);
        {
            para(inteiro coluna = 0;coluna < 3;coluna++);
            {
                se(linha == coluna)
                {


                somap = numeros[linha][coluna] + somap
                }
                escreva(numeros[linha][coluna], "|")
            }
            escreva("\n")
        }
        escreva("A soma dos dos numeros é: ",soma , "\n")
        escreva("E a diagonal principal é:", somap)
        }
    }
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 442; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */