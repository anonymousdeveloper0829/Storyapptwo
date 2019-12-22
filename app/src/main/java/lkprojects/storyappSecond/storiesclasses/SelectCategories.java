package lkprojects.storyappSecond.storiesclasses;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import lkprojects.storyappSecond.Fronttest;
import lkprojects.storyappSecond.MainActivity;
import lkprojects.storyappSecond.R;
import lkprojects.storyappSecond.SelectLoveStories;
import lkprojects.storyappSecond.SelectMotivationalStories;
import lkprojects.storyappSecond.SelectSadStories;

public class SelectCategories extends AppCompatActivity implements View.OnClickListener {
    protected void onStart() {
        super.onStart();

        ConnectivityManager ConnectionManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo networkInfo = ConnectionManager.getActiveNetworkInfo();
        if(networkInfo != null && networkInfo.isConnected()==true )
        {

        }
        else
        {
            Toast.makeText(SelectCategories.this, "Switch ON your internet!!!", Toast.LENGTH_LONG).show();

        }
    }
    ImageView love, adult, sad, motivatation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_categories);
        love = findViewById(R.id.lovestoryicon);
        adult = findViewById(R.id.adultstoryicon);
        sad = findViewById(R.id.sadstoryicon);
        motivatation = findViewById(R.id.motivationstoryicon);
        love.setOnClickListener(this);
        adult.setOnClickListener(this);
        sad.setOnClickListener(this);
        motivatation.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == love)
        {

       //     Toast.makeText(SelectCategories.this, "Love Story", Toast.LENGTH_LONG).show();
            startActivity(new Intent(SelectCategories.this, SelectLoveStories.class));
        }
        if(view == adult)
        {
          //  Toast.makeText(SelectCategories.this, "Adult Story", Toast.LENGTH_LONG).show();
            startActivity(new Intent(SelectCategories.this, MainActivity.class));
        }
        if(view == sad){
           // Toast.makeText(SelectCategories.this, "Sad Story", Toast.LENGTH_LONG).show();
            startActivity(new Intent(SelectCategories.this, SelectSadStories.class));
        }
        if(view == motivatation){
          //  Toast.makeText(SelectCategories.this, "Motivation Story", Toast.LENGTH_LONG).show();
            startActivity(new Intent(SelectCategories.this, SelectMotivationalStories.class));
        }
    }
    @Override
    public void onBackPressed() {
        finishAndRemoveTask();
        finishAffinity();
        finish();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=lkprojects.storyappSecond&hl=en"));
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
