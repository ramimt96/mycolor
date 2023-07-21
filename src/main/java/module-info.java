module com.example.mycolor {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.mycolor to javafx.fxml;
    exports com.example.mycolor;
}