import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {

	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		---------------------------Premi�re tentative avec un input directement dans le code-----------------------------------------
//		int Quantit� = 2;
//		int Prix = 15;
//		String Plat = "P�tes";
//		int Total = Quantit� * Prix;
//		
//		System.out.println(Quantit� + " portion(s) de " + Plat + " � "  + Prix + "� soit un Total de " + Total + "�" );
		
//		-------------------------------Premi�re Partie avec un seul type de plat------------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Combien de portions?");
//		int Quantit� = sc.nextInt();
//		
//		Scanner nd = new Scanner(System.in);
//		System.out.println("Quel plat?");
//		String Plat = nd.nextLine();
//		
//		Scanner tl = new Scanner(System.in);
//		System.out.println("Quel prix?");
//		double Prix = tl.nextDouble();          --- Ne pas oublier d'entrer les prix avec une virgule si il y a une d�cimale----
//		
//		double Total = Prix * Quantit�;
//		
//		System.out.println(Quantit� + " portion(s) de " + Plat + " � "  + Prix + "� soit un Total de " + Total + "�" );
//		System.out.println("Merci pour votre passage et bon app�tit!");
//		
		
		Scanner sc = new Scanner(System.in);
		
        ArrayList<Consommation> list1 = new ArrayList<Consommation>();
//		On cr�e une nouvelle liste pour pouvoir stocker toutes nos donn�es!        
        
        
        while (true)
//		On commence la boucle while qui sera d�termin�e par la variable Fin qui est Oui/Non
        {
        System.out.println("Entrez la quantit�");
        int Quantit� = sc.nextInt();
        
        Scanner nd = new Scanner(System.in);
        System.out.println("Quel plat?");		
        String Plat = nd.nextLine();
		
		System.out.println("Quel prix?");
		double Prix = nd.nextDouble();
// 		J'ai pu r�utiliser 	le m�me code que le commentaire du d�but et les premiers essais
		

		Scanner fg = new Scanner(System.in);
		System.out.println("Est-ce la fin de la commande?");
		String Fin = nd.next();
// 		En utilisant next on cible simplement le prochain mot qui est plus adapt� 
		
		
		Consommation consommation = new Consommation(Quantit�, Plat, Prix, Fin);
		
		list1.add(consommation);
//		On ajoute le tout dans la liste
		
		
		String sous = "" ;
		for (Consommation uneconso:list1) {
			sous = sous + uneconso.toString(); 
		}
//		Le premier for afin de stocker tous les to strings. C'�tait la derni�re partie du code que j'ai impl�ment�.
		
		
		double totaux = 0;
		for (Consommation uneconso:list1) {
			totaux = totaux + uneconso.getTotal();
		}
//		Le deuxi�me for pour stocker tous les sous-totaux.
		
		if (consommation.getFin().equals("Oui")) {
			System.out.println("");
			System.out.println("<----------------------- Bienvenue au snack Mounir ------------------------------>");
			System.out.println("                     Le meilleur snack de la rue des Postes!                          ");
			System.out.println(" ");
			System.out.println("         Le Snack Mounir �tait content de vous acceuillir pour :");
			System.out.println("");
			System.out.println(sous);
			System.out.println("<----------------------------------------------------------------------------------->");
			System.out.println("                            Soit un total final de " + totaux + "�");
			System.out.println("<------------------------ Merci pour votre Passage! ------------------------------>");
					
			break;
		}
			
// 		Il s'agit de la partie "design" du code. Il faudrait que je le teste un peu plus pour tout bien centrer...
		
//		En conclusion c'�tait un exercice tr�s sympa, il a permit de voir si nous avions bien compris les bases de Java, particuli�rement le concept Classes/Objet
//		La dur�e limit� de l'exercie (une journ�e) �tait sympa aussi car cela nous a oblig� � nous concentrer sur l'essentiel !
//		Enfin le concept de facture (bien que tr�s simplifi�) sera facilement r�applicable dans le futur.
//		Bref un tr�s bon exercice, bien qu'improvis�!
			
			
		
			
        }
        
        
       
       
 
		
	
		
		
		
	}

}
