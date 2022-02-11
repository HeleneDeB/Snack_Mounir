
public class Consommation {
	
		
// Override a été un gain de temps considérable! Il faudrait le voir dans la formation.
//	Ne pas oublier que le \n se met dans les guillemets de text
	
	
	@Override
	public String toString() {
		return " " + quantité + " portions de " + plat + ", à un prix unitaire de " + prix + "€, soit un sous-total de " + this.getTotal()
				+ "€ \n";
	}
	
	
//	On définit tous nos objets dans notre nouvelle classe!

	private int quantité;
	private String plat;
	private double prix;
	private double total;
	private String fin;
	
	public Consommation (int Quantité, String Plat, double Prix, String Fin) {
		this.quantité = Quantité;
		this.plat = Plat;
		this.prix = Prix;
		this.fin = Fin;
	}
// On génère automatiquement nos getters et setters
	public int getQuantité() {
		return quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

	public String getPlat() {
		return plat;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

//	Sauf pour le total car il s'agit d'une opération!
	
	public double getTotal() {
		return prix * quantité ;
	}


	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}
	
	
		
	}
	

	


