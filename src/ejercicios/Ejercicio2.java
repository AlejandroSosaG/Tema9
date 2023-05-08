package ejercicios;

import java.util.*;

public class Ejercicio2 {
    static LinkedHashSet<String> lista = new LinkedHashSet();
    public static void main(String[] args) {
        generar();
        System.out.println(lista);
    }
    public static void generar(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        do {
            nombre = sc.next();
            if (!nombre.equals("fin")){
                lista.add(nombre);
            }
        }while (!nombre.equals("fin"));
    }
}
