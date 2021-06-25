package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    @FXML
    private Button Submit;

    @FXML

    private TextField inputData;

    @FXML

    private TextField OutputData;

    @FXML

    void Submit(ActionEvent event)
    {
        Scanner input = new Scanner(System.in);
                int n = Integer.parseInt(inputData.getText());
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        System.out.println(result);

    }
}
