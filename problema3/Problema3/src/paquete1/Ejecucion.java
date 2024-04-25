package paquete1;

import paquete2.InstitucionesEducativas;

public class Ejecucion {
    /*
    Integrantes: Martin Ruiz y Carlos Valladares
    */
    
    public static void main(String[] args) {
        //-----------------------Institucion N°1------------------------------

        InstitucionesEducativas Institucion1 = new InstitucionesEducativas();

        String nombre = "Instituto Tecnológico Superior Daniel Álvarez Burneo";
        String tipoInstitucion = "Pública";
        int numeroAlumnos = 870;
        int numeroDocentes = 40;
        int numeroSedes = 2;
        double gastosProyectadoE = 10000.0;

        Institucion1.setNombre(nombre);
        Institucion1.setTipoInstitucion(tipoInstitucion);
        Institucion1.setNumeroAlumnos(numeroAlumnos);
        Institucion1.setNumeroDocentes(numeroDocentes);
        Institucion1.setNumeroSedes(numeroSedes);
        Institucion1.setGastosProyectadoE(gastosProyectadoE);
        Institucion1.calcularPresupuesto();

        System.out.println("-------------------------------------------------"
                + "---------------------------");
        System.out.println("                            Institución N°1");
        System.out.println("-------------------------------------------------"
                + "---------------------------");
        System.out.println("Institución Educativa: "
                + Institucion1.getNombre());
        System.out.println("Tipo de Institución: "
                + Institucion1.getTipoInstitucion());
        System.out.println("Número de Alumnos: "
                + Institucion1.getNumeroAlumnos());
        System.out.println("Número de Docentes: "
                + Institucion1.getNumeroDocentes());
        System.out.println("Número de Sedes: " + Institucion1.getNumeroSedes());
        System.out.println("Gastos proyectado por estudiante: $"
                + Institucion1.getGastosProyectadoE());
        System.out.println("Presupuesto: $" + Institucion1.getPresupuesto());

        System.out.println("");

        // -------------------Institucion N°2----------------------------------
        
        InstitucionesEducativas Institucion2 = new InstitucionesEducativas();

        nombre = "Unidad Educativa Particular San Gabriel";
        tipoInstitucion = "Privada";
        numeroAlumnos = 600;
        numeroDocentes = 35;
        numeroSedes = 5;
        gastosProyectadoE = 15670.80;

        Institucion2.setNombre(nombre);
        Institucion2.setTipoInstitucion(tipoInstitucion);
        Institucion2.setNumeroAlumnos(numeroAlumnos);
        Institucion2.setNumeroDocentes(numeroDocentes);
        Institucion2.setNumeroSedes(numeroSedes);
        Institucion2.setGastosProyectadoE(gastosProyectadoE);
        Institucion2.calcularPresupuesto();

        System.out.println("-------------------------------------------------"
                + "---------------------------");
        System.out.println("                          Institución N°2");
        System.out.println("-------------------------------------------------"
                + "---------------------------");
        System.out.println("Institución Educativa: "
                + Institucion2.getNombre());
        System.out.println("Tipo de Institución: "
                + Institucion2.getTipoInstitucion());
        System.out.println("Número de Alumnos: "
                + Institucion2.getNumeroAlumnos());
        System.out.println("Número de Docentes: "
                + Institucion2.getNumeroDocentes());
        System.out.println("Número de Sedes: "
                + Institucion2.getNumeroSedes());
        System.out.println("Gastos proyectado por estudiante: $"
                + Institucion2.getGastosProyectadoE());
        System.out.println("Presupuesto: $" + Institucion2.getPresupuesto());
    }

}
