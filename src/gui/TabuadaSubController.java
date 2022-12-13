package gui;


import com.ete.matheasie.application.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TabuadaSubController {
	@FXML
	private Button btnBack;
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
	
	public void onBtnUmAction() {
		Main.changeScreen("tabuadaSub1");
		
	}
	public void onBtnDoisAction() {
		Main.changeScreen("tabuadaSub2");
		
		}
	public void onBtnTresAction() {
		Main.changeScreen("tabuadaSub3");
		}
	public void onBtnQuatroAction() {
		Main.changeScreen("tabuadaSub4");
		}
	public void onBtnCincoAction() {
		Main.changeScreen("tabuadaSub5");
		}
	public void onBtnSeisAction() {
		Main.changeScreen("tabuadaSub6");
		}
	public void onBtnSeteAction() {
		Main.changeScreen("tabuadaSub7");
	}
		
	public void onBtnOitoAction() {
		Main.changeScreen("tabuadaSub8");
		}
	public void onBtnNoveAction() {
		Main.changeScreen("tabuadaSub9");
		}
	public void onBtnBackAction() {
		Main.changeScreen("tabuadaOpcao");}
	
}
