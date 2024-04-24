/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class EquivalenteHora {
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getMinutos() {
        return minutos;
    }

    public void convertirMinutos() {
        minutos = (horas) * (60/1) ;
    }

    public double getSegundos() {
        return segundos;
    }

    public void convertirSegundos() {
        segundos = (horas) * (3600/1);
    }

    public double getDias() {
        return dias;
    }

    public void convertirDias() {
        dias = horas * (1/24.0);
    }
    
    
}
