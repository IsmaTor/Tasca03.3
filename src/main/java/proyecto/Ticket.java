package proyecto;

import java.util.Date;

public class Ticket {

	private static int id;
	private int idTicket;
	private Date data_compra;
	
	//Habría que pasar desde el main un arrayList con todas las compras

	public Ticket(Date data_compra) {
		this.data_compra = data_compra;
		id++;
		idTicket = id;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public Date getData_compra() {
		return data_compra;
	}

	
	
	
}
