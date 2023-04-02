public class Historia {
    public static void main(String[] args) throws Exception {

        //Personagens


        Personagem luccas = new Personagem("Luccas", 100);
        Personagem ingrid = new Personagem("Ingrid", 100);

         //criando escolhas

         Escolha perguntar = new Escolha("perguntar",null);
         Escolha adeus = new Escolha("despedir",null);
         Escolha atender = new Escolha("Atender",null);
         Escolha ignorar = new Escolha("Ignorar",null);

         Escolha[] escolhas1 = {perguntar,adeus};
         Escolha[] escolhas2 = {atender,ignorar};

        // Criação dos capitulos:        

        Cap historia = new Cap(
            "ENCONTRO DO DESASTRE\n" +
            ingrid.getNome() + " trabalhava em uma biblioteca quando um certo dia,\n" +
            luccas.getNome() + " um cientista que pesquisava uma forma de acabar com \n" +
            "o aquecimento global, que estava avançando drasticamente nos ultimos anos, esbarra 'sem querer' em " +  ingrid.getNome() +", " +
            luccas.getNome() + " se encanta com a graça de "+ ingrid.getNome() +" e seu livro misterioso em mãos e se desculpa.\n" +
            ingrid.getNome() + " decide perguntar o que ele procura ou se despedir?",
            escolhas1, 
            luccas, 
            -20
        );

        Cap continua = new Cap(
            luccas.getNome() + " então se apresenta e explica sobre sua pesquisa, tentando parecer 'interessante' e pergunta sobre o livro em suas mãos, "+
            ingrid.getNome() +" explica que ela estava organizando os livros e decide continuar conversando com o rapaz até que seu celular toca\n"+
            luccas.getNome() +" atende ou decide ignorar a ligação?", 
            escolhas2, 
            ingrid, -10
        );
        
        Cap ligacao = new Cap(
            luccas.getNome() +" então decide atender a ligação e se despede de " + ingrid.getNome()+ ", A ligação em si não era relevante porém, "+
            ingrid.getNome()+ " termina de organizar os livros, e "+ luccas.getNome()+ " acaba encontrando o livro em uma estante e que continha o sucesso de sua pesquisa.",
            null,  
            luccas, 20);

        Cap casamento = new Cap(
        luccas.getNome() +" ignora a ligação e "+ ingrid.getNome()+ " começa a se interessar por ele mais e mais, e terminam juntos. "+
        "No fim... "+ luccas.getNome() +" não termina seu projeto e o mundo sofre com o Aquecimento global até seu fim em 2046", 
        null, 
        luccas, -80);
        
        Cap missao = new Cap(
        ingrid.getNome() +" estão vai embora e "+luccas.getNome()+" continua pesquisando e eventualmente ele encontra uma pesquisa russa misteriosa e"+
        " acaba com o aquecimento global", 
        null, 
        luccas, 20);
        

//dizer quem é proximo de quem:

//Capitulos: historia; missão; casamento; continnua ; ligacao
// escolhas: proximo, atender, ignorar, adeus;

perguntar.setProximo(continua);
atender.setProximo(ligacao);
ignorar.setProximo(casamento);
adeus.setProximo(missao);

// definir uma cabeça, só para melhor visualização;

Cap cabeca = historia;

cabeca.Mostrar();


    }
}