package brj;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route
public class MainView extends VerticalLayout {

    public MainView() {
        Button button1 = new Button("Click me 1",
                event -> Notification.show("Clicked 1!"));
        Button button2 = new Button("Click me 2",
                event -> Notification.show("Clicked 2!"));
        add(button1);
        add(button2);
    }
}
