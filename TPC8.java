package rky.poo.tpc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class TPC8 extends Application {

    @Override
    public void start(Stage primaryStage) {
        /*
         TPC8 foi feito utilizando text
         */
        Text texto1 = new Text("TPC 8");
        texto1.setFont(Font.font("Arial", 50));
        texto1.setFill(Color.GREEN);
        texto1.setX(50);
        texto1.setY(50);

        /*
          o Retangulo Rectangle
         */
        Rectangle retangulo = new Rectangle(100, 100, 100, 100);
        retangulo.setFill(Color.BLUE);
        retangulo.setStroke(Color.BLACK);
        retangulo.setStrokeWidth(5);


         /*
         criei a linha  só que coloquei uma cor um pouco mais forte
               */
        Line linha1 = new Line(50, 50, 250, 250);
        linha1.setStroke(Color.DARKRED);
        linha1.setStrokeWidth(6);
        linha1.setLayoutX(210);
        linha1.setLayoutY(50);




        /*
        usei Polygon para criar o Triangulo
         */
        Polygon triangulo = new Polygon();
        triangulo.getPoints().addAll(150.0, 350.0, 150.0, 450.0, 250.0, 450.0);
        triangulo.setFill(Color.YELLOW);
        triangulo.setLayoutX(50);
        triangulo.setLayoutY(-150);


        /*
          o Circulo foi feito usando Circle
         */
        Circle circulo = new Circle(155, 505, 50);
        circulo.setFill(Color.ORANGE);
        circulo.setCenterX(345);
        circulo.setCenterY(360);

        /*
         O Logotipo da UTA
         */
        Image imagem = new Image("uta-logo.png");
        ImageView imageView = new ImageView(imagem);
        imageView.setX(110);
        imageView.setY(430);
        imageView.setFitHeight(100);
        imageView.setFitWidth(300);


        /*root

         */
        Pane root = new Pane();
        root.getChildren().addAll(texto1, linha1, retangulo, triangulo, circulo, imageView);
        root.setBackground(Background.EMPTY);

        /* Scene

         */
        Scene scene = new Scene(root, 600, 600);
        scene.setFill(Color.CORNFLOWERBLUE);

        /*o titulo "Trabalhar com Scene"

         */
        primaryStage.setTitle("TPC8 - Trabalhar com Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
