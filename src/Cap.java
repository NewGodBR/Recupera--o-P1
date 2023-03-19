import java.util.Scanner;

public class Cap {
    private String texto;
    private Escolha[] escolhas;
    private Personagem personagem;
    private int atencao;
    public int valor;

    public Cap(String texto, Escolha[] escolhas, Personagem personagem, int atencao) {
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.atencao = atencao;
    }
    

    public void Mostrar() {
        this.personagem.setAtencao(this.atencao);
        System.out.println(
                "-----------\n" +
                        this.texto + "\n" +
                        this.personagem.getNome() + ": " + this.personagem.getAtencao());
        if(escolhas != null && escolhas.length >= 2){
            for (int i = 0; i < escolhas.length; i++) {
                System.out.println((i+1) + ". [" + escolhas[i].nome+"]");
            }
            Scanner scanner = new Scanner(System.in);
            String escolha;
            escolha = scanner.nextLine();
            for (int i = 0; i < escolhas.length; i++) {
                if (escolha.equalsIgnoreCase(escolhas[i].nome)) {
                   escolhas[i].proximo.Mostrar();
                   return;
                }
            }
            System.out.println("Escolha inválida");
            scanner.close();
        }
    }
}
