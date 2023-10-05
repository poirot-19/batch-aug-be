package DesignPatterns.Factory.Components.Buttons;

public class AndroidButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("Changed size of Android button");
    }
}
