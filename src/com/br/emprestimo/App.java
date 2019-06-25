package com.br.emprestimo;

import java.util.Scanner;

public class App { 
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("informe sua idade : ");
	
	int idade = entrada.nextInt();
	
	System.out.println("informe sua valor : ");
	
	double valor = entrada.nextDouble();
	
	System.out.println("informe o valor pedido : ");
	
	double valorPedido = entrada.nextDouble();
	
	int juros = 3;
	double valorTotal = (((valorPedido * juros)/100)*12);
	
	if (idade >= 25 && idade <= 60) {
		System.out.println("idade aprovada");
		if (valor > 1000) {
			if (valorPedido >= 1000 && valorPedido <= valor * 10) {
				System.out.println("valor aceito , parabens");
			
			}else 
				System.out.println("idade aprovada");
		
		}else {
			System.out.println("valor insuficiente");
		}
	}else {
		System.out.println("idade inadequada");
			}
		}

}
