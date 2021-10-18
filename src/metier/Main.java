
package metier;

public class Main {
	
	public static void main(String[] args) {
		Iuniversity univ=new UniversityImp();
		try {
			univ.ajouterEtudiant(new Etudiant(7,"xyz","bbb"));
			univ.ajouterEtudiant(new Etudiant(9,"zzzz","bbbb"));
			univ.ajouterEtudiant(new Etudiant(1,"aaaaa","bbbbb"));
			//univ.trierEtudiantsParId();
			univ.trierEtudiantsParNom();
	        univ.displayEtudiants();
		} catch (EtudiantExistantException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
