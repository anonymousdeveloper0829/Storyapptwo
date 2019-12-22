package lkprojects.storyappSecond;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import lkprojects.storyappSecond.storiesclasses.SelectCategories;

public class Fronttest extends AppCompatActivity {

    Button btnyes, btnno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fronttest);

        btnyes = findViewById(R.id.btn_yes);
        btnno=findViewById(R.id.btn_no);
        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fronttest.this, SelectCategories.class));
            }
        });
        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Fronttest.this,"POGO Dekho jaakar chhotuu !!!",Toast.LENGTH_LONG).show();
                finishAndRemoveTask();
                finishAffinity();
                finish();
            }
        });
    }


}
