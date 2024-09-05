package com.banco.app;

public class Programa {

	public static void main(String[] args) {
	System.out.println("Banco $á");


Cliente cliente1 = new Cliente();
	
	cliente1.id = 1;
	cliente1.nome = "João da Silva";
	cliente1.cpf = "12345678910";
	cliente1.logradouro = "Rua Domingos Ferreira";
	cliente1.bairro = "Boa Viagem";
	cliente1.cidade = "Recife";
	
	System.out.println(cliente1);
	
	
	   Cliente cliente2 = new Cliente();
   	
   	cliente2.id = 2;
   	cliente2.nome = "Maria da Silva";
   	cliente2.cpf = "12345321910";
   	cliente2.logradouro = "Rua das Flores";
   	cliente2.bairro = "Boa Vista";
   	cliente2.cidade = "Recife";
   	
	
	
	
	
	
	}

}
