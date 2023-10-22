package ex1;

public class Entreprise {
	public static void main(String[] args) {
		Salarie[]  tabSalarie = new Salarie[5] ;
		tabSalarie[0] = new Employe(12345,"Walid",2002,15,4);
		tabSalarie[1] = new Vendeur(23445,"Yessine",2007,1000,0.1);
		tabSalarie[2] = new Vendeur(65478,"Nassime",2000,700,0.1);
		tabSalarie[3] = new Employe(87698,"Aymen ",2003,19,5);
		tabSalarie[4] = new Employe(12345,"Khaled",2008,7,4);
		
		System.out.print("******************************** Liste des Employes***************************** \n");
		for(int i = 0;i < tabSalarie.length ; i++) {
			if(tabSalarie[i]instanceof Employe) {
				tabSalarie[i].affiche();
			}
			
		}
		System.out.print("***************************************************************************** \n");
		
		
		System.out.print("\n ********************************** Liste des Vendeurs *************************** \n");
		for(int i = 0;i < tabSalarie.length ; i++) {
			if(tabSalarie[i]instanceof Vendeur) {
				tabSalarie[i].affiche();
			}
			
		}
		System.out.print("***************************************************************************** \n");
		
		Salarie min = tabSalarie[0] ;
		for(int i = 0;i < tabSalarie.length ; i++) {
			
			if(tabSalarie[i].recrutement < min.recrutement ) {
				min = tabSalarie[i];
			}
		}
		
		System.out.print("\n ****************** Matricule du vendeur disposant du plus grand salaire **************** \n");
		System.out.print("Nom: " + min.nom + " recrute en l an " + min.recrutement);
		System.out.print("\n ***************************************************************************** \n");
		
		Salarie max  = null;
		for(int i = 0;i < tabSalarie.length ; i++) {
			if(tabSalarie[i]instanceof Vendeur ) {
				if(max == null) {
					max = tabSalarie[i];
				}
				else {
					if(tabSalarie[i].salaire() > max.salaire()) {
						max = tabSalarie[i];
					}
				}
			}
		}
		System.out.print("\n ****************** Matricule du vendeur disposant du plus grand salaire **************** \n");
		System.out.print("Matricule = "+ max.matricule + " de salaire = " + max.salaire() + " DT");
		System.out.print("\n ***************************************************************************** \n");
}
	}
