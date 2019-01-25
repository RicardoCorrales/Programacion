
package mainproducto;
public class Producto {
    
    String nombre;
    String codigo;
    String tipo;
    String precio;

    public Producto(String nombre, String codigo, String tipo, String precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    public void producto()
    {
        System.out.println("Nombre del Producto:"+nombre);
        
        System.out.println("Ingrese el Codigo:"+codigo);
       
        System.out.println("Ingrese el Tipo:"+tipo);
       
        System.out.println("Ingrese el Precio"+precio);
        
    }
    
}
