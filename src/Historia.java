public class Historia {
    public static void main(String[] args) throws Exception {

        //Definir variáveis e criar escaneador + Personagens

        String escolha;
        int valor;

        Personagem luccas = new Personagem("Luccas", 100);
        Personagem ingrid = new Personagem("Ingrid", 100);
        // Criação dos capitulos:
        
        Capitulo historia = new Capitulo(
            " ENCONTRO DO DESASTRE \n"+
        ingrid.getNome()+" trabalhava em uma biblioteca quando um certo dia,\n"+
        luccas.getNome() +" um cientista que pesquisava uma forma de acabar com \n"+
        "o aquecimento global, que estava avançando drasticamente nos ultimos anos, esbarra 'sem querer' em "+  ingrid.getNome()+", "+
        luccas.getNome()+ " se encanta com a graça de "+ ingrid.getNome() +" e seu livro misterioso em mãos e se desculpa .\n"+
        ingrid.getNome() +" decide perguntar o que ele procura ou se despedir?",
        "perguntar", 
        "despedir", 
        luccas, -20);  
        
        Capitulo pergunta = new Capitulo(
            luccas.getNome() + " então se apresenta e explica sobre sua pesquisa, tentando parecer 'interessante' e pergunta sobre o livro em suas mãos, "+
             ingrid.getNome() +" explica que ela estava organizando os livros e decide continuar conversando com o rapaz até que seu celular toca\n"+
            luccas.getNome() +" atende ou decide ignorar a ligação?", 
            "atende", 
            "ignorar", 
            ingrid, -10);
        
        Capitulo atende = new Capitulo(
            luccas.getNome() +" então decide atender a ligação e se despede de " + ingrid.getNome()+ ", A ligação em si não era relevante porém, "+
            ingrid.getNome()+ " termina de organizar os livros, e "+ luccas.getNome()+ " acaba encontrando o livro em uma estante e que continha o sucesso de sua pesquisa.",
            null, 
            null, 
            luccas, 20);

        Capitulo ignorar = new Capitulo(
        luccas.getNome() +" ignora a ligação e "+ ingrid.getNome()+ " começa a se interessar por ele mais e mais, e terminam juntos. "+
        "No fim... "+ luccas.getNome() +" não termina seu projeto e o mundo sofre com o Aquecimento global até seu fim em 2046", 
        null, 
        null, 
        luccas, -80);
        
        Capitulo adeus = new Capitulo(
        ingrid.getNome() +" estão vai embora e "+luccas.getNome()+" continua pesquisando e eventualmente ele encontra uma pesquisa russa misteriosa e"+
        " acaba com o aquecimento global", 
        null, 
        null, 
        luccas, 20);

      // fazer a historia funcionar com capitulos
        
        //Historia -> pergunta -> atende
        // historia -> pergunta -> ignora
        // historia -> adeus 

        historia.Mostrar();
        if (historia.valor == 1){
            pergunta.Mostrar();
            if (pergunta.valor == 1){
                atende.Mostrar();
            }
            else if(pergunta.valor == 2){
                ignorar.Mostrar();
            }
        }
        else if(historia.valor == 2){
            adeus.Mostrar();
        }
        }
    }
  
   
