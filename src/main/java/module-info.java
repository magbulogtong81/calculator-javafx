module calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens calculator to javafx.fxml;
    exports calculator;
}
