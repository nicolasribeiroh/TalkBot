import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;


public class Principal {
    public static void main(String[] args){
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Olá, tudo bem? qual seu nome? ");
        String nome = sc.nextLine();

        //Declaração para verificar as perguntas        
        String hora = "hora";
        String data = "data";
        String despedida = "tchau";
        String ajuda = "ajuda";

       
        System.out.printf("Seja bem vindo %s!!",nome);
        System.out.print("\nO que gostaria de perguntar? ");
        String pergunta = sc.nextLine();
        
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
                System.out.println("Você pode fazer perguntas como \n-Data\n-Hora\n-Ajuda");
                pergunta =sc.nextLine();

            }
            else{
                System.out.print("Desculpe, não entendi sua pergunta poderia reformula-la:");
                pergunta =sc.nextLine();

            }
      }

        System.out.println("Tchau tchau, até uma próxima vez ;)");

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


}
