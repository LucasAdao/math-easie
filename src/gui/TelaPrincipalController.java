package gui;

import com.ete.matheasie.application.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaPrincipalController {
	@FXML
	private Button geometriaChange;
	@FXML
	private Button calculadoraChange;
	@FXML
	private Button tabuadaChange;
	
	public void onBtnGeometriaChangeAction() {
		Main.changeScreen("geometria");
	}
	public void onBtnCalculadoraChangeAction() {
		Main.changeScreen("calculadora");
	}
	public void onBtnTabuadaChangeAction() {
		Main.changeScreen("tabuadaOpcao");
	}
	
}
