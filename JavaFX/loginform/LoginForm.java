import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.*;

public class LoginForm extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
       primaryStage.setTitle("JavaFX Login Form");
        

        //grid
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Welcome!");
        scenetitle.setFont(Font.font("Comic Sans", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 1,0,2,1); //x,y,lenx,leny

        Label userName = new Label("Username:");
        grid.add(userName,0,1);

        TextField userTextField = new TextField();
        grid.add(userTextField,1,1);

        Label password = new Label("Password:");
        grid.add(password,0,2);
        
        PasswordField passUserField = new PasswordField();
        grid.add(passUserField,1,2);

        //Button
        Button btn = new Button("Sign up");
        HBox hb = new HBox(10);
        hb.setAlignment(Pos.BOTTOM_RIGHT);
        hb.getChildren().add(btn);
        grid.add(hb,1,3);

        final Text actiontarget = new Text("HERE");
        grid.add(actiontarget, 1,5);

        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });

        scene.getStylesheets().add(Login)

        primaryStage.show();
    }
}