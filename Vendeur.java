package TP4_2_POO;

public class Vendeur extends Salaire{
	
	private double vente;
	private double pourcentage;
	public Vendeur(int matricule, String nom, double recrutement,double vente, double pourcentage) {
		super(matricule, nom, recrutement);
		this.vente=vente;
		this.pourcentage=pourcentage;
	}
	public double getVente() {
		return vente;
	}
	public void setVente(double vente) {
		this.vente = vente;
	}
	public double getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}
	@Override
	public void AfficherSal() {
		super.AfficherSal();
		System.out.println(" vente : "+vente+" pourcentage : "+pourcentage);
		
	}
	@Override
	public double SalaireE(){
		return super.SalaireE()+ (getVente()*getPourcentage());
		
	}

}
