package Services;

import dao.Dao;
import dao.SingletonDao;
import modele.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by khale on 16/05/2016.
 */
public class ProjectBdd implements ProjectService {
    Dao dao = SingletonDao.getInstance();

    public void register(User user) {
        String sql = "INSERT INTO `user` (`login`,`password`,`firstName`,`lastName`,`adresse`,`adresseLivraison`,`role`) VALUES(?,?,?,?,?,?,?)";
        try {

            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);

            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());
            preparedStatement.setString(5, user.getAdresse());
            preparedStatement.setString(6, user.getAdresseLivraison());
            preparedStatement.setString(7, user.getRole());

            preparedStatement.execute();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public User userIn(String login, String password) {
        String sql = "SELECT * FROM `user` WHERE `login`= ? AND `password`= ? ";
        User util = new User();
        boolean exist = false;
        try {

            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                exist = true;
                Long id = rs.getLong("id");
                util.setId(id);
                util.setLogin(rs.getString("login"));
                util.setPassword(rs.getString("password"));
                util.setFirstName(rs.getString("firstName"));
                util.setLastName(rs.getString("lastName"));
                util.setAdresse(rs.getString("adresse"));
                util.setAdresseLivraison(rs.getString("adresseLivraison"));
                util.setRole(rs.getString("role"));
            }
            if (exist) {
                return util;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean productIn(Product produit, List<Product> list) {
        for(Product p : list){
            if(p.getId()==produit.getId()){
                return true;
            }
        }
        return false;
    }

    public void addnewphoto(Product p) {
        String sql = "INSERT INTO `productimage` (`idproduit`,`nomimage`) VALUES (?,?)";
        try{
            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setInt(1, p.getId());
            preparedStatement.setString(2, p.getImages().get(0).getFile());
            preparedStatement.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void addProduit(Product produit) {
        if ((produit.getCategory() == "chambre") || (produit.getCategory() == "cuisine")) {
            String sql = "INSERT INTO `product` (`reference`,`price`,`category`,`couleur`,`image`,`taille`) VALUES (?,?,?,?,?,?)";
            try {

                PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);

                preparedStatement.setString(1, produit.getReference());
                preparedStatement.setDouble(2, produit.getPrice());
                preparedStatement.setString(3, produit.getCategory());
                preparedStatement.setString(4, "");
                preparedStatement.setString(5,produit.getImages().get(0).getFile());
                preparedStatement.setDouble(6, 0);



                preparedStatement.execute();

            } catch (SQLException e) {

                e.printStackTrace();

            }
        } else {
            String sql = "INSERT INTO `product` (`reference`,`price`,`taille`,`couleur`,`category`,`image`) VALUES (?,?,?,?,?,?)";
            try {

                PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);

                preparedStatement.setString(1, produit.getReference());
                preparedStatement.setDouble(2, produit.getPrice());
                preparedStatement.setDouble(3, produit.getTaille());
                preparedStatement.setString(4, produit.getCouleur());
                preparedStatement.setString(5, produit.getCategory());
                preparedStatement.setString(6,produit.getImages().get(0).getFile());


                preparedStatement.execute();

            } catch (SQLException e) {

                e.printStackTrace();

            }
        }

    }

    public void removeproduct(int idproduit) {
        String sql = "DELETE FROM `product` WHERE id = ?";
        try {
            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setInt(1, idproduit);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateproduit(int idproduit, Product produit) {
        String sql = "UPDATE `product` SET reference = ? AND price = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setString(1, produit.getReference());
            preparedStatement.setDouble(2, produit.getPrice());
            preparedStatement.setInt(3, idproduit);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Cuisine> getAllCuisines() {
        List<Cuisine> allCuisine = new ArrayList<Cuisine>();
        String sql = "SELECT * FROM `product` WHERE category = ?";
        try {
            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setString(1, "cuisine");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Cuisine cuisine = new Cuisine();
                cuisine.setId(rs.getInt("id"));
                cuisine.setCategory(rs.getString("category"));
                cuisine.setReference(rs.getString("reference"));
                cuisine.setPrice(rs.getDouble("price"));
                allCuisine.add(cuisine);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allCuisine;
    }

    public List<Chambre> getAllChambres() {
        List<Chambre> allChambre = new ArrayList<Chambre>();
        String sql = "SELECT * FROM `product` WHERE category = ?";
        try {
            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setString(1, "chambre");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Chambre chambre = new Chambre();
                chambre.setId(rs.getInt("id"));
                chambre.setCategory(rs.getString("category"));
                chambre.setReference(rs.getString("reference"));
                chambre.setPrice(rs.getDouble("price"));
                allChambre.add(chambre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allChambre;
    }

    public List<Lit> getAllLits() {
        List<Lit> allLit = new ArrayList<Lit>();
        String sql = "SELECT * FROM `product` WHERE category = ?";
        try {
            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setString(1, "lit");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Lit lit = new Lit();
                lit.setId(rs.getInt("id"));
                lit.setCategory(rs.getString("category"));
                lit.setReference(rs.getString("reference"));
                lit.setPrice(rs.getDouble("price"));
                allLit.add(lit);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allLit;
    }

    public void validerpanier(User u) {
        String sql = "INSERT INTO `commande` (`iduser`,`price`,`state`) VALUES (?,?,?)";
        try {

            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);

            preparedStatement.setLong(1, u.getId());
            preparedStatement.setDouble(2, u.getPanier().getPrice());
            preparedStatement.setString(3, "en attente de paiement");


            preparedStatement.execute();

        } catch (SQLException e) {

            e.printStackTrace();

        }


    }

    public void validercomposantscommande(User u) {
        for(Product p : u.getPanier().getProductList()){
            String sql2 = "INSERT INTO `composantcommande` (`idcommande`,`idproduit`,`quantity`) VALUES (?,?,?)";
            try{
                PreparedStatement preparedStatement2 = dao.cn.prepareStatement(sql2);

                preparedStatement2.setLong(1,getIdCommande(u.getId()));
                preparedStatement2.setInt(2,p.getId());
                preparedStatement2.setInt(3,p.getQuantity());

                preparedStatement2.execute();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public Product getProduitById(int id) {
        Product produit = new Product();
        String sql = "SELECT * FROM `product` WHERE id = ?";
        try {
            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setDouble(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                produit.setId(rs.getInt("id"));
                produit.setPrice(rs.getDouble("price"));
                produit.setReference(rs.getString("reference"));
                produit.setCategory(rs.getString("category"));
                produit.setCouleur(rs.getString("couleur"));
                produit.setTaille(rs.getDouble("taille"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produit;
    }

    public int getIdCommande(Long iduser) {
        int result = 0;
        String sql = "SELECT * FROM `commande` WHERE iduser = ? AND state = ?";
        try {
            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setLong(1,iduser);
            preparedStatement.setString(2,"en attente de paiement");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
               result = rs.getInt("id");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }

    public void addImageBDD(int MaxId, String NomImage) {
        String sql = "INSERT INTO `productimage` (`idproduit`,`nomimage`) VALUES (?,?)";
        try{
            PreparedStatement preparedStatement=dao.cn.prepareStatement(sql);
            preparedStatement.setInt(1,MaxId);
            preparedStatement.setString(2,NomImage);
            preparedStatement.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void addComposantChambre(int MaxId, int idproduit) {
        String sql = "INSERT INTO `composantchambre` (`idchambre`,`idproduit`) VALUES (?,?)";
        try{
            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setInt(1,MaxId);
            preparedStatement.setInt(2,idproduit);
            preparedStatement.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getMaxIDProduct() {
        int max = 0;


        String sql = "SELECT id FROM `product` ORDER BY id DESC LIMIT 1";
        try {

            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                max = rs.getInt("id");
            }
            return max;


            }catch (SQLException e){
            e.printStackTrace();
            return 0;
        }
    }

    public List<Image> getListeImages(int idproduit) {
            String sql = "SELECT * FROM `productimage` WHERE idproduit = ?";
            List<Image> maliste = new ArrayList<Image>();
        try{
            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setInt(1,idproduit);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Image image = new Image(rs.getString("nomimage"));
                maliste.add(image);
            }


        }catch (SQLException e){
            e.printStackTrace();
        }
        return maliste;
    }


    public List<Product> getAllProduitByCategory(String categorie) {
        List<Product> AllProduits = new ArrayList<Product>();
        String sql = "SELECT * FROM `product` WHERE category = ?";
        try {
            PreparedStatement preparedStatement = dao.cn.prepareStatement(sql);
            preparedStatement.setString(1, categorie);
            ResultSet rs = preparedStatement.executeQuery();
            while ((rs.next())) {
                Product produit = new Product();

                produit.setId(rs.getInt("id"));

                produit.setPrice(rs.getDouble("price"));
                produit.setReference(rs.getString("reference"));
                produit.setCategory(rs.getString("category"));
                produit.setCouleur(rs.getString("couleur"));
                produit.setTaille(rs.getDouble("taille"));
                produit.getImages().add(new Image(rs.getString("image")));
                System.out.println(rs.getString("image"));
                AllProduits.add(produit);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return AllProduits;
    }

}
