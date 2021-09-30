package br.com.generation;

import java.util.Scanner;
/*leonardo azevedo
4 - Faça um programa que receba a idade de uma pessoa 
 * e mostre na saída em qual categoria ela se encontra:
	10-14 infantil
	15-17 juvenil
	18-25 adulto
 */

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//int infantil; 
		//int juvenil;
	    // int adulto;
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		
		if (idade >=10 && idade <=14 ) {
			System.out.println("Voce esta na categoria INFANTIL: " + idade + " anos");
		}
		if (idade >=15 && idade <=17 ) {
			System.out.println("Voce esta na categoria JUVENIL: " + idade + " anos");
		}
		else if (idade >=18 && idade <=25) {
		    System.out.println("Voce esta na categoria ADULTO: " + idade + " anos");
		}
		else { //senao
			System.out.println("Insira uma idade valida!!!!!!! (de 10 a 25 anos) ");
		}
			ler.close();
	}
}
