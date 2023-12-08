module eu.telecomnancy.boggleFX{
    requires javafx.controls;
    requires javafx.fxml;


    opens eu.telecomnancy.boggleFX to javafx.fxml;
    exports eu.telecomnancy.boggleFX;
}
