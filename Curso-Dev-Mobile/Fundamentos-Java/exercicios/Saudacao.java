package exercicios;

import java.time.LocalTime;

public class Saudacao {
    public static void main(String[] args) {
        LocalTime data = LocalTime.now();
        int hora = data.getHour();
        if(hora>4 && hora<12){
            System.out.println("Bom dia!");
        }
        else if(hora>=12 && hora <18){
            System.out.println("Boa Tarde!");
        }else {
            System.out.println("Boa Noite!");
        }

    }

}
