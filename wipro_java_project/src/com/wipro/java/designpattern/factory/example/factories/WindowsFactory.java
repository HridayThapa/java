package com.wipro.java.designpattern.factory.example.factories;
import com.wipro.java.designpattern.factory.example.buttons.Button;
import com.wipro.java.designpattern.factory.example.buttons.WindowsButton;
import com.wipro.java.designpattern.factory.example.checkboxes.Checkbox;
import com.wipro.java.designpattern.factory.example.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}