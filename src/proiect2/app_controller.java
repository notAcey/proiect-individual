package proiect2;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class app_controller implements EventHandler<KeyEvent>{

    @FXML
    private AnchorPane anchor_login;

    @FXML
    private Button exit_button;

    @FXML
    private Button login_btn;

    @FXML
    private PasswordField password_txb;

    @FXML
    private TextField username_txb;

    public void close(){
        System.exit(0);
    }
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    private double x = 0 ;
    private double y = 0;

    public void loginAdmin(){
        String sql = "SELECT * FROM utilizatori WHERE username = ? AND parola = ? AND tipUtilizator = 'administrator'";
        //String sql = "SELECT * FROM utilizatori WHERE username = ? AND parola = ? AND tip_utilizator = ?";
        connect = database.connectDB();
        try{
            Alert alert;
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, username_txb.getText());
            prepare.setString(2, password_txb.getText());
            
            result = prepare.executeQuery();
            
            if(username_txb.getText().isEmpty()|| password_txb.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("error message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            }
            else{
                if(result.next()){
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information message");
                    alert.setHeaderText(null);
                    alert.setContentText("Succesfully logged-in");
                    alert.showAndWait();
                    
                    login_btn.getScene().getWindow().hide();
                    
                    Parent root = FXMLLoader.load(getClass().getResource("admin_dashboard.fxml"));
                    
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    
                    root.setOnMousePressed((MouseEvent event) ->{
                        x = event.getSceneX();
                        y = event.getSceneY();
                        stage.setOpacity(.8);
                    });
                    
                    root.setOnMouseDragged((MouseEvent event) ->{
                        stage.setX(event.getScreenX() - x);
                        stage.setY(event.getScreenY() - y);
                    });
                    
                    scene.setOnMouseReleased(event -> {
                        stage.setOpacity(1);
                    });
                    
                    stage.initStyle(StageStyle.TRANSPARENT);
                    
                    stage.setScene(scene);
                    stage.show();
                }
                else{
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("error message");
                    alert.setHeaderText(null);
                    alert.setContentText("wrong username/password or you're not an admin");
                    alert.showAndWait();
                }
            }
        }catch (Exception e){e.printStackTrace();}
    }

    public void initialize() {
        username_txb.setOnKeyPressed(this);
        password_txb.setOnKeyPressed(this);
    }

    @Override
    public void handle(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            loginAdmin();
        }
    }
}