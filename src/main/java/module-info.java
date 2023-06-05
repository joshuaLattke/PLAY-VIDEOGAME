module com.example.tareaintegradora3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tareaintegradora3 to javafx.fxml;
    exports com.example.tareaintegradora3;
}