import java.util.Scanner;

public class Historia {
    public static void main(String[] args) throws Exception {

        //Definir variáveis e criar escaneador

        String escolha;
        
        Scanner imput = new Scanner(System.in);

        // Apresentação da historia

        System.out.println(
        " ENCONTRO DO DESASTRE \n"+
        "Ingrid trabalhava em uma biblioteca quando um certo dia,\n"+
        "Luccas um cientista que pesquisiva uma forma de acabar com \n"+
        "o aquecimento global, que estava avançando drasticamente nos ultimos anos, esbarra 'sem querer' em Ingrid, "+
        "Luccas se desculpa e se encanta com a graça de Ingrid e seu livro misterioso em mãos."+
        "\n Ingrid decide [perguntar] o que ele procura ou se [despedir]?"
        );

        // Tomada de Decisão

        escolha = imput.nextLine();
        
        // Acontecimentos pós Decisão e por assim vai
        
        if (escolha.equals("perguntar")){
            // continuação
            System.out.println("Luccas então se apresenta e explica sobre sua pesquisa, tentando parecer 'interessante' e pergunta sobre o livro em suas mãos"+
            " Ingrid explica que ela estava organizando os livros e decide continuar conversando com o rapaz até que seu celular toca"+
            "\n Luccas [atende] ou decide [ignorar] a ligação?"
            );
            // Tomada de Decisão
            escolha = imput.nextLine();
            if (escolha.equals("ignorar")){
                System.out.println(
                "Luccas ignora a ligação e Ingrid começa a se interessar por ele mais e mais, e terminam juntos. "+
                "No fim... Luccas não termina seu projeto e o mundo sofre com o Aquecimento global até seu fim em 2046"
                );
            }
            else if (escolha.equals("atende")){
                System.out.println(
                " Luccas então decide atender a ligação e se despede de Ingrid, A ligação em si não era relevante porém, "+
                "Ingrid termina de organizar os livros, e Luccas acaba encontrando o livro em uma estante que continha o sucesso de sua pesquisa."
                );
            }
            else{
                System.out.println(
                " ESCOLHA INVALIDA "
                );
            }
        }
        else if (escolha.equals("despedir")){
            System.out.println(
            "Ingrid estão vai embora e Luccas continua pesquisando e eventualmente ele encontra uma pesquisa russa misteriosa e"+
            " acaba com o aquecimento global"
            );
        }
        else {
            System.out.println(
            " ESCOLHA INVALIDA "
            );
        }
        imput.close();
    }
}