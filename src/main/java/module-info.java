module com.iub.cse.oop.spring25groupprojectdemo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iub.cse.oop.spring25groupprojectdemo1 to javafx.fxml;
    exports com.iub.cse.oop.spring25groupprojectdemo1;
    exports com.iub.cse.oop.spring25groupprojectdemo1.mahmood;
    opens com.iub.cse.oop.spring25groupprojectdemo1.mahmood to javafx.fxml;
    exports com.iub.cse.oop.spring25groupprojectdemo1.asif;
    opens com.iub.cse.oop.spring25groupprojectdemo1.asif to javafx.fxml;
}