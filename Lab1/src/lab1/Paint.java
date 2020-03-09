package lab1;

import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.shape.*;

public class Paint extends Application {
	 public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("Lab 1");
	        
	        Group root = new Group();
	        Scene scene = new Scene(root, 500, 500);
	        scene.setFill(Color.GREEN);
	        Polygon polygon = new Polygon();
	        polygon.getPoints().addAll(230.0, 125.0,
	                330.0, 250.0,
	                160.0, 250.0);
	        root.getChildren().add(polygon);
	        polygon.setFill(Color.YELLOW);
	        
	        Ellipse ellipse1 = new Ellipse(148, 150, 2, 8);
	        Ellipse ellipse2 = new Ellipse(148, 210, 2, 8);
	        Ellipse ellipse3 = new Ellipse(310, 175, 2, 8);
	        
	        root.getChildren().add(ellipse1);
	        root.getChildren().add(ellipse2);
	        root.getChildren().add(ellipse3);
	        ellipse1.setFill(Color.AQUA);
	        ellipse2.setFill(Color.AQUA);
	        ellipse3.setFill(Color.AQUA);

	        Polyline polyline = new Polyline();
	        polyline.getPoints().addAll(90.0, 125.0,
	                140.0, 292.0,
	                350.0, 292.0,
	                400.0, 125.0);
	        root.getChildren().add(polyline);
	        polyline.setStroke(Color.RED);
	        polyline.setStrokeWidth(4);

	        Line line1 = new Line(125.0, 125.0, 175.0 , 125.0);
	        Line line2 = new Line(280.0, 125.0, 340.0 , 125.0);

	        root.getChildren().add(line1);
	        root.getChildren().add(line2);
	        line1.setStroke(Color.BLUE);
	        line2.setStroke(Color.BLUE);
	        line1.setStrokeWidth(4);
	        line2.setStrokeWidth(4);

	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
}
