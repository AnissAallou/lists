package listes;

import java.util.ArrayList;


import java.util.Collections;
import java.util.List;

public class TestListeInt {
	  
	public static void main(String[] args) {
		
	// On instancie la liste tableau
	List<Integer> entiers = new ArrayList<Integer>();
	entiers.add(-1); 
	entiers.add(5);
	entiers.add(7);
	entiers.add(3);
	entiers.add(-2);
	entiers.add(4);
	entiers.add(8);
	entiers.add(5); 
	
	System.out.println(entiers);
	System.out.println("max: " + Collections.max(entiers)); // Le plus grand de la liste
    System.out.println("min: " + Collections.min(entiers)); // Le plus petit de la liste
	
    System.out.println("\nSuppression du minimum");
    
    entiers.remove(Collections.min(entiers));
    
    System.out.print(entiers + " ");
    
    System.out.println("\n\nConversion des négatifs en positifs");
    
    for(int i=0; i<entiers.size(); i++) {
    	if(entiers.get(i)<0) { // chaque nombre négatif deviendra positif grâce à la méthode Math.abs()
    		entiers.set(entiers.indexOf(entiers.get(i)), Math.abs(entiers.get(i)));		
    	}
    }
       
    System.out.print(entiers + " ");
    

    
    
     
    
    
    
    
    




    
	}
	
}
	



