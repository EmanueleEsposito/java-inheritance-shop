package jana60shop;

public class Televisori extends Prodotto {
//Attributi
	private String dimensioni;
	private String smart;

//Costruttore
	public Televisori(int codice, String nome, String marca, double prezzo, int iva, String dimensioni, String smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}
//Getter e setter

	public String getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
	}

	public String isSmart() {
		return smart;
	}

	public void setSmart(String smart) {
		this.smart = smart;
	}

//Metodo override
	@Override
	public String infoProdotto() {
		return super.infoProdotto() + "\nDimensioni: " + dimensioni + "\nProprietà Smart: " + smart;
	}
}