package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Buttons.Button;
import DesignPatterns.Factory.Components.Dropdowns.Dropdown;
import DesignPatterns.Factory.Components.Menus.Menu;

public interface UiFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();

}
