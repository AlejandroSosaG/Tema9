package ejercicios;

import javax.swing.tree.TreeCellRenderer;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejercicio4 {
    static TreeMap<Integer, Integer> numeros = new TreeMap();
    static TreeMap<Integer, Integer> estrellas = new TreeMap<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String repetir = "";
        while (repetir.toLowerCase().equals("si")){
            ejecutar();
        }
    }
    public static void ejecutar(){
        int num, estrella;
        System.out.println("Introduzca los 5 primeros números");
        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();

        }
        System.out.println("Introduzca las 2 estrellas");
        for (int i = 0; i < 2; i++) {
            estrella = sc.nextInt();
            estrellas.add(estrella);
        }
    }
}
