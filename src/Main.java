import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(final Stage fenster) throws Exception {
        // FXML-Datei laden
        final URL url = getClass().getResource("quadrieren.fxml");
        final FXMLLoader fxmlloader = new FXMLLoader(url);
        // Controller verbinden
        fxmlloader.setController(new View());
        // Layout laden
        final Parent root = fxmlloader.load();
        // Layout auf Fensterinhalt setzen
        fenster.setScene(new Scene(root));
        // sonstige Fenstereigenschaften
        fenster.setTitle("Titel");
        // Fenster anzeigen
        fenster.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
