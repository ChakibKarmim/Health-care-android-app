package IHM.FFC;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class GestionStress extends AppCompatActivity {

    private RadioButton oui_1 ;
    private RadioButton non_1 ;
    private RadioButton oui_2 ;
    private RadioButton non_2 ;
    private RadioButton qst3_1;
    private RadioButton qst3_2;
    private RadioButton qst3_3;
    private RadioButton qst4_1;
    private RadioButton qst4_2;
    private RadioButton qst4_3;
    private RadioButton qst4_4;
    private Button next;
    private Button prev;
    private Person p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_stress);

        oui_1  = (RadioButton) findViewById(R.id.oui_1);
        non_1  = (RadioButton) findViewById(R.id.non_1);
        oui_2  = (RadioButton) findViewById(R.id.oui_2 );
        non_2  = (RadioButton) findViewById(R.id.non_2 );
        qst3_1  = (RadioButton) findViewById(R.id.qst3_1);
        qst3_2  = (RadioButton) findViewById(R.id.qst3_2);
        qst3_3  = (RadioButton) findViewById(R.id.qst3_3);
        qst4_1  = (RadioButton) findViewById(R.id.qst4_1);
        qst4_2  = (RadioButton) findViewById(R.id.qst4_2);
        qst4_3  = (RadioButton) findViewById(R.id.qst4_3);
        qst4_4  = (RadioButton) findViewById(R.id.qst4_4);
        next = (Button) findViewById(R.id.button8);
        prev = (Button) findViewById(R.id.button9);
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
                    Toast.makeText(GestionStress.this, "Vous devez répondre à toutes les questions" ,Toast.LENGTH_LONG).show();
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
        Intent intent = new Intent (this, HygieneDeVie.class).putExtra("Personne",p);
        startActivity(intent);
    }

    public void GoPrev()
    {
        Intent intent = new Intent(this,ConsoTabac.class);
        startActivity(intent);
    }

    public boolean RadioChecked()
    {
        if(
                qst_check_condition(oui_1.isChecked(),non_1.isChecked()) &&
                qst_check_condition(oui_2.isChecked(),non_2.isChecked()) &&
                qst_check_condition(qst3_1.isChecked() , qst3_2.isChecked() , qst3_3.isChecked()) &&
                qst_check_condition(qst4_1.isChecked(),qst4_2.isChecked(),qst4_3.isChecked(),qst4_4.isChecked())
        ){
            return true;
        }
        return false;
    }

    public boolean qst_check_condition(boolean condition,boolean condition_2)
    {
        if(condition || condition_2 )
        {
            return true;
        }
        return false;
    }

    public boolean qst_check_condition(boolean condition,boolean condition_2,boolean condition_3)
    {
        if(condition  || condition_2 || condition_3)
        {
            return true;
        }
        return false;
    }

    public boolean qst_check_condition(boolean condition,boolean condition_2,boolean condition_3 , boolean condition_4)
    {
        if(condition  || condition_2 || condition_3 || condition_4)
        {
            return true;
        }
        return false;
    }

    public void ParseData()
    {
        if(oui_1.isChecked())
        {
            p.setAntidépresseur(oui_1.getText().toString());
        }
        p.setAntidépresseur(non_1.getText().toString());

        if(oui_2.isChecked())
        {
            p.setGestion_famille(oui_2.getText().toString());
        }
        p.setGestion_famille(non_2.getText().toString());

        if(qst3_1.isChecked())
        { p.setStr_anx(qst3_1.getText().toString());
        }else if(qst3_2.isChecked()) { p.setStr_anx(qst3_2.getText().toString()); }
        else
        { p.setStr_anx(qst3_3.getText().toString()); }

        if(qst4_1.isChecked())
        { p.setColére(qst4_1.getText().toString());
        }else if(qst4_2.isChecked()) { p.setColére(qst4_2.getText().toString()); }
        else if(qst4_3.isChecked())
        { p.setColére(qst4_3.getText().toString()); }
        else{ p.setColére(qst4_4.getText().toString()); }

    }
}