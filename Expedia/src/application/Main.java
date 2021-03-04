package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		//Image Buttons (Just going to be lying around for now)
		Image miamiPic = new Image("https://grist.org/wp-content/uploads/2017/08/miami.jpg");
		ImageView imageMI = new ImageView(miamiPic);
		Button buttonI1 = new Button ("    Miami    ", imageMI);
		imageMI.setFitWidth(160);
		imageMI.setFitHeight(160);
		buttonI1.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override public void handle(ActionEvent e)
                    {
            	        
                    }
                });
		
		Image nycPic = new Image("https://www.amny.com/wp-content/uploads/2020/03/GettyImages-1181858711.jpg");
		ImageView imageNY = new ImageView(nycPic);
		Button buttonI2 = new Button ("    New York City    ", imageNY);
		imageNY.setFitWidth(160);
		imageNY.setFitHeight(160);
		buttonI2.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override public void handle(ActionEvent e)
                    {
            	        
                    }
                });
		
		Image losaPic = new Image("https://thumbnails.expedia.com/vAfdSxQ45I8ksj7KXJI0nMZeS8k=/800x533/a.cdn-hotels.com/gdcs/production194/d1896/4362b070-8f10-11e8-9bad-0242ac110002.jpg");
		ImageView imageLA = new ImageView(losaPic);
		Button buttonI3 = new Button ("    Los Angeles    ", imageLA);
		imageLA.setFitWidth(160);
		imageLA.setFitHeight(160);
		buttonI3.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override public void handle(ActionEvent e)
                    {
            	        
                    }
                });
		//End of City Images
		
		
		
		//Gridpane for Buttons
		GridPane gridPane = new GridPane();
		gridPane.add(buttonI1,	   0, 0, 1, 1);
		gridPane.add(buttonI2,     1, 0, 1, 1); 		
		gridPane.add(buttonI3,     2, 0, 1, 1);
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
