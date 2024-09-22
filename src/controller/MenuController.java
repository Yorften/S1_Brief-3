package controller;

import util.IO;
import view.interfaces.View;
import view.menu.MainMenu;

public class MenuController {
    private View mainMenu = new MainMenu();
    private ProjectController projectController = new ProjectController();
    private boolean isRunning = true;

    public void startMainMenu() {
        while (isRunning) {
            IO.clear();
            int choice = mainMenu.display();
            handleChoice(choice);
        }
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1:
                projectController.addProjectUI();
                break;
            case 2:
                projectController.startProjectMenu();
                break;
            case 3:
                System.out.println("Calculate costs");
                mainMenu.back();
                break;
            case 4:
                isRunning = false;
                System.out.println("Exiting...");
                break;
            default:
                break;
        }
    }

}
