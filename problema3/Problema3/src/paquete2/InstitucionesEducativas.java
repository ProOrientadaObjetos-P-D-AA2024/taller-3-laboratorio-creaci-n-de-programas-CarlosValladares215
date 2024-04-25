package paquete2;
    
    /*
    Integrantes: Martin Ruiz y Carlos Valladares
    */

public class InstitucionesEducativas {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectadoE;
    private double presupuesto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumeroDocentes() {
        return numeroDocentes;
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public int getNumeroSedes() {
        return numeroSedes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }

    public double getGastosProyectadoE() {
        return gastosProyectadoE;
    }

    public void setGastosProyectadoE(double gastosProyectadoE) {
        this.gastosProyectadoE = gastosProyectadoE;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void calcularPresupuesto() {
        presupuesto = numeroAlumnos * gastosProyectadoE;
    }
    
    
}
