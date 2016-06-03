package modele;

import java.util.Date;

public class User {

    private Long id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String adresse;
    private String adresseLivraison;
    private Date lastConnexion;
    private Panier panier;
    private String role;


    public User() {
    }

    public User(String login, String password, String firstName, String lastName, Date lastConnexion, Panier panier) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastConnexion = lastConnexion;
        this.panier = panier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastConnexion() {
        return lastConnexion;
    }

    public void setLastConnexion(Date lastConnexion) {
        this.lastConnexion = lastConnexion;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
