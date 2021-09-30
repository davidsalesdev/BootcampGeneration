package br.com.generation;

import java.util.Scanner;
//leonardo azevedo
//4 - Faça um programa em que permita a entrada de um número qualquer
// exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
//se for ímpar exiba o número elevado ao quadrado.

public class Exercicio2 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int numero;
	double raiz, elevado = 0;
	
	System.out.println("Digite um numero inteiro: ");
	numero = leia.nextInt();
	elevado = Math.pow(numero, elevado);
	
	if(numero % 2 ==0) {; // se o resto da divisao for igual a 0 é par
	   System.out.println("este numero é par...");
	   raiz = Math.sqrt(numero);
	   
	   System.out.println("Raiz Quadrada:" + raiz);
	   System.out.println("Raiz Quadrada:" + Math.sqrt(numero));
	}
	else if (numero % 2==1) { //se o resto da divisao for igual a 1 é impar
		System.out.println("este numero é impar...");
		elevado = Math.pow(numero, 2);
		
		System.out.println("potencia:  + elevado");
		
		leia.close();
	}
	}
}
