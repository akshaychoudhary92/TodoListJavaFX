package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import sample.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;

    public void initialize(){
        TodoItem item1 = new TodoItem("item1", "details1", LocalDate.of(2021, Month.DECEMBER, 25));
        TodoItem item2 = new TodoItem("item2", "details2", LocalDate.of(2021, Month.DECEMBER, 1));
        TodoItem item3 = new TodoItem("item3", "details3", LocalDate.of(2021, Month.DECEMBER, 2));
        TodoItem item4 = new TodoItem("item4", "details4", LocalDate.of(2021, Month.DECEMBER, 3));
        TodoItem item5 = new TodoItem("item5", "details5", LocalDate.of(2021, Month.DECEMBER, 4));
        TodoItem item6 = new TodoItem("item6", "details6", LocalDate.of(2021, Month.DECEMBER, 5));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
        todoItems.add(item6);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }

    @FXML
    public void handleClickListView(){
        TodoItem item =  todoListView.getSelectionModel().getSelectedItem();
//        System.out.println("The selected item is " + item);
        itemDetailsTextArea.setText(item.getDetails());

    }
}
