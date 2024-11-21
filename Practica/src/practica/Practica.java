/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import cl.ducoc.models.Guarderia;
import cl.ducoc.models.TipoHierva;
import java.util.Scanner;

/**
 *
 * @author davic
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guarderia registros= new Guarderia();
        
        //clases 
        TipoHierva chicorita=new TipoHierva(001,"chicorita" , 133.5, "tierra", "gargantua");
        TipoHierva joaco=new TipoHierva(002,"joaco" , 13.3, "fuego", "deslechado");
        TipoHierva treecko=new TipoHierva(003,"treecko" ,15.33 , "luchador", "cortadoprofunda");
        
        
        
        //menu
        Scanner entrada=new Scanner(System.in);
        int opcion=0;
        
        
        while(opcion!=3){
            System.out.println("_______________MENU_____________");
            System.out.println("agregar pokemon");
            System.out.println("listar pokemon");
            System.out.println("salir");
            
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    while(opcion!=4){
                    Scanner entrada1=new Scanner(System.in);
                    int opcion1=0;
                    
                            
                    System.out.println(chicorita);
                    System.out.println(joaco);
                    System.out.println(treecko);
                    System.out.println("salir");
                    opcion1=entrada1.nextInt();
                    switch(opcion1){
                        case 1:
                            registros.agregarPokemon(chicorita);
                            System.out.println("pokemon agregado con exito");
                                break;
                        case 2:
                            registros.agregarPokemon(joaco);
                            System.out.println("pokemon agregado con exito");
                                break;        
                        case 3:
                            registros.agregarPokemon(treecko);
                            System.out.println("pokemon agregado con exito");
                                break;
                        case 4:
                                break;        
                    }
                    }
                    break;
                case 2:
                    registros.listarPokemon();
                    
                    break;
                case 3:
                    break;
                
                default: 
                    System.out.println("opcion no valida");
                    break;
               
            }
            
        
        }
        
        

        
        
        
        
        
        
        
        
        
        
    }
    
}//llave final
