public class TstLuiz {

    public static void main(String[] args) {
        Leitura l1 = new Leitura();
        Luiz lp = new Luiz();
        Roupa rp = new Roupa();

        // Lendo valores para Luiz
        lp.setIdade(Integer.parseInt(l1.entDados("Informe a idade de Luiz: ")));
        lp.setCara(l1.entDados("Informe a característica de Luiz: "));
        lp.setNamorando(l1.entDados("Luiz está namorando? (s/n): ").charAt(0));

        // Lendo valores para Roupa
        rp.setTam(l1.entDados("Informe o tamanho da roupa: "));
        rp.setSapTam(Integer.parseInt(l1.entDados("Informe o tamanho do sapato: ")));

        // Exibindo valores de Luiz
        System.out.println("\nIdade: " + lp.getIdade());
        System.out.println("Característica: " + lp.getCara());
        System.out.println("Namorando? " + lp.getNamorando());

        // Exibindo valores de Roupa
		
        System.out.println("\nTamanho da roupa: " + rp.getTam());
        System.out.println("Tamanho do sapato: " + rp.getSapTam());
    }
}