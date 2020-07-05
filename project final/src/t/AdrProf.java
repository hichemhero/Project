package t;

import java.util.Scanner;

public class AdrProf extends AdrEmail {
	private String entreprise;
	private String domain;
	
	public AdrProf(String pseudo , String site , String mdp, String domain , String entreprise) {
		super(pseudo , site , mdp);
		this.entreprise = entreprise ;
		this.domain = domain;
	}
	
	
	public AdrProf() {
		
	}

	
	public void saisie() {
		Scanner scanner = new Scanner(System.in);
		super.saisie();
		System.out.println("----Veuillez insérez le nom de l'entreprise----");
		entreprise = scanner.nextLine();
		
		System.out.println("----Veuillez insérez le domain du travaille----");
		domain = scanner.nextLine();
	}
	
	
	public String toString() {
		return(super.toString());
	}
	
	
	public boolean equals(Object o) {
		if(o==null)
			return false ;
		
		if (!(o instanceof AdrEmail))
			return false ;
		
		AdrEmail obj = (AdrEmail) o ;
		if(!this.getSite().contentEquals(obj.getSite()) || !this.getPseudo().contentEquals(obj.getPseudo()))
			return false ;
		
		return true ;	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public int hashCode() {
		return 0;
	}
}
