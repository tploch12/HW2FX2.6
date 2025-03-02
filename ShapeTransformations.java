
package com.example.demo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage; //imports
public class ShapeTransformations extends Application { //defines the class
    @Override
    public void start(Stage primaryStage) { //the start method that is required for FX
        Pane pane = new Pane(); //creates a new 'pane' the background visual that we see
        Rectangle rectangle = new Rectangle(50, 50, 100, 60); //creates a new rectangle at x=50 y=50 100 width 60 height
        rectangle.setFill(Color.LIGHTBLUE); //sets the color of the rectangle to light blue
        rectangle.setStroke(Color.BLACK); //creates a black outline around the rectangle
        Circle circle = new Circle(200, 80, 40); //creates a new circle at x=200 y=80 radius=40
        circle.setFill(Color.ORANGE); //sets the color of the circle to orange
        circle.setStroke(Color.BLACK); //creates a black outline around the circle
        Ellipse ellipse = new Ellipse(350, 80, 60, 30); //creates a new ellipse at x=350 y=80 x.radius=60 y.radius=30
        ellipse.setFill(Color.GREEN); //sets the color of the ellipse to green
        ellipse.setStroke(Color.BLACK); //creates a black outline around the ellipse
        Line line = new Line(50, 150, 150, 200); //creates a new line at startx=50 starty=150 endx=150 endy=200
        line.setStroke(Color.RED); //sets the color of the line to red
        line.setStrokeWidth(3); //sets the width of the line to (3)
        Polygon polygon = new Polygon(); //creates a new triangle
        polygon.getPoints().addAll(250.0, 150.0, 300.0, 250.0, 200.0, 250.0); //sets the polygon, first vertex=250,150 second vertex=300,250 third vertex=200,250
        polygon.setFill(Color.YELLOW); //sets the color of the triangle to yellow
        polygon.setStroke(Color.BLACK); //creates a black outline around the triangle
        Arc arc = new Arc(420, 200, 50, 50, 30, 180); //creates a new arc at x=420 y=200 x.radius=50 y.radius=50 start.angle=30 arc.length=180
        arc.setFill(Color.PINK); //sets the color of the arc to pink
        arc.setStroke(Color.BLACK); //creates a black outline around the arc
        arc.setType(ArcType.OPEN); //makes the arc a semi circle thats open on one side
        Button rotateRectangle = new Button("Rotate Rectangle");  //creates a button with the label 'Rotate Rectangle'
        rotateRectangle.setOnAction(e -> rectangle.setRotate(rectangle.getRotate()
                + 15)); //on button press -- rotates the rectangle 15 degrees
        Button scaleCircle = new Button("Scale Circle"); //creates a new button with the label 'Scale Circle'
        scaleCircle.setOnAction(e -> circle.setScaleX(circle.getScaleX() + 0.1)); //on button press -- circle gets .1 bigger
        Button moveEllipse = new Button("Move Ellipse"); //creates a new button with the label 'Move Ellipse'
        moveEllipse.setOnAction(e -> ellipse.setTranslateX(ellipse.getTranslateX() //on button press -- translates the ellipse on x-axis by 10
                + 10));
        Button rotateLine = new Button("Rotate Line"); //creates new button with the label 'Rotate Line'
        rotateLine.setOnAction(e -> line.setRotate(line.getRotate() + 15)); //on button press -- rotate line by 15 degrees
        Button scalePolygon = new Button("Scale Polygon"); // creates new button with the label 'Scale Polygon'
        scalePolygon.setOnAction(e -> {
            polygon.setScaleX(polygon.getScaleX() + 0.1); //on button press -- scales triangle x axis by .1
            polygon.setScaleY(polygon.getScaleY() + 0.1); //on button press -- scales triangle y axis by .1
        });
        Button moveArc = new Button("Move Arc"); //creates button with the label 'Move Arc'
        moveArc.setOnAction(e -> arc.setTranslateX(arc.getTranslateX() + 10)); //on button press -- translate along x-axis by 10
        VBox buttonBox = new VBox(10, rotateRectangle, scaleCircle, moveEllipse, // creates new button box to store all previous made buttons
                rotateLine, scalePolygon, moveArc);
        buttonBox.setLayoutX(520); //sets size of button box x-axis
        buttonBox.setLayoutY(50); // sets size of button box y-axis
        pane.getChildren().addAll(rectangle, circle, ellipse, line, polygon, arc,
                buttonBox); //adds all shapes and buttons to the pane
        Scene scene = new Scene(pane, 700, 300); //creates new scene with the sixe x=700 y=300
        primaryStage.setTitle("JavaFX Shape Transformations"); //sets the title to JavaFX Shape Transformations'
        primaryStage.setScene(scene); //displays the scene on the stage
        primaryStage.show(); //creates the show visible on screen
    }
    public static void main(String[] args) {
        launch(args); //starts the program by calling start
    }
}
