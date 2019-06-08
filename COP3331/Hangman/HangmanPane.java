/* A13009956 Andrew Ettensohn
 * This program displays a drawing of the popular game hangman
 * Pesudocode:
 * Create pane and scene
 * create the stand,pole, top, rope, and stick figure body parts
 * Display scene
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class HangmanPane extends Application {
	
	public void start(Stage primaryStage) {
		
	      Pane pane = new Pane(); // Create pane
	      Scene scene = new Scene(pane,260, 250); // Create scene
	      primaryStage.setScene(scene); // Place the scene in the stage
	      primaryStage.show(); // Display the stage

		// Create stand
		Arc arc = new Arc(50, 190, 25, 25, 0, 180);
		arc.setFill(Color.TRANSPARENT);
		arc.setStroke(Color.BLACK);
		arc.setType(ArcType.OPEN);
		pane.getChildren().add(arc); //Add arc stand to scene

		// Create pole
		Line linePole = new Line();
		linePole.setStartX(50.0f);
		linePole.setStartY(165.0f);
		linePole.setEndX(50.0f);
		linePole.setEndY(20.0f);
		pane.getChildren().add(linePole); //Add pole line to scene
		
		// Create top line
		Line lineTop = new Line();
		lineTop.setStartX(50.0f);
		lineTop.setStartY(20.0f);
		lineTop.setEndX(150.0f);
		lineTop.setEndY(20.0f);
		pane.getChildren().add(lineTop); //Add top line to scene
		
		// Create rope
		Line lineRope = new Line();
		lineRope.setStartX(150.0f);
		lineRope.setStartY(20.0f);
		lineRope.setEndX(150.0f);
		lineRope.setEndY(40.0f);
		pane.getChildren().add(lineRope); //Add line rope to scene
		
		// Create Head
		Circle Head = new Circle();
		Head.setCenterX(150.0f);
		Head.setCenterY(60.0f);
		Head.setRadius(20.0f);
		Head.setStroke(Color.BLACK); 
		Head.setFill(Color.WHITE);
		pane.getChildren().add(Head); // Add circle head to scene
		
		//Create left arm
		Line lineLeftArm = new Line();
		lineLeftArm.setStartX(132.0f);
		lineLeftArm.setStartY(70.0f);
		lineLeftArm.setEndX(90.0f);
		lineLeftArm.setEndY(110.0f);
		pane.getChildren().add(lineLeftArm); //Add left arm to scene
		
		//create right arm
		Line lineRightArm = new Line();
		lineRightArm.setStartX(169.0f);
		lineRightArm.setStartY(70.0f);
		lineRightArm.setEndX(210.0f);
		lineRightArm.setEndY(109.0f);
		pane.getChildren().add(lineRightArm); //Add right arm to scene
		
		//create body
		Line lineBody = new Line();
		lineBody.setStartX(150.0f);
		lineBody.setStartY(80.0f);
		lineBody.setEndX(150.0f);
		lineBody.setEndY(140.0f);
		pane.getChildren().add(lineBody); //Add body to scene
		
		//create left leg
		Line lineLeftLeg = new Line();
		lineLeftLeg.setStartX(150.0f);
		lineLeftLeg.setStartY(140.0f);
		lineLeftLeg.setEndX(110.0f);
		lineLeftLeg.setEndY(180.0f);
		pane.getChildren().add(lineLeftLeg); //Add left leg to scene
		
		//create right leg
		Line lineRightLeg = new Line();
		lineRightLeg.setStartX(150.0f);
		lineRightLeg.setStartY(140.0f);
		lineRightLeg.setEndX(190.0f);
		lineRightLeg.setEndY(180.0f);
		pane.getChildren().add(lineRightLeg); //Add right leg to scene
	
	}
}