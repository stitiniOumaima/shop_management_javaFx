package com.software.shop.user.controller;

import java.io.IOException;

import com.software.shop.base.controller.MainCtrl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class UserCtrl {
	  private MainCtrl MainUser;
		@FXML
		private void goTo() throws IOException {
			MainUser.showUsers();
		}

}
