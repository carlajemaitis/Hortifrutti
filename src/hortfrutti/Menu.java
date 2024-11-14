package hortfrutti;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	
		int opcao = 0;
		float valor;
		String tipo_produto, cliente, email;
		int senha;
		
		Scanner leia = new Scanner(System.in);
		
		while (true)
		{

			System.out.println("\n\n*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Hort+Vida                            ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Fazer Login                          ");
			System.out.println("            3 - Ver catálogo                         ");
			System.out.println("            4 - Meus pedidos                         ");
			System.out.println("            5 - Carrinho                             ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
		opcao = leia.nextInt();
		leia.nextLine();
		
		if (opcao == 6) {
                System.out.println( "\n********* Hort+Vida ********* \n Sua vida mais saudável!");
                leia.close();
 				System.exit(0);
			}
		
		switch(opcao) {
			case 1:
				System.out.println("Qual o seu nome completo?");
				cliente = leia.nextLine();
				System.out.println("Qual o seu email?");
				email = leia.nextLine();
				System.out.println("Crie uma senha de 6 dígitos:");
				senha = leia.nextInt();
				System.out.println(">>>> Eba! Agora você é um HortLovers! <<<<");
				leia.nextLine();
				break;
			case 2:
				System.out.println("Digite seu email:");
                email = leia.nextLine();
                System.out.println("Digite sua senha:");
                senha = leia.nextInt();
                leia.nextLine();
				
				break;
			case 3:
				System.out.println("Abrindo catálago... (Carregando)");
				
				break;
			case 4: 
				System.out.println("Aqui estão os seus últimos pedidos: ");
				break;
			case 5:
				System.out.println("Você adicionou ao seu carrinho: ");
				break;
			default:
				System.out.println( "\nOpção Inválida!\n");
				break;
		}
			
		}
	}
}
