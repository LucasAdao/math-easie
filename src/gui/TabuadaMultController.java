package gui;


import com.ete.matheasie.application.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TabuadaMultController {
	@FXML
	private Button btnUm;
	@FXML
	private Button btnDois;
	@FXML
	private Button btnTres;
	@FXML
	private Button btnQuatro;
	@FXML
	private Button btnCinco;
	@FXML
	private Button btnSeis;
	@FXML
	private Button btnSete;
	@FXML
	private Button btnOito;
	@FXML
	private Button btnNove;
	@FXML
	private Button btnBack;
	
	public void onBtnUmAction() {
		Main.changeScreen("tabuadaMult1");
	}
	public void onBtnDoisAction() {
		Main.changeScreen("tabuadaMult2");
		}
	public void onBtnTresAction() {
		Main.changeScreen("tabuadaMult3");
		}
	public void onBtnQuatroAction() {
		Main.changeScreen("tabuadaMult4");
		}
	public void onBtnCincoAction() {
		Main.changeScreen("tabuadaMult5");
		}
	public void onBtnSeisAction() {
		Main.changeScreen("tabuadaMult6");
		}
	public void onBtnSeteAction() {
		Main.changeScreen("tabuadaMult7");
		}
	public void onBtnOitoAction() {
		Main.changeScreen("tabuadaMult8");
		}
	public void onBtnNoveAction() {
		Main.changeScreen("tabuadaMult9");
		}
	public void onBtnBackAction() {
		Main.changeScreen("tabuadaOpcao");}
}
