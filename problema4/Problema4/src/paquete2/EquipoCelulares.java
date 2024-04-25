package paquete2;

public class EquipoCelulares {

    private String sistemaOperativo;
    private double pantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String infoIMEI;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public double getIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }

    public double getIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public void calcularIvaCostoInicial() {
        ivaCostoInicial = costoInicial * (ivaPorcentaje / 100);
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public void calcularCostoFinal() {
        costoFinal = costoInicial + ivaCostoInicial;
    }

    public String getDireccionMac() {
        return direccionMac;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public String getInfoIMEI() {
        return infoIMEI;
    }

    public void setInfoIMEI(String infoIMEI) {
        this.infoIMEI = infoIMEI;
    }
    
    
    
}
