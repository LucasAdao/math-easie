package gui;

import com.ete.matheasie.application.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TabSubNumController {
	@FXML
	private Button BtnBack;
	
	public void onBtnBackAction() {
		Main.changeScreen("tabuadaSub");}
}
