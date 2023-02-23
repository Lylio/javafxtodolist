module com.lylechristine.javafxtodolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lylechristine.javafxtodolist to javafx.fxml;
    exports com.lylechristine.javafxtodolist;
}