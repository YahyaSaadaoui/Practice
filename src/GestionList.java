import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GestionListe {
    private List<Personne> listePersonnes;

    // Constructeur
    public GestionListe() {
        listePersonnes = new ArrayList<>();
    }

    // Fonction pour alimenter la liste
    public void alimenterListe() {
        // Ajoutez des éléments à la liste, par exemple :
        listePersonnes.add(new Personne("Nom1", "Prenom1", 25));
        listePersonnes.add(new Employe("Nom2", "Prenom2", 30, "Poste1"));
        // Ajoutez autant d'éléments que nécessaire.
    }

    // Fonction pour afficher la liste (ligne par ligne)
    public void afficherListe() {
        for (Personne personne : listePersonnes) {
            System.out.println(personne.toString());
        }
    }

    // Fonction pour parcourir la liste avec un Iterateur
    public void parcourirListe() {
        Iterator<Personne> iterator = listePersonnes.iterator();
        while (iterator.hasNext()) {
            Personne personne = iterator.next();
            // Faites quelque chose avec chaque élément (personne)
        }
    }

    // Fonction pour insérer un élément dans la liste
    public void insererElement(Personne nouvellePersonne) {
        listePersonnes.add(nouvellePersonne);
    }

    // Fonction pour récupérer un élément de la liste
    public Personne recupererElement(int index) {
        if (index >= 0 && index < listePersonnes.size()) {
            return listePersonnes.get(index);
        }
        return null; // ou lancez une exception selon votre besoin
    }

    // Fonction pour supprimer un élément de la liste
    public void supprimerElement(Personne personne) {
        listePersonnes.remove(personne);
    }

    // Fonction pour rechercher un élément dans la liste
    public Personne rechercherElement(String nom) {
        for (Personne personne : listePersonnes) {
            if (personne.nom.equals(nom)) {
                return personne;
            }
        }
        return null; // ou lancez une exception selon votre besoin
    }

    // Fonction pour trier la liste
    public void trierListe() {
        Collections.sort(listePersonnes);
    }

    // Fonction pour copier la liste dans un nouveau tableau
    public List<Personne> copierListe() {
        return new ArrayList<>(listePersonnes);
    }

    // Fonction pour mélanger les éléments de la liste
    public void melangerListe() {
        Collections.shuffle(listePersonnes);
    }

    // Fonction pour inverser les éléments de la liste
    public void inverserListe() {
        Collections.reverse(listePersonnes);
    }

    // Fonction pour extraire une partie de la liste
    public List<Personne> extrairePartieListe(int debut, int fin) {
        return new ArrayList<>(listePersonnes.subList(debut, fin));
    }

    // Fonction pour comparer deux listes
    public boolean comparerListes(List<Personne> autreListe) {
        return listePersonnes.equals(autreListe);
    }

    // Fonction d'échange de deux éléments dans une liste
    public void echangerElements(int index1, int index2) {
        Collections.swap(listePersonnes, index1, index2);
    }

    // Fonction pour vider la liste
    public void viderListe() {
        listePersonnes.clear();
    }

    // Fonction pour tester si la liste est vide ou non
    public boolean listeEstVide() {
        return listePersonnes.isEmpty();
    }
}
