package com.ete.matheasie.application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Stage stage;
	private static Scene mainScene;
	private static Scene geometria;
	private static Scene tabuadaOpcao;
	private static Scene tabuadaSub;
	private static Scene tabuadaSum;
	private static Scene tabuadaDiv;
	private static Scene tabuadaMult;
	private static Scene calculadora;
	private static Scene tabuadaSub1;
	private static Scene tabuadaSub2;
	private static Scene tabuadaSub3;
	private static Scene tabuadaSub4;
	private static Scene tabuadaSub5;
	private static Scene tabuadaSub6;
	private static Scene tabuadaSub7;
	private static Scene tabuadaSub8;
	private static Scene tabuadaSub9;
	private static Scene tabuadaSoma1;
	private static Scene tabuadaSoma2;
	private static Scene tabuadaSoma3;
	private static Scene tabuadaSoma4;
	private static Scene tabuadaSoma5;
	private static Scene tabuadaSoma6;
	private static Scene tabuadaSoma7;
	private static Scene tabuadaSoma8;
	private static Scene tabuadaSoma9;
	private static Scene tabuadaDiv1;
	private static Scene tabuadaDiv2;
	private static Scene tabuadaDiv3;
	private static Scene tabuadaDiv4;
	private static Scene tabuadaDiv5;
	private static Scene tabuadaDiv6;
	private static Scene tabuadaDiv7;
	private static Scene tabuadaDiv8;
	private static Scene tabuadaDiv9;
	private static Scene tabuadaMult1;
	private static Scene tabuadaMult2;
	private static Scene tabuadaMult3;
	private static Scene tabuadaMult4;
	private static Scene tabuadaMult5;
	private static Scene tabuadaMult6;
	private static Scene tabuadaMult7;
	private static Scene tabuadaMult8;
	private static Scene tabuadaMult9;
	private static Scene figureQuadrado;
	private static Scene figureTriangulo;
	private static Scene figureCirculo;
	private static Scene figureRetangulo;
	@Override
	public void start(Stage primaryStage) throws Exception{
		try {
			stage = primaryStage;
			
			
			//Main
			Parent fxmlMain = FXMLLoader.load(getClass().getResource("/gui/TelaPrincipal.fxml"));
			mainScene = new Scene(fxmlMain,1280,720);
			
			//Geometria
			Parent fxmlGeometria = FXMLLoader.load(getClass().getResource("/gui/Geometria.fxml"));
			geometria = new Scene(fxmlGeometria,1280,720);
			
			//Tabuada opcoes
			Parent fxmlTabuadaOpcao = FXMLLoader.load(getClass().getResource("/gui/TabuadaOpcao.fxml"));
			tabuadaOpcao = new Scene(fxmlTabuadaOpcao,1280,720);
			
			Parent fxmlTabuadaSum= FXMLLoader.load(getClass().getResource("/gui/TabuadaSoma.fxml"));
			tabuadaSum = new Scene(fxmlTabuadaSum,1280,720);
			
			Parent fxmlTabuadaSub = FXMLLoader.load(getClass().getResource("/gui/TabuadaSub.fxml"));
			tabuadaSub = new Scene(fxmlTabuadaSub,1280,720);
			
			Parent fxmlTabuadaDiv = FXMLLoader.load(getClass().getResource("/gui/TabuadaDiv.fxml"));
			tabuadaDiv = new Scene(fxmlTabuadaDiv,1280,720);
			
			Parent fxmlTabuadaMult= FXMLLoader.load(getClass().getResource("/gui/TabuadaMult.fxml"));
			tabuadaMult = new Scene(fxmlTabuadaMult,1280,720);
			
			//Calculadora
			Parent fxmlCalculadora = FXMLLoader.load(getClass().getResource("/gui/Calculadora.fxml"));
			calculadora = new Scene(fxmlCalculadora);
			
			//tabuada Sub
			Parent fxmlTabuadaSub1 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSub1.fxml"));
			tabuadaSub1 = new Scene(fxmlTabuadaSub1);
			
			Parent fxmlTabuadaSub2 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSub2.fxml"));
			tabuadaSub2 = new Scene(fxmlTabuadaSub2);
			
			Parent fxmlTabuadaSub3 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSub3.fxml"));
			tabuadaSub3 = new Scene(fxmlTabuadaSub3);
			
			Parent fxmlTabuadaSub4 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSub4.fxml"));
			tabuadaSub4 = new Scene(fxmlTabuadaSub4);
			
			Parent fxmlTabuadaSub5 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSub5.fxml"));
			tabuadaSub5 = new Scene(fxmlTabuadaSub5);
			
			Parent fxmlTabuadaSub6 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSub6.fxml"));
			tabuadaSub6 = new Scene(fxmlTabuadaSub6);
			
			Parent fxmlTabuadaSub7 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSub7.fxml"));
			tabuadaSub7 = new Scene(fxmlTabuadaSub7);
			
			Parent fxmlTabuadaSub8 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSub8.fxml"));
			tabuadaSub8 = new Scene(fxmlTabuadaSub8);
			
			Parent fxmlTabuadaSub9 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSub9.fxml"));
			tabuadaSub9 = new Scene(fxmlTabuadaSub9);
			
			//tabuada Soma
			Parent fxmlTabuadaSoma1 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSoma1.fxml"));
			tabuadaSoma1 = new Scene(fxmlTabuadaSoma1);
			
			Parent fxmlTabuadaSoma2 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSoma2.fxml"));
			tabuadaSoma2 = new Scene(fxmlTabuadaSoma2);
			
			Parent fxmlTabuadaSoma3 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSoma3.fxml"));
			tabuadaSoma3 = new Scene(fxmlTabuadaSoma3);
			
			Parent fxmlTabuadaSoma4 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSoma4.fxml"));
			tabuadaSoma4 = new Scene(fxmlTabuadaSoma4);
			
			Parent fxmlTabuadaSoma5 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSoma5.fxml"));
			tabuadaSoma5 = new Scene(fxmlTabuadaSoma5);
			
			Parent fxmlTabuadaSoma6 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSoma6.fxml"));
			tabuadaSoma6 = new Scene(fxmlTabuadaSoma6);
			
			Parent fxmlTabuadaSoma7 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSoma7.fxml"));
			tabuadaSoma7 = new Scene(fxmlTabuadaSoma7);
			
			Parent fxmlTabuadaSoma8 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSoma8.fxml"));
			tabuadaSoma8 = new Scene(fxmlTabuadaSoma8);
			
			Parent fxmlTabuadaSoma9 = FXMLLoader.load(getClass().getResource("/gui/TabuadaSoma9.fxml"));
			tabuadaSoma9 = new Scene(fxmlTabuadaSoma9);
			
			//tabuada DIV
			Parent fxmlTabuadaDiv1 = FXMLLoader.load(getClass().getResource("/gui/TabuadaDiv1.fxml"));
			tabuadaDiv1 = new Scene(fxmlTabuadaDiv1);
			
			Parent fxmlTabuadaDiv2 = FXMLLoader.load(getClass().getResource("/gui/TabuadaDiv2.fxml"));
			tabuadaDiv2 = new Scene(fxmlTabuadaDiv2);
			
			Parent fxmlTabuadaDiv3 = FXMLLoader.load(getClass().getResource("/gui/TabuadaDiv3.fxml"));
			tabuadaDiv3 = new Scene(fxmlTabuadaDiv3);
			
			Parent fxmlTabuadaDiv4 = FXMLLoader.load(getClass().getResource("/gui/TabuadaDiv4.fxml"));
			tabuadaDiv4 = new Scene(fxmlTabuadaDiv4);
			
			Parent fxmlTabuadaDiv5 = FXMLLoader.load(getClass().getResource("/gui/TabuadaDiv5.fxml"));
			tabuadaDiv5 = new Scene(fxmlTabuadaDiv5);
			
			Parent fxmlTabuadaDiv6 = FXMLLoader.load(getClass().getResource("/gui/TabuadaDiv6.fxml"));
			tabuadaDiv6 = new Scene(fxmlTabuadaDiv6);
			
			Parent fxmlTabuadaDiv7 = FXMLLoader.load(getClass().getResource("/gui/TabuadaDiv7.fxml"));
			tabuadaDiv7 = new Scene(fxmlTabuadaDiv7);
			
			Parent fxmlTabuadaDiv8 = FXMLLoader.load(getClass().getResource("/gui/TabuadaDiv8.fxml"));
			tabuadaDiv8 = new Scene(fxmlTabuadaDiv8);
			
			Parent fxmlTabuadaDiv9 = FXMLLoader.load(getClass().getResource("/gui/TabuadaDiv9.fxml"));
			tabuadaDiv9 = new Scene(fxmlTabuadaDiv9);
			
			//TABUADA MULT
			Parent fxmlTabuadaMult1= FXMLLoader.load(getClass().getResource("/gui/TabuadaMult1.fxml"));
			tabuadaMult1= new Scene(fxmlTabuadaMult1);
			
			Parent fxmlTabuadaMult2= FXMLLoader.load(getClass().getResource("/gui/TabuadaMult2.fxml"));
			tabuadaMult2= new Scene(fxmlTabuadaMult2);
			
			Parent fxmlTabuadaMult3= FXMLLoader.load(getClass().getResource("/gui/TabuadaMult3.fxml"));
			tabuadaMult3= new Scene(fxmlTabuadaMult3);
			
			Parent fxmlTabuadaMult4= FXMLLoader.load(getClass().getResource("/gui/TabuadaMult4.fxml"));
			tabuadaMult4= new Scene(fxmlTabuadaMult4);
			
			Parent fxmlTabuadaMult5= FXMLLoader.load(getClass().getResource("/gui/TabuadaMult5.fxml"));
			tabuadaMult5= new Scene(fxmlTabuadaMult5);
			
			Parent fxmlTabuadaMult6= FXMLLoader.load(getClass().getResource("/gui/TabuadaMult6.fxml"));
			tabuadaMult6= new Scene(fxmlTabuadaMult6);
			
			Parent fxmlTabuadaMult7= FXMLLoader.load(getClass().getResource("/gui/TabuadaMult7.fxml"));
			tabuadaMult7= new Scene(fxmlTabuadaMult7);
			
			Parent fxmlTabuadaMult8= FXMLLoader.load(getClass().getResource("/gui/TabuadaMult8.fxml"));
			tabuadaMult8= new Scene(fxmlTabuadaMult8);
			
			Parent fxmlTabuadaMult9= FXMLLoader.load(getClass().getResource("/gui/TabuadaMult9.fxml"));
			tabuadaMult9= new Scene(fxmlTabuadaMult9);
			
			//FIGURAS GEOMETRICAS
			
			Parent fxmlFigureQuadrado = FXMLLoader.load(getClass().getResource("/gui/FigureQuadrado.fxml"));
			figureQuadrado = new Scene(fxmlFigureQuadrado);
			
			Parent fxmlFigureCirculo = FXMLLoader.load(getClass().getResource("/gui/FigureCirculo.fxml"));
			figureCirculo = new Scene(fxmlFigureCirculo);
			
			Parent fxmlFigureTriangulo = FXMLLoader.load(getClass().getResource("/gui/FigureTriangulo.fxml"));
			figureTriangulo = new Scene(fxmlFigureTriangulo);
			
			Parent fxmlFigureRetangulo = FXMLLoader.load(getClass().getResource("/gui/FigureRetangulo.fxml"));
			figureRetangulo = new Scene(fxmlFigureRetangulo);
			
			primaryStage.setScene(mainScene);
			primaryStage.show();
			
			primaryStage.setTitle("Math Easie");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void changeScreen(String scr) {
		switch(scr) {
		case "calculadora":
			stage.setScene(calculadora);
			break;
		case "main":
			stage.setScene(mainScene);
			break;
		case "geometria":
			stage.setScene(geometria);
			break;
		case "tabuadaSum":
			stage.setScene(tabuadaSum);
			break;
		case "tabuadaDiv":
			stage.setScene(tabuadaDiv);
			break;
		case "tabuadaSub":
			stage.setScene(tabuadaSub);
			break;
		case "tabuadaMult":
			stage.setScene(tabuadaMult);
			break;
		case "tabuadaOpcao":
			stage.setScene(tabuadaOpcao);
			break;
		case "tabuadaSub1":
			stage.setScene(tabuadaSub1);
			break;
		case "tabuadaSub2":
			stage.setScene(tabuadaSub2);
			break;	
		case "tabuadaSub3":
			stage.setScene(tabuadaSub3);
			break;
		case "tabuadaSub4":
			stage.setScene(tabuadaSub4);
			break;	
		case "tabuadaSub5":
			stage.setScene(tabuadaSub5);
			break;	
		case "tabuadaSub6":
			stage.setScene(tabuadaSub6);
			break;	
		case "tabuadaSub7":
			stage.setScene(tabuadaSub7);
			break;	
		case "tabuadaSub8":
			stage.setScene(tabuadaSub8);
			break;	
		case "tabuadaSub9":
			stage.setScene(tabuadaSub9);
			break;	
		case "tabuadaSoma1":
			stage.setScene(tabuadaSoma1);
			break;		
		case "tabuadaSoma2":
			stage.setScene(tabuadaSoma2);
			break;	
		case "tabuadaSoma3":
			stage.setScene(tabuadaSoma3);
			break;		
		case "tabuadaSoma4":
			stage.setScene(tabuadaSoma4);
			break;		
		case "tabuadaSoma5":
			stage.setScene(tabuadaSoma5);
			break;		
		case "tabuadaSoma6":
			stage.setScene(tabuadaSoma6);
			break;		
		case "tabuadaSoma7":
			stage.setScene(tabuadaSoma7);
			break;		
		case "tabuadaSoma8":
			stage.setScene(tabuadaSoma8);
			break;		
		case "tabuadaSoma9":
			stage.setScene(tabuadaSoma9);
			break;
		case "tabuadaDiv1":
			stage.setScene(tabuadaDiv1);
			break;	
		case "tabuadaDiv2":
			stage.setScene(tabuadaDiv2);
			break;	
		case "tabuadaDiv3":
			stage.setScene(tabuadaDiv3);
			break;	
		case "tabuadaDiv4":
			stage.setScene(tabuadaDiv4);
			break;	
		case "tabuadaDiv5":
			stage.setScene(tabuadaDiv5);
			break;	
		case "tabuadaDiv6":
			stage.setScene(tabuadaDiv6);
			break;	
		case "tabuadaDiv7":
			stage.setScene(tabuadaDiv7);
			break;	
		case "tabuadaDiv8":
			stage.setScene(tabuadaDiv8);
			break;	
		case "tabuadaDiv9":
			stage.setScene(tabuadaDiv9);
			break;		
		case "tabuadaMult1":
			stage.setScene(tabuadaMult1);
			break;
		case "tabuadaMult2":
			stage.setScene(tabuadaMult2);
			break;
		case "tabuadaMult3":
			stage.setScene(tabuadaMult3);
			break;		
		case "tabuadaMult4":
			stage.setScene(tabuadaMult4);
			break;		
		case "tabuadaMult5":
			stage.setScene(tabuadaMult5);
			break;		
		case "tabuadaMult6":
			stage.setScene(tabuadaMult6);
			break;		
		case "tabuadaMult7":
			stage.setScene(tabuadaMult7);
			break;		
		case "tabuadaMult8":
			stage.setScene(tabuadaMult8);
			break;		
		case "tabuadaMult9":
			stage.setScene(tabuadaMult9);
			break;
		case "quadrado":
			stage.setScene(figureQuadrado);
			break;
		case "circulo":
			stage.setScene(figureCirculo);
			break;
		case "retangulo":
			stage.setScene(figureRetangulo);
			break;
		case "triangulo":
			stage.setScene(figureTriangulo);
			break;	
		}			
	}

	public static void main(String[] args) {
		launch(args);
	}
}
