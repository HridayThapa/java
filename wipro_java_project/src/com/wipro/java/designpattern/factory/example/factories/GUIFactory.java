package com.wipro.java.designpattern.factory.example.factories;
import com.wipro.java.designpattern.factory.example.buttons.Button;
import com.wipro.java.designpattern.factory.example.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}