package sn.ahmedgueye.controller;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {
    
    // Methode de recupération des données
    public void readData(){
        // Création d'une Connection
        try(Connection connexion = DriverManager.getConnection("jdbc:sqlite:crud_maven.db")){
            Statement stmt = connexion.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM membres");
            while (res.next()) {
                System.out.println( "Prenom : "+res.getString("prenom")
                +"               Nom : "+res.getString("nom")
                +"               Age : "+res.getString("age"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }        
    }

    //Methode d'insertion de donnée
    public void insertData(String prenom, String nom, int age){
        // Creation d'une connexion
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:crud_maven.db")) {
            Statement stmt = connection.createStatement();
            String req = "INSERT INTO membres(prenom,nom,age) VALUES('"+prenom+"','"+nom+"','"+age+"')";
            stmt.executeUpdate(req);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Methode de modification des données
    public void updateData(int id, String prenom, String nom, int age){
        // Creation d'une connexion
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:crud_maven.db")) {
            Statement stmt = connection.createStatement();
            String req = "UPDATE membres SET prenom='"+prenom+"', nom='"+nom+"',age='"+age+"' WHERE id='"+id+"'";
            stmt.executeUpdate(req);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Methode de suppression de donnée
    public void deleteData(int id){
        try (Connection connexion = DriverManager.getConnection("jdbc:sqlite:crud_maven.db")) {
            Statement stmt = connexion.createStatement();
            String req = "DELETE FROM membres WHERE id="+id+";";
            stmt.executeUpdate(req);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
