public class CheckingAccount extends BankAccount {

    private double limit;
    
    // Constructeur par défaut
    public CheckingAccount() {
        super();  // Appel du constructeur parent
    }
    
    // Constructeur avec paramètres
    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);  
        this.limit = limit;
    }
    
    // Méthode pour définir la limite
    public void setLimit(double limit) {
        this.limit = limit;
    }
    
    // Méthode pour obtenir la limite
    public double getLimit() {
        return limit;
    }
    
    // Redéfinition de la méthode retirer avec gestion de la limite
    @Override
    public void retirer(double montant) {

        if ((balance - montant) >= -limit) {
            balance -= montant;
            System.out.println("Retrait de " + montant + " FCFA effectué sur compte courant.");
            if (balance < 0) {
                System.out.println("Attention : Vous êtes en découvert de " + Math.abs(balance) + " FCFA");
            }
        } else {
            System.out.println("Retrait impossible : Limite de découvert dépassée.");
        }
    }
    
    // Méthode pour afficher les informations spécifiques au compte courant
    @Override
    public void afficherInfos() {
        System.out.println("=== COMPTE COURANT ===");
        super.afficherInfos();
        System.out.println("Limite de découvert : " + limit + " FCFA");
    }
}