/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.Arrays;

/**
 *
 * @author Joao
 */
public class Tabla {
    
    Lista[] HashTable;                                //la tabla adentro va a tener una lista de arreglos 
    int tamanno;
    
    public Tabla(int tamanno){
        
        this.tamanno=tamanno;
        HashTable = new Lista[tamanno];
        Lista lista = new Lista();
        Arrays.fill(HashTable, lista);                //llenamos todos los espacios de la tabla con listas
   }
    
   public void Insertar(String nombre){               //los atributos que quieres insertar en la tabla de hash
       int contador=0;
       for (int i=0; i < nombre.length(); i++){
       contador = contador + nombre.codePointAt(i); 
       }
       //contador contiene el valor en ascii de la palabra
       int PosInsertar = contador%(tamanno-1);
       System.out.println("El indice correspondiente al elemento es el "+PosInsertar);
       HashTable[PosInsertar].InsertarAlFinal(nombre);
       HashTable[PosInsertar].EliminarRepetido();
       
        Nodo aux = HashTable[PosInsertar].getPfirst();                          //creamos una variable auxiliar del tipo nodo que va a tomar el valor del primer elemento de la lista (este elemento esta contenido en pfirst)
        while (aux!=null){
            System.out.println(aux.getTinfo());      //imprimimos el dato de aux 
            aux = aux.getPnext();
        }
        
   }
}
