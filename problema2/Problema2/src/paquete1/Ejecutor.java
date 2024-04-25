package paquete1;

import paquete2.EquivalenteHora;

    /*
    Integrantes: Martin Ruiz y Carlos Valladares
    */
    

public class Ejecutor {

    public static void main(String[] args) {
        
        EquivalenteHora horas_1 = new EquivalenteHora();
        
        double hora = 5;
        
        horas_1.setHoras(hora);
        horas_1.convertirDias();
        horas_1.convertirMinutos();
        horas_1.convertirSegundos();
        
        System.out.println("-------------------------------------------------");
        System.out.println("            Conversion de horas #1");
        System.out.println("-------------------------------------------------");
        System.out.println("Horas: " + horas_1.getHoras());
        System.out.println( horas_1.getHoras()+ " Horas a Dias es: " 
                + horas_1.getDias() + " dias.");
        System.out.println( horas_1.getHoras()+ " Horas a minutos es: " 
                + horas_1.getMinutos() + " minutos.");
        System.out.println( horas_1.getHoras()+ " Horas a segundos es: " 
                + horas_1.getSegundos()+ " segundos.");
        
        EquivalenteHora horas_2 = new EquivalenteHora();
        
        hora = 400;
        
        horas_2.setHoras(hora);
        horas_2.convertirDias();
        horas_2.convertirMinutos();
        horas_2.convertirSegundos();
        
        System.out.println("-------------------------------------------------");
        System.out.println("            Conversion de horas #2");
        System.out.println("-------------------------------------------------");
        System.out.println("Horas: " + horas_2.getHoras());
        System.out.println( horas_2.getHoras()+ " Horas a Dias es: " 
                + horas_2.getDias() + " dias");
        System.out.println( horas_2.getHoras()+ " Horas a minutos es: " 
                + horas_2.getMinutos() + " minutos");
        System.out.println( horas_2.getHoras()+ " Horas a segundos es: " 
                + horas_2.getSegundos()+ " segundos");
        
        
    }
    
}
