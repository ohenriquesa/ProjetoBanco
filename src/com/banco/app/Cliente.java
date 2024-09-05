package com.banco.app;

import java.time.LocalDate;

public class Cliente {
	
	int id;
	String cpf;
	String nome;
	String logradouro;
	String numero;
	String complemento;
	String cep;
	String bairro;
	String cidade;
	String uf;
	String telefone;
	String email;
	LocalDate dataNascimento;
	
	public String toString() {
        return "Cliente ID: " + id +
               "\nNome: " + nome +
               "\nCPF: " + cpf +
               "\nEndereço: " + logradouro + " " + numero + ", " + complemento + 
               ", Bairro: " + bairro + ", " + cidade + " - " + uf + 
               "\nTelefone: " + telefone +
               "\nEmail: " + email +
               "\nData de Nascimento: " + dataNascimento;
        
     
    }
	

}
