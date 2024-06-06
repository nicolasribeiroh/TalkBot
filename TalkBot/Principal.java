import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;


public class Principal {
    public static void main(String[] args){
        
        String nome;
        String pergunta;
        String[] tempo = new String[] {"Clima","Tempo","clima","tempo"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.printf("Olá %s, Tudo Bem?",nome);
        System.out.print("\nO que gostaria de perguntar? ");
        pergunta = sc.nextLine();

        boolean p1= pergunta.equals(tempo);
        if (p1==true){
            Hora();

        }

        

        
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
