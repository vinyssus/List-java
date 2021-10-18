package metier;

public interface Iuniversity {
	public 	void ajouterEtudiant (Etudiant e) throws EtudiantExistantException;
	public 	boolean rechercherEtudiant (Etudiant e);
	public 	boolean rechercherEtudiant (String nom);
	public 	void supprimerEtudiant (Etudiant e);
	public 	void displayEtudiants();
	public 	void trierEtudiantsParId();
	public 	void trierEtudiantsParNom();
}
