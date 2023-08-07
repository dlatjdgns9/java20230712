package pkg13Database;

import pkg13Database.controller.MainController;
import pkg13Database.ui.LoginFrm;

public class Main {
    public static void main(String[] args) {
//    MainController mc1 = new MainController();
//    MainController mc2 = new MainController();
//    MainController mc1 = MainController.getInstance();
//    MainController mc2 = MainController.getInstance();
//
//    System.out.println(mc1);
//    System.out.println(mc2);

        MainController.getInstance().getControll("", null);
    }
}