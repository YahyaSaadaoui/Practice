public class Personne implements Comparable<Personne> {
    // Attributs
    protected String nom;
    protected String prenom;
    protected int age;

    // Constructeur avec paramètres
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
    }

    // Méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Personne personne = (Personne) obj;

        if (age != personne.age) return false;
        if (!nom.equals(personne.nom)) return false;
        return prenom.equals(personne.prenom);
    }

    // Méthode clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Méthode compareTo pour l'interface Comparable
    @Override
    public int compareTo(Personne autrePersonne) {
        return this.nom.compareTo(autrePersonne.nom);
    }
}
