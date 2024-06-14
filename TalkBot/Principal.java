import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;
import java.util.Random;


public class Principal {
    public static double valor1=0;
    public static double valor2=0;
    private String pergunta;
    public static void main(String[] args){
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Olá, tudo bem? qual seu nome? ");
        String nome = sc.nextLine();

        //Declaração para verificar as perguntas(palavras-chave)
        String hora = "hora";
        String data = "data";
        String despedida = "tchau";
        String ajuda = "ajuda";
        String Nome ="nome";
        String tdBem = "bem";
        String cmEsta = "esta";
        String piada = "piada";        
        String curiosidade="curiosidade";
        String receita ="receita";
        String vida="vida";
        String conta ="conta";
     
       
        System.out.printf("Seja bem vindo %s!!",nome);
        System.out.print("\nO que gostaria de perguntar? ");
        String pergunta = sc.nextLine();
        Principal perguntas = new Principal();
        perguntas.setPerguntas(pergunta);
        while (true){
            //Ação caso a pergunta seja feita com a palavra chave 
            if(pergunta.toLowerCase().contains(hora.toLowerCase())){
                System.out.println(Hora());
                System.out.print("Gostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }
            if(pergunta.toLowerCase().contains(data.toLowerCase())){
                System.out.println(Data());
                System.out.print("Gostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }

            if(pergunta.toLowerCase().contains(despedida.toLowerCase())){
                break;
            }

            if (pergunta.toLowerCase().contains(ajuda.toLowerCase())){
                System.out.println("Você pode fazer perguntas como \n-Data\n-Hora\n-Ajuda\n-Se esta tudo bem\n-Receitas\n-Piadas\n-Curiosidades\n-Qual o significado da vida:");
                pergunta =sc.nextLine();
            }
            if (pergunta.toLowerCase().contains(Nome.toLowerCase())){
                System.out.printf("Seu nome é %s: ",nome);
                pergunta =sc.nextLine();
            }

            if (pergunta.toLowerCase().contains(tdBem.toLowerCase())){
                String[] opcoes = { "Estou funcionando perfeitamente, obrigado por perguntar!", "Tudo ótimo por aqui. E com você?", "Pronto para ajudar no que você precisar!"};
                String selecionada = opcoes[new Random().nextInt(opcoes.length)];
                System.out.println(selecionada);
                System.out.print("Gostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }
                //redundancia da pergunta anterior 
            if (pergunta.toLowerCase().contains(cmEsta.toLowerCase())){
                //Método para aleatorizar as respostas do programa
                 String[] op1 = { "Estou funcionando perfeitamente, obrigado por perguntar!", "Tudo ótimo por aqui. E com você?", "Pronto para ajudar no que você precisar!"};
                String selecionada = op1[new Random().nextInt(op1.length)];
                System.out.println(selecionada);
                System.out.print("Gostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
                System.out.print("Gostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }

            if (pergunta.toLowerCase().contains(piada.toLowerCase())){
               String[] op2 ={"Você sabe qual é o contrário de volátil? Vem cá, sobrinho", 
                "Por que não é bom guardar kibe no freezer? Porque lá dentro ele esfirra",
                "Se chovesse achocolatado, a gente ia se molhar Toddynho","Por que a formiga tem quatro patas? Porque se ela tivesse cinco se chamaria fivemiga",
                "Você sabe qual é a diferença entre lagoa e padaria? Na lagoa há sapinho. Na padaria, assa pão"};
                String selecionada = op2[new Random().nextInt(op2.length)];
                System.out.println(selecionada);
            }

            if (pergunta.toLowerCase().contains(curiosidade.toLowerCase())){
                String[] op3 ={"A cada minuto, cerca de 72 horas de conteúdo são enviadas ao site de vídeos Youtube",
                "Estima-se que, a cada ano, o monte Everest cresça 4 milímetros",
                "Você sabia que os pinguins se propõem e ficam juntos para toda a vida?",
                "O mel é o único alimento que nunca estraga",
                "Acredita-se que a Terra colidiu com um planeta do tamanho de Marte chamado Theia, resultando na formação da Lua."};
                String selecionada = op3[new Random().nextInt(op3.length)];
                System.out.println(selecionada);
                System.out.print("Gostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }

            if (pergunta.toLowerCase().contains(receita.toLowerCase())){
                String[] op4 ={"\nBruscheta\n\nIngredientes: \n-1 pão baguete cortado em fatias\n -2 tomates picados\n-1 dente de alho picado\n -Folha de manjericão\n-Azeite de Oliva\n -Sal e pimenta a gosto\n -Queijo parmesão ralado(opicional)\n\nModo de preparo: \n-Toste as fatias de pão até ficarem levemente douradas\n -Em uma tigela, misture os tomates, alho, manjericão, azeite, sal e pimente\n -Coloque a mistura de tomate sobre as fatias de pão tostado\n -Coloque a mistura de tomate sobre as fatias de pão tostado\n -Polvilhe com queijo parmesão, se desejar, e sirva",
                "\nWrap de Frango\n\n - tortilha de trigo\n -1 filé de frango grelhado e fatiado\n-Folhas de alface\n-1 tomate picado\n-1/4 de cebola roxa fatiada\n-2 colheres de sopa de maionese ou molho de sua preferência\n\nModo de preparo:\n -Aqueça a torilha em uma frigideira por alguns segundos de cada lado\n-Espalhe a maionese ou molho na tortilha\n-Adicione o frango, alface, tomate e cebola\n-Enrole a tortilha como um wrap e sirva",
                "\nSalada de Atum\n\n -1 lata de atum\n-1 tomate picado\n-1/2 cebola picada\n-1 cenoura ralada\n-1 colher de sopa de maionese\n-Sal e pimenta a gosto\n-Suco de limão a gosto\n\nModo de preparo:\n -Escorra o atum e coloque em uma tigela\n-Adicione o tomate, a cebola, a cenoura e a maionese\n-Tempere com sal, pimenta e suco de limão\n-Misture bem e sirva com folhas de alface ou pão"};
                String selecionada = op4[new Random().nextInt(op4.length)];
                System.out.println(selecionada);
                System.out.print("Gostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }
            if (pergunta.toLowerCase().contains(vida.toLowerCase())){
                String[] op5 ={"42, segundo o 'Guia do Mochileiro das Galáxias'.",
                "Acredito que o significado da vida é algo que cada um deve descobrir por si mesmo.",
                "Talvez seja ser feliz e fazer os outros felizes."};
                String selecionada = op5[new Random().nextInt(op5.length)];
                System.out.println(selecionada);
                System.out.print("Gostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }

            if (pergunta.toLowerCase().contains(tdBem.toLowerCase())){
                String[] op6 = { "Você sabia que os polvos têm três corações?",
                "Aqui vai uma dica: quando estiver aprendendo algo novo, tente ensinar a outra pessoa. Isso reforça seu aprendizado.",
                "Uma curiosidade interessante: os girassóis podem limpar solo contaminado com metais pesados."};
                String selecionada = op6[new Random().nextInt(op6.length)];
                System.out.println(selecionada);
                System.out.print("Gostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }

            if(pergunta.toLowerCase().contains(conta.toLowerCase())){
                Principal Conta = new Principal();
                Conta.Conta();
            }

            else{
                System.out.print("Desculpe, não entendi sua pergunta poderia reformula-la:");
                pergunta =sc.nextLine();

            }
      }

        System.out.println("Tchau tchau, até uma próxima vez ;)");

    }
    
    public void setPerguntas(String pergunta){
        this.pergunta=pergunta;

    }
    public String getPerguntas(){
        return pergunta;
    }

    //Classe Data
    private static String Data(){
        LocalDate LocalDate=java.time.LocalDate.now();
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("PT","br" ));
        String Data = "Data atual: "+LocalDate.format(localDateTimeFormatter);
        return Data;
    }
    //Classe Hora
    private static String Hora(){
        LocalTime LocalTime=java.time.LocalTime.now();
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss", new Locale("PT","br" ));
        String Hora = "Hora atual: "+LocalTime.format(localDateTimeFormatter);
        return Hora;
    }

    public void Conta(){

        this.pergunta = getPerguntas();
        Scanner sc = new Scanner(System.in);
        String soma="soma";
        String sub="sub";
        String div="divi";
        String multi="multi";
        double total =0;
        char tp=' ';
        int i=0;
        double[] vlr=new double[i];

        System.out.println("Qual tipo de conta gostaria de fazer: ");
        pergunta =sc.nextLine();
        
    if (pergunta.toLowerCase().contains(soma.toLowerCase())){
        while(i==2404){
            System.out.println("Digite os valores(0 para sair): ");
            vlr[i]=sc.nextDouble();
                if(vlr.length==0){
                    i=0;
                }
                i++;
        }

        tp= '+';
        total += vlr.length;
        
    }

    if (pergunta.toLowerCase().contains(sub.toLowerCase())){
        while(i!=0){
            System.out.println("Digite os valores(0 para sair): ");
            vlr[i]=sc.nextDouble();
                if(vlr.length==0){
                    i=0;
                }
                i++;
        }
        tp ='-';
        total -= vlr.length;
    }

    if (pergunta.toLowerCase().contains(div.toLowerCase())){
        while(true){
            System.out.println("Digite os valores(0 para sair): ");
            vlr[i]=sc.nextDouble();
                if(vlr[i]==0){
                    break;
                }
        }
        tp= '/';
 
        total /= vlr.length;
    }

    if (pergunta.toLowerCase().contains(multi.toLowerCase())){
        while(true){
            System.out.println("Digite os valores(0 para sair): ");
            vlr[i]=sc.nextDouble();
                if(vlr[i]==0){
                    break;
                }
        }
        tp='*';
        total *= vlr.length;
    }

    System.out.printf("O resultado da conta é:%d%s%d=%d",valor1,tp,valor2,total);
    System.out.print("Gostaria de fazer outra pergunta? caso contrario se despida: ");
    pergunta =sc.nextLine();
}
    



}
