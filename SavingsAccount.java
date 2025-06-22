public class SavingsAccount extends BankAccount {

    private double tauxInteret;
    
    public SavingsAccount() {
        super();  
    }
    
    // Constructeur avec paramètres
    public SavingsAccount(String account, double balance, double tauxInteret) {
        super(account, balance); 
        this.tauxInteret = tauxInteret;
    }
    
    // Méthode pour définir le taux d'intérêt
    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
    
    // Méthode pour obtenir le taux d'intérêt
    public double getTauxInteret() {
        return tauxInteret;
    }
    
    // Méthode pour calculer les intérêts
    public void calculerInterets() {
        double interets = balance * (tauxInteret / 100);
        balance += interets;
        System.out.println("Intérêts calculés : " + interets + " FCFA ajoutés au compte.");
    }
    
    // Redéfinition de la méthode retirer (pas de découvert sur épargne)
    @Override
    public void retirer(double montant) {
        if (balance >= montant) {
            balance -= montant;
            System.out.println("Retrait de " + montant + " FCFA effectué sur compte d'épargne.");
        } else {
            System.out.println("Retrait impossible : Solde insuffisant sur compte d'épargne.");
        }
    }
    
    // Méthode pour afficher les informations spécifiques au compte d'épargne
    @Override
    public void afficherInfos() {
        System.out.println("=== COMPTE D'ÉPARGNE ===");
        super.afficherInfos();
        System.out.println("Taux d'intérêt : " + tauxInteret + "%");
    }
}