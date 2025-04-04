module principal.calculadoraimc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens principal.calculadoraimc to javafx.fxml;
    exports principal.calculadoraimc;
}
