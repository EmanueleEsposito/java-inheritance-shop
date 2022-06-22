package jana60shop;

public class Main {

	public static void main(String[] args) {
		Smartphone Iphone = new Smartphone(123, "Iphone20", "Apple", 1000.00, 22, "123-465", "4GB");
		Televisori LG = new Televisori(456, "Televisore LG", "Samsung", 500.00, 22, "50 pollici", "SI");

		Cuffie Sony = new Cuffie(786, "Cuffie Sony wireless", "Sony", 150.00, 22, "bianco", "wireless");
		Prodotto[] catalogo = { Iphone, LG, Sony };

		for (int i = 0; i < catalogo.length; i++) {
			System.out.println("Il nostro catalogo è composto da:\n" + catalogo[i].infoProdotto());
		}

	}
}
