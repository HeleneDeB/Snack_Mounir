
public class Consommation {
	
		
// Override a �t� un gain de temps consid�rable! Il faudrait le voir dans la formation.
//	Ne pas oublier que le \n se met dans les guillemets de text
	
	
	@Override
	public String toString() {
		return " " + quantit� + " portions de " + plat + ", � un prix unitaire de " + prix + "�, soit un sous-total de " + this.getTotal()
				+ "� \n";
	}
	
	
//	On d�finit tous nos objets dans notre nouvelle classe!

	private int quantit�;
	private String plat;
	private double prix;
	private double total;
	private String fin;
	
	public Consommation (int Quantit�, String Plat, double Prix, String Fin) {
		this.quantit� = Quantit�;
		this.plat = Plat;
		this.prix = Prix;
		this.fin = Fin;
	}
// On g�n�re automatiquement nos getters et setters
	public int getQuantit�() {
		return quantit�;
	}

	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
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

//	Sauf pour le total car il s'agit d'une op�ration!
	
	public double getTotal() {
		return prix * quantit� ;
	}


	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}
	
	
		
	}
	

	


