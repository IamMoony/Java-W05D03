package javafx.panes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane root = new BorderPane();

        root.setPadding(new Insets(15, 20, 10, 10));

        // TOP
        Button buttonTop = new Button("Button Top");
        buttonTop.setPadding(new Insets(10, 10, 20, 20));
        root.setTop(buttonTop);
        BorderPane.setMargin(buttonTop, new Insets(10, 20, 10, 15));

        // LEFT
        Button btnLeft = new Button("Left");
        btnLeft.setPadding(new Insets(5, 5, 5, 5));
        root.setLeft(btnLeft);
        // Set margin for left area.
        BorderPane.setMargin(btnLeft, new Insets(10, 10, 10, 10));

        // CENTER
        Button btnCenter = new Button("Center");
        btnCenter.setPadding(new Insets(5, 5, 5, 5));
        root.setCenter(btnCenter);
        // Alignment.
        BorderPane.setAlignment(btnCenter, Pos.BOTTOM_CENTER);

        // RIGHT
        Button btnRight = new Button("Right");
        btnRight.setPadding(new Insets(5, 5, 5, 5));
        root.setRight(btnRight);
        // Set margin for right area.
        BorderPane.setMargin(btnRight, new Insets(10, 10, 10, 10));

        // BOTTOM
        Button btnBottom = new Button("Bottom");
        btnBottom.setPadding(new Insets(5, 5, 5, 5));
        root.setBottom(btnBottom);
        // Alignment.
        BorderPane.setAlignment(btnBottom, Pos.TOP_RIGHT);

        Scene scene = new Scene(root, 550, 250);

        primaryStage.setTitle("BorderPane Layout Demo");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
