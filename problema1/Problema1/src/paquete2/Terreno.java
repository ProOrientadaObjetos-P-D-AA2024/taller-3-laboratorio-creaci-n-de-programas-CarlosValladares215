package paquete2;

/*
    Integrantes: Martin Ruiz y Carlos Valladares
*/

public class Terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public double getCosto_terreno() {
        return costo_terreno;
    }

    public void calcularCosto_terreno() {
        costo_terreno = valorMetroCuadrado * area;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getArea() {
        return area;
    }

    public void calcularArea() {
        area = largo * ancho;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    
    
}
