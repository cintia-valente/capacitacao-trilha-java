package Exercicio2_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Controlador {

    private static Map<Integer,String> mapa = new HashMap<>();

    public static void adicionarAoMapa(int idCabide, String modelo) {
        mapa.put(1, "calça");
        mapa.put(2, "casaco");
        mapa.put(3, "camisa");
        mapa.put(4, "jaqueta");

        for (String roupa : mapa.values()) {
            System.out.println(roupa);
        }
        System.out.println();
    }

    public static int retornarCabidePorRoupa(String modelo){
        adicionarAoMapa(1, "calça");

        for (Map.Entry roupa : mapa.entrySet()) {
            if (modelo.equals(roupa.getValue())) {
                return (int) roupa.getKey();
            }
        }
        return 0;
    }

    public static void mostrarCabidePorRoupa(String modelo) {
        System.out.println(retornarCabidePorRoupa(modelo));
    }

    public static String retornarRoupaPorCabide(int idCabide) {
        for (Map.Entry roupa : mapa.entrySet()) {
            if (Objects.equals(idCabide, roupa.getKey())) {
                return (String) roupa.getValue();
            }
        }
        return null;
    }

    public static void liberarCabidePorRoupa(String modeloRoupa) {
        for (Map.Entry roupa : mapa.entrySet()) {
            if (modeloRoupa.equals(roupa.getValue())) {
                mapa.remove(roupa.getKey());
                return;
            }
        }
    }

    public static void liberarCabide(int idCabide) {
        for (Map.Entry roupa : mapa.entrySet()) {
            if (Objects.equals(idCabide, roupa.getKey())) {
                mapa.remove(idCabide);
            }
        }
    }

    public static void mostrarMapa() {
        liberarCabidePorRoupa("camisa");
        liberarCabide(4);
        for (String roupa : mapa.values()) {
            System.out.println(roupa);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        mostrarCabidePorRoupa("calça");

        System.out.println();

        System.out.print("Roupa do cabide 2: ");
        System.out.println(retornarRoupaPorCabide(2));

        System.out.println();

        System.out.println("Mapa: ");
        mostrarMapa();
    }
}
