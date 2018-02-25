package eecs1022.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab4Activity extends AppCompatActivity {
    EditText entername1;
    EditText entername2;
    EditText entername3;
    EditText entermoney1;
    EditText entermoney2;
    EditText entermoney3;
    Spinner servicechoice;
    Spinner from;
    Spinner to;
    EditText amount;
    TextView status1;
    TextView status2;
    TextView status3;
    Bank bank = new Bank();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab4);
        entername1 = (EditText)findViewById(R.id.name1);
        entername2 = (EditText)findViewById(R.id.name2);
        entername3 = (EditText)findViewById(R.id.name3);
        entermoney1 = (EditText)findViewById(R.id.fixmoney1);
        entermoney2 = (EditText)findViewById(R.id.money2);
        entermoney3 = (EditText)findViewById(R.id.money3);
        amount = (EditText)findViewById(R.id.amountofmoney);
        servicechoice = (Spinner)findViewById(R.id.cusservice);
        from = (Spinner)findViewById(R.id.fromAccount);
        to = (Spinner)findViewById(R.id.fromAccount);
        status1 = (TextView)findViewById(R.id.statusClient1);
        status2 = (TextView)findViewById(R.id.statusClient2);
        status3 = (TextView)findViewById(R.id.statusClient3);

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

    public void createAccountsButtonClicked(View v){
        //TODO
        String entermoneyofclient1 = entermoney1.getText().toString();
        Double entermoneyclient1 = Double.parseDouble(entermoneyofclient1);
        String entermoneyofclient2 = entermoney2.getText().toString();
        Double entermoneyclient2 = Double.parseDouble(entermoneyofclient2);
        String entermoneyofclient3 = entermoney3.getText().toString();
        Double entermoneyclient3 = Double.parseDouble(entermoneyofclient3);
        bank.initialClient(entername1.getText().toString(),entername2.getText().toString(),entername3.getText().toString(),entermoneyclient1,entermoneyclient2,entermoneyclient3);
        //Update status to TextView
        updateStatus();
    }

    public void completeTransactionButtonClicked(View v){
        //TODO
        String getService = servicechoice.getSelectedItem().toString();
        String enteramounttransfer = amount.getText().toString();
        Double enteramount = Double.parseDouble(enteramounttransfer);
        bank.completedTransaction(getService,from.getSelectedItemPosition(),to.getSelectedItemPosition(),enteramount);
        //Update status to TextView
        updateStatus();
    }

    private void updateStatus(){
        status1.setText(bank.getClient1().toString());
        status2.setText(bank.getClient2().toString());
        status3.setText(bank.getClient3().toString());
    }

}
