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
public class Nodo {
    
    private Object tinfo;        
    private Nodo pnext;     

    public Nodo(Object dato){     

        this.pnext=null;       
        this.tinfo=dato;           
    }

    public Object getTinfo() {
        return tinfo;
    }

    public void setTinfo(Object dato) {
        this.tinfo = dato;
    }

    public Nodo getPnext() {
        return pnext;
    }

    public void setPnext(Nodo siguiente) {
        this.pnext = siguiente;
    }
}
