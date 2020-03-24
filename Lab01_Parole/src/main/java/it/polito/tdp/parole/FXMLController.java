package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCanccella;
    
    private Parole p = new Parole();

    @FXML
    void doInsert(ActionEvent event) {
    	String inserisci = txtParola.getText();
    	p.addParola(inserisci);
    	String res="";
    	for(String inserisci1: p.getElenco()) {
    		res+= inserisci1+"\n";
    	}
    	txtParola.clear();
    	txtResult.setText(res);
    
    }
    @FXML
    void doSelect(MouseEvent event) {
     txtResult.getSelectedText();
     System.out.println(  txtResult.getSelectedText());
   
    }
    
    
    @FXML
    void doCancella(ActionEvent event) {
    	String s1= txtResult.getSelectedText(); //s1 è la parola selezionata
    	String res1=""; 
    	  p.resetonly1(s1); //cancello s1
    	for(String s2: p.getElenco()) {
    		res1+= s2+"\n";
    		//salvo nomi della lista in res1
    		
    	}
    	 
    	  txtResult.setText(res1);
    	  System.out.println(s1);
    	
   
    }
    
   

    @FXML
    void doReset(ActionEvent event) {
    	
    	txtResult.clear();
    	p.reset();
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCanccella != null : "fx:id=\"btnCanccella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco = new Parole() ;
    }
}
