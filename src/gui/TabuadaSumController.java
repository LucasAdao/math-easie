package gui;



import com.ete.matheasie.application.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TabuadaSumController {
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
		Main.changeScreen("tabuadaSoma1");
		
	}
	public void onBtnDoisAction() {
		Main.changeScreen("tabuadaSoma2");
		}
	public void onBtnTresAction() {
		Main.changeScreen("tabuadaSoma3");
		}
	public void onBtnQuatroAction() {
		Main.changeScreen("tabuadaSoma4");
		}
	public void onBtnCincoAction() {
		Main.changeScreen("tabuadaSoma5");
		}
	public void onBtnSeisAction() {
		Main.changeScreen("tabuadaSoma6");
		}
	public void onBtnSeteAction() {
		Main.changeScreen("tabuadaSoma7");
	}
		
	public void onBtnOitoAction() {
		Main.changeScreen("tabuadaSoma8");
		}
	public void onBtnNoveAction() {
		Main.changeScreen("tabuadaSoma9");
		}
	public void onBtnBackAction() {
		Main.changeScreen("tabuadaOpcao");}
}