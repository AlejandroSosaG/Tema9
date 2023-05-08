package ejercicios;

import java.util.ArrayList;

public class Ejercicio1 {
    static ArrayList lista = new ArrayList();
    public static void main(String[] args) {
        generar();
        System.out.println(lista);
    }
    public static void generar(){
        for (int i = 0; i < 20; i++) {
            lista.add(Math.round(Math.random()*100));
            lista.sort(null);
        }
    }
}
