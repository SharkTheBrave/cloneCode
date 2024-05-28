package com.projecao;

import java.util.Scanner;

public class Pedido {
	
	public static void main(String[] args) {
		
		String[][] pedido = new String [2][5];
		int controle;
		
		Scanner sc = new Scanner(System.in);
		
	do {
		System.out.println("Digite seu nome:");
		pedido[0][0] = sc.nextLine();
		System.out.println("Digite seu CPF:");
		pedido[0][1] = sc.nextLine();
		System.out.println("Digite seu telefone:");
		pedido[0][2] = sc.nextLine();
		System.out.println("Digite seu pedido:");
		pedido[0][3] = sc.nextLine();
		System.out.println("Digite a quantidade:");
		pedido[0][4] = sc.nextLine();
		
		
		for(int i = 0; i <2; i++) {
			for(int x = 0; x <5; x++) {
				
			System.out.println(pedido[i][x]);	
			
		}		
		
		}
		
		System.out.println("Quer continuar com os pedido? Aperte 10");
		 controle = sc.nextInt();
		
	}while(controle == 10);
	
		
		
		
		
	}

}
