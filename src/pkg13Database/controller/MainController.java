package pkg13Database.controller;

import pkg13Database.ui.JoinFrm;
import pkg13Database.ui.LoginFrm;
import pkg13Database.ui.MainListFrm;

public class MainController {
    private static MainController mainController;

    private MainController() {

    }

    public static MainController getInstance() {
        if (mainController == null) { mainController = new MainController(); }
        return mainController;
    }

    public void getControll(String request) {
        if (request == null) {
            new LoginFrm();
        } else {
            if (request.equals("")) {
                new LoginFrm();
            } else if (request.equals("MainList")) {
                new MainListFrm();
            } else if (request.equals("Login")) {
                new LoginFrm();
            } else if (request.equals("Join")) {
                new JoinFrm();
            }
        }
    }
}
