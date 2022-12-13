package gui;

import javax.swing.JOptionPane;

import com.ete.matheasie.application.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class FigureRetanguloController {
		@FXML
		private Button btnCalcularArea;
		@FXML
		private Button btnBack;
		@FXML
		private TextField txt1;
		@FXML
		private TextField txt2;
		@FXML
		private TextField txt3;
		@FXML
		private Button btnLimpar;
		
		
		double valorLado;
		double valorAltura;
		double area;
		
		public void onBtnCalcularAreaAction(){
			valorLado = Double.parseDouble(txt1.getText());
			valorAltura = Double.parseDouble(txt2.getText());
			
			area = valorAltura*valorLado;
			txt3.setText(String.valueOf(area));
		}
		public void onBtnVoltarAction() {
			Main.changeScreen("geometria");
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
		}
		@FXML
		public void keyInput(KeyEvent event) {
			
			if(event.getCharacter().matches("[^\\e\t\r\\d+$]")) {
				event.consume();
				txt1.setStyle("-fx-border-color: red");
				JOptionPane.showMessageDialog(null, "Digite apenas números");
			}else {
				txt1.setStyle("-fx-border-color: green");
			}
		}
		
		public void onBtnLimparAction() {
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
		}
		
	}

