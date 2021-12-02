module me.loule.decimaltoromannumerals {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.decimaltoromannumerals to javafx.fxml;
    exports me.loule.decimaltoromannumerals;
    exports me.loule.decimaltoromannumerals.controller;
    opens me.loule.decimaltoromannumerals.controller to javafx.fxml;
}