/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.ducoc.models;

/**
 *
 * @author davic
 */
public class TipoHierva {
    private int id;
    private String nombre;
    private double peso;
    private String segundoTipo, HabilidadOculta;

    public TipoHierva() {
    }

    public TipoHierva(int id, String nombre, double peso, String segundoTipo, String HabilidadOculta) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.segundoTipo = segundoTipo;
        this.HabilidadOculta = HabilidadOculta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSegundoTipo() {
        return segundoTipo;
    }

    public void setSegundoTipo(String segundoTipo) {
        this.segundoTipo = segundoTipo;
    }

    public String getHabilidadOculta() {
        return HabilidadOculta;
    }

    public void setHabilidadOculta(String HabilidadOculta) {
        this.HabilidadOculta = HabilidadOculta;
    }

    @Override
    public String toString() {
        return "TipoHierva{" + "id=" + id + ", nombre=" + nombre + ", peso=" + peso + ", segundoTipo=" + segundoTipo + ", HabilidadOculta=" + HabilidadOculta + '}';
    }
    
    
    
}
