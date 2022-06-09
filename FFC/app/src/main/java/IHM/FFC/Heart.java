package IHM.FFC;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Heart extends AppCompatActivity {
    private RadioButton oui_1;
    private RadioButton non_1;
    private RadioButton oui_2;
    private RadioButton non_2;
    private RadioButton oui_3;
    private RadioButton non_3;
    private RadioButton oui_4;
    private RadioButton non_4;
    private RadioButton oui_5;
    private RadioButton non_5;
    private RadioButton jnsp_5;
    private RadioButton oui_6;
    private RadioButton non_6;
    private RadioButton jnsp_6;
    private Button next;
    private Button prev;
    private static final String TAG = "info";
    Person p ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);
        oui_1  = (RadioButton) findViewById(R.id.oui_1);
        non_1 = (RadioButton) findViewById(R.id.non_1);

        oui_2 = (RadioButton) findViewById(R.id.oui_2);
        non_2 = (RadioButton) findViewById(R.id.non_2);

        oui_3 = (RadioButton) findViewById(R.id.oui_3);
        non_3 = (RadioButton) findViewById(R.id.qst3_3);

        oui_4 = (RadioButton) findViewById(R.id.oui_4);
        non_4 = (RadioButton) findViewById(R.id.non_4);

        oui_5 = (RadioButton) findViewById(R.id.oui_5);
        non_5 = (RadioButton) findViewById(R.id.non_5);
        jnsp_5 = (RadioButton) findViewById(R.id.jnsp_5);

        oui_6 = (RadioButton) findViewById(R.id.oui_6);
        non_6 = (RadioButton) findViewById(R.id.non_6);
        jnsp_6 = (RadioButton) findViewById(R.id.jnsp_6);

        next = (Button) findViewById(R.id.button5);
        prev = (Button) findViewById(R.id.button4);
        p = getIntent().getExtras().getParcelable("Personne");


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(RadioChecked())
                {
                    ParseData();
                    GoNext();
                }
                else
                {
                    Toast.makeText(Heart.this, "Vous devez répondre à toutes les questions" ,Toast.LENGTH_LONG).show();
                }
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoPrev();
            }
        });

    }

    public void GoNext(){
        Intent intent = new Intent (this, SuiviCardiaque.class).putExtra("Personne",p);
        startActivity(intent);
    }

    public void GoPrev()
    {
        Intent intent = new Intent(this,JeSuis.class);
        startActivity(intent);
    }

    public boolean RadioChecked()
    {
        if(
            qst_check_two_condition(oui_1.isChecked() , non_1.isChecked()) &&
            qst_check_two_condition(oui_2.isChecked() , non_2.isChecked() ) &&
            qst_check_two_condition(oui_3.isChecked() , non_3.isChecked() ) &&
            qst_check_two_condition(oui_4.isChecked() , non_4.isChecked() ) &&
            qst_check_three_condition(oui_5.isChecked() , non_5.isChecked() ,jnsp_5.isChecked()) &&
            qst_check_three_condition(oui_6.isChecked() , non_6.isChecked() , jnsp_6.isChecked())
        ) {
            return true;
        }
        else
        {
            return false;
        }

    }

    public boolean qst_check_two_condition(boolean condition,boolean condition_2)
    {
      if(condition || condition_2 )
      {
          return true;
      }
      return false;
    }

    public boolean qst_check_three_condition(boolean condition,boolean condition_2,boolean condition_3)
    {
        if(condition  || condition_2 || condition_3)
        {
            return true;
        }
        return false;
    }

    public void ParseData()
    {

        if(oui_1.isChecked())
        {
            p.setProb_cardiaqua(oui_1.getText().toString());
        }
        else{
            p.setProb_cardiaqua(non_1.getText().toString());
        }

        if(oui_2.isChecked())
        {
            p.setProb_colesterol(oui_2.getText().toString());
        }
        else{
            p.setProb_colesterol(non_2.getText().toString());
        }

        if(oui_3.isChecked())
        {
            p.setDiabet(oui_3.getText().toString());
        }
        else{
            p.setDiabet(non_3.getText().toString());
        }

        if(oui_4.isChecked())
        {
            p.setHyperT(oui_4.getText().toString());
        }
        else{
            p.setHyperT(non_4.getText().toString());
        }

        if(oui_5.isChecked())
        {
            p.setParent_prob(oui_5.getText().toString());
        }
        else if ( non_5.isChecked() ){
            p.setParent_prob(non_5.getText().toString());
        }
        else
        {
            p.setParent_prob(jnsp_5.getText().toString());
        }

        if(oui_6.isChecked())
        {
            p.setIMC(oui_6.getText().toString());
        }
        else if ( non_6.isChecked() ){
            p.setIMC(non_6.getText().toString());
        }
        else
        {
            p.setIMC(jnsp_6.getText().toString());
        }

    }


}