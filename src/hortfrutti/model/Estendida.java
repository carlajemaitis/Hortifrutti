package hortfrutti.model;

public class Estendida extends Principal{ // Pagamento
	
	private String pagamento;
	
	public Estendida(String cliente, String email, String senha) {
		super(cliente, email, senha);		
	}
	
	

	public Estendida() {
		
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public void realizarPagamento() {
		System.out.println("Pagamento realizado via: " + pagamento);
	}
	
	@Override
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
			
			System.out.println(super.getCliente() +", sua compra foi realizada com sucesso! Você comprou " + quantidade + " " + nome + "(s)\n e o Valor total é de: R$" + valorFinal);
	}
}