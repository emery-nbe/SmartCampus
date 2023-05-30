module com.kuetu.smartcampus {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires org.hibernate.commons.annotations;
    requires org.hibernate.orm.core;


    opens com.kuetu.smartcampus to javafx.fxml;
    exports com.kuetu.smartcampus;
}