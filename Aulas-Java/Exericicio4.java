package br.com.generation;

import java.util.Scanner;

public class Exericicio4 {

//2 - Faça um programa que entre com três números e coloque em ordem crescente.
 
public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int num1, num2, num3;
			
	System.out.println("Escreva o primeiro numero: ");
	num1 = ler.nextInt();
	System.out.println("Escreva o segundo numero: ");
	num2 = ler.nextInt();
	System.out.println("Escreva o terceiro numero: ");
	num3 = ler.nextInt();
	
			//checando se o 1º é o menor de todos
			if (num1<num2 && num1<num3) {
			System.out.println("\n-"+num1); 
			if (num2<num3) {//checando se os numeros que sobraram (maiores que um) são um menor que o outro e imprimindo na ordem de acordo
			
			System.out.println("\n-"+num2);
		    System.out.println("\n-"+num3);
			
			}
			else {
			System.out.println("\n-"+num3);
		    System.out.println("\n-"+num2);
				}
			}
				    
			//checando se o 2º é o menor de todos	
			if (num2<num1 && num2<num3) {
			System.out.println("\n-"+num2);
			if (num1<num3) {
			System.out.println("\n-"+num1);
			System.out.println("\n-"+num3);
			}
			else {
			System.out.println("\n-"+num3);
			System.out.println("\n-"+num1);
			}
			}
			//checando se o 3º é o menor de todos	
			if (num3<num1 && num3<num2) {
			System.out.println("\n-"+num3);
			if (num1<num2) {
			System.out.println("\n-"+num1);
			System.out.println("\n-"+num2);
			}
			else {
			System.out.println("\n-"+num2);  System.out.println("\n-"+num1);
			}
			}
			
		}

	}

