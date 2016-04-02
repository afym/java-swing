package com.producto.a3;

public class MontoResumen {

    public static String obtener(Monto monto, Alumno alumno) {
        StringBuilder constructor = new StringBuilder();
        constructor.append(" - - - - Alumno - - - -").append("\n")
                .append("Nombre : ").append(alumno.getNombre()).append("\n")
                .append("Apellido : ").append(alumno.getApellido()).append("\n")
                .append(" - - - - Matricula - - - -").append("\n")
                .append("Ciclo : ").append(monto.getCiclo()).append("\n")
                .append("Curso : ").append(monto.getCurso()).append("\n")
                .append("Creditos : ").append(monto.getCreditos()).append("\n")
                .append("Total a pagar : ").append(monto.getTotal()).append("\n");

        return constructor.toString();
    }
}
