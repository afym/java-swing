package com.producto.a3;

public class Inicio {
    public static void main(String[] args){
        VentanaMenu menu = new VentanaMenu();
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.agregarMenu(menu);
        ventana.crearVentana();
        ventana.setVisible(true);
    }
}
