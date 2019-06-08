/* A13009956 Andrew Ettensohn
 * This program let's the user play tic tac toe
 * Pesudocode
 * Display board and tokens
 * Create buttons that let user chose a side and exit the game
 * create cell where player can place tokens
 * Check for winner or draw
 * Display information on turns and winners to user
 * 
 * 
 */
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class TicTacToe extends Application {
	//Indicate which player has the first turn (player X)
	private char whoseTurn = ' ';
		
	// Create cell
	private Cell[][] cell = new Cell[3][3];
		
	// Create status label
	private Label lblStatus = new Label("Select Play X or Play O to begin the game! After starting simply click a cell to place an X or O.");
		
	@Override
	public void start(Stage primaryStage) {
		
		 // Create play as x and play as y buttons
		 Button xButton = new Button("Play X");
	     Button oButton = new Button("Play O");
	     Button play = new Button("New Game");
	     xButton.setStyle("-fx-font-size: 15pt;");
	     oButton.setStyle("-fx-font-size: 15pt;");
	     play.setStyle("-fx-font-size: 15pt;");
		
	     // Action for new game button
	     play.setOnAction(new EventHandler<ActionEvent>()
	    		 {
	    	 @Override
	    	 public void handle(ActionEvent e) {
	    		 Platform.exit();
	         }
	    	    });
	     
	     // Action for play as X button
	     xButton.setOnAction(new EventHandler<ActionEvent>()
	     		{
	    	 @Override
	    	 public void handle(ActionEvent e) {
	    		 whoseTurn = 'X';
	    	}
	     		});
	     
	     // Action for play as Y button
	     oButton.setOnAction(new EventHandler<ActionEvent>()
			 {
		    @Override
		    public void handle(ActionEvent e) {
		    	whoseTurn = '0';
		    }
		        });
		     
	     // Create gridpane to display cells
		GridPane pane = new GridPane();
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				pane.add(cell[i][j] = new Cell(), j, i);
		
		// borderpane to hold information label
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setTop(lblStatus);
		
		// Add button bar for play as x, play as Y, and new game
		HBox buttonBar = new HBox();
		buttonBar.setAlignment(Pos.CENTER);
	    buttonBar.setSpacing(20);
	    borderPane.setBottom(buttonBar);
	    buttonBar.getChildren().addAll(xButton, oButton, play);
		
	    // create scene aand place pane in scene
		Scene scene = new Scene(borderPane, 500, 500);
		primaryStage.setTitle("Tic Tac Toe");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		}
		// Determine if cell is occupied
		public boolean isFull() {
			for(int i = 0; i < 3; i++)
				for(int j = 0; j < 3; j++)
					if (cell[i][j].getToken() == ' ')
						return false;
			
			return true;
		}
		// Determine if a player has won
		public boolean isWon(char token) {
			for(int i = 0; i < 3; i++)
				if(cell[i][0].getToken() == token
					&& cell [i][1].getToken() == token
					&& cell [i][2].getToken()  == token) {
					return true;
				}
		
			for(int j = 0; j < 3; j++)		
				if(cell[0][j].getToken() == token
					&& cell [1][j].getToken()  == token
					&& cell [2][j].getToken()  == token) {
					return true;
				}
			
			if(cell[0][0].getToken() == token
					&& cell [1][1].getToken()  == token
					&& cell [2][2].getToken()  == token) {
					return true;
			}
			
			if(cell[0][2].getToken() == token
					&& cell [1][1].getToken()  == token
					&& cell [2][0].getToken()  == token) {
					return true;
			}
			
			return false;
	}

		
		public class Cell extends Pane {
			private char token = ' ';
			
			// Display a tic tac toe board
			public Cell() {
				setStyle("-fx-border-color: black");
				this.setPrefSize(2000, 2000);
				this.setOnMouseClicked(e -> handleMouseClick());
			}
			
			public char getToken() {
				return token;
			}
			
			public void setToken(char c) {
				token = c;
				
			// create X symbol
			if (token == 'X') {
				Line line1 = new Line(10, 10,
						this.getWidth() - 10, this.getHeight() - 10);
				line1.endXProperty().bind(this.widthProperty().subtract(10));
				line1.endYProperty().bind(this.heightProperty().subtract(10));
				Line line2 = new Line(10, this.getHeight() - 10,
						this.getWidth() -10, 10);
				line2.startYProperty().bind(
				this.heightProperty().subtract(10));
				line2.endXProperty().bind(this.widthProperty().subtract(10));
				
				this.getChildren().addAll(line1, line2);
			}
			// create O symbol
			else if (token == '0') {
				Ellipse ellipse = new Ellipse(this.getWidth() / 2,
						this.getHeight() / 2, this.getWidth() / 2 - 10,
						this.getHeight() / 2 - 10);
				ellipse.centerXProperty().bind(
					this.widthProperty().divide(2));
				ellipse.centerYProperty().bind(
					this.heightProperty().divide(2));
				ellipse.radiusXProperty().bind(
					this.widthProperty().divide(2).subtract(10));
				ellipse.radiusYProperty().bind(
					this.heightProperty().divide(2).subtract(10));
				ellipse.setStroke(Color.BLACK);
				ellipse.setFill(Color.WHITE);
				
				getChildren().add(ellipse);
			}
		}

			// Display feedback to the user
			private void handleMouseClick() {
				
				// Display who won
				if(token == ' ' && whoseTurn != ' ') {
					setToken(whoseTurn);
					
					if (isWon(whoseTurn)) {
						lblStatus.setText(whoseTurn + " won! The game is over");
						whoseTurn = ' ';
						
					}
					
					// Display if draw
					else if (isFull()) {
						lblStatus.setText("Draw! the game is over");
						whoseTurn = ' ';
					}
					// Display who's turn it is
					else {
						whoseTurn = (whoseTurn == 'X') ? '0' : 'X';
						
						lblStatus.setText(whoseTurn + "'s turn");
						
				}
			}
		}
	}
}
