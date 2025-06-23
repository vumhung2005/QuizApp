/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quizapp;

import com.mycompany.CategoryServices.CategoryServices;
import com.mycompany.dungchung.Category;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuanLiCauHoiController implements Initializable {
    @FXML private ComboBox<Category> cbCates;
    private static final CategoryServices catesServices= new CategoryServices();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
           
            this.cbCates.setItems(FXCollections.observableArrayList(catesServices.getCates()));
        } catch (SQLException ex) {
            Logger.getLogger(QuanLiCauHoiController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }    
    
}
