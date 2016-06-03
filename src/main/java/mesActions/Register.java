package mesActions;

import modele.User;


/**
 * Created by khale on 16/05/2016.
 */
public class Register extends SuperAction {
    User u = new User();
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String adresse;
    private String adresseLivraison;


    public User getUser() {
        return u;
    }

    public void setUser(User user) {
        this.u = user;
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


    public String execute() throws Exception{

        u.setLogin(login);
        u.setPassword(password);
        u.setFirstName(firstName);
        u.setLastName(lastName);
        u.setAdresse(adresse);
        u.setAdresseLivraison(adresseLivraison);
        u.setRole("client");
        if ((!u.getLogin().equals(""))&&(!u.getPassword().equals(""))&&(!u.getFirstName().equals(""))&&(!u.getLastName().equals(""))&&(!u.getAdresse().equals(""))&&(!u.getAdresseLivraison().equals(""))&&(!u.getRole().equals(""))) {
            this.projectService.register(u);
            return SUCCESS;
        }
            return INPUT;
    }


}
