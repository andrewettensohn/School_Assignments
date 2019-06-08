/* A13009956 Andrew Ettensohn
 * This program uses radio buttons to display a countries flag and description text
 * Pesudocode:
 * Create radio buttons
 * Add Radio buttons to their own pane
 * Set the buttons to display the country and description
 * Delete ComboxBox related code
 * 
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class RadioButtonFlags extends Application {
	// Declare an array of Strings for flag titles
	private String[] flagTitles = {"Canada", "China", "Denmark","France", "Germany", "India", "Norway", "United Kingdom","United States of America"};
	
	// find the working directory, ImageView in JavaFX is not same as Swing
	String workingDir = System.getProperty("user.dir");
	  

	// Declare an ImageView array for the national flags of 9 countries
	private ImageView[] flagImage = {
		new ImageView("file:"+workingDir+"/image/ca.gif"),
		new ImageView("file:"+workingDir+"/image/china.gif"),
		new ImageView("file:"+workingDir+"/image/de.gif"),
		new ImageView("file:"+workingDir+"/image/fr.gif"),
		new ImageView("file:"+workingDir+"/image/ge.gif"),
		new ImageView("file:"+workingDir+"/image/ind.gif"),
		new ImageView("file:"+workingDir+"/image/nor.gif"),
		new ImageView("file:"+workingDir+"/image/uk.gif"), 
		new ImageView("file:"+workingDir+"/image/us.gif")};
	
	// Declare an array of strings for flag descriptions
	private String[] flagDescription = new String[9];
	
	// Declare and create a description pane
	private DescriptionPane descriptionPane = new DescriptionPane();
	
	// Create a combo box for selecting countries
	private ComboBox<String> cbo = new ComboBox<>(); // flagTitles;

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Set text description
	    flagDescription[0] = "The Canadian national flag ...";
	    flagDescription[1] = "Description for China ... ";
	    flagDescription[2] = "Description for Denmark ... ";
	    flagDescription[3] = "Description for France ... ";
	    flagDescription[4] = "Description for Germany ... ";
	    flagDescription[5] = "Description for India ... ";
	    flagDescription[6] = "Description for Norway ... ";
	    flagDescription[7] = "Description for UK ... ";
	    flagDescription[8] = "Description for US ... ";
	
	    // Set the first country (Canada) for display
	    setDisplay(0);
	
		// Add combo box and description pane to the border pane
	    BorderPane pane = new BorderPane();
	    
	    // Create VBox and add buttons to new pane
	    VBox PaneForRadioButtons = new VBox(20);
	    PaneForRadioButtons.setPadding(new Insets(5,5,5,5));
	    PaneForRadioButtons.setStyle("-fx-border-color: green");
	    PaneForRadioButtons.setStyle
	    ("-fx-border-width: 2px; -fx-border-color: green");
	    RadioButton rbCanada = new RadioButton("Canada");
	    RadioButton rbChina = new RadioButton("China");
	    RadioButton rbDenmark = new RadioButton("Denmark");
	    RadioButton rbFrance = new RadioButton("France");
	    RadioButton rbGermany = new RadioButton("Germany");
	    RadioButton rbIndia = new RadioButton("India");
	    RadioButton rbNorway = new RadioButton("Norway");
	    RadioButton rbUK = new RadioButton("UK");
	    RadioButton rbUS = new RadioButton("US");
	    PaneForRadioButtons.getChildren().addAll(rbCanada, rbChina,rbDenmark, rbFrance, rbGermany, rbIndia, rbNorway, rbUK, rbUS);
	    pane.setLeft(PaneForRadioButtons);
	    
	    // Create toggle group for buttons
	    ToggleGroup group = new ToggleGroup();
	    rbCanada.setToggleGroup(group);
	    rbChina.setToggleGroup(group);
	    rbDenmark.setToggleGroup(group);
	    rbFrance.setToggleGroup(group);
	    rbGermany.setToggleGroup(group);
	    rbIndia.setToggleGroup(group);
	    rbNorway.setToggleGroup(group);
	    rbUK.setToggleGroup(group);
	    rbUS.setToggleGroup(group);
	    
	    // Set actions for each button to display flag and description
	    rbCanada.setOnAction(e -> {
	    	if (rbCanada.isSelected()) {
	    		 setDisplay(0); 	
	    	}
	    });
	    
	    rbChina.setOnAction(e -> {
	    	if (rbChina.isSelected()) {
	    		 setDisplay(1); 	
	    	}
	    });
	
	    rbDenmark.setOnAction(e -> {
	    	if (rbDenmark.isSelected()) {
	    		 setDisplay(2); 	
	    	}
	    });
	
	    rbFrance.setOnAction(e -> {
	    	if (rbFrance.isSelected()) {
	    		 setDisplay(3); 	
	    	}
	    });
	
	    rbGermany.setOnAction(e -> {
	    	if (rbGermany.isSelected()) {
	    		 setDisplay(4); 	
	    	}
	    });
	
	    rbIndia.setOnAction(e -> {
	    	if (rbIndia.isSelected()) {
	    		 setDisplay(5); 	
	    	}
	    });
	
	    rbNorway.setOnAction(e -> {
	    	if (rbNorway.isSelected()) {
	    		 setDisplay(6); 	
	    	}
	    });
	
	    rbUK.setOnAction(e -> {
	    	if (rbUK.isSelected()) {
	    		 setDisplay(7); 	
	    	}
	    });
	
	    rbUS.setOnAction(e -> {
	    	if (rbUS.isSelected()) {
	    		 setDisplay(8); 	
	    	}
	    });
    
	    ObservableList<String> items =
	    FXCollections.observableArrayList(flagTitles);
	    cbo.getItems().addAll(items); 
	    pane.setCenter(descriptionPane);
	    
	   // Display the selected country
	    cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));
	    
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane, 450, 170);
	    primaryStage.setTitle("RadioButtonFlags"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
    }
    
    /** Set display information on the description pane */
    public void setDisplay(int index) {
    	descriptionPane.setTitle(flagTitles[index]);
        descriptionPane.setImageView(flagImage[index]);
        descriptionPane.setDescription(flagDescription[index]);
    }
}

	class DescriptionPane extends BorderPane {
	/** Label for displaying an image and a title */
	private Label lblImageTitle = new Label();

	/** Text area for displaying text */
	private TextArea taDescription = new TextArea();

	public DescriptionPane() {
		// Center the icon and text and place the text under the icon
		lblImageTitle.setContentDisplay(ContentDisplay.TOP); 
		lblImageTitle.setPrefSize(200,  100);

		// Set the font in the label and the text field
		lblImageTitle.setFont(new Font("SansSerif", 16));
		taDescription.setFont(new Font("Serif", 14));

		taDescription.setWrapText(true);
		taDescription.setEditable(false);

		// Create a scroll pane to hold the text area
		ScrollPane scrollPane = new ScrollPane(taDescription);

		// Place label and scroll pane in the border pane
		setLeft(lblImageTitle);
		setCenter(scrollPane);
		setPadding(new Insets(5, 5, 5, 5));
    }

	/** Set the title */
	public void setTitle(String title) {
		lblImageTitle.setText(title);
    }

	/** Set the image view */
	public void setImageView(ImageView icon) {
		lblImageTitle.setGraphic(icon);
    	}

	/** Set the text description */
	public void setDescription(String text) {
		taDescription.setText(text);
    	}
  	}