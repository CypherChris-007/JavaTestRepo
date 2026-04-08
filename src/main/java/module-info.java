module edu.utsa.cs3443.demojava {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.utsa.cs3443.demojava to javafx.fxml;
    exports edu.utsa.cs3443.demojava;
}