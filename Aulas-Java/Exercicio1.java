package br.com.generation;

import java.util.Scanner;

public class Exercicio1 {
//leonardo azevedo
//1 -Faça um programa que receba três inteiros e diga qual deles é o maior.
    
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	int numero1 = 0, numero2 = 0, numero3 = 0;

	System.out.println("digite o primeiro numero: ");
	numero1 = leia.nextInt();
	
	System.out.println("digite o segundo numero: ");
	numero2 = leia.nextInt();
		
	System.out.println("digite o terceiro numero: ");
	numero3 = leia.nextInt();
	
	if (numero1 > numero2 && numero1 > numero3){
	System.out.println("O primeiro numero é o maior e o numero digitado foi = " + numero1);
	}
    if (numero2 > numero1 && numero2 > numero3){	
    System.out.println("O segundo numero é o maior e o numero digitado foi = " + numero2);
    }
    if (numero3 > numero1 && numero3 > numero2){	
    System.out.println("O terceiro numero é o maior e o numero digitado foi = " + numero3);
    }
	leia.close();
	
}
}

