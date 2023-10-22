package ex1;

public class Employe extends Salarie {
	
	private double hsupp;
	private double pHsupp;

	public Employe(int matricule, String nom, double recrutement, double hsupp , double pHsupp) {
		super(matricule, nom, recrutement);
		this.setHsupp(hsupp);
		this.setpHsupp(pHsupp);

	}
	

	protected double getHsupp() {
		return hsupp;
	}

	protected void setHsupp(double hsupp) {
		this.hsupp = hsupp;
	}

	protected double getpHsupp() {
		return pHsupp;
	}

	protected void setpHsupp(double pHsupp) {
		this.pHsupp = pHsupp;
	}

	@Override
	protected double salaire() {
		return super.salaire() + this.hsupp * this.pHsupp;
	}
	
	@Override
	protected void affiche() {
		super.affiche() ;
		System.out.print(" nombre d'heures supplementaires= " + this.getHsupp() 
		+ "0 et prix par heure supplementaire=" + this.getpHsupp() + "\n");
	}

	
	
}
