/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.ducoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davic
 */
public class Guarderia {
    private List<TipoHierva> registro = new ArrayList<>();
    
    public Guarderia(){
    registro = new ArrayList<>();
    }
    public List<TipoHierva> getRegistro() {
        return registro;
    }
    
    //metodos 
    public void agregarPokemon(TipoHierva pokemon){
        registro.add(pokemon);
            System.out.println("pokemon agregado con exito");
    
    }
    public void listarPokemon(){
        for(TipoHierva pokemon: registro){
            System.out.println("---------");
            System.out.println("nombre: "+pokemon.getNombre());
            System.out.println("peso: "+pokemon.getPeso());
            System.out.println("segundo tipo: "+pokemon.getSegundoTipo());
            System.out.println("HabilidadOculta: "+pokemon.getHabilidadOculta());
        }
        
        
    }
    public void cantidadPokemon(){
        System.out.println("cantidad de pokemon registrada es: "+registro.size());
    
    }
    
    
    
    
    
    
    
    
    
}//llave final

