package jana60shop;

public class Smartphone extends Prodotto {

//Attributi
	private String codiceIMEI;
	private String quantitaDiMemoria;

//Costruttore
	public Smartphone(int codice, String nome, String marca, double prezzo, int iva, String codiceIMEI,
			String quantitaDiMemoria) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceIMEI = codiceIMEI;
		this.quantitaDiMemoria = quantitaDiMemoria;
	}
//Getter e setter

	public String getCodiceIMEI() {
		return codiceIMEI;
	}

	public void setCodiceIMEI(String codiceIMEI) {
		this.codiceIMEI = codiceIMEI;
	}

	public String getQuantitaDiMemoria() {
		return quantitaDiMemoria;
	}

	public void setQuantitaDiMemoria(String quantitaDiMemoria) {
		this.quantitaDiMemoria = quantitaDiMemoria;
	}

}
