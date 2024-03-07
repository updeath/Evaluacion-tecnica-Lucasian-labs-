package restaurante;
import java.util.Scanner;
public class Restaurante {
    public static void main(String[] args) {
        float factura_cobro, compra, descuento;
        String nombre;
        Scanner SC = new Scanner (System.in);
        
        System.out.println("Ingresa tu nombre: ");
        nombre = SC.nextLine();
        
        System.out.println("Ingresa el valor de tu compra: ");
        compra = SC.nextFloat();
        
        if (compra >= 200000) {
            descuento = (compra * 15) / 100;
            factura_cobro = compra - descuento;
            System.out.println("Señor " + nombre + " el valor de tu compra es de " + factura_cobro);
            
        }else if(compra < 200000 && compra >= 50000){
            descuento = (compra * 2) / 100;
            factura_cobro = compra - descuento;
            System.out.println("Señor " + nombre + " el valor de tu compra es de " + factura_cobro);
            
        }else if(compra < 50000 && compra >= 20000){
            descuento =  (float) ((compra *  1.5) / 100);
            factura_cobro = compra - descuento;
            System.out.println("Señor " + nombre + " el valor de tu compra es de " + factura_cobro);
            
        }else {
            System.out.println("Señor " + nombre + " el valor de tu compra es de " + compra);
        }
    }
    
}
