public class Employe extends Personne {
    // Attributs spécifiques à la classe Employe
    private String poste;

    // Constructeur avec paramètres
    public Employe(String nom, String prenom, int age, String poste) {
        super(nom, prenom, age);
        this.poste = poste;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Employe [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", poste=" + poste + "]";
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Employe employe = (Employe) obj;

        return poste.equals(employe.poste);
    }

    // Redéfinition de la méthode clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        Employe clone = (Employe) super.clone();
        clone.poste = this.poste;
        return clone;
    }

    // Méthode compareTo pour l'interface Comparable (basée sur le poste)
    @Override
    public int compareTo(Personne autrePersonne) {
        if (autrePersonne instanceof Employe autreEmploye) {
            return this.poste.compareTo(autreEmploye.poste);
        } else {
            // Vous pouvez définir la logique de comparaison pour les autres types de Personne
            return super.compareTo(autrePersonne);
        }
    }
}