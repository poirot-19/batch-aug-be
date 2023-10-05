package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Buttons.AndroidButton;
import DesignPatterns.Factory.Components.Buttons.Button;
import DesignPatterns.Factory.Components.Dropdowns.AndroidDorpdown;
import DesignPatterns.Factory.Components.Dropdowns.Dropdown;
import DesignPatterns.Factory.Components.Menus.AndroidMenu;
import DesignPatterns.Factory.Components.Menus.Menu;

public class AndroidUiFactory implements UiFactory{

    @Override
    public AndroidButton createButton() {
        System.out.println("Created an Android Button");
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDorpdown createDropdown() {
        return new AndroidDorpdown();
    }
}
