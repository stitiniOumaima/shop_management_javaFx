package com.software.shop.base.controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainCtrl extends Application {
	private Stage primaryStage;
	private static BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Shop Management Software");
		showMainView();
	}
private void showMainView() throws IOException {
	FXMLLoader fxmlLoader = new FXMLLoader();
	fxmlLoader.setLocation(MainCtrl.class.getResource("../MainView.fxml"));
	mainLayout = fxmlLoader.load();
	Scene scene = new Scene(mainLayout);
	primaryStage.setScene(scene);
	primaryStage.show();
}
public static void showUsers() throws IOException {
	FXMLLoader fxmlLoader = new FXMLLoader();
	fxmlLoader.setLocation(MainCtrl.class.getResource("../../user/view/userView.fxml"));
	BorderPane rolePane = fxmlLoader.load();
	mainLayout.setCenter(rolePane);
}
	public static void main(String[] args) {
		launch(args);
	}
}
