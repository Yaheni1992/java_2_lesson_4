module com.example.java_2_lesson_4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.java_2_lesson_4 to javafx.fxml;
    exports com.example.java_2_lesson_4;
}