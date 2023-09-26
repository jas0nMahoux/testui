module fr.jmahoux.testui.testui {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.jmahoux.testui.testui to javafx.fxml;
    exports fr.jmahoux.testui.testui;
}