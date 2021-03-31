
package hashtable;

/**
 *
 * @author Joao
 */
public class HashTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tabla hashtable = new Tabla(10);  
        
        for (int i = 0; i < 10; i++) {
            hashtable.Insertar("Juancho");
        }
    }
    
}
