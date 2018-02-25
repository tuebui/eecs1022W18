package e.etjsc.rockpaperscissor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Lab3 extends AppCompatActivity {
    EditText entername1;
    EditText entername2;
    Spinner choices1;
    Spinner choices2;
    Spinner choices3;
    Spinner choices4;
    Spinner choices5;
    Spinner choices6;
    TextView result;
    TextView status;
    Games game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
        entername1 = (EditText)findViewById(R.id.enterName1);
        entername2 = (EditText)findViewById(R.id.enterName2);
        choices1 = (Spinner)findViewById(R.id.choices1);
        choices2 = (Spinner)findViewById(R.id.choices2);
        choices3 = (Spinner)findViewById(R.id.choices3);
        choices4 = (Spinner)findViewById(R.id.choices4);
        choices5 = (Spinner)findViewById(R.id.choices5);
        choices6 = (Spinner)findViewById(R.id.choices6);
        result = (TextView)findViewById(R.id.result);
        status = (TextView)findViewById(R.id.status);
        createNewGame();
    }

    private void createNewGame(){
        if (game == null){
            game = new Games();
        }
        game.resetGame();
        result.setText("New Game Started");
        status.setText("Enter names of Players");
    }

    private void setContentOfTextView(int id, String newContents){
        View view = findViewById(id);
        TextView textview = (TextView) view;
        textview.setText(newContents);
    }

    private String getInputOfTextField(int id){
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    public void computeRound1ButtonClicked(View view){
        String choose1 = choices1.getSelectedItem().toString();
        String choose2 = choices2.getSelectedItem().toString();
        game.getPlayer1().setChoicesRound1(choose1);
        game.getPlayer2().setChoicesRound1(choose2);
        game.finishRound1();
        result.setText("");
        status.setText(game.toString());
    }

    public void computeRound2ButtonClicked(View view){
        String choose1 = choices3.getSelectedItem().toString();
        String choose2 = choices4.getSelectedItem().toString();
        game.getPlayer1().setChoicesRound2(choose1);
        game.getPlayer2().setChoicesRound2(choose2);
        game.finishRound2();
        result.setText("");
        if(game.gameIsEnded()){
            status.setText("Error: Game has ended");
            result.setText("Enter Name of Players");
        }else {
            status.setText(game.toString());
        }
    }
    public void computeRound3ButtonClicked(View view){
        result.setText("");
        if(game.gameIsEnded()){
            status.setText("Error");
            result.setText("Enter Name of Players");
        }else {
            String choose1 = choices5.getSelectedItem().toString();
            String choose2 = choices6.getSelectedItem().toString();
            game.getPlayer1().setChoicesRound3(choose1);
            game.getPlayer2().setChoicesRound3(choose2);
            game.finishRound3();
            status.setText(game.toString());
        }
    }
    public void resetButtonClicked(View view){
        createNewGame();
    }
}
