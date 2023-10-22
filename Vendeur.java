package ex1;

public class Vendeur extends Salarie {
	protected double vente,pourcentage; 
	
	public Vendeur(int matricule, String nom, double recrutement ,double vente , double pourcentage) {
		super(matricule, nom, recrutement);
		this.setVente(vente);
		this.setPourcentage(pourcentage);
		
	}
	
	protected double getVente() {
		return vente;
	}

	protected void setVente(double vente) {
		this.vente = vente;
	}

	protected double getPourcentage() {
		return pourcentage;
	}

	protected void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

	@Override
	protected void affiche() {
		super.affiche() ;
		System.out.print(" , total des ventes par mois (Dinars) " + this.getVente()
		+ " et pourcentage sur les ventes:" + this.getPourcentage() + "% \n");
	}

	@Override
	protected double salaire() {
		return super.salaire() + this.vente * this.pourcentage;
	}

	

}
