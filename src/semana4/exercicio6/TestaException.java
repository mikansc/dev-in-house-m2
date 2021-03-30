package semana4.exercicio6;

import java.io.IOException;

public class TestaException {
    public static void main(String[] args) {

        try {
            throw new ExceptionA("Exception A!");
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new ExceptionB("Exception B!");
        } catch (ExceptionB e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(e);
        }



    }
}
