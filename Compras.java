package pack1;

import java.io.IOException;
import java.lang.ArithmeticException;

   public abstract class Compras {
       public static void main(String[] args) throws IOException {
		
          Producto uno = new Producto("Yerba Mate 1kg",800.50,001);
          Producto dos = new Producto("Pan 1kg",350,002);
          Producto tres = new Producto("Dulce de frutilla",275.50,003);
          Pers c1 = new Pers("Frodo Bolsón");
          Carrito z = new Carrito(c1,9032);
		
	       ItemCarrito [] item = new ItemCarrito[3];
		   item[0] = new ItemCarrito(z,uno,2);
                   item[1] = new ItemCarrito(z,dos,2);
                   item[2] = new ItemCarrito(z,tres,1);		
		       mostrarCompra(item,z,c1);
   }	
        public static void mostrarCompra(ItemCarrito cargaItem[], Carrito z, Pers c1) {
	           
	       System.out.println("Ticket: "+z.Num());
	       System.out.println("Cliente/a: "+c1.Nombre());
	         for (ItemCarrito  items : cargaItem) {
	             items.mostrarItem();
	             z.sumarMonto(items);			
	  }
	       System.out.println(" ");
               System.out.println("Total: $"+z.MontoTotal());
            
                  double ceroYnegativo = 0;
                  double montoFijo = 3500;
                  double x = ((z.MontoTotal() * 50)/100);
            
           try{
               if(z.MontoTotal() <= montoFijo) {
                  System.out.println("Total con descuento del 50% es: $"+x);
              }else if
                  (z.MontoTotal() <= ceroYnegativo) {
                  System.out.println("Error");
                  } else
                    System.out.println("Sin descuento");
               }catch (ArithmeticException c) {    
                  System.out.println("error");
                   }
   System.out.print("\nGracias vuelva pronto");
        }
   }