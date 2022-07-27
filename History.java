import java.util.Scanner;
 
 public class History{
    public static void main (String[] args) throws Exception
    {
    // string nome de personagem
    // int Energia do personagem
    String inicio = "Não deixe sua motivação chegar a 0";
    String sairDeCasa = "Acorda tarde da manhã, o barulho do lado de fora do quarto é grande,"
     + "pega a lista e sai de casa";
    
    int motivacao = 5;

    // strings pra chamar
    String atual = "está é sua motivação atual";
    

    String escolha1 = "\nComeço do dia, para a praça vou pelo ferro velho ou pela via? Pelo ferro velho é mais rápido, mas é sujo.";
    String escolha2 = " , quer uma breja, não tenho muito dinheiro. Dá apenas para ou uma cerveja ou refri";
    String escolha3 = "\nTá ficando tarde, melhor voltar para casa, mesmo que não queira. ";

    String caminhoRapido = "\nParkour pela sucata, tudo vai bem mas vejo que sujou toda minha roupa, mais que chato";
    String caminhoAlt = "\nNa via não tem nada demais, a mesma chatice de sempre ";
    
    // escolha loja
    String compraLegal ="\nO dinheiro é meu. Guaraná Jesus vamos lá";
    String compraNecessario = "\né melhor comprar o que ele quer mesmo";

// final
    String final1 = "\nApesar de tudo hoje foi um dia ok.";
    String final2 = "\nQue saco, não queria mais ter que ficar aqui.";
    String final3 = "\né minha última noite nessa casa.";
    //String  = "";



    // intro do jogo
    System.out.println(inicio);
    System.out.println(atual);
    System.out.println(motivacao);
    
    // pegar o nome do jogador e atribuir
    System.out.println(sairDeCasa);
    System.out.println("Diga o seu nome:\n ");
 
    Scanner nome = new Scanner(System.in);
    String bully = nome.next();
    
    System.out.println(escolha1);
    int r1;
    Scanner ler = new Scanner(System.in);
    System.out.printf("Responda 1 para a 1° resposta e 2 para a 2°:\n");
    r1 = ler.nextInt();
    // fazer os if de escolha
    //if-1 escolha do caminho
   
    if (r1 == 1) {
      System.out.println(caminhoRapido);


    }
    else{
      System.out.println(caminhoAlt);
      motivacao = motivacao - 2;
    }
    
    //if-2 compras 
    System.out.println("Chega na lojinha favorita perto do parque, compro meu refri ou o que querem lá em casa?\n");
    int r2;
    Scanner leia = new Scanner(System.in);
    System.out.printf("Responda 1 para a 1° resposta e 2 para a 2°: \n");
    r2 = leia.nextInt();

    System.out.println(bully + escolha2);
    if (r2 == 1){
      System.out.println(compraLegal);
    }
    else {
      System.out.println(compraNecessario);
      motivacao = motivacao +1;
    }
    
    //if-3 caminho de volta
    System.out.println(escolha3);
    motivacao = motivacao - 2;
    
    System.out.println("Posso tentar pedir para mãe para dormir lá ou vou encontrar logo pai.");
    int r3;
    Scanner leer = new Scanner(System.in);
    System.out.printf("Responda 1 para a 1° resposta e 2 para a 2°:\n");
    r3 = leer.nextInt();

    if(r3 == 1)  {
      System.out.println("\nComo sempre, ela não estava...");
      motivacao = motivacao - 1;
    }
    else {
      System.out.println("\n Corri direto pro quarto, a TV continua ligada, espero que ele durma a noite toda.");
      motivacao = motivacao - 2;
    }
    
    //finais 
    if (motivacao >2) {
      System.out.println(final1);
      System.out.println("\nFIM");
    }
    else if (motivacao == 1) {
      System.out.println(final2);
      System.out.println("\nFIM");
    }
    else {
      System.out.println(final3);
      System.out.println("\nFIM");
    }
    ler.close();
    leia.close();
    leer.close();
    nome.close();
   }
 }