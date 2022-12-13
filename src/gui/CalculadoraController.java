package gui;

import com.ete.matheasie.application.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController {
	double valor1 = 0;
	double valor2 = 0;
	double resultado = 0;
	
	String operacao = "";
	
	
	@FXML
	private TextField txtField;
	@FXML
	private Button btnBack;
	@FXML
	private Button btnDiv;
	@FXML
	private Button btnMult;
	@FXML
	private Button btnSete;
	@FXML
	private Button btnOito;
	@FXML
	private Button btnNove;
	@FXML
	private Button btnSub;
	@FXML
	private Button btnQuatro;
	@FXML
	private Button btnCinco;
	@FXML
	private Button btnSeis;
	@FXML
	private Button btnSum;
	@FXML
	private Button btnUm;
	@FXML
	private Button btnDois;
	@FXML
	private Button btnTres;
	@FXML
	private Button btnResult;
	@FXML
	private Button btnClear;
	@FXML
	private Button btnZero;
	@FXML
	private Button btnPonto;
	
	@FXML
	public void onBtnUmAction() {
		txtField.setText(txtField.getText()+ "1");
	}
	@FXML
	public void onBtnDoisAction() {
		txtField.setText(txtField.getText()+ "2");
	}
	@FXML
	public void onBtnTresAction() {
		txtField.setText(txtField.getText()+ "3");
	}
	@FXML
	public void onBtnQuatroAction() {
		txtField.setText(txtField.getText()+ "4");
	}
	@FXML
	public void onBtnCincoAction() {
		txtField.setText(txtField.getText()+ "5");
	}
	@FXML
	public void onBtnSeisAction() {
		txtField.setText(txtField.getText()+ "6");
	}
	@FXML
	public void onBtnSeteAction() {
		txtField.setText(txtField.getText()+ "7");	}
	@FXML
	public void onBtnOitoAction() {
		txtField.setText(txtField.getText()+ "8");
	}
	@FXML
	public void onBtnNoveAction() {
		txtField.setText(txtField.getText()+ "9");
	}
	@FXML
	public void onBtnDivAction() {
		valor1 = Double.parseDouble(txtField.getText());
		txtField.setText("");
		operacao = "/";
	}
	@FXML
	public void onBtnMultAction() {
		valor1 = Double.parseDouble(txtField.getText());
		txtField.setText("");
		operacao = "x";
	}
	@FXML
	public void onBtnSumAction() {
		valor1 = Double.parseDouble(txtField.getText());
		txtField.setText("");
		operacao = "+";
	}
	@FXML
	public void onBtnSubAction() {
		valor1 = Double.parseDouble(txtField.getText());
		txtField.setText("");
		operacao = "-";
	}
	@FXML
	public void onBtnResultAction() {
		valor2 = Double.parseDouble(txtField.getText());
		
		switch(operacao) {
		case "+":
			resultado = valor1+valor2;
			txtField.setText(String.valueOf(resultado));
			break;
		case "-":
			resultado = valor1-valor2;
			txtField.setText(String.valueOf(resultado));
			break;
		case "x":
			resultado = valor1*valor2;
			txtField.setText(String.valueOf(resultado));
			break;
		case "/":
			resultado = valor1/valor2;
			txtField.setText(String.valueOf(resultado));
			break;
		}
		operacao = "";
		valor1 = 0;
		valor2 = 0;
	}
	@FXML
	public void onBtnZeroAction() {
		txtField.setText(txtField.getText()+ "0");
	}
	@FXML
	public void onBtnClearAction() {
		txtField.setText("");
		valor1 = 0;
		valor2 = 0;
		operacao = "";
	}
	@FXML
	public void onBtnBackAction() {
		Main.changeScreen("main");
		txtField.setText("");
	}
	
}
