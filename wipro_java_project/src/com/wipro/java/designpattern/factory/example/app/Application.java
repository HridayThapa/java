package com.wipro.java.designpattern.factory.example.app;
import com.wipro.java.designpattern.factory.example.buttons.Button;
import com.wipro.java.designpattern.factory.example.checkboxes.Checkbox;
import com.wipro.java.designpattern.factory.example.factories.GUIFactory;
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
