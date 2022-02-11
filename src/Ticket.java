import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {

	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		---------------------------Première tentative avec un input directement dans le code-----------------------------------------
//		int Quantité = 2;
//		int Prix = 15;
//		String Plat = "Pâtes";
//		int Total = Quantité * Prix;
//		
//		System.out.println(Quantité + " portion(s) de " + Plat + " à "  + Prix + "€ soit un Total de " + Total + "€" );
		
//		-------------------------------Première Partie avec un seul type de plat------------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Combien de portions?");
//		int Quantité = sc.nextInt();
//		
//		Scanner nd = new Scanner(System.in);
//		System.out.println("Quel plat?");
//		String Plat = nd.nextLine();
//		
//		Scanner tl = new Scanner(System.in);
//		System.out.println("Quel prix?");
//		double Prix = tl.nextDouble();          --- Ne pas oublier d'entrer les prix avec une virgule si il y a une décimale----
//		
//		double Total = Prix * Quantité;
//		
//		System.out.println(Quantité + " portion(s) de " + Plat + " à "  + Prix + "€ soit un Total de " + Total + "€" );
//		System.out.println("Merci pour votre passage et bon appétit!");
//		
		
		Scanner sc = new Scanner(System.in);
		
        ArrayList<Consommation> list1 = new ArrayList<Consommation>();
//		On crée une nouvelle liste pour pouvoir stocker toutes nos données!        
        
        
        while (true)
//		On commence la boucle while qui sera déterminée par la variable Fin qui est Oui/Non
        {
        System.out.println("Entrez la quantité");
        int Quantité = sc.nextInt();
        
        Scanner nd = new Scanner(System.in);
        System.out.println("Quel plat?");		
        String Plat = nd.nextLine();
		
		System.out.println("Quel prix?");
		double Prix = nd.nextDouble();
// 		J'ai pu réutiliser 	le même code que le commentaire du début et les premiers essais
		

		Scanner fg = new Scanner(System.in);
		System.out.println("Est-ce la fin de la commande?");
		String Fin = nd.next();
// 		En utilisant next on cible simplement le prochain mot qui est plus adapté 
		
		
		Consommation consommation = new Consommation(Quantité, Plat, Prix, Fin);
		
		list1.add(consommation);
//		On ajoute le tout dans la liste
		
		
		String sous = "" ;
		for (Consommation uneconso:list1) {
			sous = sous + uneconso.toString(); 
		}
//		Le premier for afin de stocker tous les to strings. C'était la dernière partie du code que j'ai implémenté.
		
		
		double totaux = 0;
		for (Consommation uneconso:list1) {
			totaux = totaux + uneconso.getTotal();
		}
//		Le deuxième for pour stocker tous les sous-totaux.
		
		if (consommation.getFin().equals("Oui")) {
			System.out.println("");
			System.out.println("<----------------------- Bienvenue au snack Mounir ------------------------------>");
			System.out.println("                     Le meilleur snack de la rue des Postes!                          ");
			System.out.println(" ");
			System.out.println("         Le Snack Mounir était content de vous acceuillir pour :");
			System.out.println("");
			System.out.println(sous);
			System.out.println("<----------------------------------------------------------------------------------->");
			System.out.println("                            Soit un total final de " + totaux + "€");
			System.out.println("<------------------------ Merci pour votre Passage! ------------------------------>");
					
			break;
		}
			
// 		Il s'agit de la partie "design" du code. Il faudrait que je le teste un peu plus pour tout bien centrer...
		
//		En conclusion c'était un exercice très sympa, il a permit de voir si nous avions bien compris les bases de Java, particulièrement le concept Classes/Objet
//		La durée limité de l'exercie (une journée) était sympa aussi car cela nous a obligé à nous concentrer sur l'essentiel !
//		Enfin le concept de facture (bien que très simplifié) sera facilement réapplicable dans le futur.
//		Bref un très bon exercice, bien qu'improvisé!
			
			
		
			
        }
        
        
       
       
 
		
	
		
		
		
	}

}
