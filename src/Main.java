import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of GestionListe
        GestionListe gestionListe = new GestionListe();

        // Test: Alimenter la liste
        gestionListe.alimenterListe();

        // Test: Afficher la liste avant modification
        System.out.println("Liste avant modification:");
        gestionListe.afficherListe();

        // Test: Insérer un nouvel employé dans la liste
        Employe nouvelEmploye = new Employe("Nom3", "Prenom3", 28, "Poste2");
        gestionListe.insererElement(nouvelEmploye);

        // Test: Afficher la liste après insertion
        System.out.println("\nListe après insertion d'un nouvel employé:");
        gestionListe.afficherListe();

        // Test: Récupérer un élément de la liste
        System.out.println("\nÉlément récupéré à l'index 1: " + gestionListe.recupererElement(1));

        // Test: Supprimer un employé de la liste
        Personne personneASupprimer = gestionListe.rechercherElement("Nom1");
        gestionListe.supprimerElement(personneASupprimer);

        // Test: Afficher la liste après suppression
        System.out.println("\nListe après suppression d'un élément:");
        gestionListe.afficherListe();

        // Test: Rechercher un employé dans la liste
        System.out.println("\nRechercher un employé:");
        Personne personneRecherchee = gestionListe.rechercherElement("Nom2");
        System.out.println(personneRecherchee != null ? "Trouvé : " + personneRecherchee : "Non trouvé.");

        // Test: Trier la liste
        gestionListe.trierListe();
        System.out.println("\nListe triée:");
        gestionListe.afficherListe();

        // Test: Copier la liste dans un nouveau tableau
        List<Personne> copieListe = gestionListe.copierListe();
        System.out.println("\nCopie de la liste:");
        copieListe.forEach(System.out::println);

        // Test: Alimenter la liste
        gestionListe.alimenterListe();

        // Test: Afficher la liste avant modification
        System.out.println("Liste avant modification:");
        gestionListe.afficherListe();


        // Test: Afficher la liste après insertion
        System.out.println("\nListe après insertion d'un nouvel employé:");
        gestionListe.afficherListe();

        // Test: Récupérer un élément de la liste
        System.out.println("\nÉlément récupéré à l'index 1: " + gestionListe.recupererElement(1));


        // Test: Afficher la liste après suppression
        System.out.println("\nListe après suppression d'un élément:");
        gestionListe.afficherListe();

        // Test: Trier la liste
        gestionListe.trierListe();
        System.out.println("\nListe triée:");
        gestionListe.afficherListe();


        // Test: Mélanger les éléments de la liste
        gestionListe.melangerListe();
        System.out.println("\nListe mélangée:");
        gestionListe.afficherListe();

        // Test: Inverser les éléments de la liste
        gestionListe.inverserListe();
        System.out.println("\nListe inversée:");
        gestionListe.afficherListe();

        // Test: Extraire une partie de la liste
        List<Personne> partieListe = gestionListe.extrairePartieListe(1, 3);
        System.out.println("\nPartie de la liste extraite:");
        partieListe.forEach(System.out::println);

        // Test: Comparer deux listes
        List<Personne> autreListe = gestionListe.copierListe();
        System.out.println("\nComparaison de deux listes:");
        System.out.println("Les listes sont égales : " + gestionListe.comparerListes(autreListe));

        // Test: Échange de deux éléments dans une liste
        gestionListe.echangerElements(0, 2);
        System.out.println("\nListe après échange d'éléments:");
        gestionListe.afficherListe();

        // Test: Vider la liste
        gestionListe.viderListe();
        System.out.println("\nListe après vidage:");
        gestionListe.afficherListe();

        // Test: Tester si la liste est vide
        System.out.println("\nLa liste est vide : " + gestionListe.listeEstVide());
    }
}
