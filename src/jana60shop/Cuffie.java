package jana60shop;

public class Cuffie extends Prodotto {
//Attributi
	private String colore;
	private String wirelessOrCablate;

//Costruttore
	public Cuffie(int codice, String nome, String marca, double prezzo, int iva, String colore,
			String wirelessOrCablate) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wirelessOrCablate = wirelessOrCablate;
	}
//Getter e setter

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String isWirelessOrCablate() {
		return wirelessOrCablate;
	}

	public void setWirelessOrCablate(String wirelessOrCablate) {
		this.wirelessOrCablate = wirelessOrCablate;
	}

//Metodo override
	@Override
	public String infoProdotto() {
		return super.infoProdotto() + "\nColore: " + colore + "\nWireless o Cablate: " + wirelessOrCablate;
	}

}
