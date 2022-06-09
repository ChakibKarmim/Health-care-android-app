package IHM.FFC;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Person p = new Person();
    private EditText name;
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name_input);
        next = (Button) findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(name.getText().toString()))
                {
                    p.setNom(name.getText().toString());
                    GoNext();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Vous devez inserer votre nom" ,Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void GoNext(){
        Intent intent = new Intent (this, JeSuis.class).putExtra("Personne", p);
        startActivity(intent);
    }

}