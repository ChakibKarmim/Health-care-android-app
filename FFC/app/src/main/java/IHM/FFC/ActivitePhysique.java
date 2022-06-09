package IHM.FFC;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivitePhysique extends AppCompatActivity {

    private RadioButton oui_1;
    private RadioButton non_1;
    private RadioButton qst2_1;
    private RadioButton qst2_2;
    private RadioButton qst2_3;
    private RadioButton qst2_4;
    private RadioButton oui_3;
    private RadioButton non_3;
    private RadioButton qst4_1;
    private RadioButton qst4_2;
    private RadioButton qst4_3;
    private RadioButton qst4_4;
    private RadioButton qst5_1;
    private RadioButton qst5_2;
    private RadioButton qst5_3;
    private RadioButton qst5_4;
    private Button next_; //14
    private Button prev_; //15
    private Person p;
    private static final String TAG = "info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite_physique);

        oui_1 = (RadioButton) findViewById(R.id.oui_1) ;
        non_1 = (RadioButton) findViewById(R.id.non_1) ;
        qst2_1 = (RadioButton) findViewById(R.id.qst2_1) ;
        qst2_2 = (RadioButton) findViewById(R.id.qst2_2) ;
        qst2_3 = (RadioButton) findViewById(R.id.oui_2) ;
        qst2_4 = (RadioButton) findViewById(R.id.non_2) ;
        oui_3 = (RadioButton) findViewById(R.id.oui_3) ;
        non_3 = (RadioButton) findViewById(R.id.qst3_3) ;
        qst4_1 = (RadioButton) findViewById(R.id.qst4_1) ;
        qst4_2 = (RadioButton) findViewById(R.id.qst4_2) ;
        qst4_3 = (RadioButton) findViewById(R.id.qst4_3) ;
        qst4_4 = (RadioButton) findViewById(R.id.qst4_4) ;
        qst5_1 = (RadioButton) findViewById(R.id.qst5_1) ;
        qst5_2 = (RadioButton) findViewById(R.id.qst5_2) ;
        qst5_3 = (RadioButton) findViewById(R.id.qst5_3) ;
        qst5_4 = (RadioButton) findViewById(R.id.qst5_4) ;
        next_ = (Button) findViewById(R.id.button14);
        prev_ = (Button) findViewById(R.id.button15);

        p = getIntent().getExtras().getParcelable("Personne");

        next_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(RadioChecked())
                {
                    ParseData();
                    gonext();
                }
                else
                {
                    Toast.makeText(ActivitePhysique.this, "Vous devez répondre à toutes les questions" ,Toast.LENGTH_LONG).show();
                }
            }
        });

        prev_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoPrev();
            }
        });

    }
    public void gonext(){
        Log.e("goin next","next");
        Intent intent = new Intent (this, ConsoTabac.class).putExtra("Personne",p);
        startActivity(intent);
    }

    public void GoPrev(){
        Intent intent = new Intent(this,Alimentation.class);
        startActivity(intent);
    }


    public boolean qst_check_two_condition(boolean condition,boolean condition_2)
    {
        if(condition || condition_2 )
        {
            return true;
        }
        return false;
    }

    public boolean qst_check_four_condition(boolean condition,boolean condition_2,boolean condition_3, boolean condition_4)
    {
        if(condition  || condition_2 || condition_3 || condition_4)
        {
            return true;
        }
        return false;
    }

    public boolean RadioChecked()
    {
        if(
                qst_check_two_condition(oui_1.isChecked() , non_1.isChecked()) &&
                qst_check_four_condition(qst2_1.isChecked() , qst2_2.isChecked(), qst2_3.isChecked() , qst2_4.isChecked()) &&
                qst_check_two_condition(oui_3.isChecked() , non_3.isChecked() ) &&
                qst_check_four_condition(qst4_1.isChecked() , qst4_2.isChecked(), qst4_3.isChecked() , qst4_4.isChecked()) &&
                qst_check_four_condition(qst5_1.isChecked() , qst5_2.isChecked()  , qst5_3.isChecked() , qst5_4.isChecked())
        ) {
            return true;
        }
        return false;
    }

    public void ParseData()
    {
        if(oui_1.isChecked()) {
            p.setPas_quotidient(oui_1.getText().toString());}
        else{ p.setPas_quotidient(non_1.getText().toString());}

        if(qst2_1.isChecked())
        { p.setSport_hebdo(qst2_1.getText().toString());
        }else if(qst2_2.isChecked()) { p.setSport_hebdo(qst2_2.getText().toString()); }
        else if(qst2_3.isChecked())
        { p.setSport_hebdo(qst2_3.getText().toString()); }
        else{ p.setSport_hebdo(qst2_4.getText().toString()); }

        if(oui_3.isChecked()) {
            p.setFréquence_cardiaque(oui_3.getText().toString());}
        else{ p.setFréquence_cardiaque(non_3.getText().toString());}

        if(qst4_1.isChecked())
        { p.setProfile_sportif(qst4_1.getText().toString());
        }else if(qst4_2.isChecked()) { p.setProfile_sportif(qst4_2.getText().toString()); }
        else if(qst4_3.isChecked())
        { p.setProfile_sportif(qst4_3.getText().toString()); }
        else{ p.setProfile_sportif(qst4_4.getText().toString()); }

        if(qst5_1.isChecked())
        { p.setActivité_weekend(qst5_1.getText().toString());
        }else if(qst5_2.isChecked()) { p.setActivité_weekend(qst5_2.getText().toString()); }
        else if(qst5_3.isChecked())
        { p.setActivité_weekend(qst5_3.getText().toString()); }
        else{ p.setActivité_weekend(qst5_4.getText().toString()); }

    }


}