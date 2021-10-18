package metier;
import java.util.*;

public class UniversityImp implements Iuniversity {
  List<Etudiant>liste=new ArrayList<>();
	@Override
	public void ajouterEtudiant(Etudiant e)throws EtudiantExistantException {
		if(!rechercherEtudiant(e))
		liste.add(e);
		else
			throw new EtudiantExistantException("l'etudiant existe deja");

	}

	@Override
	public boolean rechercherEtudiant(Etudiant e) {
		
		return liste.contains(e);
	}

	@Override
	public boolean rechercherEtudiant(String nom) {
		for(int i=0;i<liste.size();i++)
			if(liste.get(i).getNom().equals(nom))
				return true;
		return false;
	}

	@Override
	public void supprimerEtudiant(Etudiant e) {
		liste.remove(e);

	}

	@Override
	public void displayEtudiants() {
		System.out.println(liste);
		System.out.println("*******************");
		for(int i=0;i<liste.size();i++)
			System.out.println(liste.get(i));
		System.out.println("*******************");
		for(Etudiant e:liste)
			System.out.println(e);
		System.out.println("*******************");
		for(Iterator<Etudiant> i=liste.iterator();i.hasNext();)
			System.out.println(i.next());
		System.out.println("*********java 8**********");
		liste.forEach(x->System.out.println(x));
		System.out.println("*********java 8**********");
		liste.forEach(System.out::println);
	}

	@Override
	public void trierEtudiantsParId() {
		Collections.sort(liste);

	}

	/*@Override
	public void trierEtudiantsParNom() {
		Collections.sort(liste, new Comparator<Etudiant>() {

			@Override
			public int compare(Etudiant o1, Etudiant o2) {
				// TODO Auto-generated method stub
				return o1.getNom().compareTo(o2.getNom());
			}
		});

	}*/
	/*public void trierEtudiantsParNom() {
		Collections.sort(liste, (x,y)->x.getNom().compareTo(y.getNom()));
			}*/
	public void trierEtudiantsParNom() {	
		liste.sort((x,y)->x.getNom().compareTo(y.getNom()));
	}

}
