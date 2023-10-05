package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Buttons.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.createUiFactory("Android");

        Button button = uiFactory.createButton();
        button.changeSize();

    }
}
