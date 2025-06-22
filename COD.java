public class COD extends BankAccount {
    // Attributs supplémentaires : durée du certificat et taux d'intérêt
    private int dureeEnMois;
    private double tauxInteret;
    private boolean estMature;  
    
    public COD() {
        super();  
        this.estMature = false;
    }
    
    // Constructeur avec paramètres
    public COD(String account, double balance, int dureeEnMois, double tauxInteret) {
        super(account, balance);  
        this.dureeEnMois = dureeEnMois;
        this.tauxInteret = tauxInteret;
        this.estMature = false;
    }
    
    // Méthode pour définir la durée
    public void setDureeEnMois(int dureeEnMois) {
        this.dureeEnMois = dureeEnMois;
    }
    
    // Méthode pour obtenir la durée
    public int getDureeEnMois() {
        return dureeEnMois;
    }
    
    // Méthode pour définir le taux d'intérêt
    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
    
    // Méthode pour obtenir le taux d'intérêt
    public double getTauxInteret() {
        return tauxInteret;
    }
    
    // Méthode pour marquer le certificat comme mature
    public void marquerCommeMature() {
        this.estMature = true;
        // Calculer les intérêts à maturité
        double interetsFinaux = balance * (tauxInteret / 100) * (dureeEnMois / 12.0);
        balance += interetsFinaux;
        System.out.println("Certificat arrivé à maturité !");
        System.out.println("Intérêts ajoutés : " + interetsFinaux + " FCFA");
    }
    
    // Redéfinition de la méthode retirer 
    @Override
    public void retirer(double montant) {
        if (!estMature) {
            System.out.println("Retrait impossible : Certificat pas encore mature.");
            System.out.println("Durée restante : " + dureeEnMois + " mois");
        } else if (balance >= montant) {
            balance -= montant;
            System.out.println("Retrait de " + montant + " FCFA effectué sur certificat de dépôt.");
        } else {
            System.out.println("Retrait impossible : Solde insuffisant.");
        }
    }
    
    // Redéfinition de la méthode déposer 
    @Override
    public void deposer(double montant) {
        System.out.println("Dépôt impossible : Aucun dépôt autorisé sur un certificat de dépôt.");
    }
    
    // Méthode pour afficher les informations spécifiques au certificat de dépôt
    @Override
    public void afficherInfos() {
        System.out.println("=== CERTIFICAT DE DÉPÔT ===");
        super.afficherInfos();
        System.out.println("Durée : " + dureeEnMois + " mois");
        System.out.println("Taux d'intérêt : " + tauxInteret + "%");
        System.out.println("Statut : " + (estMature ? "Mature" : "En cours"));
    }
}