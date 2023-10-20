package TP4_2_POO;

public class Employe extends Salaire {
	private double Hsupp;
	private double PHsupp;
	public Employe(int matricule, String nom, double recrutement,double Hsupp, double PHsupp) {
		super(matricule, nom, recrutement);
		this.Hsupp=Hsupp;
		this.PHsupp=PHsupp;
	}
	public double getHsupp() {
		return Hsupp;
	}
	public void setHsupp(double hsupp) {
		Hsupp = hsupp;
	}
	public double getPHsupp() {
		return PHsupp;
	}
	public void setPHsupp(double pHsupp) {
		PHsupp = pHsupp;
	}
	@Override
	public void AfficherSal() {
		super.AfficherSal();
		System.out.println(" Hsupp : "+Hsupp+" PHsupp : "+PHsupp);
		
	}
	@Override
	public double SalaireE(){
		
		return super.SalaireE()+(Hsupp*PHsupp);
	}

}
