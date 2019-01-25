
package mainproducto;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProducto {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
          String nombre;
    String codigo;
    String tipo;
    String precio;
        int op,npro,buspro,elimpro,modpro;
        String pro;
        String nuevo;
        ArrayList<String>producto=new ArrayList<>();
        ArrayList<String>producto1=new ArrayList<>();
        ArrayList<String>producto2=new ArrayList<>();
        ArrayList<String>producto3=new ArrayList<>();
        do{
             
        System.out.println("\t\t Menu");
        System.out.println("1. Anadir");
        System.out.println("2. Buscar");
        System.out.println("3. Eliminar");
        System.out.println("4. Modifica");
            System.out.println("5. Salir");
        System.out.println("Seleccione una opcion:");
        op=teclado.nextInt();
        
        switch(op)
        {
            case 1:
                System.out.println("Añadir");
                System.out.println("Ingrese cuantos productos desea ingresar:");
                npro=teclado.nextInt();
       
                for(int i=0;i<npro;i++)
                {
                    System.out.println("Ingrese el nombre:");
                    nombre=teclado.next();
                    producto.add(nombre);     
                    System.out.println("Ingresa el codigo:");
                    codigo=teclado.next();
                    producto1.add(codigo);
                    System.out.println("Ingresa el Tipo:");
                    tipo=teclado.next();
                    producto2.add(tipo);
                    System.out.println("Ingresa el Precio:");
                    precio=teclado.next();
                    producto3.add(precio);
                   
                }
                System.out.println("Productos Ingresados\n:");
                System.out.println("Nombre :"+producto.toString());
                System.out.println("Codigo :"+producto1.toString());
                System.out.println("Tipo   :"+producto2.toString());
                System.out.println("Precio :"+producto3.toString());
                
                break;
            case 2:
                System.out.println("Buscar");
                
                System.out.println("Ingrese que producto desea buscar:");
                buspro=teclado.nextInt();
                System.out.println("El producto es:\n");
                System.out.println("Nombre:"+producto.get(buspro));
                System.out.println("Codigo:"+producto1.get(buspro));
                System.out.println("Tipo:"+producto2.get(buspro));
                System.out.println("Precio:"+producto3.get(buspro));
                
                break;
            case 3:
                System.out.println("Eliminar");
               
                System.out.println("Ingrese que producto desea eliminar:");
                elimpro=teclado.nextInt();
                producto.remove(elimpro);
                producto1.remove(elimpro);
                producto2.remove(elimpro);
                producto3.remove(elimpro);
                System.out.println("Productos:\n");
                System.out.println("Nombre :"+producto.toString());
                System.out.println("Codigo :"+producto1.toString());
                System.out.println("Tipo   :"+producto2.toString());
                System.out.println("Precio :"+producto3.toString());
                break;
            case 4:
                System.out.println("Modificar");
                System.out.println("Ingrese que producto desea modificar:");
                modpro=teclado.nextInt();
                System.out.println("Ingrese el nuevo nombre:");
                nuevo=teclado.next();
                System.out.println("Nombre:"+producto.set(modpro,nuevo));
                
                 System.out.println("Productos:\n");
                System.out.println("Nombre :"+producto.toString());
                System.out.println("Codigo :"+producto1.toString());
                System.out.println("Tipo   :"+producto2.toString());
                System.out.println("Precio :"+producto3.toString());
                break;
        }
        
        }while(op!=5);
        
    }
    
}
