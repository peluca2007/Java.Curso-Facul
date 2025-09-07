public class TstPes{
	
	public static void main(String arg[]){ //ClassLoader
	
	
		Leitura l1 = new Leitura();
	/*
		String frase = l1.entDados("\nDigite uma frase: ");
		System.out.println("\nA FRASE é: " + frase);
		
		int val1 = Integer.parseInt(l1.entDados("\n 1º NUMERO: "));	
		int val2 = Integer.parseInt(l1.entDados("\n 2º NUMERO: "));
		
		int soma,sub,mult,div;
		
		soma = val_Int + val2_Int;
		sub = val_Int - val2_Int;
		mult = val_Int * val2_Int;
		div = val_Int / val2_Int;
		System.out.println("soma:"+soma);
		System.out.println("sub:"+sub);
		System.out.println("mult:"+mult);
		System.out.println("div:"+div);
		*/
		Pessoa p1 = new Pessoa();

		p1.setCpf(Integer.parseInt(l1.entDados("\nCPF..: ")));
		p1.setNome(l1.entDados("NOME.:"));
		p1.getEnder().setRua(l1.entDados("\nRUA...:"));
		p1.getEnder().setNum(Integer.parseInt(l1.entDados("NUMERO:")));
		
		System.out.println("\nCPF..: " + p1.getCpf());
		System.out.println("NOME..: "+p1.getNome());
		
		System.out.println("\nRUA..: "+p1.getEnder().getRua());//Reflexividade
		System.out.println("NUMERO..: "+p1.getEnder().getNum());//Reflexividade
		
		
		
		
		
		
		
		
	
	}
}