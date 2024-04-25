package paquete1;
    /*
    Integrantes: Martin Ruiz y Carlos Valladares
    */


import paquete2.Terreno;

public class Ejecutor {

    
    public static void main(String[] args) {
        
        // TERRENO 1
        Terreno terreno1 = new Terreno();
        
        double ancho = 10;
        double largo = 20; 
        double valorMetroCuadrado = 200;
        
        terreno1.setAncho(ancho);
        terreno1.setLargo(largo);
        terreno1.setValorMetroCuadrado(valorMetroCuadrado);
        terreno1.calcularArea();
        terreno1.calcularCosto_terreno();
        
        System.out.println("-------------------------------------------------");
        System.out.println("           Caracteristicas del terreno 1");
        System.out.println("-------------------------------------------------");
        System.out.println("Ancho: " + terreno1.getAncho());
        System.out.println("Largo: " + terreno1.getLargo());
        System.out.println("Valor Metro Cuadrado del Terreno: " 
                + terreno1.getValorMetroCuadrado());
        System.out.println("Area: " + terreno1.getArea());
        System.out.println("Costo del Terreno: " + terreno1.getCosto_terreno());

        
        System.out.println("");
        
        // TERRENO 2
        Terreno terreno2 = new Terreno();
        
        ancho = 50;
        largo = 30; 
        valorMetroCuadrado = 200;
        
        terreno2.setAncho(ancho);
        terreno2.setLargo(largo);
        terreno2.setValorMetroCuadrado(valorMetroCuadrado);
        terreno2.calcularArea();
        terreno2.calcularCosto_terreno();
        
        System.out.println("-------------------------------------------------");
        System.out.println("           Caracteristicas del terreno 2");
        System.out.println("-------------------------------------------------");
        System.out.println("Ancho: " + terreno2.getAncho());
        System.out.println("Largo: " + terreno2.getLargo());
        System.out.println("Valor Metro Cuadrado del Terreno: " 
                + terreno2.getValorMetroCuadrado());
        System.out.println("Area: " + terreno1.getArea());
        System.out.println("Costo del Terreno: " + terreno2.getCosto_terreno());
        System.out.println("-------------------------------------------------");

        

    }
    
}
