package TP4_2_POO;



public class Salaire {
	protected int matricule;
	protected String nom;
	protected double recrutement;
	public Salaire(int matricule,String nom,double recrutement) {
		this.matricule=matricule;
		this.nom=nom;
		this.recrutement=recrutement;
		
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getRecrutement() {
		return recrutement;
	}
	public void setRecrutement(double recrutement) {
		this.recrutement = recrutement;
	}
	public String toString() {
		return("le nom de "+getClass().getSimpleName()+": "+nom+" son matricule est : "+matricule+" il est recrute en :"+recrutement+" son salaire est : "+SalaireE());
	}
	public void AfficherSal() {
		System.out.println(this.toString());
	}
	public double SalaireE() {
		double sal;
		if(recrutement<=2005) {
			sal=400;
		}
		else {
			sal=280;
			}
		return sal;
			
	}

	
	
	

}
