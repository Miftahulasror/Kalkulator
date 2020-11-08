/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {
    
private double angkakesatu,angkakedua,hasil;
private String operasi,answer;
private int btnTitikClick;
private Label label;
@FXML
private Button nol;
 
@FXML
private Button satu;
 
@FXML
private Button titik;
 
@FXML
private Button positifnegatif;
 
@FXML
private Button tiga;
 
@FXML
private Button dua;
 
@FXML
private Button empat;
 
@FXML
private Button enam;
 
@FXML
private Button lima;
 
@FXML
private Button tujuh;
 
@FXML
private Button sembilan;
 
@FXML
private Button delapan;
 
@FXML
private Button samadengan;
 
@FXML
private Button tambah;
 
@FXML
private Button kurang;
 
@FXML
private Button kali;
 
@FXML
private Button bagi;
 
@FXML
private Button CE;
 
@FXML
private Button back;
 
 
@FXML
private Button C;
 
@FXML
private TextField Tampilan;
 
 
 
@Override
public void initialize(URL url, ResourceBundle rb) {
// TODO
}
 
@FXML
private void nol(ActionEvent event) {
String MasukanAngka = Tampilan.getText()+ nol.getText();
Tampilan.setText(MasukanAngka);
}
 
@FXML
private void satu(ActionEvent event) {
String MasukanAngka = Tampilan.getText()+ satu.getText();
Tampilan.setText(MasukanAngka);
}
 
@FXML
private void tiga(ActionEvent event) {
String MasukanAngka = Tampilan.getText()+ tiga.getText();
Tampilan.setText(MasukanAngka);
}
 
@FXML
private void dua(ActionEvent event) {
String MasukanAngka = Tampilan.getText()+ dua.getText();
Tampilan.setText(MasukanAngka);
}
 
@FXML
private void empat(ActionEvent event) {
String MasukanAngka = Tampilan.getText()+ empat.getText();
Tampilan.setText(MasukanAngka);
}
 
@FXML
private void enam(ActionEvent event) {
String MasukanAngka = Tampilan.getText()+ enam.getText();
Tampilan.setText(MasukanAngka);
}
 
@FXML
private void lima(ActionEvent event) {
String MasukanAngka = Tampilan.getText()+ lima.getText();
Tampilan.setText(MasukanAngka);
}
 
@FXML
private void tujuh(ActionEvent event) {
String MasukanAngka = Tampilan.getText()+ tujuh.getText();
Tampilan.setText(MasukanAngka);
}
 
@FXML
private void sembilan(ActionEvent event) {
String MasukanAngka = Tampilan.getText()+ sembilan.getText();
Tampilan.setText(MasukanAngka);
}
 
@FXML
private void delapan(ActionEvent event) {
String MasukanAngka = Tampilan.getText()+ delapan.getText();
Tampilan.setText(MasukanAngka);
}
 
@FXML
private void cleare(ActionEvent event) {
Tampilan.setText("");
btnTitikClick=0;
}
 
@FXML
private void back(ActionEvent event) {
String ops = String.valueOf(Tampilan.getText());
ops = ops.substring(0, ops.length()-1);
Tampilan.setText(ops);
}
 
@FXML
private void clear(ActionEvent event) {
angkakesatu=0.0;
hasil=0.0;
Tampilan.setText("");
btnTitikClick=0;
}
 
@FXML
private void samadengan(ActionEvent event) {
angkakedua =Double.parseDouble(Tampilan.getText());
    if (operasi =="+") {
        hasil = angkakesatu + angkakedua;
        answer = String.format("%,.2f", hasil);
        Tampilan.setText(answer);
    }
    else if (operasi =="-") {
        hasil = angkakesatu - angkakedua;
        answer = String.format("%,.2f", hasil);
        Tampilan.setText(answer);
    }
    else if (operasi =="*") {
        hasil = angkakesatu * angkakedua;
        answer = String.format("%,.2f", hasil);
        Tampilan.setText(answer);
    }
    else if (operasi =="÷") {
        hasil = angkakesatu / angkakedua;
        answer = String.format("%,.2f", hasil);
        Tampilan.setText(answer);
    }
    else {JOptionPane.showMessageDialog(null," Data yang anda masukan salah. Ulangi lagi!!!");
    }
}
 
@FXML
private void tambah(ActionEvent event) {
angkakesatu = Double.parseDouble(Tampilan.getText());
Tampilan.setText("");
operasi="+";
btnTitikClick=0;
}
 
@FXML
private void kurang(ActionEvent event) {
angkakesatu = Double.parseDouble(Tampilan.getText());
Tampilan.setText("");
operasi="-";
btnTitikClick=0;
}
 
@FXML
private void kali(ActionEvent event) {
angkakesatu = Double.parseDouble(Tampilan.getText());
Tampilan.setText("");
operasi="*";
btnTitikClick=0;
}
 
@FXML
private void bagi(ActionEvent event) {
angkakesatu = Double.parseDouble(Tampilan.getText());
Tampilan.setText("");
operasi="÷";
btnTitikClick=0;
}

@FXML
private void titik(ActionEvent event) {
if (btnTitikClick==0) {
Tampilan.setText(Tampilan.getText()+ titik.getText());
btnTitikClick=1;
}
}

@FXML
private void positifnegatif(ActionEvent event) {
double ops = Double.parseDouble(String.valueOf(Tampilan.getText()));
ops = ops *(-1);
Tampilan.setText(String.valueOf(ops));
btnTitikClick=0;
}
 
}
