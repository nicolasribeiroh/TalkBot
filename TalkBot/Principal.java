import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;


public class Principal {
    public static double valor1=0;
    public static double valor2=0;
    private String pergunta;
    public static void main(String[] args){
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Ola, tudo bem? qual seu nome? ");
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
        String filme ="filme";
     
       
        System.out.printf("Seja bem vindo %s!!",nome);
        System.out.print("\nO que gostaria de perguntar? ");
        String pergunta = sc.nextLine();
        Principal perguntas = new Principal();
        perguntas.setPerguntas(pergunta);
        while (true){
            //Ação caso a pergunta seja feita com a palavra chave 
            if(pergunta.toLowerCase().contains(hora.toLowerCase())){
                System.out.println(Hora());
                System.out.print("\nGostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }
            if(pergunta.toLowerCase().contains(data.toLowerCase())){
                System.out.println(Data());
                System.out.print("\nGostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }

            if(pergunta.toLowerCase().contains(despedida.toLowerCase())){
                break;
            }

            if (pergunta.toLowerCase().contains(ajuda.toLowerCase())){
                System.out.println("Você pode fazer perguntas como \n-Data\n-Hora\n-Ajuda\n-Qual seu nome\n-Se esta tudo bem\n-Receitas\n-Piadas\n-Curiosidades\n-Qual o significado da vida\n-Receitas\n-Contas matematicas\n-Recomendações de filme ");
                pergunta =sc.nextLine();
            }
            if (pergunta.toLowerCase().contains(Nome.toLowerCase())){
                System.out.printf("Seu nome é %s: ",nome);
                pergunta =sc.nextLine();
            }

            if (pergunta.toLowerCase().contains(tdBem.toLowerCase())){
                String[] opcoes = { "Estou funcionando perfeitamente, obrigado por perguntar!", "Tudo otimo por aqui. E com você?", "Pronto para ajudar no que você precisar!"};
                String selecionada = opcoes[new Random().nextInt(opcoes.length)];
                System.out.println(selecionada);
                System.out.print("\nGostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }
                //redundancia da pergunta anterior 
            if (pergunta.toLowerCase().contains(cmEsta.toLowerCase())){
                //Método para aleatorizar as respostas do programa
                 String[] op1 = { "Estou funcionando perfeitamente, obrigado por perguntar!", "Tudo otimo por aqui. E com você?", "Pronto para ajudar no que você precisar!"};
                String selecionada = op1[new Random().nextInt(op1.length)];
                System.out.println(selecionada);
                System.out.print("\nGostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
                System.out.print("\nGostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }

            if (pergunta.toLowerCase().contains(piada.toLowerCase())){
               String[] op2 ={"Você sabe qual é o contrário de volátil? Vem ca, sobrinho", 
                "Por que nao e bom guardar kibe no freezer? Porque la dentro ele esfirra",
                "Se chovesse achocolatado, a gente ia se molhar Toddynho","Por que a formiga tem quatro patas? Porque se ela tivesse cinco se chamaria fivemiga",
                "Você sabe qual a a diferença entre lagoa e padaria? Na lagoa ha sapinho. Na padaria, assa pao"};
                String selecionada = op2[new Random().nextInt(op2.length)];
                System.out.println(selecionada);
            }

            if (pergunta.toLowerCase().contains(curiosidade.toLowerCase())){
                String[] op3 ={"A cada minuto, cerca de 72 horas de conteudo são enviadas ao site de videos Youtube",
                "Estima-se que, a cada ano, o monte Everest cresça 4 milimetros",
                "Você sabia que os pinguins se propõem e ficam juntos para toda a vida?",
                "O mel é o unico alimento que nunca estraga",
                "Acredita-se que a Terra colidiu com um planeta do tamanho de Marte chamado Theia, resultando na formacao da Lua."};
                String selecionada = op3[new Random().nextInt(op3.length)];
                System.out.println(selecionada);
                System.out.print("\nGostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }

            if (pergunta.toLowerCase().contains(receita.toLowerCase())){
                String[] op4 ={"\nBruscheta\n\nIngredientes: \n-1 pao baguete cortado em fatias\n -2 tomates picados\n-1 dente de alho picado\n -Folha de manjericao\n-Azeite de Oliva\n -Sal e pimenta a gosto\n -Queijo parmesao ralado(opicional)\n\nModo de preparo: \n-Toste as fatias de pao até ficarem levemente douradas\n -Em uma tigela, misture os tomates, alho, manjericao, azeite, sal e pimente\n -Coloque a mistura de tomate sobre as fatias de pao tostado\n -Coloque a mistura de tomate sobre as fatias de pao tostado\n -Polvilhe com queijo parmesao, se desejar, e sirva",
                "\nWrap de Frango\n\n - tortilha de trigo\n -1 filé de frango grelhado e fatiado\n-Folhas de alface\n-1 tomate picado\n-1/4 de cebola roxa fatiada\n-2 colheres de sopa de maionese ou molho de sua preferência\n\nModo de preparo:\n -Aqueça a torilha em uma frigideira por alguns segundos de cada lado\n-Espalhe a maionese ou molho na tortilha\n-Adicione o frango, alface, tomate e cebola\n-Enrole a tortilha como um wrap e sirva",
                "\nSalada de Atum\n\n -1 lata de atum\n-1 tomate picado\n-1/2 cebola picada\n-1 cenoura ralada\n-1 colher de sopa de maionese\n-Sal e pimenta a gosto\n-Suco de limao a gosto\n\nModo de preparo:\n -Escorra o atum e coloque em uma tigela\n-Adicione o tomate, a cebola, a cenoura e a maionese\n-Tempere com sal, pimenta e suco de limao\n-Misture bem e sirva com folhas de alface ou pao"};
                String selecionada = op4[new Random().nextInt(op4.length)];
                System.out.println(selecionada);
                System.out.print("\nGostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }
            if (pergunta.toLowerCase().contains(vida.toLowerCase())){
                String[] op5 ={"42, segundo o 'Guia do Mochileiro das Galáxias'.",
                "Acredito que o significado da vida e algo que cada um deve descobrir por si mesmo.",
                "Talvez seja ser feliz e fazer os outros felizes."};
                String selecionada = op5[new Random().nextInt(op5.length)];
                System.out.println(selecionada);
                System.out.print("\nGostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }

            if (pergunta.toLowerCase().contains(tdBem.toLowerCase())){
                String[] op6 = { "Voce sabia que os polvos tem tres coracoes?",
                "Aqui vai uma dica: quando estiver aprendendo algo novo, tente ensinar a outra pessoa. Isso reforca seu aprendizado.",
                "Uma curiosidade interessante: os girassóis podem limpar solo contaminado com metais pesados."};
                String selecionada = op6[new Random().nextInt(op6.length)];
                System.out.println(selecionada);
                System.out.print("\nGostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }

            if (pergunta.toLowerCase().contains(filme.toLowerCase())){
                String[] op6 = {"Mad Max: Estrada da Furia (2015)","John Wick","Superbad","Forrest Gump","Blade Runner 2049","Interestelar" };
                String selecionada = op6[new Random().nextInt(op6.length)];
                System.out.println(selecionada);
                System.out.print("\nGostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
            }
            if(pergunta.toLowerCase().contains(conta.toLowerCase())){
                Principal Conta = new Principal();
                Conta.Conta();
                System.out.print("\nGostaria de fazer outra pergunta? caso contrario se despida: ");
                pergunta =sc.nextLine();
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
       ArrayList<Double> valores = new ArrayList<>();

        System.out.println("Qual tipo de conta gostaria de fazer: ");
        pergunta = sc.nextLine();

        if (pergunta.toLowerCase().contains(soma.toLowerCase())) {
            while (true) {
                System.out.print("Digite o valor " + (valores.size() + 1) + " (Digite 0 para sair): ");
                double valor = sc.nextDouble();
                if (valor == 0) {
                    break;
                }
                valores.add(valor);
                total += valor;
            }
            tp = '+';
        }

        if (pergunta.toLowerCase().contains(sub.toLowerCase())) {
            while (true) {
                System.out.print("Digite o valor " + (valores.size() + 1) + " (Digite 0 para sair): ");
                double valor = sc.nextDouble();
                if (valor == 0) {
                    break;
                }
                valores.add(valor);
                if (valores.size() == 1) {
                    total = valor; // Inicializa com o primeiro valor para subtrair os próximos
                } else {
                    total -= valor;
                }
            }
            tp = '-';
        }

        if (pergunta.toLowerCase().contains(div.toLowerCase())) {
            while (true) {
                System.out.print("Digite o valor " + (valores.size() + 1) + " (Digite 0 para sair): ");
                double valor = sc.nextDouble();
                if (valor == 0) {
                    break;
                }
                valores.add(valor);
                if (valores.size() == 1) {
                    total = valor; // Inicializa com o primeiro valor para dividir pelos próximos
                } else {
                    total /= valor;
                }
            }
            tp = '/';
        }

        if (pergunta.toLowerCase().contains(multi.toLowerCase())) {
            total = 1; // Inicializa o total como 1 para multiplicar
            while (true) {
                System.out.print("Digite o valor " + (valores.size() + 1) + " (Digite 0 para sair): ");
                double valor = sc.nextDouble();
                if (valor == 0) {
                    break;
                }
                valores.add(valor);
                total *= valor;
            }
            tp = '*';
        }

        System.out.printf("O resultado da conta é: %.2f\n", total);
        pergunta = sc.nextLine();
    }
    



}
