package com.producto.a3;

import java.util.HashMap;

public class MontoAyudante {

    public static int obtenerValorPorCiclo(String ciclo) {
        HashMap<String, Integer> ciclos = new HashMap<>();

        ciclos.put("I", 1);
        ciclos.put("II", 2);
        ciclos.put("III", 3);
        ciclos.put("IV", 4);
        ciclos.put("V", 5);
        ciclos.put("VI", 6);
        ciclos.put("VII", 7);
        ciclos.put("VIII", 8);
        ciclos.put("IX", 9);
        ciclos.put("X", 10);

        return ciclos.get(ciclo);
    }

    public static HashMap<String, Monto> obtenerPreciosPorCiclo(int ciclo) {
        HashMap<String, Monto> seccion1 = new HashMap<>();
        seccion1.put("A", new Monto("A", 2, 5d));
        seccion1.put("B", new Monto("B", 4, 8d));
        seccion1.put("C", new Monto("C", 3, 6d));

        HashMap<String, Monto> seccion2 = new HashMap<>();
        seccion2.put("A", new Monto("A", 4, 6d));
        seccion2.put("B", new Monto("B", 3, 2d));
        seccion2.put("C", new Monto("C", 6, 8d));

        HashMap<String, Monto> seccion3 = new HashMap<>();
        seccion2.put("A", new Monto("A", 3, 2d));
        seccion3.put("B", new Monto("B", 4, 5d));
        seccion3.put("C", new Monto("C", 5, 4d));

        if (ciclo >= 1 && ciclo <= 3) {
            return seccion1;
        }

        if (ciclo >= 4 && ciclo <= 6) {
            return seccion2;
        }

        return seccion3;
    }
}
