	public class Pessoa {
 		int cpf;
 		String nome;

	 public void insereDados(){
		int cpf = 1;
		String nome ="Jesus";
		this.cpf=cpf;
		this.nome=nome;
}
	 public void mostraDados(){
		System.out.println("\n Cpf: "+cpf);
		System.out.println("\n Nome: "+nome);	

}

	 public static void main(String arg[]){
		Pessoa p = new Pessoa();
		p.insereDados();
		p.mostraDados();
}
}