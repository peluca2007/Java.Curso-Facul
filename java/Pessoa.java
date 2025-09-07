public class Pessoa{//Classe Entidade
	
	//Atributos --> Variáveis Globais
	
	private int cpf = 0;
	private String nome = "";

	private Endereco ender = new Endereco();

		
	//Método get: retorna o valor de um atributo
	public int getCpf(){
		return cpf;		
	}
	public String getNome(){
		return nome;		
	}
	
	public Endereco getEnder(){
		return ender;		
	}
	
	//Método set: altera o valor de um atributo.
	
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
	
	public void setNome(String nome){
		this.nome = nome;		
	}
	
	public void setEnder(Endereco ender){
		this.ender = ender;		
	}

}