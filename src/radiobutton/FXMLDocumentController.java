/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobutton;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author daw
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private RadioButton RBrojo;
    @FXML
    private ToggleGroup alcoholicosAnonimos;
    @FXML
    private RadioButton RBazul;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RBrojo.setUserData("ROJO");
        RBazul.setUserData("AZUL");
        
    }

    @FXML
    private void apretarRadioButton(ActionEvent event) {
//        
//        if (RBrojo.isSelected()) {
//            this.label.setText("ROJO");
//        } else if (RBazul.isSelected()){
//            this.label.setText("AZUL");
//        }
//        
//        //OTRA FORMA
        RBrojo.setUserData("ROJO");
        RBazul.setUserData("AZUL");

        Toggle seleccionado = alcoholicosAnonimos.getSelectedToggle();
//        
//        if (seleccionado.getUserData().equals("R")) {
//            this.label.setText("ROJO");
//        } else if (seleccionado.getUserData().equals("A")){
//            this.label.setText("AZUL");
//        }

        //OTRA FORMA EXTRA
        this.label.setText(seleccionado.getUserData() + "");

    }

}
