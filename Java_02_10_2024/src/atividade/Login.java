package atividade;

import java.util.Scanner;

public class Login {
	
	Scanner teclado = new Scanner(System.in);
	//	Entrada em um sistema
	//	login e senha
	// Public = Acesso público
	// Void = sem retorno
	// Entrar = verbo de conexão

	
	public void vindo() {
		System.out.println("Bem vindo");
	}
	
	// Primeira atividade
	public void calcular2Medias() {
		double primeiraNota, segundaNota, mediaNotas;
	
		System.out.println("Escreva a primeira nota do aluno");
		primeiraNota =  teclado.nextDouble();
		
		System.out.println("Escreva a segunda nota do aluno");
		segundaNota = teclado.nextDouble();
		
		mediaNotas = (primeiraNota + segundaNota) / 2;
		
		if(mediaNotas >= 6) {
			System.out.println("O aluno foi aprovado com uma média de: " + mediaNotas);
		} else {
			System.out.println("O aluno foi reprovado com uma média de: " + mediaNotas);
		}	
	}
	
	// Segunda atividade
	public void calcularNascimento() {
		int anoAtual, anoNascimento, idade;

		
		anoAtual = teclado.nextInt();
		anoNascimento = teclado.nextInt();
		
		idade = anoAtual - anoNascimento;

		if(idade >= 18) {
		System.out.println("Você pode votar");
		} else {
			System.out.println("você não pode votar com " + idade + " anos");
		}
	}
	
	// Terceira atividade
	public void calcular4Medias() {
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double mediaBimestre;
		
		System.out.println("Qual a sua primeira nota?");
		nota1 = teclado.nextDouble();
		
		System.out.println("Qual a sua segunda nota?");
		nota2 = teclado.nextDouble();
		
		System.out.println("Qual a sua terceira nota?");
		nota3 = teclado.nextDouble();
		
		System.out.println("Qual a sua quarta nota?");
		nota4 = teclado.nextDouble();
		
		mediaBimestre = (nota1 + nota2 + nota3 + nota4) / 4;
	
		System.out.println("A nota final foi: " + mediaBimestre);
	}
	
	// Quarta atividade
	public void centimetroParaMetro() {
		double metro;
		double centimetro;

		System.out.println("Qual metros você quer converter?");
		metro = teclado.nextDouble();
		
		centimetro = metro * 100;
		
		System.out.println(metro + " metros são iguais a " + centimetro + " centimetros.");
	}
	
	// Quinta atividade
	public void salarioPorHora() {
		double salarioHora;
		double horasTrabalhadas;
		double salarioTotal;

		System.out.println("Quanto você ganha por hora?");
		salarioHora = teclado.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês?");
		horasTrabalhadas = teclado.nextDouble();
		
		salarioTotal = salarioHora * horasTrabalhadas;
		
		System.out.println("Você ganha um total de: " + salarioTotal);
	}
	
	// Sexta atividade
	public void comprarBolsa() {
		double precoBolsa;
		
		System.out.println("Escreva o preço de uma bolsa");
		precoBolsa = teclado.nextDouble();
		
		if (precoBolsa >= 50 && precoBolsa <= 80) {
			System.out.println("O preço está dentro do orçamento de Pedro");
		} else {
			System.out.println("O preço está fora do orçamento de Pedro");
		}
	}

	// Login para que o usuário possa ver as respostas
	public void entrar() {
		String login, senha, atividade;
		String login1 = "Tinho";
		String senha1 = "Teste";
		
		System.out.println("Entre com o seu login");
			login = teclado.nextLine();
			System.out.println("------------------------");
			
		System.out.println("Insira a sua senha");
			senha = teclado.nextLine();
			
		if (login.equals(login1) && senha.equals(senha1)) {
			vindo();
			System.out.println("Nós temos: \n"
					+ " calcular 2 notas (Digite 'calcuar 2 medias') \n"
					+ " calcular ano de nascimento (Digite 'calcular nascimento' \n"
					+ " calcular 4 notas (Digite 'calcular 4 medias') \n"
					+ " transformar centimetro em metro (Digite 'centimetro para metro' \n"
					+ " calcular valor de uma bolsa (Digite 'calcular bolsa') \n \n"
					+ "Qual atividade deseja visualizar?");
			atividade = teclado.nextLine();
			if(atividade.equals("calcular 2 medias")) {
				calcular2Medias();
			} else {
				if(atividade.equals("calcular nascimento")) {
					calcularNascimento();
				} else {
					if(atividade.equals("calcular 4 medias")) {
						calcular4Medias();
					} else {
						if(atividade.equals("centimetro para metro")) {
							centimetroParaMetro();
						} else {
							if(atividade.equals("calcular bolsa")) {
								comprarBolsa();
							}
						}
					}
				}
			}
					
		} else {
			System.out.println("Entrada proibida");
		}
		
	}
}
