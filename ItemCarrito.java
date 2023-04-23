package pack1;

    public class ItemCarrito {
        
        private Carrito ticket;
        private Producto prod;
        private int cantidad;
        private double subTotal;
	
    	public ItemCarrito(Carrito num, Producto p, int cantidad) {
		      ticket = num;
    	    prod = p;
	    	  this.cantidad=cantidad;
    	   	subTotal = prod.un_precio() * cantidad;	
        }
    	public double SubTotal() {
    	    return subTotal;
        }
    	public void mostrarItem() {
	    System.out.println("Producto: "+ prod.un_nombre());
    	    System.out.println("Cantidad: " +cantidad);
    	    System.out.println("Precio: "+prod.un_precio());
    	    System.out.println("Sub Total: "+ subTotal);
	}
    }