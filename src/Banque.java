import java.util.Vector;
//import java.util.ArrayList;

public class Banque {
    private String bankName;
    Vector<Compte> Acount = new Vector<Compte>();

    public Banque(String bankName) {
        this.setBankName(bankName);
    }

    public String getBankName() {
         return bankName;
     }
     public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void ouvrirCompte(String nom, String password) {
        boolean find = false;
        try {
            for (Compte c : Acount) {
                if (c.getNom().equals(nom) && c.getPassword().equals(password)) {
                    System.out.println("Vous avez deja un compte !");
                    find = true;
                    break;
                }
            }
            if (find == false)
                Acount.add(new Compte(nom, password, 0) );
        } catch (Exception e) {
            System.out.println("Erreur d'ouvreture de compte !");
            System.out.println(e.toString());
        }
    }

    public Compte verifie(String nom, String password) {
        Compte user = new Compte();
        boolean find = false;
        for (Compte c: Acount) {
            if (c.getNom().equals(nom) && c.getPassword().equals(password)) {
                user = c;
                find = true;
                break;
            }
        }
        if (find == false) {
            user = null;
            System.out.println("\n ce compte n'existe pas !");
        }
        return user;
    }
    public double fermerCompte(String nom, String password) {
        double solde = 0;
        for (Compte c : Acount) {
            if (c.getNom().equals(nom) && c.getPassword().equals(password)){
                solde = c.getSolde();
                Acount.remove(c);
                System.out.println("\n votre compte est bien supprimer monsieur " + nom + " votre solde est :");
                return solde;
            }
        }
        System.out.println("\n il n'y a pas du compte à votre nom !");
        return solde;
    }
    public void deposer(int somme, Compte c) {
        double solde = 0;
        try {
            for (Compte b: Acount){
                if (b == c) {
                    solde = b.getSolde();
                    solde += somme;
                    System.out.println("vous avez ajouter "+ somme + " est votre solde actuel est maitenant " + solde);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Erreur de deposer sur votre compte !");
            System.out.println(e.toString());
        }
    }


    public double retirer(double somme, Compte c) {
        double solde = c.getSolde();
        for (Compte b: Acount){
            if (b == c && solde >= somme) {
                solde -= somme ;
                System.out.println("vous avez retirer "+ somme + " est votre solde actuel est maitenant :" + solde + "£");
                return solde;
            }
        }
        System.out.println("Votre solde est insuffisant pour retirer "+ somme +" £! essayez avec moins de montant ! " +
                "votre solde actuel est :" + solde + "£");
        return solde;
    }
    public double solde(Compte c) {
        double solde = c.getSolde();
        for (Compte b: Acount){
            if (b == c ) {
                System.out.println("votre solde actuel est :" + solde + "£");
                return solde;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "bankName='" + getBankName() + '\'' +
                ", Acount=" + Acount +
                '}';
    }
}