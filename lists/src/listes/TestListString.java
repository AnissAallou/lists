package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListString { 

	public static void main(String[] args) {

		String[] ville = {"Nice","Carcassonne","Narbonne","Lyon","Foix","Pau","Marseille","Tarbes"};
		// ArrayList<String> list = new ArrayList<String>();
		
		ArrayList<String> villes = new ArrayList<String>();
		
		villes.addAll(Arrays.asList(ville));
		
		// System.out.println("Ville qui a le plus grand nombre de lettres : " + Collections.max(villes));

		String length = " ";
		for (String string : villes) {
			//le mot au plus grand nombre de caractères
			if(string.length()>length.length()) {
				length = string;
			}
			
		}
		
		System.out.println("La ville qui a le plus grand nombre de lettres : " + length);
		
		System.out.println("\nVilles en majuscule : ");
		
		for (String string : villes) {
			// mettre en MAJUSCULES
			System.out.print(string.toUpperCase() + " ");
		}
		
		for (int i=0;i<villes.size();i++) {
			//pour trouver le ville qui commence par un N
			if(villes.get(i).charAt(0)=='N') {
				villes.remove(villes.get(i));
			}
		}
		
		
		System.out.print("\n\nSuppression de la liste des villes commençant par N : \n" + villes);
		
	}

}