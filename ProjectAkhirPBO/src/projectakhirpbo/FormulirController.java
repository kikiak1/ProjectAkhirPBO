package projectakhirpbo;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

public class FormulirController implements Initializable {
    DataModeller dm;
    
    @FXML
    private TextField tfIdNI;

    @FXML
    private TextField tfNamaNI;

    @FXML
    private TextField tfAlamatNI;

    @FXML
    private TextField tfNikI;

    @FXML
    private TextField tfNpwpI;

    @FXML
    private TextField tfNoRekI;

    @FXML
    private TextField tfSaldoI;

    @FXML
    private Button btnTambahNI;

    @FXML
    private Button btnMuatUlangDataI;

    @FXML
    private Button btnHapusDataI;

    @FXML
    private Label lblStatusI;

    @FXML
    private TableView<Individu> tblNasabahI;

    @FXML
    private TableColumn<Individu, Integer> colIdNasabahI;

    @FXML
    private TableColumn<Individu, String> colNamaI;

    @FXML
    private TableColumn<Individu, String> colAlamatI;

    @FXML
    private TableColumn<Individu, String> colNikI;

    @FXML
    private TableColumn<Individu, String> colNpwpI;

    @FXML
    private TableView<Rekening> tblRekI;

    @FXML
    private TableColumn<Rekening, Integer> colNoRekI;

    @FXML
    private TableColumn<Rekening, Double> colSaldoI;

    @FXML
    private AnchorPane fieldNewRekI;

    @FXML
    private TextField tfNewIdNI;

    @FXML
    private TextField tfNewNoRekI;

    @FXML
    private TextField tfNewSaldoI;

    @FXML
    private Button btnTambahRekI;

    @FXML
    private TextField tfIdNP;

    @FXML
    private TextField tfNamaP;

    @FXML
    private TextField tfAlamatP;

    @FXML
    private TextField tfNibP;

    @FXML
    private TextField tfNoRekP;

    @FXML
    private TextField tfSaldoP;

    @FXML
    private Button btnTambahNP;

    @FXML
    private Button btnMuatUlangDataP;

    @FXML
    private Button btnHapusDataP;

    @FXML
    private Label lblStatusP;

    @FXML
    private TableView<Perusahaan> tblNP;

    @FXML
    private TableColumn<Perusahaan, Integer> colIdNP;

    @FXML
    private TableColumn<Perusahaan, String> colNamaP;

    @FXML
    private TableColumn<Perusahaan, String> colAlamatP;

    @FXML
    private TableColumn<Perusahaan, String> colNibP;

    @FXML
    private TableView<Rekening> tblRekP;

    @FXML
    private TableColumn<Rekening, Integer> colNoRekP;

    @FXML
    private TableColumn<Rekening, Double> colSaldoP;

    @FXML
    private AnchorPane fieldNewRekP;

    @FXML
    private TextField tfNewIdNP;

    @FXML
    private TextField tfNewNoRekP;

    @FXML
    private TextField tfNewSaldoP;

    @FXML
    private Button btnTambahRekP;

    @FXML
    private TextField tfSearchIdNTbh;

    @FXML
    private Button btnSearchIdNTbh;

    @FXML
    private TextField tfIdNTbh;

    @FXML
    private TextField tfNoRekTbh;

    @FXML
    private TextField tfSaldoTbh;

    @FXML
    private Button btnTambahSaldo;

    @FXML
    private Button btnHapusDataTbh;

    @FXML
    private Label lblStatusTambahS;

    @FXML
    private TableView<Rekening> tblRekTbh;

    @FXML
    private TableColumn<Rekening, Integer> colNoRekTbh;

    @FXML
    private TableColumn<Rekening, Double> colSaldoTbh;

    @FXML
    private TextField tfSearchIdNTrk;

    @FXML
    private Button btnSearchIdNTrk;

    @FXML
    private TextField tfIdNTrk;

    @FXML
    private TextField tfNoRekTrk;

    @FXML
    private TextField tfSaldoTrk;

    @FXML
    private Button btnTarikSaldo;

    @FXML
    private Button btnHapusDataTrk;

    @FXML
    private Label lblStatusTarikS;

    @FXML
    private TableView<Rekening> tblRekTrk;

    @FXML
    private TableColumn<Rekening, Integer> colNoRekTrk;

    @FXML
    private TableColumn<Rekening, Double> colSaldoTrk;

    @FXML
    void handleHapusIBtn(ActionEvent event) {
        try {
            tfIdNI.setText(""+dm.nextNasabahID());
            tfNoRekI.setText(tfIdNI.getText()+"01");
            tfNamaNI.setText("");
            tfAlamatNI.setText("");
            tfNikI.setText("");
            tfNpwpI.setText("");
            tfSaldoI.setText("");
            tblRekI.setItems(null);
            tfNewIdNI.setText("");
            fieldNewRekI.setVisible(false);
            btnTambahNI.setDisable(true);
            tfNewSaldoI.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(FormulirController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void handleHapusPBtn(ActionEvent event) {
        try {
            tfIdNP.setText(""+dm.nextNasabahID());
            tfNoRekP.setText(tfIdNP.getText()+"01");
            tfNamaP.setText("");
            tfAlamatP.setText("");
            tfNibP.setText("");
            tfSaldoP.setText("");
            tblRekP.setItems(null);
            fieldNewRekP.setVisible(false);
            btnTambahNP.setDisable(true);
            tfNewSaldoP.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(FormulirController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void handleHapusTbhBtn(ActionEvent event) {
        tfSearchIdNTbh.setText("");
        tfIdNTbh.setText("");
        tfNoRekTbh.setText("");
        tfSaldoTbh.setText("");
        btnTambahSaldo.setDisable(true);
        tblRekTbh.setItems(null);
    }

    @FXML
    void handleHapusTrkBtn(ActionEvent event) {
        tfSearchIdNTrk.setText("");
        tfIdNTrk.setText("");
        tfNoRekTrk.setText("");
        tfSaldoTrk.setText("");
        btnTarikSaldo.setDisable(true);
        tblRekTrk.setItems(null);
    }

    @FXML
    void handleMuatUlangIBtn(ActionEvent event) {
        ObservableList<Individu> data = dm.getIndividu();
        colIdNasabahI.setCellValueFactory(new PropertyValueFactory<>("nasabahID"));
        colNamaI.setCellValueFactory(new PropertyValueFactory<>("nama"));
        colAlamatI.setCellValueFactory(new PropertyValueFactory<>("alamat"));
        colNikI.setCellValueFactory(new PropertyValueFactory<>("nik"));
        colNpwpI.setCellValueFactory(new PropertyValueFactory<>("npwp"));
        tblNasabahI.setItems(null);
        tblNasabahI.setItems(data);
        fieldNewRekI.setVisible(false);
        btnTambahNI.setDisable(false);
    }

    @FXML
    void handleMuatUlangPBtn(ActionEvent event) {
        ObservableList<Perusahaan> data = dm.getPerusahaan();
        colIdNP.setCellValueFactory(new PropertyValueFactory<>("nasabahID"));
        colNamaP.setCellValueFactory(new PropertyValueFactory<>("nama"));
        colAlamatP.setCellValueFactory(new PropertyValueFactory<>("alamat"));
        colNibP.setCellValueFactory(new PropertyValueFactory<>("nib"));
        tblNP.setItems(null);
        tblNP.setItems(data);
        fieldNewRekP.setVisible(false);
        btnTambahNP.setDisable(false);
    }

    @FXML
    void handleSearchIdNTbhBtn(ActionEvent event) {
        tfIdNTbh.setText("");
        tfNoRekTbh.setText("");
        tfSaldoTbh.setText("");
        btnTambahSaldo.setDisable(true);
        tblRekTbh.setItems(null);
        viewDataRekeningTambahSaldo(Integer.parseInt(tfSearchIdNTbh.getText()));
    }

    @FXML
    void handleSearchIdNTrkBtn(ActionEvent event) {
        tfIdNTrk.setText("");
        tfNoRekTrk.setText("");
        tfSaldoTrk.setText("");
        btnTarikSaldo.setDisable(true);
        tblRekTrk.setItems(null);
        viewDataRekeningTarikSaldo(Integer.parseInt(tfSearchIdNTrk.getText()));
    }

    @FXML
    void handleTambahNIBtn(ActionEvent event) {
        Individu nb = new Individu(tfNikI.getText(), tfNpwpI.getText(), 
                        Integer.parseInt(tfIdNI.getText()), tfNamaNI.getText(), 
                        tfAlamatNI.getText(), new Rekening(Integer.parseInt(tfNoRekI.getText()), 
                        Double.parseDouble(tfSaldoI.getText())));
        try {
            dm.addNasabah(nb);
            btnMuatUlangDataI.fire();
            btnHapusDataI.fire();
            btnMuatUlangDataP.fire();
        } catch (SQLException ex) {
            Logger.getLogger(FormulirController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void handleTambahNPBtn(ActionEvent event) {
        Perusahaan nb = new Perusahaan(tfNibP.getText(), 
                Integer.parseInt(tfIdNP.getText()), tfNamaP.getText(),
                tfAlamatP.getText(), new Rekening(Integer.parseInt(tfNoRekP.getText()),
                        Double.parseDouble(tfSaldoP.getText())));
        try {
            dm.addNasabah(nb);
            btnMuatUlangDataP.fire();
            btnHapusDataP.fire();
            btnMuatUlangDataI.fire();
        } catch (SQLException ex) {
            Logger.getLogger(FormulirController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void handleTambahRekIBtn(ActionEvent event) {
        try {
            Rekening rek = new Rekening(Integer.parseInt(tfNewNoRekI.getText()),
                            Double.parseDouble(tfNewSaldoI.getText()));
            dm.addRekening(Integer.parseInt(tfNewIdNI.getText()),rek);
            viewDataRekeningIndividu(Integer.parseInt(tfNewIdNI.getText()));
            btnMuatUlangDataI.fire();
            tfNewSaldoI.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(FormulirController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void handleTambahRekPBtn(ActionEvent event) {
        try {
            Rekening rek = new Rekening(Integer.parseInt(tfNewNoRekP.getText()),
                        Double.parseDouble(tfNewSaldoP.getText()));
            dm.addRekening(Integer.parseInt(tfNewIdNP.getText()), rek);
            viewDataRekeningPerusahaan(Integer.parseInt(tfNewIdNP.getText()));
            btnMuatUlangDataP.fire();
            tfNewSaldoP.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(FormulirController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void handleTambahSaldoBtn(ActionEvent event) {
        Rekening rek = tblRekTbh.getSelectionModel().getSelectedItem();
        try {
             dm.updateSaldo(rek.getNoRekening(), Double.parseDouble(tfSaldoTbh.getText())<=0?rek.getSaldo():rek.getSaldo()+Double.parseDouble(tfSaldoTbh.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(FormulirController.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnHapusDataTbh.fire();
    }

    @FXML
    void handleTarikSaldoBtn(ActionEvent event) {
        Rekening rek = tblRekTrk.getSelectionModel().getSelectedItem();
        try {
             dm.updateSaldo(rek.getNoRekening(), rek.getSaldo()-Double.parseDouble(tfSaldoTrk.getText())<=0
                     ?rek.getSaldo():rek.getSaldo()-Double.parseDouble(tfSaldoTrk.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(FormulirController.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnHapusDataTrk.fire();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        try {
            dm = new DataModeller("MYSQL");
            setStatus(dm.conn!=null?"Terkoneksi":"");
            tfIdNI.setText(Integer.toString(dm.nextNasabahID()));
            tfNoRekI.setText(Integer.toString(dm.nextNasabahID())+"01");
            fieldNewRekI.setVisible(false);
            btnHapusDataI.fire();
            btnMuatUlangDataI.fire();
            
            tfIdNP.setText(Integer.toString(dm.nextNasabahID()));
            tfNoRekP.setText(Integer.toString(dm.nextNasabahID())+"01");
            fieldNewRekP.setVisible(false);
            btnHapusDataP.fire();
            btnMuatUlangDataP.fire();
            
            btnTambahSaldo.setDisable(true);
            btnTarikSaldo.setDisable(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(FormulirController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tblNasabahI.getSelectionModel().selectedIndexProperty().addListener(listener->{
            if (tblNasabahI.getSelectionModel().getSelectedItem()!=null){
                Individu nb = tblNasabahI.getSelectionModel().getSelectedItem();
                viewDataRekeningIndividu(nb.getNasabahID());
                fieldNewRekI.setVisible(true);
                btnTambahNI.setDisable(true);
                tfNewIdNI.setText(""+nb.getNasabahID());
                try {
                    tfNewNoRekI.setText(""+dm.nextNomorRekening(nb.getNasabahID()));
                } catch (SQLException ex) {
                    Logger.getLogger(FormulirController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        tblNP.getSelectionModel().selectedIndexProperty().addListener(listener->{
            if (tblNP.getSelectionModel().getSelectedItem()!=null){
                Perusahaan nb = tblNP.getSelectionModel().getSelectedItem();
                viewDataRekeningPerusahaan(nb.getNasabahID());
                fieldNewRekP.setVisible(true);
                btnTambahNP.setDisable(true);
                tfNewIdNP.setText(""+nb.getNasabahID());
                try {
                    tfNewNoRekP.setText(""+dm.nextNomorRekening(nb.getNasabahID()));
                } catch (SQLException ex) {
                    Logger.getLogger(FormulirController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        tblRekTbh.getSelectionModel().selectedIndexProperty().addListener(listener->{
            if (tblRekTbh.getSelectionModel().getSelectedItem()!=null){
                Rekening rek = tblRekTbh.getSelectionModel().getSelectedItem();
                tfNoRekTbh.setText(""+rek.getNoRekening());
                tfIdNTbh.setText(tfSearchIdNTbh.getText());
                btnTambahSaldo.setDisable(false);
            }
        });
        
        tblRekTrk.getSelectionModel().selectedIndexProperty().addListener(listener->{
            if (tblRekTrk.getSelectionModel().getSelectedItem()!=null){
                Rekening rek = tblRekTrk.getSelectionModel().getSelectedItem();
                tfNoRekTrk.setText(""+rek.getNoRekening());
                tfIdNTrk.setText(tfSearchIdNTrk.getText());
                btnTarikSaldo.setDisable(false);
            }
        });
    }
    
    public void viewDataRekeningTambahSaldo(int nasabahID){
        ObservableList<Rekening> data = dm.getRekening(nasabahID);
        colNoRekTbh.setCellValueFactory(new PropertyValueFactory<>("noRekening"));
        colSaldoTbh.setCellValueFactory(new PropertyValueFactory<>("saldo"));
        tblRekTbh.setItems(null);
        tblRekTbh.setItems(data);
    }
    
    public void viewDataRekeningTarikSaldo(int nasabahID){
        ObservableList<Rekening> data = dm.getRekening(nasabahID);
        colNoRekTrk.setCellValueFactory(new PropertyValueFactory<>("noRekening"));
        colSaldoTrk.setCellValueFactory(new PropertyValueFactory<>("saldo"));
        tblRekTrk.setItems(null);
        tblRekTrk.setItems(data);
    }
    
    public void viewDataRekeningIndividu(int nasabahID){
        ObservableList<Rekening> data = dm.getRekening(nasabahID);
        colNoRekI.setCellValueFactory(new PropertyValueFactory<>("noRekening"));
        colSaldoI.setCellValueFactory(new PropertyValueFactory<>("saldo"));
        tblRekI.setItems(null);
        tblRekI.setItems(data);
    }
    
    public void viewDataRekeningPerusahaan(int nasabahID){
        ObservableList<Rekening> data = dm.getRekening(nasabahID);
        colNoRekP.setCellValueFactory(new PropertyValueFactory<>("noRekening"));
        colSaldoP.setCellValueFactory(new PropertyValueFactory<>("saldo"));
        tblRekP.setItems(null);
        tblRekP.setItems(data);
    }
    
    public void setStatus(String ss){
        lblStatusI.setText(ss);
        lblStatusP.setText(ss);
        lblStatusTambahS.setText(ss);
        lblStatusTarikS.setText(ss);
    }
    
}