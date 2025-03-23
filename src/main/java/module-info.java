module com.iub.cse.oop.spring25groupprojectdemo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iub.cse.oop.spring25groupprojectdemo1 to javafx.fxml;
    exports com.iub.cse.oop.spring25groupprojectdemo1;
}