package gui;

import com.ete.matheasie.application.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TabuadaOpcaoController {
	@FXML
	private Button btnSomaChange;
	@FXML
	private Button btnSubChange;
	@FXML
	private Button btnDivChange;
	@FXML
	private Button btnMultChange;
	@FXML
	private Button btnBack;
	
	
	@FXML
	public void onBtnSomaChangeAction() {
		Main.changeScreen("tabuadaSum");
	}
	@FXML
	public void onBtnSubChangeAction() {
		Main.changeScreen("tabuadaSub");
	}
	@FXML
	public void onBtnDivChangeAction() {
		Main.changeScreen("tabuadaDiv");
	}
	@FXML
	public void onBtnMultChangeAction() {
		Main.changeScreen("tabuadaMult");
	}
	@FXML
	public void onBtnBackAction() {
		Main.changeScreen("main");
	}
}
