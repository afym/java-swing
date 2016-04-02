package com.producto.a3;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaMenu extends JMenuBar {
    
    public static final String CALCULAR = "CALCULAR";
    public static final String CERRAR = "CERRAR";
    
    private JMenu archivo;
    private JMenu procesos;
    private JMenuItem cerrar;
    private JMenuItem calcula;
    
    public VentanaMenu() {
        this.crearPestanas();
        this.crearOpciones();
        this.crearMenu();
    }
    
    private void crearPestanas() {
        this.archivo = new JMenu("Archivo");
        this.procesos = new JMenu("Procesos");
    }
    
    private void crearOpciones() {
        this.calcula = new JMenuItem(new AbstractAction("Calcular") {
            public void actionPerformed(ActionEvent e) {
                MatriculaFormularo formulario = new MatriculaFormularo();
                formulario.setVisible(true);
            }
        });
        this.calcula.setActionCommand(CALCULAR);
        
        this.cerrar = new JMenuItem(new AbstractAction("Cerrar") {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.cerrar.setActionCommand(CERRAR);
    }
    
    private void crearMenu() {
        this.archivo.add(this.cerrar);
        this.procesos.add(this.calcula);
        this.add(this.archivo);
        this.add(this.procesos);
    }
}
