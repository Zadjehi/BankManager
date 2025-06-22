public class BankManager {
    public static void main(String[] args) {
        System.out.println("=== APPLICATION BANK MANAGER ===");
        System.out.println("Gestion des comptes bancaires\n");
        
        // Créer une instance de CheckingAccount (compte courant)
        CheckingAccount compteCourant = new CheckingAccount();
        compteCourant.account = "CC-001-Kouakou";
        compteCourant.balance = 150000.0;
        compteCourant.setLimit(50000.0);  // Limite de découvert de 50 000 FCFA
        
        // Créer une instance de SavingsAccount (compte d'épargne)
        SavingsAccount compteEpargne = new SavingsAccount();
        compteEpargne.account = "EP-002-Zadjehi";
        compteEpargne.balance = 500000.0;
        compteEpargne.setTauxInteret(3.5);  // Taux d'intérêt de 3.5%
        
        // Créer une instance de COD (certificat de dépôt)
        COD certificatDepot = new COD();
        certificatDepot.account = "CD-003-Kone";
        certificatDepot.balance = 1000000.0;
        certificatDepot.setDureeEnMois(12);  // 12 mois
        certificatDepot.setTauxInteret(5.0);  // Taux d'intérêt de 5%
        
        // Afficher les informations de tous les comptes
        System.out.println("=== INFORMATIONS DES COMPTES ===\n");
        
        compteCourant.afficherInfos();
        System.out.println();
        
        compteEpargne.afficherInfos();
        System.out.println();
        
        certificatDepot.afficherInfos();
        System.out.println();
        
        // Tester les opérations sur le compte courant
        System.out.println("=== OPÉRATIONS SUR COMPTE COURANT ===");
        compteCourant.deposer(25000);
        compteCourant.retirer(200000);  // Test avec découvert
        compteCourant.afficherInfos();
        System.out.println();
        
        // Tester les opérations sur le compte d'épargne
        System.out.println("=== OPÉRATIONS SUR COMPTE D'ÉPARGNE ===");
        compteEpargne.deposer(100000);
        compteEpargne.calculerInterets();  // Calculer les intérêts
        compteEpargne.retirer(50000);
        compteEpargne.afficherInfos();
        System.out.println();
        
        // Tester les opérations sur le certificat de dépôt
        System.out.println("=== OPÉRATIONS SUR CERTIFICAT DE DÉPÔT ===");
        certificatDepot.retirer(100000);  // Tentative avant maturité
        certificatDepot.deposer(50000);   // Tentative de dépôt (interdite)
        
        // Simuler la maturité du certificat
        certificatDepot.marquerCommeMature();
        certificatDepot.retirer(100000);  // Maintenant autorisé
        certificatDepot.afficherInfos();
        System.out.println();
        
        // Vérification de l'accès aux attributs account et balance
        System.out.println("=== VÉRIFICATION D'ACCÈS AUX ATTRIBUTS ===");
        System.out.println("Compte courant - Numéro : " + compteCourant.account);
        System.out.println("Compte courant - Solde : " + compteCourant.balance + " FCFA");
        
        System.out.println("Compte épargne - Numéro : " + compteEpargne.account);
        System.out.println("Compte épargne - Solde : " + compteEpargne.balance + " FCFA");
        
        System.out.println("Certificat dépôt - Numéro : " + certificatDepot.account);
        System.out.println("Certificat dépôt - Solde : " + certificatDepot.balance + " FCFA");
        
        System.out.println("\n=== FIN DU PROGRAMME ===");
    }
}