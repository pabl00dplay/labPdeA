/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypes;

import java.util.Date;

/**
 *
 * @author francisco
 */

public class DTCompra {
    private Date fecha,venc;
    private int cosTotal,cantidadTuristas;
    private String tur, paq;

    public DTCompra(Date fecha, Date venc, int cosTotal, int cantidadTuristas, String tur, String paq) {
        this.fecha = fecha;
        this.venc = venc;
        this.cosTotal = cosTotal;
        this.cantidadTuristas = cantidadTuristas;
        this.tur = tur;
        this.paq = paq;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getVenc() {
        return venc;
    }

    public void setVenc(Date venc) {
        this.venc = venc;
    }

    public int getCosTotal() {
        return cosTotal;
    }

    public void setCosTotal(int cosTotal) {
        this.cosTotal = cosTotal;
    }

    public int getCantidadTuristas() {
        return cantidadTuristas;
    }

    public void setCantidadTuristas(int cantidadTuristas) {
        this.cantidadTuristas = cantidadTuristas;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getPaq() {
        return paq;
    }

    public void setPaq(String paq) {
        this.paq = paq;
    }
    
}
