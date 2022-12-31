public class Compte {
    private String name;
    private String password;
    private double solde;

    public Compte(String name, String pass, double solde) {
        this.setNom(name);
        this.setPassword(pass);
        this.setSolde(solde);
    }
    public Compte() {

    }
    // name setter and getter
    public String getNom() {return name;}
    public void setNom(String name) { this.name = name; }

    // password setter and getter
    public String getPassword() { return password; }
    public void setPassword(String pass) {
        this.password = pass;
    }

    // solde setter and getter
    public double getSolde() { return solde; }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    @Override
    public String toString() {
        return "Compte{" +
                "name='" + getNom() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", solde=" + getSolde() +
                '}';
    }
}
