/* A13009956 Andrew Ettensohn
 * This program allows the user to control a circle, changing the properties
 * Pesduocode:
 * Create box
 * Place buttons on box
 * Create circle
 * set actions for buttons
 * create actions for circle
 * place object in scene
 * 
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Panel extends Application {
	private CirclePane circlePane = new CirclePane();

	@Override
	public void start(Stage primaryStage) {
		
		// Create hbox and buttons
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		hBox.getChildren().addAll(btEnlarge, btShrink, btUp, btDown, btLeft,btRight); //add to scene
		
		// Set actions to buttons
		btEnlarge.setOnAction(new EnlargeHandler());
		btShrink.setOnAction(new ShrinkHandler());
		btUp.setOnAction(new UpHandler());
		btDown.setOnAction(new DownHandler());
	    btLeft.setOnAction(new LeftHandler());
	    btRight.setOnAction(new RightHandler());
		
	    // Create border pane
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
	
		// create scene and place border pane in screne
		Scene scene = new Scene(borderPane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		}
	// Start event handelrs
	class EnlargeHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			circlePane.enlarge();
		
			}
		}
	class ShrinkHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			circlePane.shrink();
		}
	}
	
	class UpHandler implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
			circlePane.up();
			}
		}
	class DownHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
				circlePane.down();
				}
			}
	class LeftHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
				circlePane.left();
				}
			}
	class RightHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
				circlePane.right();
				}
		// End event handlers
	}

class CirclePane extends StackPane {
	private Circle circle = new Circle(200, 200, 50);
	
	public CirclePane() {
		//set properties for circle
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		circle.setManaged(false);
	}
	//Method that recreates the circle with a larger radius
	public void enlarge() {
		if (circle.getRadius()  + circle.getCenterX() == 400 || circle.getCenterY()  + circle.getRadius() == 400 || circle.getCenterY() - circle.getRadius() == 0 || circle.getCenterX() - circle.getRadius() == 0)   {
		circle.setRadius(circle.getRadius() + 0);
		} else {
				circle.setRadius(circle.getRadius() + 2);
			}
		}
	//Method that shrinks circle
	public void shrink() {
			circle.setRadius(circle.getRadius() > 2 ?
					circle.getRadius() - 2 : circle.getRadius());
			
		
	}
	// Method that moves circle up
	public void up() {
		int sceneTop = 50;
		
			if (circle.getCenterY()  == sceneTop) {
			circle.setCenterY(circle.getCenterY() - 0);
			} else {
				if (circle.getCenterY() != sceneTop) {
					circle.setCenterY(circle.getCenterY() - 10);
			}
		}
	}
	// Method that moves circle down
	public void down() {
		int sceneBottom = 350;
		if (circle.getCenterY()  == sceneBottom) {
			circle.setCenterY(circle.getCenterY() - 0);
			} else {
				if (circle.getCenterY() != sceneBottom) {
					circle.setCenterY(circle.getCenterY() + 10);
				}
			}
		}
	// Method that moves circle to the left
	public void left() {
		int sceneLeft = 50;
		if (circle.getCenterX()  == sceneLeft) {
			circle.setCenterX(circle.getCenterX() - 0);
			} else {
				if (circle.getCenterX() != sceneLeft) {
					circle.setCenterX(circle.getCenterX() - 10);
				}
			}
		}
	// Method that moves circle right
	public void right() {
		int sceneRight = 350;
		if (circle.getCenterX()  == sceneRight) {
			circle.setCenterX(circle.getCenterX() - 0);
			} else {
				if (circle.getCenterX() != sceneRight) {
					circle.setCenterX(circle.getCenterX() + 10);
				}
			}
		}
	}
}//End main class




