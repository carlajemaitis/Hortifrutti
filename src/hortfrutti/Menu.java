package hortfrutti;

import hortfrutti.model.Estendida;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int opcao = 0;
		float valor;
		String  cliente, email, senha;
		int  produto, quantidade;

		Scanner leia = new Scanner(System.in);
		
		Estendida pedido1 = new Estendida();
		
		while (true) {

			System.out.println("\n\n*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Hort+Vida                            ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Fazer Login                          ");
			System.out.println("            3 - Fazer Compra                         ");
			System.out.println("            4 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			leia.nextLine();

			if (opcao == 4) {
				System.out.println("\n********* Hort+Vida ********* \n Sua vida mais saudável!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Qual o seu nome completo?");
				cliente = leia.nextLine();
				System.out.println("Qual o seu email?");
				email = leia.nextLine();
				System.out.println("Crie uma senha de 6 dígitos:");
				senha = leia.nextLine();
				
				pedido1.setCliente(cliente);
				pedido1.setEmail(email);
				pedido1.setSenha(senha);
				
				
				System.out.println(">>>> Eba! Agora você é um HortLovers! <<<<");
				leia.nextLine();
				break;
			case 2:
				System.out.println("Digite seu email:");
				email = leia.nextLine();
				System.out.println("Digite sua senha:");
				senha = leia.nextLine();
				leia.nextLine();
				break;
			case 3:
				System.out.println("Abrindo catálago... (Carregando)");

				System.out.println("\n\n*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                Hort+Vida                            ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Banana                               ");
				System.out.println("            2 - Abacaxi                              ");
				System.out.println("            3 - Cebola                               ");
				System.out.println("            4 - Alho                                 ");
				System.out.println("            5 - Tomate                               ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Escolha o seu produto:                               ");
				System.out.println("                                                     ");

				produto = leia.nextInt(); 
				System.out.println("Digite a quantidade desejada: ");
				quantidade = leia.nextInt(); 
				
				pedido1.comprar(quantidade, produto);
				
				System.exit(0);
				
				break;
				
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Carla Fernanda Torres Jemaitis.");
		System.out.println("Generation Brasil - carlaj@genstudents.org");
		System.out.println("*********************************************************");
	}
}
