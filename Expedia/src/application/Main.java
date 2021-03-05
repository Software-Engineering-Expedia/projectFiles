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
import javafx.stage.Stage;


public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		try {
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
			
			//payment method
			Label name           = new Label("\t Name : ");
			TextField nameF      = new TextField();
			Label nameERR        = new Label("");
			Lable phone	     = new Label('\t Phone Number: ");
			TextField phoneF     = new TextField();
			Label phoneERR       = new Label("");
			Label email          = new Label("\t Email : ");
			TextField emailF     = new TextField();
			Label emailERR       = new Label("");
			Label blank          = new Label ("");
			Label pay			 = new Label ("\t Payment Method : ");
			Label Card           = new Label ("\t Card Number : ");
			TextField CardF      = new TextField();
			Label help           = new Label("");
		
			ToggleGroup Payment = new ToggleGroup();
			RadioButton RB1 = new RadioButton("Credit\t");
			RadioButton RB2 = new RadioButton("Debit\t");
			RB1.setToggleGroup(Payment);
			RB2.setToggleGroup(Payment);
			RB3.setToggleGroup(Payment);
			
			
			
			//Gridpane for Buttons
			GridPane gridPane = new GridPane();
			gridPane.add(buttonI1,	   0, 0, 1, 1);
			gridPane.add(buttonI2,     1, 0, 1, 1); 		
			gridPane.add(buttonI3,     2, 0, 1, 1);
			
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(gridPane,1000,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
