package Exercicio1_ArrayList;

import java.util.ArrayList;

public class Agenda {

    public static void adicionarNumeros() {
        ArrayList<String> listaTelefonica = new ArrayList<>();

        listaTelefonica.add(new String("23028434"));
        listaTelefonica.add(new String("83842542"));
        listaTelefonica.add(new String("58384242"));
        listaTelefonica.add(new String("18424535"));

        for (String obj: listaTelefonica) {
            System.out.println(obj);
        }

        System.out.println();

        System.out.println("Lista sem o primeiro número:");
        listaTelefonica.remove(0);
        System.out.println(listaTelefonica);

        System.out.println();

        System.out.print("Lista Vazia: ");
        listaTelefonica.clear();
        System.out.println(listaTelefonica);
    }

    public static void main(String[] args) {
        adicionarNumeros();
    }
}
