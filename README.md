# BankManager - Système de Gestion Bancaire

## Description
Application Java de gestion de comptes bancaires utilisant l'héritage orienté objet. Le système gère différents types de comptes : comptes courants, comptes d'épargne et certificats de dépôt.

## Fonctionnalités
- Gestion des comptes bancaires avec héritage
- Trois types de comptes distincts avec leurs spécificités
- Opérations bancaires (dépôt, retrait, calcul d'intérêts)
- Gestion des limites de découvert et restrictions

## Structure du projet

### Classes principales
- `BankAccount.java` : Classe parent pour tous les comptes
- `CheckingAccount.java` : Compte courant avec limite de découvert
- `SavingsAccount.java` : Compte d'épargne avec taux d'intérêt
- `COD.java` : Certificat de dépôt avec durée et restrictions
- `BankManager.java` : Application principale avec démonstrations
- 
## Attributs et spécificités

### BankAccount (classe parent)
- `account` : Numéro de compte
- `balance` : Solde du compte
- Méthodes : `deposer()`, `retirer()`, `afficherInfos()`

### CheckingAccount (compte courant)
- Hérite de `BankAccount`
- `limit` : Limite de découvert autorisée
- Permet les retraits avec découvert dans la limite

### SavingsAccount (compte d'épargne)
- Hérite de `BankAccount`
- `tauxInteret` : Taux d'intérêt annuel
- Méthode `calculerInterets()` pour générer des intérêts
- Pas de découvert autorisé

### COD (certificat de dépôt)
- Hérite de `BankAccount`
- `dureeEnMois` : Durée du certificat
- `tauxInteret` : Taux d'intérêt plus élevé
- `estMature` : Statut de maturité
- Retraits uniquement à maturité, pas de dépôts supplémentaires

## Prérequis
- Java 21 ou plus récent
- Terminal ou invite de commande

## Installation et utilisation

### 1. Télécharger le projet
```bash
git clone https://github.com/Zadjehi/BankManager.git
cd BankManager
```

### 2. Compiler tous les fichiers
```bash
javac *.java
```

### 3. Exécuter l'application
```bash
java BankManager
```


## Fonctionnalités démontrées

### Héritage
- Toutes les classes héritent de `BankAccount`
- Accès aux attributs `account` et `balance`
- Redéfinition des méthodes selon le type de compte

### Encapsulation
- Attributs protégés dans la classe parent
- Getters et setters pour les attributs spécifiques

## Tests effectués
- Création d'instances des 3 classes enfants
- Accès en lecture et écriture aux attributs `account` et `balance`
- Fonctionnement des méthodes héritées
- Spécificités de chaque type de compte
- Gestion des erreurs et restrictions



## Auteur
Zadjehi Moahe Emmanuel Hyacinthe Junior - Exercice de programmation Java orientée objet
