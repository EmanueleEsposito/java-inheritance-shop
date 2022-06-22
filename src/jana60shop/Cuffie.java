package jana60shop;

public class Cuffie extends Prodotto {
//Attributi
	private String colore;
	private boolean wirelessOrCablate;

//Costruttore
	public Cuffie(int codice, String nome, String marca, double prezzo, int iva, String colore,
			boolean wirelessOrCablate) {
		super(iva, colore, colore, prezzo, iva);
		this.colore = colore;
		this.wirelessOrCablate = wirelessOrCablate;
	}

}
