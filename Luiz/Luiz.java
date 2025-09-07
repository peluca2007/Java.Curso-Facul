public class Luiz {

    private int idade = 20;
    private String cara = "manco";
    private char namorando = 'n';

    private Roupa rp ;

    public Roupa getRp() {
        return rp;
    }

    public int getIdade() {
        return idade;
    }

    public String getCara() {
        return cara;
    }

    public char getNamorando() {
        return namorando;
    }

    public void setIdade(int idade_x) {
        this.idade = idade_x;
    }

    public void setCara(String cara_x) {
        this.cara = cara_x;
    }

    public void setNamorando(char namorando_x) {
        this.namorando = namorando_x;
    }

    public Luiz() {
        System.out.println("\n\t METODO CONSTRUTOR");
        idade = 20;
        cara = "manco";
        namorando = 'n';
        rp =new Roupa();
    }

}