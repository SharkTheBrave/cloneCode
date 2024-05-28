package com.projecao;

import java.util.Iterator;

public class Aula2904 {
	
	public static void main(String[] args) {
		
		int[] numeros = {1,2};
	/*		
	for(int i=0; i<numeros.length;i++) {
	System.out.println(numeros[i]);
	}*/
	
int[][] matriz = {
		{10,10,20}, 
		{20,25,21},
		{11,15,30}};

for(int i = 0; i < 3; i++) {
	
	for (int x = 0 ; x<3;x++) {
	System.out.print(matriz[i][x] + " ");	
	}
System.out.println();
	
	
}

	
}	
}