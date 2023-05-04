module com.kuetu.smartcampus {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kuetu.smartcampus to javafx.fxml;
    exports com.kuetu.smartcampus;
}