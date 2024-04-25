package paquete1;
    /*
    Integrantes: Martin Ruiz y Carlos Valladares
    */

import paquete2.EquipoCelulares;


public class Ejecutor {
    public static void main(String[] args) {
        
        // objeto 1 
        EquipoCelulares dispositivo1 = new EquipoCelulares();
        
        String sistemaOperativo = "Android";
        double pantalla = 6.5; 
        double costoInicial = 799.99; 
        double ivaPorcentaje = 16.0; 
        String direccionMac = "12:34:56:78:90:AB";
        String infoIMEI = "123456789012345";
        
        dispositivo1.setSistemaOperativo(sistemaOperativo);
        dispositivo1.setPantalla(pantalla);
        dispositivo1.setCostoInicial(costoInicial);
        dispositivo1.setIvaPorcentaje(ivaPorcentaje);
        dispositivo1.calcularIvaCostoInicial();
        dispositivo1.setDireccionMac(direccionMac);
        dispositivo1.setInfoIMEI(infoIMEI);
        dispositivo1.calcularCostoFinal();
        
        System.out.println("-----------------------------------------------");
        System.out.println("                Dispositivo N 1");
        System.out.println("-----------------------------------------------");
        System.out.println("Sistema Operativo: " + dispositivo1.getSistemaOperativo());
        System.out.println("Tamaño de la Pantalla: " + dispositivo1.getPantalla());
        System.out.println("Costo Inicial: " + dispositivo1.getCostoInicial());
        System.out.println("Porcentaje del IVA: " + dispositivo1.getIvaPorcentaje());
        System.out.println("Costo inicial con iva: " + dispositivo1.getIvaCostoInicial());
        System.out.println("Direccion Mac: " + dispositivo1.getDireccionMac());
        System.out.println("Informacion IMEI: " + dispositivo1.getInfoIMEI());
        System.out.println("Costo Final: $" + dispositivo1.getCostoFinal());
        
        System.out.println("");
        
        // objeto 2
        
        EquipoCelulares dispositivo2 = new EquipoCelulares();
        
        sistemaOperativo = "iOS";
        pantalla = 6.1; 
        costoInicial = 999.99; 
        ivaPorcentaje = 18.0; 
        direccionMac = "AB:CD:EF:12:34:56";
        infoIMEI = "987654321098765";
        
        dispositivo2.setSistemaOperativo(sistemaOperativo);
        dispositivo2.setPantalla(pantalla);
        dispositivo2.setCostoInicial(costoInicial);
        dispositivo2.setIvaPorcentaje(ivaPorcentaje);
        dispositivo2.calcularIvaCostoInicial();
        dispositivo2.setDireccionMac(direccionMac);
        dispositivo2.setInfoIMEI(infoIMEI);
        dispositivo2.calcularCostoFinal();
        
        System.out.println("-----------------------------------------------");
        System.out.println("                Dispositivo N 2");
        System.out.println("-----------------------------------------------");
        System.out.println("Sistema Operativo: " + dispositivo2.getSistemaOperativo());
        System.out.println("Tamaño de la Pantalla: " + dispositivo2.getPantalla());
        System.out.println("Costo Inicial: " + dispositivo2.getCostoInicial());
        System.out.println("Porcentaje del IVA: " + dispositivo2.getIvaPorcentaje());
        System.out.println("Costo inicial con iva: " + dispositivo2.getIvaCostoInicial());
        System.out.println("Direccion Mac: " + dispositivo2.getDireccionMac());
        System.out.println("Informacion IMEI: " + dispositivo2.getInfoIMEI());
        System.out.println("Costo Final: $" + dispositivo2.getCostoFinal());
        
        System.out.println("");
        
        
    }
}
