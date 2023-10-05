package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Buttons.Button;
import DesignPatterns.Factory.Components.Buttons.IosButton;
import DesignPatterns.Factory.Components.Dropdowns.Dropdown;
import DesignPatterns.Factory.Components.Dropdowns.IosDropdown;
import DesignPatterns.Factory.Components.Menus.IosMenu;
import DesignPatterns.Factory.Components.Menus.Menu;

public class IosUiFactory implements UiFactory{

    @Override
    public IosButton createButton() {
        System.out.println("Created an iOS button");
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosDropdown createDropdown() {
        return new IosDropdown();
    }
}
