package jana60shop;

import java.text.DecimalFormat;

public class Prodotto {
//Attributi
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int iva;

//Costruttore
	public Prodotto(int codice, String nome, String marca, double prezzo, int iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

//Getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	// Metodo per calcolare prezzo formattato con aggiunta di iva
	double calcolaPrezzoConIva() {
		return prezzo + prezzo * iva / 100;
	}

	String formattaPrezzo() {
		DecimalFormat df = new DecimalFormat("0.00€");
		return df.format(calcolaPrezzoConIva());
	}

	String infoProdotto() {
		String infoProdotto = "Codice: " + codice;
		infoProdotto += "\nNome: " + nome;
		infoProdotto += "\nMarca: " + marca;
		infoProdotto += "\nPrezzo: " + formattaPrezzo();
		return infoProdotto;

	}

}
