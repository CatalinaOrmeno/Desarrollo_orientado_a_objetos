package veterinaria;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Catalina
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aqui creamos objetos:
        //Vamos a crear MINIMO 3 objetos:
        //NOMBRE_CLASE nombre_objeto = new NOMBRE_CONSTRUCTOR(pueden ir valores)
        Mascota mascota1 = new Mascota(12345, "Queso", 80.1f, 0.6, 'o', false, new Date());
        mascota1.imprimir();
        
        Mascota mascota2 = new Mascota();
        mascota2.setNombre("Mario");
        //mascota2.imprimir();
    }
    
}
