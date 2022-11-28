package cl.bastian.biketour2.modelo;

import cl.bastian.biketour2.Registroactividades;

public class RegistroActividadDiaria {


    public String getFechadia() {
        return Fechadia;
    }

    public void setFechadia(String fechadia) {
        Fechadia = fechadia;
    }

    public String getCaloriasP() {
        return caloriasP;
    }

    public void setCaloriasP(String caloriasP) {
        this.caloriasP = caloriasP;
    }

    public String getKmP() {
        return kmP;
    }

    public void setKmP(String kmP) {
        this.kmP = kmP;
    }

    public String getDuracionP() {
        return duracionP;
    }

    public void setDuracionP(String duracionP) {
        this.duracionP = duracionP;
    }

    public RegistroActividadDiaria(){

    }


    public RegistroActividadDiaria(String fechadia, String caloriasP, String kmP, String duracionP) {
        this.Fechadia = fechadia;
        this.caloriasP = caloriasP;
        this.kmP = kmP;
        this.duracionP = duracionP;
    }

    private String Fechadia;
    private String caloriasP;
    private String kmP;
    private String duracionP;
}
