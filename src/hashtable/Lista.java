/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author Joao
 */
public class Lista {
    
    private Nodo pfirst;        //esta variable pfirst es apuntador al primer elemento de la lista - es del tipo nodo
    private Nodo plast;         //esta variable es apuntador al ultimo elemento de la lista - es del tipo nodo
    private int tamanno;       //esta variable nos sennala el tamanno de la lista
    
    //constructor de la clase lista
    
    public Lista(){           
        
        this.tamanno=0;
        this.plast=null;
        this.pfirst=null;
    }
    
    public boolean EsVacia(){       
        if (tamanno==0){
            return true;
        }else{
            return false;
        }
    }
    
    public void InsertarAlFinal(Object dato){
        
        Nodo NuevoNodo = new Nodo(dato);
        if (EsVacia()){
            pfirst = plast = NuevoNodo;
        }else{
            Nodo aux = pfirst;
            for (int i = 0; i < tamanno-1; i++) {
                aux = aux.getPnext();
            }
            aux.setPnext(NuevoNodo);
            plast = NuevoNodo;
        }
        tamanno++;
    }
    
    public void EliminarAlFinal(){
        
        if (EsVacia()) {
            System.out.println("No hay objetos para eliminar en la lista");
        }else if (tamanno == 1) {
            pfirst = plast = null;
            tamanno--;
        }else{
            Nodo aux =pfirst;
            for (int i = 1; i < tamanno-1; i++) {   //de esta manera llegamos al penultimo de los elementos y aux toma el valor de este
                aux = aux.getPnext();
                }
            plast = aux;                            //sennalamos que plast apunta a aux, recordamos que aux toma el valor del penultimo elemento de la lista
            plast.setPnext(null);                   //sennalamos que elemento siguiente de plast sera null, de esta menera desenlazamos el ultimo elemnto de la lista
            tamanno--;
        }
    }
    
    public void InsertarAlIncio(Object dato){                //con este metodo insertamos nuevos nodos a la lista
        
        Nodo NuevoNodo = new Nodo(dato); 
        if (EsVacia()){                                      //al colocar EsVacia en el if, evaluamos si ese metodo es verdadero       
            pfirst = plast = NuevoNodo;                      //como la lista esta vacia, pfirst apunta al primer y unico elemtno, plast tambien apunta al unico elemento, que es el unico que existe
        }else{
            Nodo aux = pfirst;                               //creamos una variable auxiliar del tipo nodo a la que le damos el valor del que pasara a ser el segundo nodo                          
            NuevoNodo.setPnext(aux);                         //sennalamos que el campo pnext de este nuevo objeto del tipo nodo va a contener el valor de la variable anterior
            pfirst = NuevoNodo;                              //finalmente sennalamos que pfirst apunta al nuevo nodo
        }
        tamanno++;                                           //de este modo, cada vez que agregamos un elemento, el tamanno de nuestra lista aumenta 
    }
    
    public boolean Existe(Object dato){     
                                            
        boolean existe=false;
        
        if (EsVacia()) {
            //nada
        }else{
            Nodo aux = pfirst;
            while (aux!=null && existe==false){
                if (aux.getTinfo().equals(dato)) {            //colocar con .equals y no con ==
                    existe = true;
                }else{
                    aux=aux.getPnext();
                } 
        }
        }
        return existe;
    }
    
    public void EliminarRepetido(){
        
         if (EsVacia()) {
             System.out.println("no hay elementos en la lista");
         }else{     
             int size = tamanno;
             for (int i = 0; i < size; i++) {
                Object aux = plast.getTinfo(); 
                EliminarAlFinal();
                if (Existe(aux)==false) {
                    InsertarAlIncio(aux);
                 }
             }
         }
    }
    
    //GETTERS Y SETTERS 

    public Nodo getPfirst() {
        return pfirst;
    }

    public void setPfirst(Nodo pfirst) {
        this.pfirst = pfirst;
    }

    public Nodo getPlast() {
        return plast;
    }

    public void setPlast(Nodo plast) {
        this.plast = plast;
    }

    public int getTamanno() {
        return tamanno;
    }

    public void setTamanno(int tamanno) {
        this.tamanno = tamanno;
    }
    
    
}
