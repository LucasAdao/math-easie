package gui;



import com.ete.matheasie.application.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TabuadaDivController {
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
		Main.changeScreen("tabuadaDiv1");
		
	}
	public void onBtnDoisAction() {
		Main.changeScreen("tabuadaDiv2");
		}
	public void onBtnTresAction() {
		Main.changeScreen("tabuadaDiv3");
		}
	public void onBtnQuatroAction() {
		Main.changeScreen("tabuadaDiv4");
		}
	public void onBtnCincoAction() {
		Main.changeScreen("tabuadaDiv5");
	}
	public void onBtnSeisAction() {
		Main.changeScreen("tabuadaDiv6");
		}
	public void onBtnSeteAction() {
		Main.changeScreen("tabuadaDiv7");
		}
	public void onBtnOitoAction() {
		Main.changeScreen("tabuadaDiv8");
		}
	public void onBtnNoveAction() {
		Main.changeScreen("tabuadaDiv9");
		}
	public void onBtnBackAction() {
		Main.changeScreen("tabuadaOpcao");
	}
}
