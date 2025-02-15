package com.wipro.java.designpattern.factory.example.factories;
import com.wipro.java.designpattern.factory.example.buttons.Button;
import com.wipro.java.designpattern.factory.example.buttons.MacOSButton;
import com.wipro.java.designpattern.factory.example.checkboxes.Checkbox;
import com.wipro.java.designpattern.factory.example.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}