package application;
	
import java.util.Date;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;



public class Main extends Application 
{
	double total=0;
	TextArea clock;
	@Override
	public void start(Stage primaryStage) 
	{
		try {
			primaryStage.setTitle("Expedia");
			primaryStage.setWidth(809);
			primaryStage.setHeight(600);
	        
	        TextArea ta = new TextArea();
	        ta.setEditable(false);
	        ta.setPrefWidth(50);
	        ta.setPrefHeight(100);
	        
	        TextArea ta2= new TextArea();
	        ta2.setEditable(false);   
	        ta2.setStyle("-fx-font-weight: bold");
	        ta2.setPrefWidth(200);
	        ta2.setPrefHeight(100);
	        
	        clock = new TextArea();
	        clock.setEditable(false);
	        clock.setPrefHeight(30);   
	        clock.setPrefWidth(900);
	        
	        //body
	        Label startLoc        = new Label(" Starting Location: ");
			TextField num1TF   = new TextField();
			Label endLoc        = new Label(" Ending Location: ");
			TextField num2TF   = new TextField();
			Label answerL      = new Label("Answer : ");
			TextField answerTF = new TextField();
			
			Button findTimes = new Button("Find Times");
			findTimes.setOnAction(new EventHandler<ActionEvent>()
	        {
	            @Override public void handle(ActionEvent e)
	            {
	            	 
	            }
	        });
			
			//Image Buttons (Just going to be lying around for now)
			Label reccLabel        = new Label("Recommendations: ");
			
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
			
			Image tokyoPic = new Image("https://rimage.gnst.jp/livejapan.com/public/article/detail/a/00/02/a0002533/img/basic/a0002533_main.jpg");
			ImageView imageTokyo = new ImageView(tokyoPic);
			Button buttonTokyo = new Button ("    Tokyo    ", imageTokyo);
			imageTokyo.setFitWidth(160);
			imageTokyo.setFitHeight(160);
			buttonI3.setOnAction(new EventHandler<ActionEvent>()
	                {
	                    @Override public void handle(ActionEvent e)
	                    {
	            	        
	                    }
	                });
			Image atlantisPic = new Image("https://thumbor.forbes.com/thumbor/fit-in/1200x0/filters%3Aformat%28jpg%29/https%3A%2F%2Fblogs-images.forbes.com%2Fdavidanderson%2Ffiles%2F2018%2F12%2Fatlantis-aquaman-1200x633.jpeg");
			ImageView imageAtlantis = new ImageView(atlantisPic);
			Button buttonAtlantis = new Button ("    Atlantis    ", imageAtlantis);
			imageAtlantis.setFitWidth(160);
			imageAtlantis.setFitHeight(160);
			buttonI3.setOnAction(new EventHandler<ActionEvent>()
	                {
	                    @Override public void handle(ActionEvent e)
	                    {
	            	        
	                    }
	                });
			Image londonPic = new Image("https://www.visitbritain.com/sites/default/files/styles/consumer_hero_image_mobile/public/consumer_components_enhanced/header_image/london-skyline-vb34141642.jpg");
			ImageView imageLondon = new ImageView(londonPic);
			Button buttonLondon = new Button ("    London    ", imageLondon);
			imageLondon.setFitWidth(160);
			imageLondon.setFitHeight(160);
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
			Label phone	         = new Label("\t Phone Number: ");
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
			//RB3.setToggleGroup(Payment);
			
			Image EBG = new Image("https://i.pinimg.com/originals/11/5a/b4/115ab47f78bf3fce1f070b42e69168b3.jpg");
			BackgroundImage OrangeBG = new BackgroundImage(EBG, null, null, null, null);
			
			Image EXP = new Image("https://lh3.googleusercontent.com/proxy/5qazP9aR6aFS9ry_jlpbsLp0CivmsWCwiIyGO9d8OqFW76YfopxLkkbgaSwr61V8Iak7ap3z9mHkq_P2GR3oMbe-L3BrI3oQmzXKIsqC5jhS9lKo68BNnBIiFH8");
			ImageView imageE = new ImageView(EXP);
			
			
			//Gridpane for Buttons
			GridPane gridPane = new GridPane();
			ScrollPane scr = new ScrollPane();
			gridPane.add(reccLabel,	     0, 0, 1, 1);
			gridPane.add(buttonI1,	     0, 1, 1, 1);
			gridPane.add(buttonI2,       1, 1, 1, 1); 		
			gridPane.add(buttonI3,       2, 1, 1, 1);
			gridPane.add(buttonTokyo,    0, 2, 1, 1);
			gridPane.add(buttonAtlantis, 1, 2, 1, 1); 		
			gridPane.add(buttonLondon,   2, 2, 1, 1);
			gridPane.setStyle("-fx-background-color:#eeeefe; -fx-opacity:1;");
			scr.setContent(gridPane);
			scr.setPrefViewportWidth(10);
			scr.setPrefViewportHeight(200);
			
			//Gridpane for Body
			GridPane body = new GridPane();
			body.add(startLoc,    0, 0);
			body.add(num1TF,   1, 0);
			body.add(endLoc,    3, 0);
			body.add(num2TF,   4, 0);
			//body.add(answerL,  0, 2);
			//body.add(answerTF, 1, 2);
			body.add(findTimes, 5, 0);
			//body.add(imageE, 6, 12, 1, 1);
			
			//DepartTimes
			GridPane right = new GridPane();
			Label lb1        = new Label("Depart Times:                                ");
			TextArea times = new TextArea();
	        times.setEditable(false);
	        times.setPrefHeight(300);   
	        times.setPrefWidth(30);
			times.setText("//Times will be here");
			right.add(lb1, 0, 0);
			right.add(times, 0, 1);
			
			
			BorderPane bp = new BorderPane();
		bp.setBackground(new Background(OrangeBG));
	        bp.setTop(clock);
	        bp.setCenter(body);
	        bp.setRight(right);
	        bp.setBottom(scr);
	        refreshClock();
	        
			Scene scene = new Scene(bp);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	// Clock - thread code
    private void refreshClock()
    {
    	Thread refreshClock = new Thread()
		   {  
			  public void run()
			  {	 
				while (true)
				{
					Date dte = new Date();
		
					String topMenuStr = "       " + dte.toString();					      
				    clock.setText("Expedia   			" + topMenuStr); 
			               
				    try
				    {
					   sleep(500L);
				    }
				    catch (InterruptedException e) 
				    {
					   // TODO Auto-generated catch block
					   e.printStackTrace();
				    }
				  
	            }  // end while ( true )
				 
		    } // end run thread
		 };

	     refreshClock.start();
    }
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
