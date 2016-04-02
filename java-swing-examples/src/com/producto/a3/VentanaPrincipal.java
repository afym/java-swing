package com.producto.a3;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class VentanaPrincipal extends JFrame {

    private static String TITULO = "Principal";

    public void crearVentana() {
        this.setTitle(TITULO);
        this.setSize(400, 550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void agregarMenu(JMenuBar menu) {
        this.setJMenuBar(menu);
    }

}
