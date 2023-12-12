package modul6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView tableView = new TableView();

        TableColumn<Mahasiswa, String> column1 =
                new TableColumn<>("NIM");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("nim"));


        TableColumn<Mahasiswa, String> column2 =
                new TableColumn<>("Nama");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("nama"));


        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        tableView.getItems().add(
                new Mahasiswa(101, "Maulida", "2210815"));
        tableView.getItems().add(
                new Mahasiswa(102, "Syilan", "2210823"));
        tableView.getItems().add(
                new Mahasiswa(103, "Xinein", "2210834"));
        tableView.getItems().add(
                new Mahasiswa(104, "Siwon", "2210872"));
        tableView.getItems().add(
                new Mahasiswa(105, "Feri", "2210825"));
        tableView.getItems().add(
                new Mahasiswa(106, "Melynd", "2210869"));
        tableView.getItems().add(
                new Mahasiswa(107, "Zoew", "2210873"));
        tableView.getItems().add(
                new Mahasiswa(108, "Kanefa", "2210891"));
        tableView.getItems().add(
                new Mahasiswa(109, "Tacya", "2210848"));
        tableView.getItems().add(
                new Mahasiswa(110, "Daviz", "2210870"));

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}

