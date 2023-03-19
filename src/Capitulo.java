import java.util.Scanner;

public class Capitulo {
    private String texto;
    private String escolha1;
    private String escolha2;
    private Personagem personagem;
    private int atencao;

    public Capitulo(String texto, String escolha1, String escolha2, Personagem personagem, int Atencao) {
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.atencao = Atencao;
    }

    public void Mostrar() {
        this.personagem.setAtencao(this.atencao);
        System.out.println(
                "-----------\n" +
                        this.texto +
                        this.personagem.getNome() + ": " + this.personagem.getAtencao());
        System.out.println(this.escolha1 +
                this.escolha2);

    }

    public int escolher() {
        Scanner scanner = new Scanner(System.in);
        String escolha;
        escolha = scanner.nextLine();
        if (escolha == this.escolha1) {
            return 1;
        } else {
            return 2;
        }

    }
}