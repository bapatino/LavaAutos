/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.VistaOpcionCarro;
import vista.VistaOpcionLavado;
import vista.VistaProduccion;

/**
 *
 * @author User
 */
public class Controlador implements ActionListener{
    
    private VistaOpcionCarro viewOC;
    private VistaOpcionLavado viewOL;
    private VistaProduccion viewP;
    private Modelo model;

    public Controlador(VistaOpcionCarro viewOC, VistaOpcionLavado viewOL, VistaProduccion viewP, Modelo model) {
       this.viewOC=viewOC;
       this.viewOL=viewOL;
       this.viewP=viewP;
       this.model=model;

    }
    
    public void Iniciar(){
        viewOC.setLocationRelativeTo(null);
        viewOL.setLocationRelativeTo(null);
        viewP.setLocationRelativeTo(null);
    }
    public void actionPErformed(ActionEvent e){
        model.setCarro(modelo.Modelo.carro);
        model.setFuncio(modelo.Modelo.funcio);
        model.setRangosFecha(modelo.Modelo.rangosFecha);
        model.setTipoServicio(modelo.Modelo.tipoServicio);
        model.setPrecio(modelo.Modelo.precio);
        model.Consultar();
        
        viewP.jLCarro.setText(model.getCarro());
        viewP.jLFuncionario.setText(model.getFuncio());
        viewP.jLRangos.setText(model.getRangosFecha());
        viewP.jLServicio.setText(model.getTipoServicio());
        viewP.jLPrecio.setText(model.getPrecio());
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
