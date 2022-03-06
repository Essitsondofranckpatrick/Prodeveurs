 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent; 
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Histoire;
import service.HistoireI;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FrontHistoireController implements Initializable {

    @FXML
    private GridPane histoires;

    Histoire CurrentHistoire;
    List<Histoire> List_histoires;
    HistoireController h;

    public Histoire getCurrentHistoire() {
        return CurrentHistoire;
    }

    public void setCurrentHistoire(Histoire CurrentHistoire) {
        this.CurrentHistoire = CurrentHistoire;
    }

    public void setH(HistoireController h) {
        this.h = h;
    }

//    CurrentHistoire;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        afficher();
    }

    void afficher() {

        int colum = 0;
        int row = 1;
        HistoireI hs = new HistoireI();
        List_histoires = hs.afficherhistoire();
        try {
            for (int i = 0; i < List_histoires.size(); i++) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("histoire.fxml"));
                AnchorPane anchorPane = loader.load();
                HistoireController controller = loader.getController();
                controller.afficher(List_histoires.get(i));
                if (colum == 1) {
                    colum = 0;
                    ++row;
                }
                histoires.add(anchorPane, colum++, row);
                GridPane.setMargin(anchorPane, new Insets(10, 10, 10, 10));

            }
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
