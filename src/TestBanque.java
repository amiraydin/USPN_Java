public class TestBanque {
    public static void main(String[] args) {
        Banque BMP = new Banque("bnp");
        Compte c1 = new Compte("amir", "soso", 950);
        Compte c2 = new Compte("sam", "jojo", 901);
        Compte c3 = new Compte("armin", "foto", 250);
        Compte c4 = new Compte("sophie", "sama", 850);

        BMP.Acount.add(c1);
        BMP.Acount.add(c2);
        BMP.Acount.add(c3);
        BMP.Acount.add(c4);

        /// TEST 1 : ouvrirCompte(String nom, String mdp)
        BMP.ouvrirCompte("yusuf","frero");
        BMP.ouvrirCompte("sam","sami");
        BMP.ouvrirCompte("armin", "foto");
        // System.out.println(BMP.Acount);

        /// TEST 2 : verifie(String nom, String mdp)
        System.out.println(BMP.verifie("helene", "samir"));
        System.out.println(BMP.verifie("sam", "jojo"));
        System.out.println(BMP.verifie("amir", "soso"));
        System.out.println(BMP.verifie("sophie", "masha"));

        /// TEST 3 : fermerCompte(String nom, String mdp)
        /* System.out.println(BMP.fermerCompte("sam", "jojo"));
        System.out.println(BMP.fermerCompte("Adam", "Emre"));
        System.out.println(BMP.fermerCompte("amir", "soso")); */

        /// TEST 4 : deposerCompte(double somme, Compte c)
        // BMP.deposer(50, c2);
        // BMP.deposer(60, c3);


        /// TEST 5 : retirer(int somme, Compte c)
        /*BMP.retirer(300, c3);
        BMP.retirer(100, c1);
        BMP.retirer(400, c4);*/


        /// TEST 6 : solde(Compte c)
        //BMP.solde(c1);
        //BMP.solde(c4);
        //BMP.solde(c2);
    }
}
