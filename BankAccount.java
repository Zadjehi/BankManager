public class BankAccount {

    protected String account;  // Numéro de compte
    protected double balance;  // Solde du compte
    

    public BankAccount() {
    }
    
    // Constructeur avec paramètres
    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }
    
    // Méthode pour afficher les informations du compte
    public void afficherInfos() {
        System.out.println("Numéro de compte : " + account);
        System.out.println("Solde : " + balance + " FCFA");
    }
    
    // Méthode pour déposer de l'argent
    public void deposer(double montant) {
        balance += montant;
        System.out.println("Dépôt de " + montant + " FCFA effectué.");
    }
    
    // Méthode pour retirer de l'argent
    public void retirer(double montant) {
        if (balance >= montant) {
            balance -= montant;
            System.out.println("Retrait de " + montant + " FCFA effectué.");
        } else {
            System.out.println("Solde insuffisant pour ce retrait.");
        }
    }
}