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
                System.out.println("Prenom : "+res.getString("prenom")
                +"\nNom : "+res.getString("nom")                
                +"\nAge : "+res.getString("age"));             
            }
        } catch (SQLException e){
            e.printStackTrace();
        }        
    }

}
