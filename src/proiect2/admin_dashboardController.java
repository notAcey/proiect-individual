package proiect2;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class admin_dashboardController {

    @FXML
    private Button adrese_btnAdd;

    @FXML
    private Button adrese_btnClear;

    @FXML
    private Button adrese_btnDelete;

    @FXML
    private Button adrese_btnUpdate;

    @FXML
    private AnchorPane adrese_form;

    @FXML
    private Button btn_adrese;

    @FXML
    private TextField adrese_searchBox;

    @FXML
    private TableView<dateAdrese> adrese_tableView;

    @FXML
    private TableColumn<dateAdrese, String> adrese_tableView_apartament;

    @FXML
    private TableColumn<dateAdrese, String> adrese_tableView_bloc;

    @FXML
    private TableColumn<dateAdrese, String> adrese_tableView_district;

    @FXML
    private TableColumn<dateAdrese, String> adrese_tableView_etaj;
    
    @FXML
    private TableColumn<dateAdrese, Integer> adrese_tableView_id;

    @FXML
    private TableColumn<dateAdrese, String> adrese_tableView_localitate;

    @FXML
    private TableColumn<dateAdrese, String> adrese_tableView_numar;

    @FXML
    private TableColumn<dateAdrese, String> adrese_tableView_scara;

    @FXML
    private TableColumn<dateAdrese, String> adrese_tableView_sector;

    @FXML
    private TableColumn<dateAdrese, String> adrese_tableView_strada;

    @FXML
    private TableColumn<dateAdrese, String> adrese_tableView_tara;
    
    @FXML
    private TextField adrese_txb_apartament;

    @FXML
    private TextField adrese_txb_bloc;

    @FXML
    private TextField adrese_txb_district;

    @FXML
    private TextField adrese_txb_etaj;
    
    @FXML
    private TextField adrese_txb_id;

    @FXML
    private TextField adrese_txb_localitate;

    @FXML
    private TextField adrese_txb_numar;

    @FXML
    private TextField adrese_txb_scara;

    @FXML
    private TextField adrese_txb_sector;

    @FXML
    private TextField adrese_txb_strada;

    @FXML
    private TextField adrese_txb_tara;

    @FXML
    private Button alocareOre_btnAdd;

    @FXML
    private Button alocareOre_btnClear;

    @FXML
    private Button alocareOre_btnDelete;

    @FXML
    private Button alocareOre_btnUpdate;

    @FXML
    private ComboBox<?> alocareOre_combo_materie;

    @FXML
    private ComboBox<?> alocareOre_combo_profesor;

    @FXML
    private AnchorPane alocareOre_form;

    @FXML
    private TextField alocareOre_searchBox;

    @FXML
    private TableView<?> alocareOre_tableView;

    @FXML
    private TableColumn<?, ?> alocareOre_tableView_materie;

    @FXML
    private TableColumn<?, ?> alocareOre_tableView_profesor;

    @FXML
    private TableColumn<?, ?> alocareOre_tableView_semestru;

    @FXML
    private TextField alocareOre_txb_semestru;

    @FXML
    private Button btn_close;

    @FXML
    private Button btn_editAlocareCursuri;

    @FXML
    private Button btn_editUsers;

    @FXML
    private Button btn_fac_spec;

    @FXML
    private Button btn_home;

    @FXML
    private Button btn_materie;

    @FXML
    private Button btn_minimize;

    @FXML
    private Button btn_prof;

    @FXML
    private Button btn_signOut;

    @FXML
    private Button btn_student;

    @FXML
    private Button facultate_btnAdd;

    @FXML
    private Button facultate_btnClear;

    @FXML
    private Button facultate_btnDelete;

    @FXML
    private Button facultate_btnUpdate;

    @FXML
    private TableView<dateFacultate> facultate_tableView;
    
    @FXML
    private TableColumn<dateFacultate, Integer> facultate_tableView_id;

    @FXML
    private TableColumn<dateFacultate, String> facultate_tableView_numeFac;
    
    @FXML
    private TextField facultate_txb_id;
    
    @FXML
    private TextField facultate_txb_nume;

    @FXML
    private AnchorPane home_form;

    @FXML
    private Label home_totalAdmins;

    @FXML
    private LineChart<?, ?> home_totalCoursesChart;

    @FXML
    private LineChart<?, ?> home_totalFacChart;

    @FXML
    private Label home_totalProfs;

    @FXML
    private BarChart<?, ?> home_totalStudChart;

    @FXML
    private Label home_totalStudents;

    @FXML
    private AnchorPane main_form;

    @FXML
    private AnchorPane materie_form;

    @FXML
    private Button materii_btnAdd;

    @FXML
    private Button materii_btnClear;

    @FXML
    private Button materii_btnDelete;

    @FXML
    private Button materii_btnUpdate;

    @FXML
    private TextField materii_searchBox;

    @FXML
    private TableView<dateMaterii> materii_tableView;

    @FXML
    private TableColumn<dateMaterii, Integer> materii_tableView_credite;

    @FXML
    private TableColumn<dateMaterii, Integer> materii_tableView_id;

    @FXML
    private TableColumn<dateMaterii, Integer> materii_tableView_id_spec;

    @FXML
    private TableColumn<dateMaterii, String> materii_tableView_nume;

    @FXML
    private TableColumn<dateMaterii, String> materii_tableView_semestru;

    @FXML
    private TableColumn<dateMaterii, String> materii_tableView_statut;

    @FXML
    private TextField materii_txb_credite;

    @FXML
    private TextField materii_txb_nume;

    @FXML
    private TextField materii_txb_semestru;

    @FXML
    private TextField materii_txb_statut;

    @FXML
    private Button profesor_btnAdd;

    @FXML
    private Button profesor_btnClear;

    @FXML
    private Button profesor_btnDelete;

    @FXML
    private Button profesor_btnUpdate;

    @FXML
    private AnchorPane profesor_form;

    @FXML
    private TextField profesor_searchBox;

    @FXML
    private TableView<dateProfesori> profesor_tableView;

    @FXML
    private TableColumn<dateProfesori, Integer> profesor_tableView_id;

    @FXML
    private TableColumn<dateProfesori, Integer> profesor_tableView_idUtiliz;

    @FXML
    private TableColumn<dateProfesori, String> profesor_tableView_nume;

    @FXML
    private TableColumn<dateProfesori, Integer> profesor_tableView_salariu;

    @FXML
    private TableColumn<dateProfesori, String> profesor_tableView_sex;

    @FXML
    private TableColumn<dateProfesori, Integer> profesor_tableView_varsta;
    
    @FXML
    private ComboBox<String> profesor_combo_idUtil;

    @FXML
    private TextField profesor_txb_id;

    @FXML
    private TextField profesor_txb_nume;

    @FXML
    private TextField profesor_txb_salariu;

    @FXML
    private TextField profesor_txb_sex;

    @FXML
    private TextField profesor_txb_varsta;

    @FXML
    private Button specializare_btnAdd;

    @FXML
    private Button specializare_btnClear;

    @FXML
    private Button specializare_btnDelete;

    @FXML
    private Button specializare_btnUpdate;

    @FXML
    private ComboBox<String> specializare_combo_faculta;

    @FXML
    private AnchorPane specializare_fac_form;

    @FXML
    private TableView<dateSpecializare> specializare_tableView;
    
    @FXML
    private TableColumn<dateSpecializare, Integer> specializare_tableView_id;

    @FXML
    private TableColumn<dateSpecializare, String> specializare_tableView_numeFac;

    @FXML
    private TableColumn<dateSpecializare, String> specializare_tableView_numarBuget;

    @FXML
    private TableColumn<dateSpecializare, String> specializare_tableView_numarTaxa;

    @FXML
    private TableColumn<dateSpecializare, String> specializare_tableView_nume;

    @FXML
    private TextField specializare_txb_buget;
    
    @FXML
    private TextField specializare_txb_id;
    
    @FXML
    private TextField specializare_txb_nume;

    @FXML
    private TextField specializare_txb_taxa;

    @FXML
    private AnchorPane student_form;

    @FXML
    private Button studenti_btnAdd;

    @FXML
    private Button studenti_btnClear;

    @FXML
    private Button studenti_btnDelete;

    @FXML
    private Button studenti_btnUpdate;
    
    @FXML
    private ComboBox<String> studenti_combo_idSpec;

    @FXML
    private ComboBox<String> studenti_combo_idUtil;

    @FXML
    private ComboBox<String> studenti_combo_an;

    @FXML
    private ComboBox<String> studenti_combo_grupa;

    @FXML
    private ComboBox<String> studenti_combo_statut;

    @FXML
    private ComboBox<String> studenti_combo_locBuget;

    @FXML
    private ComboBox<String> studenti_combo_sex;

    @FXML
    private ComboBox<String> studenti_combo_subgrupa;

    @FXML
    private DatePicker studenti_dataNastere;

    @FXML
    private TextField studenti_searchBox;

    @FXML
    private TableView<dateStudenti> studenti_tableView;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_cnp;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_dataNasterii;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_grupa;

    @FXML
    private TableColumn<dateStudenti, Integer> studenti_tableView_idSpec;

    @FXML
    private TableColumn<dateStudenti, Integer> studenti_tableView_idStud;

    @FXML
    private TableColumn<dateStudenti, Integer> studenti_tableView_idUtiliz;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_statut;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_locBuget;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_nume;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_prenume;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_sex;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_subgrupa;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_an;

    @FXML
    private TextField studenti_txb_cnp;

    @FXML
    private TextField studenti_txb_idStudent;

    @FXML
    private TextField studenti_txb_nume;

    @FXML
    private TextField studenti_txb_prenume;

    @FXML
    private AnchorPane user_form;

    @FXML
    private Button users_btnAdd;

    @FXML
    private Button users_btnClear;

    @FXML
    private Button users_btnDelete;

    @FXML
    private Button users_btnUpdate;

    @FXML
    private ComboBox<String> users_combo_adrese;

    @FXML
    private TextField users_searchBox;

    @FXML
    private TableView<dateUtilizatori> users_tableView;
    
    @FXML
    private TableColumn<dateUtilizatori, Integer> users_tableView_idAdr;

    @FXML
    private TableColumn<dateUtilizatori, Integer> users_tableView_idUtil;

    @FXML
    private TableColumn<dateUtilizatori, String> users_tableView_password;

    @FXML
    private TableColumn<dateUtilizatori, String> users_tableView_tipUser;

    @FXML
    private TableColumn<dateUtilizatori, String> users_tableView_username;

    @FXML
    private BarChart<?, ?> users_totalUsersChart;

    @FXML
    private TextField users_txb_id;
    
    @FXML
    private TextField users_txb_password;

    @FXML
    private TextField users_txb_tipUtiliz;

    @FXML
    private TextField users_txb_username;

    private double x = 0;
    private double y = 0;

    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    
    //facultati=============================================================================
    
    public ObservableList<dateFacultate> facultatiListData(){
        ObservableList<dateFacultate> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM facultati";
        
        connect = database.connectDB();
        try{
            dateFacultate dateF;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            while(result.next()){
                dateF = new dateFacultate(result.getInt("IDfacultate"),result.getString("numeFacultate"));
                listData.add(dateF);
            }
            
        } catch(SQLException e){}
        return listData;
    }
    
    private ObservableList<dateFacultate> facultatiDisponibile;
    
    public void facultatiDisponibileShowListData(){
        facultatiDisponibile = facultatiListData();
        
        facultate_tableView_id.setCellValueFactory(new PropertyValueFactory<dateFacultate, Integer>("IDfacultate"));
        facultate_tableView_numeFac.setCellValueFactory(new PropertyValueFactory<>("numeFacultate"));
        
        facultate_tableView.setItems(facultatiDisponibile); 
    }
    
    public void facultatiDisponibileSelect(){
        dateFacultate dateFac = facultate_tableView.getSelectionModel().getSelectedItem();
        int num = facultate_tableView.getSelectionModel().getSelectedIndex();
        
        if((num -1) < -1){
            return;
        }
        facultate_txb_id.setText(Integer.toString(dateFac.getIDfacultate()));
        facultate_txb_nume.setText(dateFac.getNumeFacultate());
    }
    
    public void addFacultati(){
        String insertData = "INSERT INTO facultati (numeFacultate) VALUES (?)";
        connect = database.connectDB();
        
        try{
            Alert alert;
            if(facultate_txb_nume.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            }
            else if(facultate_txb_nume.getText().length() > 75){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("Numele facultatii are mai mult de 75 de caractere!");
                alert.showAndWait();
            }
            else{
                String checkData = "SELECT numeFacultate FROM facultati WHERE numeFacultate = '" + facultate_txb_nume.getText() + "'";
                
                statement = connect.createStatement();
                result = statement.executeQuery(checkData);
                
                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Facultatea " + facultate_txb_nume.getText() + " deja exista!");
                }
                else {
                    prepare = connect.prepareStatement(insertData);
                    
                    prepare.setString(1, facultate_txb_nume.getText());
                    prepare.executeUpdate();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();
                    
                    facultatiDisponibileShowListData();
                    clearFacultati();
                }
            }
        }catch(SQLException e) {}
    }
    
    public void clearFacultati(){
        facultate_txb_id.setText("");
        facultate_txb_nume.setText("");
    }
    
    public void updateFacultati(){
        String updateData = "UPDATE facultati SET numeFacultate = '" + facultate_txb_nume.getText() + "' WHERE IDfacultate = '" + facultate_txb_id.getText() + "'";
        connect = database.connectDB();

        try {
            Alert alert;
            if(facultate_txb_nume.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            }
            else if(facultate_txb_nume.getText().length() > 75){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("Numele facultatii are mai mult de 75 de caractere!");
                alert.showAndWait();
            }
            else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE " + facultate_txb_nume.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    facultatiDisponibileShowListData();
                    clearFacultati();
                } 
                else {
                    return;
                }
            }
        }catch(SQLException e) {}
    }
    
    public void deleteFacultati(){
        String deleteData = "DELETE FROM facultati WHERE numeFacultate = '" + facultate_txb_nume.getText() + "'";

        connect = database.connectDB();
        try {
            Alert alert;

            if (facultate_txb_nume.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } 
            else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE " + facultate_txb_nume.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(deleteData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();
                } 
                else {
                    return;
                }
            }
        } catch (SQLException e) {}
    }
    
    //specializari==================================================================================
    
    public ObservableList<dateSpecializare> specializariListData(){
        ObservableList<dateSpecializare> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM specializare";
        
        connect = database.connectDB();
        try{
            dateSpecializare dateS;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            while(result.next()){
                dateS = new dateSpecializare(result.getInt("IDspecializare"),
                        result.getInt("IDfacultate"), result.getString("numeSpecializare"),
                        result.getString("numarLocuriBuget"),result.getString("numarLocuriTaxa"));
                listData.add(dateS);
            }
            
        } catch(SQLException e){}
        return listData;
    }
    
    private ObservableList<dateSpecializare> specializariDisponibile;
    
    public void specializariDisponibileShowListData(){
        specializariDisponibile = specializariListData();
        
        specializare_tableView_id.setCellValueFactory(new PropertyValueFactory<>("IDspecializare"));
        specializare_tableView_numeFac.setCellValueFactory(new PropertyValueFactory<>("IDfacultate"));
        specializare_tableView_nume.setCellValueFactory(new PropertyValueFactory<>("numeSpecializare"));
        specializare_tableView_numarBuget.setCellValueFactory(new PropertyValueFactory<>("numarLocuriBuget"));
        specializare_tableView_numarTaxa.setCellValueFactory(new PropertyValueFactory<>("numarLocuriTaxa"));
        
        specializare_tableView.setItems(specializariDisponibile); 
    }
    
    public void specializariFacultatiList() {
        String listF = "SELECT * FROM facultati";
        connect = database.connectDB();
        try {
            ObservableList listFac = FXCollections.observableArrayList();
            
            prepare = connect.prepareStatement(listF);
            result = prepare.executeQuery();

            while (result.next()) {
                listFac.add(result.getString("IDfacultate"));
            }
            specializare_combo_faculta.setItems(listFac);

        } catch (SQLException e) {}
    }
    
    public void specializariDisponibileSelect(){
        dateSpecializare dateSpec = specializare_tableView.getSelectionModel().getSelectedItem();
        int num = specializare_tableView.getSelectionModel().getSelectedIndex();
        
        if((num -1) < -1){
            return;
        }
        specializare_txb_id.setText(Integer.toString(dateSpec.getIDspecializare()));
        specializare_combo_faculta.setValue(Integer.toString(dateSpec.getIDfacultate()));
        specializare_txb_nume.setText(dateSpec.getNumeSpecializare());
        specializare_txb_taxa.setText(dateSpec.getNumarLocuriTaxa());
        specializare_txb_buget.setText(dateSpec.getNumarLocuriBuget());
    }
    
    public void addSpecializari(){
        String insertData = "INSERT INTO specializare (IDfacultate, numeSpecializare, numarLocuriBuget, numarLocuriTaxa) VALUES (?,?,?,?)";
        connect = database.connectDB();
        
         try{
            Alert alert;
            if(specializare_combo_faculta.getSelectionModel().getSelectedItem() == null ||  
                    specializare_txb_nume.getText().isEmpty() || 
                    specializare_txb_taxa.getText().isEmpty() || specializare_txb_buget.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();   
            }
            
            else {
                String checkData = "SELECT numeSpecializare FROM specializare WHERE numeSpecializare = '" + specializare_txb_nume.getText() + "'";
                
                statement = connect.createStatement();
                result = statement.executeQuery(checkData);
                
                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Specializarea " + facultate_txb_nume.getText() + " deja exista!");
                }
                else{
                    
                    prepare = connect.prepareStatement(insertData);
                    
                    prepare.setString(1, (String) specializare_combo_faculta.getSelectionModel().getSelectedItem());
                    prepare.setString(2, specializare_txb_nume.getText());
                    prepare.setString(3,specializare_txb_taxa.getText());
                    prepare.setString(4,specializare_txb_buget.getText());
                    prepare.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();
                    
                    specializariDisponibileShowListData();
                    clearSpecializari();
                }
            }
         }catch(Exception e){e.printStackTrace();}
    }
    
    public void clearSpecializari(){
        specializare_txb_id.setText("");
        specializare_combo_faculta.getSelectionModel().clearSelection();
        specializare_txb_nume.setText("");
        specializare_txb_taxa.setText("");
        specializare_txb_buget.setText("");
    }
    
    public void updateSpecializari(){
        String updateData = "UPDATE specializare SET IDfacultate = '" + specializare_combo_faculta.getSelectionModel().getSelectedItem() 
                + "', numeSpecializare = '" + specializare_txb_nume.getText() + "', numarLocuriTaxa = '" 
                + specializare_txb_taxa.getText() + "', numarLocuriBuget = '" + specializare_txb_buget.getText() 
                + "' WHERE IDspecializare = '" + specializare_txb_id.getText() + "'";
        connect = database.connectDB();

        try {
            Alert alert;
            if(specializare_txb_nume.getText().isEmpty()){
                 alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } 
            else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE row with ID " + specializare_txb_id.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    specializariDisponibileShowListData();
                    clearSpecializari();
                } 
                else {
                    return;
                }
            }
        }catch(Exception e) {e.printStackTrace();}
    }
    
    public void deleteSpecializari(){
        String deleteData = "DELETE FROM specializari WHERE IDspecializare = '" + specializare_txb_id.getText() + "'";

        connect = database.connectDB();
        try {
            Alert alert;

            if (specializare_txb_nume.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } 
            else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE row with ID " + specializare_txb_id.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(deleteData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();
                } 
                else {
                    return;
                }
            }
        } catch (SQLException e) {}
    }
    
    //adrese===================================================================================================
    
    public ObservableList<dateAdrese> adreseListData(){
        ObservableList<dateAdrese> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM adrese";
        
        connect = database.connectDB();
        try{
            dateAdrese dateA;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            while(result.next()){
                dateA = new dateAdrese(result.getInt("IDadresa"),result.getString("tara"), result.getString("district"),
                        result.getString("sector"),result.getString("localitate"),
                        result.getString("strada"),result.getString("numar"),
                        result.getString("bloc"),result.getString("scara"),
                        result.getString("etaj"),result.getString("apartament"));
                listData.add(dateA);
            }
            
        } catch(SQLException e){}
        return listData;
    }
    
    private ObservableList<dateAdrese> adreseDisponibile;
    
    public void adreseDisponibileShowListData(){
        adreseDisponibile = adreseListData();
        
        adrese_tableView_id.setCellValueFactory(new PropertyValueFactory<dateAdrese, Integer>("IDadresa"));
        adrese_tableView_tara.setCellValueFactory(new PropertyValueFactory<>("tara"));
        adrese_tableView_district.setCellValueFactory(new PropertyValueFactory<>("district"));
        adrese_tableView_sector.setCellValueFactory(new PropertyValueFactory<>("sector"));
        adrese_tableView_localitate.setCellValueFactory(new PropertyValueFactory<>("localitate"));
        adrese_tableView_strada.setCellValueFactory(new PropertyValueFactory<>("strada"));
        adrese_tableView_sector.setCellValueFactory(new PropertyValueFactory<>("sector"));
        adrese_tableView_numar.setCellValueFactory(new PropertyValueFactory<>("numar"));
        adrese_tableView_bloc.setCellValueFactory(new PropertyValueFactory<>("bloc"));
        adrese_tableView_scara.setCellValueFactory(new PropertyValueFactory<>("scara"));
        adrese_tableView_etaj.setCellValueFactory(new PropertyValueFactory<>("etaj"));
        adrese_tableView_apartament.setCellValueFactory(new PropertyValueFactory<>("apartament"));
        
        adrese_tableView.setItems(adreseDisponibile);
    }
    
    public void adreseDisponibileSelect(){
        dateAdrese dateAdr = adrese_tableView.getSelectionModel().getSelectedItem();
        int num = adrese_tableView.getSelectionModel().getSelectedIndex();
        
        if((num -1) < -1){
            return;
        }
        
        adrese_txb_id.setText(Integer.toString(dateAdr.getIDadresa()));
        adrese_txb_tara.setText(dateAdr.getTara());
        adrese_txb_district.setText(dateAdr.getDistrict());
        adrese_txb_sector.setText(dateAdr.getSector());
        adrese_txb_localitate.setText(dateAdr.getLocalitate());
        adrese_txb_strada.setText(dateAdr.getStrada());
        adrese_txb_numar.setText(dateAdr.getNumar());
        adrese_txb_bloc.setText(dateAdr.getBloc());
        adrese_txb_scara.setText(dateAdr.getScara());
        adrese_txb_etaj.setText(dateAdr.getEtaj());
        adrese_txb_apartament.setText(dateAdr.getApartament());
    }
    
    public void addAdrese(){
        String insertData = "INSERT INTO adrese (tara, district, sector, localitate, strada, numar, bloc, scara, etaj, apartament) VALUES (?,?,?,?,?,?,?,?,?,?)";
        connect = database.connectDB();
        
         try{
            Alert alert;
            if(adrese_txb_tara.getText().isEmpty() || adrese_txb_district.getText().isEmpty() || adrese_txb_localitate.getText().isEmpty() || 
                    adrese_txb_strada.getText().isEmpty() || adrese_txb_numar.getText().isEmpty() || adrese_txb_bloc.getText().isEmpty() || 
                    adrese_txb_scara.getText().isEmpty() || adrese_txb_etaj.getText().isEmpty() || adrese_txb_apartament.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();   
            }
            else if(adrese_txb_tara.getText().length() > 50){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Tara are mai mult de 50 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_district.getText().length() > 50){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Districtul are mai mult de 50 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_sector.getText().length() > 1){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Sectorul are mai mult de 1 caracter!");
                alert.showAndWait();
            }
            else if(adrese_txb_localitate.getText().length() > 50){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Localitatea are mai mult de 50 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_strada.getText().length() > 50){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Strada are mai mult de 50 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_numar.getText().length() > 3){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Tara are mai mult de 3 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_bloc.getText().length() > 2){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Blocul are mai mult de 2 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_scara.getText().length() > 1){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Scara are mai mult de 1 caracter!");
                alert.showAndWait();
            }
            else if(adrese_txb_etaj.getText().length() > 2){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Etajul are mai mult de 2 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_apartament.getText().length() > 3){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Apartamentul are mai mult de 3 caractere!");
                alert.showAndWait();
            }
            else {                
                statement = connect.createStatement();
                prepare = connect.prepareStatement(insertData);

                prepare.setString(1,adrese_txb_tara.getText());
                prepare.setString(2,adrese_txb_district.getText());
                prepare.setString(3,adrese_txb_sector.getText());
                prepare.setString(4,adrese_txb_localitate.getText());
                prepare.setString(5,adrese_txb_strada.getText());
                prepare.setString(6,adrese_txb_numar.getText());
                prepare.setString(7,adrese_txb_bloc.getText());
                prepare.setString(8,adrese_txb_scara.getText());
                prepare.setString(9,adrese_txb_etaj.getText());
                prepare.setString(10,adrese_txb_apartament.getText());
                prepare.executeUpdate();

                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successfully Added!");
                alert.showAndWait();

                adreseDisponibileShowListData();
                clearAdrese();
            }
         }catch(Exception e){e.printStackTrace();}
    }
    
    public void clearAdrese(){
        adrese_txb_id.setText("");
        adrese_txb_tara.setText("");
        adrese_txb_district.setText("");
        adrese_txb_sector.setText("");
        adrese_txb_localitate.setText("");
        adrese_txb_strada.setText("");
        adrese_txb_numar.setText("");
        adrese_txb_bloc.setText("");
        adrese_txb_scara.setText("");
        adrese_txb_etaj.setText("");
        adrese_txb_apartament.setText("");
    }
    
    public void updateAdrese(){
        String updateData = "UPDATE adrese SET tara = '" + adrese_txb_tara.getText() + "', district = '" + adrese_txb_district.getText() + "', sector = '" 
                + adrese_txb_sector.getText() + "', localitate = '" + adrese_txb_localitate.getText() + "', strada = '" + adrese_txb_strada.getText() + "', numar = '" 
                + adrese_txb_numar.getText() + "', bloc = '" + adrese_txb_bloc.getText() + "', scara = '" + adrese_txb_scara.getText() + "', etaj = '" + adrese_txb_etaj.getText() 
                + "', apartament = '" + adrese_txb_apartament.getText() + "' WHERE IDadresa = '" + adrese_txb_id.getText() + "'";
        connect = database.connectDB();

        try {
            Alert alert;
            if(adrese_txb_tara.getText().isEmpty() || adrese_txb_district.getText().isEmpty() || adrese_txb_localitate.getText().isEmpty() || adrese_txb_strada.getText().isEmpty() 
                    || adrese_txb_numar.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } 
            else if(adrese_txb_tara.getText().length() > 50){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Tara are mai mult de 50 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_district.getText().length() > 50){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Districtul are mai mult de 50 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_sector.getText().length() > 1){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Sectorul are mai mult de 1 caracter!");
                alert.showAndWait();
            }
            else if(adrese_txb_localitate.getText().length() > 50){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Localitatea are mai mult de 50 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_strada.getText().length() > 50){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Strada are mai mult de 50 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_numar.getText().length() > 3){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Tara are mai mult de 3 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_bloc.getText().length() > 2){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Blocul are mai mult de 2 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_scara.getText().length() > 1){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Scara are mai mult de 1 caracter!");
                alert.showAndWait();
            }
            else if(adrese_txb_etaj.getText().length() > 2){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Etajul are mai mult de 2 caractere!");
                alert.showAndWait();
            }
            else if(adrese_txb_apartament.getText().length() > 3){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Apartamentul are mai mult de 3 caractere!");
                alert.showAndWait();
            }
            else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE row with ID " + adrese_txb_id.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    adreseDisponibileShowListData();
                    clearAdrese();

                } 
                else {
                    return;
                }
            }
        }catch(Exception e) {e.printStackTrace();}
    }
    
    public void deleteAdrese(){
        String deleteData = "DELETE FROM adrese WHERE IDadresa = '" + adrese_txb_id.getText() + "'";

        connect = database.connectDB();
        try {
            Alert alert;

            if (adrese_txb_id.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields to delete (id field)");
                alert.showAndWait();
            } 
            else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE row with ID" + adrese_txb_id.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(deleteData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();
                } 
                else {
                    return;
                }
            }
        } catch (SQLException e) {}
    }
    
    //utilizatori=============================================================================================
    
    public ObservableList<dateUtilizatori> utilizatoriListData(){
        ObservableList<dateUtilizatori> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM utilizatori";
        
        connect = database.connectDB();
        try{
            dateUtilizatori dateU;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            while(result.next()){
                dateU = new dateUtilizatori(result.getInt("IDutilizator"),result.getInt("IDadresa"),
                        result.getString("username"),result.getString("parola"),result.getString("tipUtilizator"));
                listData.add(dateU);
            }
            
        } catch(SQLException e){}
        return listData;
    }
    
    private ObservableList<dateUtilizatori> utilizatoriCurenti;
    
    public void utilizatoriCurentiShowListData(){
        utilizatoriCurenti = utilizatoriListData();
        
        users_tableView_idUtil.setCellValueFactory(new PropertyValueFactory<dateUtilizatori, Integer>("IDutilizator"));
        users_tableView_idAdr.setCellValueFactory(new PropertyValueFactory<dateUtilizatori, Integer>("IDadresa"));
        users_tableView_username.setCellValueFactory(new PropertyValueFactory<>("username"));
        users_tableView_password.setCellValueFactory(new PropertyValueFactory<>("parola"));
        users_tableView_tipUser.setCellValueFactory(new PropertyValueFactory<>("tipUtilizator"));
        
        users_tableView.setItems(utilizatoriCurenti);
    }
    
    public void utilizatoriAdreseList(){
        String listA = "SELECT IDadresa FROM adrese";
        connect = database.connectDB();
        try {
            ObservableList listAdr = FXCollections.observableArrayList();
            
            prepare = connect.prepareStatement(listA);
            result = prepare.executeQuery();

            while (result.next()) {
                listAdr.add(result.getInt("IDadresa"));
            }
            users_combo_adrese.setItems(listAdr);

        } catch (SQLException e) {}
    }
    
    public void utilizatoriCurentiSelect(){
        dateUtilizatori dateUtil = users_tableView.getSelectionModel().getSelectedItem();
        int num = users_tableView.getSelectionModel().getSelectedIndex();
        
        if((num -1) < -1){
            return;
        }
        users_txb_id.setText(Integer.toString(dateUtil.getIDutilizator()));
        users_combo_adrese.setValue(Integer.toString(dateUtil.getIDadresa()));
        users_txb_username.setText(dateUtil.getUsername());
        users_txb_password.setText(dateUtil.getParola());
        users_txb_tipUtiliz.setText(dateUtil.getTipUtilizator());
    }
    
    public void addUtilizatori(){
        String insertData = "INSERT INTO utilizatori (IDadresa, username, parola, tipUtilizator) VALUES (?,?,?,?)";
        connect = database.connectDB();
        
        try{
            Alert alert;
            if(users_combo_adrese.getSelectionModel().getSelectedItem() == null ||  
                    users_txb_username.getText().isEmpty() || 
                    users_txb_password.getText().isEmpty() || users_txb_tipUtiliz.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();   
            }
            
            else {
                String checkData = "SELECT username FROM utilizatori WHERE username = '" + users_txb_username.getText() + "'";
                
                statement = connect.createStatement();
                result = statement.executeQuery(checkData);
                
                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Utilizatorul " + users_txb_username.getText() + " deja exista!");
                }
                else{
                    
                    prepare = connect.prepareStatement(insertData);
                    
                    prepare.setString(1, (String) users_combo_adrese.getSelectionModel().getSelectedItem());
                    prepare.setString(2, users_txb_username.getText());
                    prepare.setString(3,users_txb_password.getText());
                    prepare.setString(4,users_txb_tipUtiliz.getText());
                    prepare.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();
                    
                    utilizatoriCurentiShowListData();
                    clearUtilizatori();
                }
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void clearUtilizatori(){
        users_txb_id.setText("");
        users_combo_adrese.getSelectionModel().clearSelection();
        users_txb_username.setText("");
        users_txb_password.setText("");
        users_txb_tipUtiliz.setText("");
    }
    
    public void updateUtilizatori(){
        String updateData = "UPDATE utilizatori SET IDadresa = '" + users_combo_adrese.getSelectionModel().getSelectedItem() 
                + "', username = '" + users_txb_username.getText() + "', parola = '" 
                + users_txb_password.getText() + "', tipUtilizator '" + users_txb_tipUtiliz.getText() 
                + "' WHERE IDutilizator = '" + users_txb_id.getText() + "'";
        connect = database.connectDB();

        try {
            Alert alert;
            if(users_combo_adrese.getSelectionModel().getSelectedItem() == null ||  
                    users_txb_username.getText().isEmpty() || 
                    users_txb_password.getText().isEmpty() || users_txb_tipUtiliz.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();   
            }
            else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE row with ID " + users_txb_id.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    utilizatoriCurentiShowListData();
                    clearUtilizatori();
                } 
                else {
                    return;
                }
            }
        }catch(SQLException e) {}
    }
    
    public void deleteUtilizatori(){
        String deleteData = "DELETE FROM utilizatori WHERE IDutilizator = '" + users_txb_id.getText() + "'";

        connect = database.connectDB();
        try {
            Alert alert;

            if (users_txb_id.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields to delete (id field)");
                alert.showAndWait();
            } 
            else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE row with ID" + users_txb_id.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(deleteData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();
                } 
                else {
                    return;
                }
            }
        } catch (SQLException e) {}
    }
    
    //profesori================================================================================================
    
    public ObservableList<dateProfesori> profesoriListData(){
        ObservableList<dateProfesori> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM profesori";
        
        connect = database.connectDB();
        try{
            dateProfesori dateP;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            while(result.next()){
                dateP = new dateProfesori(result.getInt("IDprofesor"),result.getInt("IDutilizator"),
                        result.getString("numeProfesor"),result.getInt("varsta"),
                        result.getString("sex"),result.getInt("salariu"));
                listData.add(dateP);
            }
            
        } catch(SQLException e){}
        return listData;
    }
    
    private ObservableList<dateProfesori> profesoriCurenti;
    
    public void profesoriCurentiShowListData(){
        profesoriCurenti = profesoriListData();
        
        profesor_tableView_id.setCellValueFactory(new PropertyValueFactory<dateProfesori, Integer>("IDprofesor"));
        profesor_tableView_idUtiliz.setCellValueFactory(new PropertyValueFactory<dateProfesori, Integer>("IDutilizator"));
        profesor_tableView_nume.setCellValueFactory(new PropertyValueFactory<>("numeProfesor"));
        profesor_tableView_varsta.setCellValueFactory(new PropertyValueFactory<>("varsta"));
        profesor_tableView_sex.setCellValueFactory(new PropertyValueFactory<>("sex"));
        profesor_tableView_salariu.setCellValueFactory(new PropertyValueFactory<>("salariu"));
        
        profesor_tableView.setItems(profesoriCurenti);
    }
    
    public void profesoriUtilizatoriList(){
        String listU = "SELECT IDutilizator FROM utilizatori";
        connect = database.connectDB();
        try {
            ObservableList listUtil = FXCollections.observableArrayList();
            
            prepare = connect.prepareStatement(listU);
            result = prepare.executeQuery();

            while (result.next()) {
                listUtil.add(result.getInt("IDutilizator"));
            }
            profesor_combo_idUtil.setItems(listUtil);

        } catch (SQLException e) {}
    }
    
    public void profesoriCurentiSelect(){
        dateProfesori dateProf = profesor_tableView.getSelectionModel().getSelectedItem();
        int num = profesor_tableView.getSelectionModel().getSelectedIndex();
        
        if((num -1) < -1){
            return;
        }
        profesor_txb_id.setText(Integer.toString(dateProf.getIDprofesor()));
        profesor_combo_idUtil.setValue(Integer.toString(dateProf.getIDutilizator()));
        profesor_txb_nume.setText(dateProf.getNumeProfesor());
        profesor_txb_varsta.setText(Integer.toString(dateProf.getVarsta()));
        profesor_txb_sex.setText(dateProf.getSex());
        profesor_txb_salariu.setText(Integer.toString(dateProf.getSalariu()));
    }
    
    public void addProfesori(){
        String insertData = "INSERT INTO profesori (IDutilizator, numeProfesor, varsta, sex, salariu) VALUES (?,?,?,?,?)";
        connect = database.connectDB();
        
        try{
            Alert alert;
            if(profesor_combo_idUtil.getSelectionModel().getSelectedItem() == null ||  
                    profesor_txb_nume.getText().isEmpty() || 
                    profesor_txb_varsta.getText().isEmpty() || 
                    profesor_txb_sex.getText().isEmpty() || 
                    profesor_txb_salariu.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();   
            }
            
            else {
                String checkData = "SELECT numeProfesor FROM profesori WHERE numeProfesor = '" + profesor_txb_nume.getText() + "'";
                
                statement = connect.createStatement();
                result = statement.executeQuery(checkData);
                
                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Profesorul " + profesor_txb_nume.getText() + " deja exista!");
                }
                else{
                    
                    prepare = connect.prepareStatement(insertData);
                    
                    prepare.setString(1, (String) profesor_combo_idUtil.getSelectionModel().getSelectedItem());
                    prepare.setString(2, profesor_txb_nume.getText());
                    prepare.setString(3, profesor_txb_varsta.getText());
                    prepare.setString(4, profesor_txb_sex.getText());
                    prepare.setString(5, profesor_txb_salariu.getText());
                    prepare.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();
                    
                    profesoriCurentiShowListData();
                    clearProfesori();
                }
            }
        } catch(SQLException e){}
    }
    
    public void clearProfesori(){
        profesor_txb_id.setText("");
        profesor_combo_idUtil.getSelectionModel().clearSelection();
        profesor_txb_nume.setText("");
        profesor_txb_varsta.setText("");
        profesor_txb_sex.setText("");
        profesor_txb_salariu.setText("");
    }
    
    public void updateProfesori(){
        String updateData = "UPDATE profesori SET IDutilizator = '" + profesor_combo_idUtil.getSelectionModel().getSelectedItem() 
                + "', numeProfesor = '" + profesor_txb_nume.getText() + "', varsta = '" 
                + profesor_txb_varsta.getText() + "', sex '" + profesor_txb_sex.getText() + "', salariu '" + profesor_txb_salariu.getText() 
                + "' WHERE IDprofesor = '" + profesor_txb_id.getText() + "'";
        connect = database.connectDB();

        try {
            Alert alert;
            if(profesor_combo_idUtil.getSelectionModel().getSelectedItem() == null ||  
                    profesor_txb_nume.getText().isEmpty() || 
                    profesor_txb_varsta.getText().isEmpty() || 
                    profesor_txb_sex.getText().isEmpty() || 
                    profesor_txb_salariu.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();   
            }
            else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE row with ID " + profesor_txb_id.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    profesoriCurentiShowListData();
                    clearProfesori();
                } 
                else {
                    return;
                }
            }
        }catch(SQLException e) {}
    }
    
    public void deleteProfesori(){
        String deleteData = "DELETE FROM profesori WHERE IDprofesor = '" + profesor_txb_id.getText() + "'";

        connect = database.connectDB();
        try {
            Alert alert;

            if (profesor_txb_id.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields to delete (id field)");
                alert.showAndWait();
            } 
            else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE row with ID" + profesor_txb_id.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(deleteData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();
                } 
                else {
                    return;
                }
            }
        } catch (SQLException e) {}
    }
    
    //studenti=================================================================================================
    
    public ObservableList<dateStudenti> addStudentListData() {
        ObservableList<dateStudenti> listaStudenti = FXCollections.observableArrayList();

        String sql = "SELECT * FROM studenti";
        connect = database.connectDB();

        try {
            dateStudenti id_student;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                id_student = new dateStudenti(result.getInt("IDstudent"),result.getInt("IDutilizator"),result.getInt("IDspecializare"),result.getString("numeStudent"), result.getString("prenumeStudent"),
                        result.getDate("dataNasterii"), result.getString("sex"), result.getString("cnp"),
                        result.getString("statut"), result.getString("locBugetat"), result.getString("an"),
                        result.getString("grupa"), result.getString("subgrupa"));
                listaStudenti.add(id_student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaStudenti;
    }

    private ObservableList<dateStudenti> addStudentListD;

    public void addStudentShowListData() {
        addStudentListD = addStudentListData();
        
        studenti_tableView_idStud.setCellValueFactory(new PropertyValueFactory<dateStudenti, Integer>("IDstudent"));
        studenti_tableView_idUtiliz.setCellValueFactory(new PropertyValueFactory<dateStudenti, Integer>("IDutilizator"));
        studenti_tableView_idSpec.setCellValueFactory(new PropertyValueFactory<dateStudenti, Integer>("IDspecializare"));
        studenti_tableView_nume.setCellValueFactory(new PropertyValueFactory<>("numeStudent"));
        studenti_tableView_prenume.setCellValueFactory(new PropertyValueFactory<>("prenumeStudent"));
        studenti_tableView_dataNasterii.setCellValueFactory(new PropertyValueFactory<>("dataNasterii"));
        studenti_tableView_sex.setCellValueFactory(new PropertyValueFactory<>("sex"));
        studenti_tableView_cnp.setCellValueFactory(new PropertyValueFactory<>("cnp"));
        studenti_tableView_statut.setCellValueFactory(new PropertyValueFactory<>("statut"));
        studenti_tableView_locBuget.setCellValueFactory(new PropertyValueFactory<>("locBugetat"));
        studenti_tableView_an.setCellValueFactory(new PropertyValueFactory<>("an"));
        studenti_tableView_grupa.setCellValueFactory(new PropertyValueFactory<>("grupa"));
        studenti_tableView_subgrupa.setCellValueFactory(new PropertyValueFactory<>("subgrupa"));

        studenti_tableView.setItems(addStudentListD);
    }
    
    public void studentiUtilizatoriList(){
        String listU = "SELECT IDutilizator FROM utilizatori";
        connect = database.connectDB();
        try {
            ObservableList listUtil = FXCollections.observableArrayList();
            
            prepare = connect.prepareStatement(listU);
            result = prepare.executeQuery();

            while (result.next()) {
                listUtil.add(result.getInt("IDutilizator"));
            }
            studenti_combo_idUtil.setItems(listUtil);

        } catch (SQLException e) {}
    }
    
    public void studentiSpecializariList(){
        String listS = "SELECT IDspecializare FROM specializari";
        connect = database.connectDB();
        try {
            ObservableList listSpec = FXCollections.observableArrayList();
            
            prepare = connect.prepareStatement(listS);
            result = prepare.executeQuery();

            while (result.next()) {
                listSpec.add(result.getInt("IDspecializare"));
            }
            studenti_combo_idSpec.setItems(listSpec);

        } catch (SQLException e) {}
    }

    public void addStudentsSelect() {
        dateStudenti dateStud = studenti_tableView.getSelectionModel().getSelectedItem();
        int num = studenti_tableView.getSelectionModel().getSelectedIndex();
        if ((num - 1) < -1) {
            return;
        }
        studenti_txb_idStudent.setText(Integer.toString(dateStud.getIDstudent()));
        studenti_combo_idUtil.setValue(Integer.toString(dateStud.getIDutilizator()));
        studenti_combo_idSpec.setValue(Integer.toString(dateStud.getIDspecializare()));
        studenti_combo_an.setValue(dateStud.getAn());
        studenti_combo_grupa.setValue(dateStud.getGrupa());
        studenti_combo_subgrupa.setValue(dateStud.getSubgrupa());
        studenti_combo_statut.setValue(dateStud.getStatut());
        studenti_combo_locBuget.setValue(dateStud.getLocBugetat());
        studenti_combo_sex.setValue(dateStud.getSex());
        studenti_txb_cnp.setText(dateStud.getCnp());
        studenti_dataNastere.setValue(LocalDate.parse(String.valueOf(dateStud.getDataNasterii())));
        studenti_txb_nume.setText(String.valueOf(dateStud.getNumeStudent()));
        studenti_txb_prenume.setText(String.valueOf(dateStud.getPrenumeStudent()));
    }
    
    public void addStudenti(){
        String insertData = "INSERT INTO studenti (IDutilizator, IDspecializare, numeStudent, prenumeStudent, dataNasterii, sex, cnp, statut, locBugetat, an, grupa, subgrupa) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        connect = database.connectDB();
        
        try{
            Alert alert;
            if(studenti_combo_idUtil.getSelectionModel().getSelectedItem() == null ||  
                    studenti_dataNastere.getValue() == null || 
                    studenti_txb_cnp.getText().isEmpty() || 
                    studenti_txb_nume.getText().isEmpty() || 
                    studenti_txb_prenume.getText().isEmpty() || 
                    studenti_combo_idUtil.getSelectionModel().getSelectedItem() == null || 
                    studenti_combo_idSpec.getSelectionModel().getSelectedItem() == null || 
                    studenti_combo_an.getSelectionModel().getSelectedItem() == null || 
                    studenti_combo_grupa.getSelectionModel().getSelectedItem() == null || 
                    studenti_combo_subgrupa.getSelectionModel().getSelectedItem() == null || 
                    studenti_combo_statut.getSelectionModel().getSelectedItem() == null || 
                    studenti_combo_locBuget.getSelectionModel().getSelectedItem() == null || 
                    studenti_combo_sex.getSelectionModel().getSelectedItem() == null){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();   
            }
            else {
                String checkData = "SELECT numeStudent FROM studenti WHERE numeStudent = '" + studenti_txb_nume.getText() + "'";
                
                statement = connect.createStatement();
                result = statement.executeQuery(checkData);
                
                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Studentul " + studenti_txb_nume.getText() + " deja exista!");
                }
                else{
                    
                    prepare = connect.prepareStatement(insertData);
                    
                    prepare.setString(1, (String) studenti_combo_idUtil.getSelectionModel().getSelectedItem());
                    prepare.setString(2, (String) studenti_combo_idSpec.getSelectionModel().getSelectedItem());
                    prepare.setString(3, studenti_txb_nume.getText());
                    prepare.setString(4, studenti_txb_prenume.getText());
                    prepare.setString(5, String.valueOf(studenti_dataNastere.getValue()));
                    //prepare.setString(6, studenti_combo_sex.getText());
                    prepare.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();
                    
                    profesoriCurentiShowListData();
                    clearProfesori();
                }
            }
        } catch(SQLException e){}
    }

    private final String[] yearList = {"Anul 1", "Anul 2", "Anul 3"};

    public void addStudentsYearList() {
        ArrayList<String> listaAn = new ArrayList<>();
        listaAn.addAll(Arrays.asList(yearList));

        ObservableList oblist = FXCollections.observableArrayList(listaAn);
        studenti_combo_an.setItems(oblist);
    }

    private final String[] statusList = {"Inmatriculat", "Absolvent"};

    public void addStudentsStatusList() {
        ArrayList<String> listaStatut = new ArrayList<>();
        listaStatut.addAll(Arrays.asList(statusList));
        ObservableList oblist = FXCollections.observableArrayList(listaStatut);
        studenti_combo_statut.setItems(oblist);
    }

    private final String[] genderlist = {"M", "F"};

    public void addStudentsGenderList() {
        ArrayList<String> listaSex = new ArrayList<>();
        listaSex.addAll(Arrays.asList(genderlist));

        ObservableList oblist = FXCollections.observableArrayList(listaSex);
        studenti_combo_sex.setItems(oblist);
    }

    private final String[] groupList = {"1", "2", "3", "4", "5", "6", "7"};

    public void addStudentsGroupList() {
        ArrayList<String> listaGrupe = new ArrayList<>();
        listaGrupe.addAll(Arrays.asList(groupList));

        ObservableList oblist = FXCollections.observableArrayList(listaGrupe);
        studenti_combo_grupa.setItems(oblist);
    }

    private final String[] subgroupList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public void addStudentsSubGroupList() {
        ArrayList<String> listaSubgrupe = new ArrayList<>();
        listaSubgrupe.addAll(Arrays.asList(subgroupList));

        ObservableList oblist = FXCollections.observableArrayList(listaSubgrupe);
        studenti_combo_subgrupa.setItems(oblist);
    }

    private final String[] listaBuget = {"1", "0"};

    public void addStudentsBugetList() {
        ArrayList<String> listBuget = new ArrayList<>();
        listBuget.addAll(Arrays.asList(listaBuget));

        ObservableList oblist = FXCollections.observableArrayList(listBuget);
        studenti_combo_locBuget.setItems(oblist);
    }
    
    //functii de sistem =======================================================================================

    public void logout() {
        try {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to log out?");

            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {

                btn_signOut.getScene().getWindow().hide();

                Parent root = FXMLLoader.load(getClass().getResource("login_form.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);

                root.setOnMousePressed((MouseEvent event) -> {
                    x = event.getSceneX();
                    y = event.getSceneY();
                    stage.setOpacity(.8);
                });

                root.setOnMouseDragged((MouseEvent event) -> {
                    stage.setX(event.getScreenX() - x);
                    stage.setY(event.getScreenY() - y);
                });

                scene.setOnMouseReleased(event -> {
                    stage.setOpacity(1);
                });

                stage.initStyle(StageStyle.TRANSPARENT);

                stage.setScene(scene);
                stage.show();
            } else {
                return;
            }

        } catch (IOException e) {}
    }

    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void minimize(ActionEvent event) {
        Stage stage = (Stage) main_form.getScene().getWindow();
        stage.setIconified(true);
    }

    public void switchForm(ActionEvent event) {
        if (event.getSource() == btn_home) {
            home_form.setVisible(true);
            adrese_form.setVisible(false);
            student_form.setVisible(false);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(false);
            user_form.setVisible(false);

            btn_home.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3);");
            btn_adrese.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == btn_adrese) {
            home_form.setVisible(false);
            adrese_form.setVisible(true);
            student_form.setVisible(false);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(false);
            user_form.setVisible(false);

            btn_home.setStyle("-fx-background-color:transparent");
            btn_adrese.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3)");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:transparent");
            
            adreseDisponibileShowListData();

        } else if (event.getSource() == btn_student) {
            home_form.setVisible(false);
            adrese_form.setVisible(false);
            student_form.setVisible(true);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(false);
            user_form.setVisible(false);

            btn_home.setStyle("-fx-background-color:transparent");
            btn_adrese.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3)");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:transparent");

            addStudentShowListData();
            addStudentsGenderList();
            addStudentsGroupList();
            addStudentsSubGroupList();
            addStudentsBugetList();
            addStudentsStatusList();
            addStudentsYearList();
            studentiUtilizatoriList();
            studentiSpecializariList();
            
        } else if (event.getSource() == btn_prof) {
            home_form.setVisible(false);
            adrese_form.setVisible(false);
            student_form.setVisible(false);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(true);
            alocareOre_form.setVisible(false);
            user_form.setVisible(false);

            btn_home.setStyle("-fx-background-color:transparent");
            btn_adrese.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3)");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:transparent");
            
            profesoriCurentiShowListData();
            profesoriUtilizatoriList();

        } else if (event.getSource() == btn_materie) {
            home_form.setVisible(false);
            adrese_form.setVisible(false);
            student_form.setVisible(false);
            materie_form.setVisible(true);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(false);
            user_form.setVisible(false);

            btn_home.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_adrese.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3)");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == btn_fac_spec) {
            home_form.setVisible(false);
            adrese_form.setVisible(false);
            student_form.setVisible(false);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(true);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(false);
            user_form.setVisible(false);

            btn_home.setStyle("-fx-background-color:transparent");
            btn_adrese.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3)");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:transparent");
            
            facultatiDisponibileShowListData();
            specializariDisponibileShowListData();
            specializariFacultatiList();

        } else if (event.getSource() == btn_editAlocareCursuri) {
            home_form.setVisible(false);
            adrese_form.setVisible(false);
            student_form.setVisible(false);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(true);
            user_form.setVisible(false);

            btn_home.setStyle("-fx-background-color:transparent");
            btn_adrese.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3)");
            btn_editUsers.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == btn_editUsers) {
            home_form.setVisible(false);
            adrese_form.setVisible(false);
            student_form.setVisible(false);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(false);
            user_form.setVisible(true);

            btn_home.setStyle("-fx-background-color:transparent");
            btn_adrese.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3);");
            
            utilizatoriCurentiShowListData();
            utilizatoriAdreseList();
        }
    }

    public void initialize(URL location, ResourceBundle resources) {
        addStudentShowListData();
        addStudentsYearList();
        addStudentsGenderList();
        addStudentsGroupList();
        addStudentsSubGroupList();
        addStudentsBugetList();
        addStudentsStatusList();
        facultatiDisponibileShowListData();
        specializariDisponibileShowListData();
        specializariFacultatiList();
        adreseDisponibileShowListData();
        utilizatoriAdreseList();
        utilizatoriCurentiShowListData();
        profesoriCurentiShowListData();
        profesoriUtilizatoriList();
    }
}