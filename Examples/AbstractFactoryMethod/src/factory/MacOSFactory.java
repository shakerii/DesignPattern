package factory;

import element.Button;
import element.MacOSStyleButton;
import element.MacOSStyleText;
import element.Text;

public class MacOSFactory implements Factory {

    @Override
    public Button createButton() {
        return new MacOSStyleButton();
    }

    @Override
    public Text createText() {
        return new MacOSStyleText();
    }
}
