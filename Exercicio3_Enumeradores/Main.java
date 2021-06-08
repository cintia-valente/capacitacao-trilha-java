package Exercicio3_Enumeradores;

public class Main {

    public static void retornarNumeroDoMes(int numero) {

        if (numero == 1) {
            System.out.println("1 é o mês de JANEIRO");
        }
        else if (numero == 2) {
            System.out.println("2 é o mês de FEVEREIRO");
        }
        else if (numero == 3) {
            System.out.println("3 é o mês de MARÇO");
        }
        else if (numero == 4) {
            System.out.println("4 é o mês de ABRIL");
        }
        else if (numero == 5) {
            System.out.println("5 é o mês de MAIO");
        }
        else if (numero == 6) {
            System.out.println("6 é o mês de JUNHO");
        }
        else if (numero == 7) {
            System.out.println("7 é o mês de JULHO");
        }
        else if (numero == 8) {
            System.out.println("8 é o mês de AGOSTO");
        }
        else if (numero == 9) {
            System.out.println("9 é o mês de SETEMBRO");
        }
        else if (numero == 10) {
            System.out.println("10 é o mês de OUTUBRO");
        }
        else if (numero == 11) {
            System.out.println("11 é o mês de NOVEMBRO");
        }
        else if (numero == 12) {
            System.out.println("12 é o mês de DEZEMBRO");
        }
    }

    public static void main(String[] args) {

        for (MesesDoAno meses : MesesDoAno.values()) {
            if (meses.equals(MesesDoAno.JANEIRO)) {
                System.out.println("JANEIRO tem 30 dias");
            }
            else if (meses.equals(MesesDoAno.FEVEREIRO)) {
                System.out.println("FEVEREIRO tem 28 dias");
            }
            else if (meses.equals(MesesDoAno.MARCO)) {
                System.out.println("MARÇO tem 31 dias");
            }
            else if (meses.equals(MesesDoAno.ABRIL)) {
                System.out.println("ABRIL tem 30 dias");
            }
            else if (meses.equals(MesesDoAno.MAIO)) {
                System.out.println("MAIO tem 31 dias");
            }
            else if (meses.equals(MesesDoAno.JUNHO)) {
                System.out.println("JUNHO tem 30 dias");
            }
            else if (meses.equals(MesesDoAno.JULHO)) {
                System.out.println("JULHO tem 31 dias");
            }
            else if (meses.equals(MesesDoAno.AGOSTO)) {
                System.out.println("AGOSTO tem 31 dias");
            }
            else if (meses.equals(MesesDoAno.SETEMBRO)) {
                System.out.println("SETEMBRO tem 30 dias");
            }
            else if (meses.equals(MesesDoAno.OUTUBRO)) {
                System.out.println("OUTUBRO tem 31 dias");
            }
            else if (meses.equals(MesesDoAno.NOVEMBRO)) {
                System.out.println("NOVEMBRO tem 30 dias");
            }
            else if (meses.equals(MesesDoAno.DEZEMBRO)) {
                System.out.println("DEZEMBRO tem 31 dias");
            }
        }

        System.out.println();

        retornarNumeroDoMes(12);
    }
}
