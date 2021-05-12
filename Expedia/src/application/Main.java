package application;
	
import java.util.Date;
import java.util.Optional;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.*;
import com.email.durgesh.Email;



public class Main extends Application 
{
	double total=0;
	TextArea clock;
	int    numOfItems=0;
	String paymentChosen = " ";
	
	@Override
	public void start(Stage primaryStage) 
	{
		try {
			primaryStage.setTitle("Expedia");
			primaryStage.setWidth(1070);
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
		
			//DepartTimes
			GridPane right = new GridPane();
			Label lb1        = new Label("Depart Times:                         "
						+ "       ");
			TextArea times = new TextArea();
		        times.setEditable(false);
		        times.setPrefHeight(300);   
		        times.setPrefWidth(30);
			times.setText("Waiting for Input");
			right.add(lb1, 0, 0);
			right.add(times, 0, 1);
	        
		
	        //body
	        Label startLoc        = new Label(" Starting Location: ");
	        startLoc.setStyle("-fx-font-weight: bold");
			//TextField startLocTF   = new TextField();
			Label endLoc        = new Label(" Ending Location: ");
			endLoc.setStyle("-fx-font-weight: bold");
			//TextField endLocTF   = new TextField();
			Label answerL      = new Label("Answer : ");
			TextField answerTF = new TextField();
			
			ComboBox<String> startLocTF = new ComboBox<String>();
			startLocTF.getItems().addAll(
				    "Miami",
				    "New York City",
				    "Los Angeles",
				    "Nairobi",
				    "Tokyo",
				    "Atlantis",
				    "London",
				    "Paris"
				);
			
			startLocTF.setEditable(true);
			
			ComboBox<String> endLocTF = new ComboBox<String>();
			endLocTF.getItems().addAll(
					"Miami",
				    "New York City",
				    "Los Angeles",
				    "Nairobi",
				    "Tokyo",
				    "Atlantis",
				    "London",
				    "Paris"
				);
			
			endLocTF.setEditable(true);
			
			Button findTimes = new Button("FIND TIMES");
			findTimes.setPrefHeight(34);
			findTimes.setStyle("-fx-font-family: Impact");
			findTimes.setOnAction(new EventHandler<ActionEvent>()
	        {
	            @Override public void handle(ActionEvent e)
	            {
	            	String strSTA = startLocTF.getValue();
	            	String strEND = endLocTF.getValue();
	            	
			times.setText("11:30 AM\n12:20 PM\n1:15 PM\n3:00 PM");
	            	//fileIO locLog = new fileIO();
	            	//locLog.writeToFile(strSTA, strEND);
	            }
	        });
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
		Label pay			 = new Label ("\t Payment Method :  Select      ");
		Label Card           = new Label ("\t Card Number : ");
		TextField CardF      = new TextField();
		Label help           = new Label("");
		
		ToggleGroup Payment = new ToggleGroup();
		RadioButton RB1 = new RadioButton("Credit\t");
		RadioButton RB2 = new RadioButton("Debit\t");
		RB1.setToggleGroup(Payment);
		RB2.setToggleGroup(Payment);
		
		Payment.selectedToggleProperty().addListener(new ChangeListener<Toggle>()  
        { 
            public void changed(ObservableValue<? extends Toggle> ob,  
                                                    Toggle o, Toggle n) 
            { 
  
                RadioButton rb = (RadioButton)Payment.getSelectedToggle(); 
  
                if (rb != null) { 
                    String s = rb.getText(); 
                    paymentChosen = s;
                    // change the label 
                    pay.setText("\t Payment Method : " + s); 
                } 
            } 
        });
		
			
			//Image Buttons (Just going to be lying around for now)
			Text reccLabel        = new Text("  Recommendations: ");
			reccLabel.setStyle("-fx-font-size: 200");
			reccLabel.setStyle("-fx-font-weight: bold");
			
			Image miamiPic = new Image("https://grist.org/wp-content/uploads/2017/08/miami.jpg");
			ImageView imageMI = new ImageView(miamiPic);
			Button buttonI1 = new Button ("    Miami    ", imageMI);
			imageMI.setFitWidth(160);
			imageMI.setFitHeight(160);
			buttonI1.setOnAction(new EventHandler<ActionEvent>()
	                {
	                    @Override public void handle(ActionEvent e)
	                    {
	            	        times.setText("7:30 AM\n1:20 PM\n3:15 PM");
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
	            	        times.setText("8:25 AM\n10:10 AM");
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
	            	        times.setText("2:15 PM\n6:00 PM");
	                    }
	                });
			Image nairobiPic = new Image("https://cdn.audleytravel.com/4082/2913/79/8003731-nairobi.jpg");
			ImageView imageNairobi = new ImageView(nairobiPic);
			Button buttonNairobi = new Button ("    Nairobi    ", imageNairobi);
			imageNairobi.setFitWidth(160);
			imageNairobi.setFitHeight(160);
			buttonI3.setOnAction(new EventHandler<ActionEvent>()
	                {
	                    @Override public void handle(ActionEvent e)
	                    {
	            	        times.setText("2:15 PM\n6:00 PM");
	                    }
	                });
			
			Image tokyoPic = new Image("https://rimage.gnst.jp/livejapan.com/public/article/detail/a/00/02/a0002533/img/basic/a0002533_main.jpg");
			ImageView imageTokyo = new ImageView(tokyoPic);
			Button buttonTokyo = new Button ("    Tokyo    ", imageTokyo);
			imageTokyo.setFitWidth(160);
			imageTokyo.setFitHeight(160);
			buttonTokyo.setOnAction(new EventHandler<ActionEvent>()
	                {
	                    @Override public void handle(ActionEvent e)
	                    {
	            	        times.setText("1:15 PM\n10:30 PM");
	                    }
	                });
			Image atlantisPic = new Image("https://thumbor.forbes.com/thumbor/fit-in/1200x0/filters%3Aformat%28jpg%29/https%3A%2F%2Fblogs-images.forbes.com%2Fdavidanderson%2Ffiles%2F2018%2F12%2Fatlantis-aquaman-1200x633.jpeg");
			ImageView imageAtlantis = new ImageView(atlantisPic);
			Button buttonAtlantis = new Button ("    Atlantis    ", imageAtlantis);
			imageAtlantis.setFitWidth(160);
			imageAtlantis.setFitHeight(160);
			buttonAtlantis.setOnAction(new EventHandler<ActionEvent>()
	                {
	                    @Override public void handle(ActionEvent e)
	                    {
	            	        times.setText("9:30 AM\n12:40 PM\n4:55 PM");
	                    }
	                });
			Image londonPic = new Image("https://www.history.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cq_auto:good%2Cw_1200/MTYyNDg1MjE3MTI1Mjc5Mzk4/topic-london-gettyimages-760251843-promo.jpg");
			ImageView imageLondon = new ImageView(londonPic);
			Button buttonLondon = new Button ("    London    ", imageLondon);
			imageLondon.setFitWidth(160);
			imageLondon.setFitHeight(160);
			buttonLondon.setOnAction(new EventHandler<ActionEvent>()
	                {
	                    @Override public void handle(ActionEvent e)
	                    {
	            	        times.setText("11:50 AM");
	                    }
	                });
			Image parisPic = new Image("https://images.adsttc.com/media/images/5d44/14fa/284d/d1fd/3a00/003d/large_jpg/eiffel-tower-in-paris-151-medium.jpg");
			ImageView imageParis = new ImageView(parisPic);
			Button buttonParis = new Button ("    Paris    ", imageParis);
			imageParis.setFitWidth(160);
			imageParis.setFitHeight(160);
			buttonLondon.setOnAction(new EventHandler<ActionEvent>()
	                {
	                    @Override public void handle(ActionEvent e)
	                    {
	            	        times.setText("11:50 AM");
	                    }
	                });
			//End of City Images
			
			Image EBG = new Image("https://i.pinimg.com/originals/dd/91/4c/dd914c6cca076f8cebb463a81e73e7e5.jpg");
			BackgroundImage OrangeBG = new BackgroundImage(EBG, null, null, null, null);
			
			Image EXP = new Image("https://lh3.googleusercontent.com/proxy/5qazP9aR6aFS9ry_jlpbsLp0CivmsWCwiIyGO9d8OqFW76YfopxLkkbgaSwr61V8Iak7ap3z9mHkq_P2GR3oMbe-L3BrI3oQmzXKIsqC5jhS9lKo68BNnBIiFH8");
			ImageView imageE = new ImageView(EXP);
			

			//Gridpane for Buttons
			BorderPane reccs = new BorderPane();
			GridPane gridPane = new GridPane();
			ScrollPane scr = new ScrollPane();
			//gridPane.add(reccLabel,	     0, 0, 1, 1);
			gridPane.add(buttonI1,	     0, 1, 1, 1);
			gridPane.add(buttonI2,       1, 1, 1, 1); 		
			gridPane.add(buttonI3,       2, 1, 1, 1);
			gridPane.add(buttonNairobi,       3, 1, 1, 1);
			gridPane.add(buttonTokyo,    0, 2, 1, 1);
			gridPane.add(buttonAtlantis, 1, 2, 1, 1); 		
			gridPane.add(buttonLondon,   2, 2, 1, 1);
			gridPane.add(buttonParis,   3, 2, 1, 1);
			gridPane.setStyle("-fx-background-color:#Ffe48b; -fx-opacity:1;");
			scr.setContent(gridPane);
			scr.setPrefViewportWidth(10);
			scr.setPrefViewportHeight(200);
			reccs.setTop(reccLabel);
			reccs.setBottom(scr);
			
			// Gridpane for contact info
			GridPane contact = new GridPane();
						
			contact.add(name, 		     0, 0, 1, 1);
			contact.add(nameF, 	     1, 0, 1, 1);
			contact.add(nameERR,        2, 0, 1, 1);
		    contact.add(email, 	     0, 2, 1, 1);
			contact.add(emailF, 	     1, 2, 1, 1);
			contact.add(emailERR, 	     2, 2, 1, 1);
			contact.add(blank, 	     0, 3, 1, 1);
			contact.add(help,           1, 3, 1, 1);
			contact.add(pay,            0, 3, 1, 1);
			contact.add(Card,           0, 6, 1, 1);
			contact.add(CardF,          1, 6, 1, 1);
			contact.add(RB1, 1, 4, 1, 1);
			contact.add(RB2, 1, 5, 1, 1);
			
			
			Button submitButton    = new Button("SUBMIT");     
	        submitButton.setOnAction(new EventHandler<ActionEvent>() 
	        {
	            @Override public void handle(ActionEvent e)
	            {
	            	
	            	Platform.runLater(new Runnable() 
					 {
					        public void run() 
					        {
					        	if (nameF.getText().isEmpty() || startLocTF.getValue()== null || endLocTF.getValue()== null || emailF.getText().isEmpty() 
					        			|| CardF.getText().isEmpty()) {
					        		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
							           
							           alert.setTitle("Incomplete Data");
							           if(startLocTF.getValue() == null) {
							        	   alert.setHeaderText("Starting Location Cannot Be Empty");
								           alert.setContentText("Please fill in your starting location.");
							           }
							           else if(nameF.getText().isEmpty()) {
								           alert.setHeaderText("Name Field Cannot Be Empty");
								           alert.setContentText("Please fill in your name.");
							           }
							           else if(endLocTF.getValue() == null) {
							        	   alert.setHeaderText("Ending Location Cannot Be Empty");
								           alert.setContentText("Please fill in your desired ending location.");
							           }
							           else if(emailF.getText().isEmpty()) {
							        	   alert.setHeaderText("Email Field Cannot Be Empty");
								           alert.setContentText("Please fill in your email address.");
							           }
							           else if(CardF.getText().isEmpty()) {
							        	   alert.setHeaderText("Card Field Cannot Be Empty");
								           alert.setContentText("Please fill in your card number.");
							           }
							           Optional<ButtonType> result = alert.showAndWait();
							           
							           if (result.get() == ButtonType.OK)
							           {
								         
							           }
							           else 
							           {
							               // ... user chose CANCEL or closed the dialog
							           }
					        	}
					        	
					            	
					        	else {
					        	String rs=null;
					            socketUtils su = new socketUtils();
					            
					            if (su.socketConnect() == true) //this always seems to be false for whatever reason
					            {
					            	String strDouble = String.format("%.2f", total);
					            	String msg = "Transaction>kiosk#001" + "," + numOfItems + "," + strDouble;
	            	                su.sendMessage(msg);				            	
	            	                String ackOrNack = su.recvMessage();
	            	                
	            	                String msg1 = "Name: " + nameF.getText();
	            	                su.sendMessage(msg1);
	            	                msg1 = "Starting Location: "+ startLocTF.getValue();
	            	                su.sendMessage(msg1);
	            	                msg1 = "Ending Location: "+ endLocTF.getValue();
	            	                su.sendMessage(msg1);
	            	                msg1 = "Email: " + emailF.getText();
	            	                su.sendMessage(msg1);
	            	                msg1 = "Payment Method: "+ paymentChosen;
	            	                su.sendMessage(msg1);
	            	                msg1 = "Card #: "+ CardF.getText();
	            	                su.sendMessage(msg1);
	            	                
	            	                
	            	                msg = "quit";
	            	                su.sendMessage(msg);
	            	                rs = su.recvMessage();
	            	                
	            	                System.out.println("Sending email to " + emailF.getText());
	            	                
	            	                try{
	            	                	Email email = new Email("tanvirthrowaway@gmail.com", "JavaFx@67");
	            	                	email.setFrom("tanvirthrowaway@gmail.com", "Expedia SE Project");
	            	                	email.setSubject("Test");
	            	                	email.setContent("<h1>Thank You For Your Expedia Purchase!</h1>"
	            	                			+ "<p>"
	            	                			+ "Starting Location: "+ startLocTF.getValue() 
	            	                			+ "<br>" + "Ending Location: "+ endLocTF.getValue()
	            	                			+ "<br>" + "Email: " + emailF.getText()
	            	                			+ "<br> Card #: "+ CardF.getText()
	            	                			+ "</p>", "text/html");
	            	                	email.addRecipient(emailF.getText());
	            	                	email.send();
	            	                	}
	            	                catch (Exception e) {
	            	            		e.printStackTrace();
	            	            		}
	            	                
	            	                
	            	                //
	            	                // close the socket connection
	            	                //
	            	                su.closeSocket();
	            	                
	            	                // 
	            	                // write to transaction log
	            	                //
	            	                msg = "CLIENT : Transaction>kiosk#001" + "," + numOfItems + "," + strDouble;
	            	                fileIO trans = new fileIO();
	            	                trans.wrTransactionData(msg);
	            	                
	            	                
	            	                // initialize variables back to zero
	            	                total=0.0;
	            	                numOfItems=0;        
	            	                
	            	                ta.setText("");
	            	                ta2.setText("");
	            	                
	            	                if (ackOrNack.startsWith("ACK") == true)
	            	                {
	            	                	ta2.setText("Success!    Message was received and processed by the Socket Server!");
	            	                }
	            	                else
	            	                {
	            	                   ta2.setText("RECV : " + ackOrNack);
	            	                   ta2.appendText(rs);
	            	                }
					            }
					            else
					            {
					            	// 
	            	                // write to transaction log
	            	                //
					            	String strDouble = String.format("%.2f", total);
	            	                String msg = "CLIENT NETWORK ERROR : Transaction>kiosk#001" + "," + numOfItems + "," + strDouble;
	            	                
	            	                fileIO trans = new fileIO();
	            	                trans.wrTransactionData(msg);
	            	                
	            	                
					            	Alert alert = new Alert(Alert.AlertType.ERROR);
							        alert.setTitle("--- Network Communications Error ---");
							        alert.setHeaderText("Unable to talk to Socket Server!");
							          
							        alert.showAndWait();
					            }
					        	}
					        }
					    });	
	            }
	          
	        });
			
			//Gridpane for payment
	        contact.add(submitButton, 1, 7, 1, 1);
			contact.setVgap(5);
			
			//Gridpane for Body
			GridPane body = new GridPane();
			body.add(startLoc,    0, 0);
			body.add(startLocTF,   1, 0);
			body.add(endLoc,    3, 0);
			body.add(endLocTF,   4, 0);
			//body.add(answerL,  0, 2);
			//body.add(answerTF, 1, 2);
			body.add(findTimes, 5, 0);
			//body.add(imageE, 6, 12, 1, 1);
			body.add(contact, 1, 1);

			
			
			
			BorderPane bp = new BorderPane();
		bp.setBackground(new Background(OrangeBG));
	        bp.setTop(clock);
	        bp.setCenter(body);
	        bp.setRight(right);
	        bp.setBottom(reccs);
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
