package IHM.FFC;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.List;

public class JeSuis extends AppCompatActivity {


    private RadioButton femme ;
    private RadioButton homme ;
    private RadioButton Minus40 ;
    private RadioButton between40_60 ;
    private RadioButton plus60;
    private  Button Next;
    private static final String TAG = "info";
    Person p ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_je_suis);
        femme = (RadioButton) findViewById(R.id.radioButton4);
        homme = (RadioButton) findViewById(R.id.radioButton3);
        Minus40 = (RadioButton) findViewById(R.id.radioButton5);
        between40_60 = (RadioButton) findViewById(R.id.radioButton6);
        plus60 = (RadioButton) findViewById(R.id.radioButton7);
        Next = (Button) findViewById(R.id.button2) ;
        p = getIntent().getExtras().getParcelable("Personne");
        Log.v("Le nom du personne" ,  p.getNom());


        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(RadioChecked())
                {
                    ParseData();
                    GoNext();
                }
                else
                {
                    Toast.makeText(JeSuis.this, "Vous devez répondre à toutes les questions" ,Toast.LENGTH_LONG).show();
                }
            }
        });



    }


    public void GoNext(){
        Intent intent = new Intent (this, Heart.class).putExtra("Personne" , p);
        startActivity(intent);
    }

    public void GoPrev(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public boolean RadioChecked()
    {
        if(femme.isChecked() || homme.isChecked() && Minus40.isChecked() || between40_60.isChecked() || plus60.isChecked())
        {
            return true;
        }
        return false;
    }



    public void ParseData()
    {

        if(femme.isChecked())
        {
            p.setSexe(femme.getText().toString());
        }
        else{
            p.setSexe(homme.getText().toString());
        }

        if ( Minus40.isChecked() )
        {
            p.setAge(Minus40.getText().toString());
        }
        else if ( between40_60.isChecked() )
        {
            p.setAge(between40_60.getText().toString());
        }
        else
        {
            p.setAge(plus60.getText().toString());
        }
    }

}