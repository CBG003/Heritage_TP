package ex1;


public class Salarie {
	
	protected int matricule;
	protected String nom ; 
	protected double recrutement ;
	
	public Salarie(int matricule , String nom , double recrutement) {
		this.setMatricule(matricule);
		this.setNom(nom);
		this.setRecrutement(recrutement);
	}

	protected int getMatricule() {
		return matricule;
	}

	protected void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	protected String getNom() {
		return nom;
	}

	protected void setNom(String nom) {
		this.nom = nom;
	}

	protected double getRecrutement() {
		return recrutement;
	}

	protected void setRecrutement(double recrutement) {
		this.recrutement = recrutement;
	}


	protected void affiche() {
		System.out.print(this.getClass().getSimpleName()+" : Matricule=" + this.getMatricule() 
		+ ", Nom=" + this.getNom() 
		+ ", Annee de recrutement=" + this.getRecrutement() );
	}
	
	protected double salaire() {
		if(this.recrutement <2005) {
			return 400;
		}
		else {
			return 280;
		}
	}
		
	

}
