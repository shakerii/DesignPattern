package factory;

import element.Button;
import element.WindowsStyleButton;
import element.Text;
import element.WindowsStyleText;

public class WindowsFactory implements Factory {

    @Override
    public Button createButton() {
        return new WindowsStyleButton();
    }

    @Override
    public Text createText() {
        return new WindowsStyleText();
    }
}

