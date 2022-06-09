package IHM.FFC;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class HygieneDeVie extends AppCompatActivity {

    private RadioButton oui_1;
    private RadioButton non_1;
    private RadioButton oui_2;
    private RadioButton non_2;
    private RadioButton oui_3;
    private RadioButton non_3;
    private RadioButton oui_4;
    private RadioButton non_4;
    private Button next;
    private Button prev;

    private static final String TAG = "info";
    Person p ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hygiene_de_vie);

        oui_1  = (RadioButton) findViewById(R.id.oui_1);
        non_1 = (RadioButton) findViewById(R.id.non_1);
        oui_2 = (RadioButton) findViewById(R.id.oui_2);
        non_2 = (RadioButton) findViewById(R.id.non_2);
        oui_3 = (RadioButton) findViewById(R.id.oui_3);
        non_3 = (RadioButton) findViewById(R.id.non_3);
        oui_4 = (RadioButton) findViewById(R.id.oui_4);
        non_4 = (RadioButton) findViewById(R.id.non_4);
        next = (Button) findViewById(R.id.button7);
        prev = (Button) findViewById(R.id.button6);
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
                    Toast.makeText(HygieneDeVie.this, "Vous devez répondre à toutes les questions" ,Toast.LENGTH_LONG).show();
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
        Intent intent = new Intent (this, Profile.class).putExtra("Personne",p);
        startActivity(intent);
    }

    public void GoPrev()
    {
        Intent intent = new Intent(this,GestionStress.class);
        startActivity(intent);
    }

    public boolean RadioChecked()
    {
        if(
                qst_check_two_condition(oui_1.isChecked() , non_1.isChecked()) &&
                qst_check_two_condition(oui_2.isChecked() , non_2.isChecked() ) &&
                qst_check_two_condition(oui_3.isChecked() , non_3.isChecked() ) &&
                qst_check_two_condition(oui_4.isChecked() , non_4.isChecked() )
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

    public void ParseData()
    {

        if(oui_1.isChecked())
        {
            p.setVerre_alco(oui_1.getText().toString());
        }
        else{
            p.setVerre_alco(non_1.getText().toString());
        }

        if(oui_2.isChecked())
        {
            p.setBoisson_energ(oui_2.getText().toString());
        }
        else{
            p.setBoisson_energ(non_2.getText().toString());
        }

        if(oui_3.isChecked())
        {
            p.setDormir_7h(oui_3.getText().toString());
        }
        else{
            p.setDormir_7h(non_3.getText().toString());
        }

        if(oui_4.isChecked())
        {
            p.setTrouble_somm(oui_4.getText().toString());
        }
        else{
            p.setTrouble_somm(non_4.getText().toString());
        }


    }

}