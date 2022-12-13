package gui;


import com.ete.matheasie.application.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GeometriaController {
	@FXML 
	private Button btnQuadrado;
	@FXML 
	private Button btnTrianIso;
	@FXML 
	private Button btnTrianEqui;
	@FXML 
	private Button btnTrapezio;
	@FXML 
	private Button btnCirculo;
	@FXML 
	private Button btnRetangulo;
	@FXML 
	private Button btnBack;
	
	@FXML
	public void onBtnBackAction() {
		Main.changeScreen("main");
	}
	@FXML
	public void onBtnQuadradoAction() {
		Main.changeScreen("quadrado");
	}
	@FXML
	public void onBtnCirculoAction() {
		Main.changeScreen("circulo");
	}
	
	@FXML
	public void onBtnTrianEquiAction() {
		Main.changeScreen("triangulo");
	}
	@FXML
	public void onBtnRetanguloAction() {
		Main.changeScreen("retangulo");
	}
	
	
}
