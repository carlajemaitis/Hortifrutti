package hortfrutti.model;

public abstract class Principal { //Pedido
	
	private String cliente;
	private String email;
	private String senha;
	
	public Principal(String cliente, String email, String senha) {
		this.cliente = cliente;
		this.email = email;
		this.senha = senha;
	}
	
	public Principal() {}
	

	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public void comprar(int quantidade, int produto) {

	    float preco = 0;
	    String nome= "";
        switch (produto) {
            case 1:
                preco = 2.50f; 
                nome = "Banana";
                break;
            case 2: 
                preco = 5.00f; 
                nome = "Abacaxi";
                break;
            case 3: 
                preco = 3.20f; 
                nome = "Cebola";
                break;
            case 4:
                preco = 10.00f; 
                nome = "Alho";
                break;
            case 5: 
                preco = 4.50f; 
                nome = "Tomate";
                break;
                
        }
        
        float valorFinal = quantidade * preco;		
		
		System.out.println( cliente +", sua compra foi realizada com sucesso! Você comprou " + quantidade + " " + nome + "(s)\n e o Valor total é de: R$" + valorFinal);	
	}

}
