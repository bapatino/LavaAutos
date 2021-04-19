/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Modelo;
import vista.VistaOpcionCarro;
import vista.VistaOpcionLavado;
import vista.VistaProduccion;

/**
 *
 * @author User
 */
public class LavaAutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo mod = new Modelo();
        VistaOpcionCarro vOC = new VistaOpcionCarro();
        VistaOpcionLavado vOL = new VistaOpcionLavado();
        VistaProduccion vP = new VistaProduccion();
        
        Controlador control=new Controlador(vOC, vOL, vP, mod);
        control.Iniciar();
        vOC.setVisible(true);

    }
    
}
