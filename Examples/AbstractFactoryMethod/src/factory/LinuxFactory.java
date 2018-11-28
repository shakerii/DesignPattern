package factory;

import element.Button;
import element.LinuxStyleButton;
import element.LinuxStyleText;
import element.Text;

public class LinuxFactory implements Factory {

    @Override
    public Button createButton() {
        return new LinuxStyleButton();
    }

    @Override
    public Text createText() {
        return new LinuxStyleText();
    }
}
