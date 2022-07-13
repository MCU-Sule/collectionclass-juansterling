package com.example.PT02_2072009;

import com.example.PT02_2072009.model.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML
    private TableView  tabel;
    @FXML
    private TableColumn coloumn1;
    @FXML
    private TableColumn coloumn2;
    @FXML
    private TextField nrpbaru;
    @FXML
    private TextField nama;
    @FXML
    private TextField hapusnrp;

    public ObservableList<Student> StudentList;

    public void initialize() {
        StudentList = FXCollections.observableArrayList(
                new Student(1111, "Juan"),
                new Student(2222, "Sterling"),
                new Student(3333, "Martua")

        );
        tabel.setItems(StudentList);
        coloumn1.setText("NRP");
        coloumn1.setCellValueFactory(new PropertyValueFactory("nrp"));
        coloumn2.setText("Nama");
        coloumn2.setCellValueFactory(new PropertyValueFactory("nama"));
    };
    @FXML
    protected void addstudent() {
        int nrp = Integer.parseInt(nrpbaru.getText());
        String namaBaru = nama.getText();
        StudentList.add(new Student(nrp, namaBaru));
        nrpbaru.setText("");
        nama.setText("");
    };
    @FXML
    protected void deletestudent() {
        int nrp = Integer.parseInt(hapusnrp.getText());
        for (Student student: StudentList) {
            if (nrp == student.getNrp()) {
                StudentList.remove(student);
                break;
            };
        };
    };
};