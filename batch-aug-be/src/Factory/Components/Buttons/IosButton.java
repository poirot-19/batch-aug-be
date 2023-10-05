package DesignPatterns.Factory.Components.Buttons;

public class IosButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("Changed size of iOS button");
    }
}
