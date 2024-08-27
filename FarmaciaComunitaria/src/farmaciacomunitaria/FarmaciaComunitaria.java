package farmaciacomunitaria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Catalina
 */
public class FarmaciaComunitaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        //1.Creando medicamentos
        Medicamento m1 = new Medicamento("Med1",
                                         "paracetamol", 
                                         "analgesico", 
                                         20, 
                                         new Date());
        //m1.imprimir();
        String fecha_caducidad = "31-12-2024";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-y");
        Medicamento m2 = new Medicamento("med2", 
                                         "aspirina", 
                                         "analgesico",
                                         10, 
                                         sdf.parse(fecha_caducidad));
        //m2.imprimir();
        
        //2.Creando cliente:
        Cliente c1 = new Cliente("1234", "Juan", m2.getNombre());
        m2.imprimir();
        m2.vender(c1);
        m2.imprimir();
        c1.realizarCompra(m2);
        m2.imprimir();
    }
    
}
