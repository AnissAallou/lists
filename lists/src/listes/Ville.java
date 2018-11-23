package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class Ville {
	 
	String nom; 
	int nbHabitants; 
	
	// ArrayList<String> villes = {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};
	
	// Constructeur
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	// getters
	
	public String getNom() {
		return nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}
	
	// setters
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Ville> townList = new ArrayList<Ville>();
		
		Ville[] towns = {new Ville("Nice", 343000),
						  new Ville("Carcassonne", 47000),
						  new Ville("Narbonne", 53000),
						  new Ville("Lyon", 343000),
						  new Ville("Foix", 9700),
						  new Ville("Pau", 77200),
						  new Ville("Marseille", 850700),
						  new Ville("Tarbes", 40600) };
		
		townList.addAll(Arrays.asList(towns));
		
		// Ville avec le plus d'habitants
		int maxCitizen = Integer.MIN_VALUE;
		int mostPopulatedTown = 0 ;
		
		// Ville avec le moins d'habitants
		int minCitizen = Integer.MAX_VALUE ;
		int leastPopulatedTown = 0;
		
		System.out.println("Liste des villes : ");
		for (Ville town : towns) {
			if(town.getNbHabitants() > maxCitizen) {
				maxCitizen = town.getNbHabitants();
				mostPopulatedTown = townList.indexOf(town);
			} else if(town.getNbHabitants() < minCitizen) {
				minCitizen = town.getNbHabitants();
				leastPopulatedTown = townList.indexOf(town);
			}
			System.out.println(town.getNom() + " : " + town.getNbHabitants() + " habitants");	
		}

		Ville vMax = townList.get(mostPopulatedTown);
		System.out.println("\nLa ville la plus peuplée : " + vMax.getNom() + " (" + vMax.getNbHabitants() + " habitants)");
		
		Ville vMin = townList.get(leastPopulatedTown); // La ville la moins peuplée que l'on supprimera 
		System.out.println("La ville la moins peuplée : " + vMin.getNom() + " (" + vMin.getNbHabitants() + " habitants) => à supprimer car sous-peuplée elle sert à rien");
		
		/// On supprime ce bled (la plus petite ville)
		townList.remove(townList.get(leastPopulatedTown));
		
		System.out.println("\nLa ville la moins peuplée disparaît et les villes de plus de 100 000 habitants passent en MAJUSCUL");
		
		for (Ville tallTown : townList) {
			if(tallTown.getNbHabitants()>100000) {
				tallTown.setNom(tallTown.getNom().toUpperCase()); // Passe en MAJUSCULES les villes qui comptent plus de 100 000 habitants
			}
			System.out.println(tallTown.getNom() + " : " + tallTown.getNbHabitants() + " habitants");
			
		}
	}
	
	
}
