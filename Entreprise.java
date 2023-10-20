package TP4_2_POO;

public class Entreprise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e1=new Employe(11, "Med", 2002, 2, 10);
		e1.AfficherSal();
		Vendeur v1=new Vendeur(10, "Salma", 2002, 5, 70);
		v1.AfficherSal();
		Salaire s1=new Salaire(13,"Ahmed",2000);
		s1.AfficherSal();
		s1.SalaireE();
		
		Salaire[] tabSalarie= new Salaire[5];
		tabSalarie[0]= new Employe(12345,"Walid",2002,15,4);
		tabSalarie[1]= new Vendeur(23445,"Yessine",2007,1000,0.1);
		tabSalarie[2]= new Vendeur(65478,"Nassime",2000,700,0.1);
		tabSalarie[3]= new Employe(87698,"Aymen ",2003,19,5);
		tabSalarie[4]= new Employe(12345,"Khaled",2008,7,4);
		
		System.out.println();
		 System.out.println("************ Liste des Employés*********");
		  for (Salaire s : tabSalarie) {
			 //(tabSalarie.getClass().getName()=="Employe")
			  if ((s != null)&&(s instanceof Employe))
	            s.AfficherSal();
	           
	        }
		  
		  System.out.println();
			 System.out.println("************ Liste des Vendeurs*********");
			  for (Salaire s : tabSalarie) {
				 //(tabSalarie.getClass().getName()=="Employe")
				  if ((s != null)&&(s instanceof Vendeur))
		            System.out.println(s.toString());
		           
		        }
			/*  for (int i=0; i <tabSalarie.length ; i++) 
				{
				
			       if(tabSalarie.getClass().getName()=="Employe")
			    	   System.out.println(tabSalarie[i].toString());
			    	   
				}*/
		  
		
		 
		Salaire SalairieAncien=tabSalarie[0];
		for (Salaire s : tabSalarie) {
			  if ((s.getRecrutement()<SalairieAncien.getRecrutement())){
				  SalairieAncien=s;
	        }
			  }
		System.out.println();
		System.out.println("Nom du salarie le plus ancien dans l'entreprise: "+SalairieAncien.getNom()+" il est recrute en "+SalairieAncien.getRecrutement());
	//Salaire maxV=tabSalarie[0];
		double max=0;
		int s=-1;
		for(int i=1; i<tabSalarie.length;i++) {
			  if (tabSalarie[i] instanceof Vendeur && max<tabSalarie[i].SalaireE()) {
				  s=i;
				  max=tabSalarie[i].SalaireE();
			  }
		}
			System.out.println();
			System.out.println("Nom du vendeur ayant le grand salaire: "+tabSalarie[s].getMatricule()+" de salaire :"+tabSalarie[s].SalaireE());

		 		
	}

	
	  
	
}
