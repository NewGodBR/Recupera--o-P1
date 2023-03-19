import java.util.Scanner;

public class Cap {
    private String texto;
    private String escolha1;
    private String escolha2;
    private Personagem personagem;
    private int atencao;
    public int valor;

    public Cap(String texto, String escolha1, String escolha2, Personagem personagem, int atencao) {
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.atencao = atencao;
    }

    public void Mostrar() {
        this.personagem.setAtencao(this.atencao);
        System.out.println(
                "-----------\n" +
                        this.texto + "\n" +
                        this.personagem.getNome() + ": " + this.personagem.getAtencao());
        if(escolha1 != null && escolha2 != null){
        System.out.println("["+this.escolha1 + "] ["+
                this.escolha2+"]");
        Scanner scanner = new Scanner(System.in);
        String escolha;
        escolha = scanner.nextLine();
        if (escolha.equals(this.escolha1)){
            this.valor = 1;
        }
        else if(escolha.equals(this.escolha2)){
            this.valor = 2;
        }
        else{
            System.out.println("Escolha invalida");
        }
        scanner.close();
    }

}}