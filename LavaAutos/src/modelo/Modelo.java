/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Modelo {

    public static String carro, tipoServicio, funcio, rangosFecha, precio;

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        Modelo.precio = precio;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getFuncio() {
        return funcio;
    }

    public void setFuncio(String funcio) {
        this.funcio = funcio;
    }

    public String getRangosFecha() {
        return rangosFecha;
    }

    public void setRangosFecha(String rangosFecha) {
        this.rangosFecha = rangosFecha;
    }

    public String Consultar() {
        if (vista.VistaOpcionCarro.jCheckAuto.isSelected()) {
            this.carro = "Camion";
            if (vista.VistaOpcionLavado.jCheckLBasico.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "100";
                this.rangosFecha = "Puede Venir En Una Hora A Reclamarlo";
                this.tipoServicio="Lavado Basico";
            }
            if (vista.VistaOpcionLavado.jCheckLEspecial.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "200";
                this.rangosFecha = "Puede Venir En Una Hora Y Cuarto A Reclamarlo";
                this.tipoServicio="Lavado Especial";
            }
            if (vista.VistaOpcionLavado.jCheckDBasica.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "300";
                this.rangosFecha = "Puede Venir En Una Hora Y Media A Reclamarlo";
                this.tipoServicio="Lavado Desinfeccion Basica";
            }
            if (vista.VistaOpcionLavado.jCheckDAvanzada.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "400";
                this.rangosFecha = "Puede Venir En Una Hora y Cuarenta y Cinco minutos A Reclamarlo";
                this.tipoServicio="Desinfeccion Avanzada";
            }
            if (vista.VistaOpcionLavado.jCheckCombo1.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "500";
                this.rangosFecha = "Puede Venir En Una Hora A Reclamarlo";
                this.tipoServicio="Combo 1";
            }
            if (vista.VistaOpcionLavado.jCheckCombo2.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "100";
                this.rangosFecha = "Puede Venir En Cuarenta Y CInco Minutos A Reclamarlo";
                this.tipoServicio="combo 2";
            }
            if (vista.VistaOpcionLavado.jCheckCombo3.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "100";
                this.rangosFecha = "Puede Venir En Una Hora Y Cuarto A Reclamarlo";
                this.tipoServicio="Combo 3";
            }
        }
        if (vista.VistaOpcionCarro.jCheckCami.isSelected()) {
            this.carro = "Camion";
            if (vista.VistaOpcionLavado.jCheckLBasico.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "500";
                this.rangosFecha = "Puede Venir Cuatro Horas A Reclamarlo";
                this.tipoServicio="Lavado Basico";
            }
            if (vista.VistaOpcionLavado.jCheckLEspecial.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "900";
                this.rangosFecha = "Puede Venir En Cinco Horas A Reclamarlo";
                this.tipoServicio="Lavado Especial";
            }
            if (vista.VistaOpcionLavado.jCheckDBasica.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "1300";
                this.rangosFecha = "Puede Venir En Seis Horas A Reclamarlo";
                this.tipoServicio="Lavado Desinfeccion Basica";
            }
            if (vista.VistaOpcionLavado.jCheckDAvanzada.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "1800";
                this.rangosFecha = "Puede Venir En 7 Horas A Reclamarlo";
                this.tipoServicio="Desinfeccion Avanzada";
            }
            if (vista.VistaOpcionLavado.jCheckCombo1.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "600";
                this.rangosFecha = "Puede Venir Cuatro Horas A Reclamarlo";
                this.tipoServicio="Combo 1";
            }
            if (vista.VistaOpcionLavado.jCheckCombo2.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "1000";
                this.rangosFecha = "Puede Venir En Cinco Horas A Reclamarlo";
                this.tipoServicio="Combo 2";
            }
            if (vista.VistaOpcionLavado.jCheckCombo3.isSelected()) {
                this.funcio = "Empleado";
                this.precio = "1400";
                this.rangosFecha = "Puede Venir En Seis Horas A Reclamarlo";
                this.tipoServicio="Combo 3";
            }
        }
        return carro;
        
    }

}
