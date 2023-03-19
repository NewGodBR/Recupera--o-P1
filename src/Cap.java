import java.util.Scanner;

public class Cap {
    private String texto;
    private String[] escolhas;
    private Personagem personagem;
    private int atencao;
    public int valor;

    public Cap(String texto, String[] escolhas, Personagem personagem, int atencao) {
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
        if(escolhas != null && escolhas.length >=2){
            for (int i = 0; i < this.escolhas.length; i++){
                System.out.println((i+1)+".["+this.escolhas[i]+"]");
            }
            Scanner scanner = new Scanner(System.in);
            String escolha = scanner.nextLine();
            for (int i = 0;i <escolhas.length; i++){
                if(escolha.equals(escolhas[i])){
                    this.valor = i; 
                }
                scanner.close();
            }
       
}}
}