package factory;

import element.Button;
import element.Text;

public interface Factory {

    Button createButton();

    Text createText();
}
