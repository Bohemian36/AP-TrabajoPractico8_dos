package pack1;

public class Carrito {
    	private int num;
	    private Pers cliente;
	    private double montoTotal;
	
	  public Carrito(Pers cli, int num) {
	    	this.num = num;
		    cliente = cli;
		    montoTotal = 0;
	}
	  public int Num() {
	    	return num;
	}
	  public double MontoTotal() {
		    return montoTotal;
	}
  	public void sumarMonto(ItemCarrito subTotal) {
	    	montoTotal = montoTotal + subTotal.SubTotal();
	}
}