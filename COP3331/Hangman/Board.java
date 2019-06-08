import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
/* A13009956 This program displays a random tic tac toe board
 * Pesudocode:
 * Create pane
 * Create constraints
 * Choose either an X or an O randomly
 * Add Image
 * Add X or O to pane
 * Display the scene
 */
public class Board extends Application {
	
    public void start(Stage primaryStage) {
    
    	 //Create pane
        GridPane gridpane = new GridPane();
        	
		 // Constraints for alignment of Xs and Os
	     	ColumnConstraints column = new ColumnConstraints(40); 
	     	gridpane.getColumnConstraints().add(column);
	        RowConstraints row = new RowConstraints(50);
	        gridpane.getRowConstraints().add(row);
	       
         // Randomly choose an X or O
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				int RandomMarker = (int)(Math.random() * 3);
		
		// Access X and O images
		Image symbolX= new Image("file:/../image/x.gif");
		Image symbolO = new Image("file:/../image/o.gif");
		
		// Add an O or X depending on random number
		if (RandomMarker == 0) {
			gridpane.add(new ImageView(symbolX), x, y);
		} else if (RandomMarker == 1) {
			gridpane.add(new ImageView(symbolO), x, y);
				} //end else if
			} //end for loop
		} //end for loop
		
		// Create and display the scene
		 Scene scene = new Scene(gridpane);
		    primaryStage.setScene(scene);
		    primaryStage.setTitle("TTT");
		    primaryStage.show();
	}//end method
}//end class

