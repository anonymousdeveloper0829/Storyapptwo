package lkprojects.storyappSecond;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import lkprojects.storyappSecond.storiesclasses.LoveStory1;
import lkprojects.storyappSecond.storiesclasses.LoveStory2;
import lkprojects.storyappSecond.storiesclasses.LoveStory3;
import lkprojects.storyappSecond.storiesclasses.LoveStory4;
import lkprojects.storyappSecond.storiesclasses.LoveStory5;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory1;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory10;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory2;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory3;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory4;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory5;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory6;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory7;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory8;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory9;
import lkprojects.storyappSecond.storiesclasses.SelectCategories;

public class SelectMotivationalStories extends AppCompatActivity implements View.OnClickListener {
    protected void onStart() {
        super.onStart();

        ConnectivityManager ConnectionManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo networkInfo = ConnectionManager.getActiveNetworkInfo();
        if(networkInfo != null && networkInfo.isConnected()==true )
        {

        }
        else
        {
            Toast.makeText(SelectMotivationalStories.this, "Switch ON your internet!!!", Toast.LENGTH_LONG).show();

        }
    }
    private InterstitialAd mInterstitialAd;
    private TextView tvmotivationalStory1, tvmotivationalStory2, tvmotivationalStory3, tvmotivationalStory4, tvmotivationalStory5;
    private TextView tvmotivationalStory6, tvmotivationalStory7, tvmotivationalStory8, tvmotivationalStory9, tvmotivationalStory10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_motivational_stories);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        mInterstitialAd = newInterstitialAd();
        loadInterstitial();
        tvmotivationalStory1 = findViewById(R.id.go2motivationalStory1);
        tvmotivationalStory2 = findViewById(R.id.go2motivationalStory2);
        tvmotivationalStory3 = findViewById(R.id.go2motivationalStory3);
        tvmotivationalStory4 = findViewById(R.id.go2motivationalStory4);
        tvmotivationalStory5 = findViewById(R.id.go2motivationalStory5);
        tvmotivationalStory6 = findViewById(R.id.go2motivationalStory6);
        tvmotivationalStory7 = findViewById(R.id.go2motivationalStory7);
        tvmotivationalStory8 = findViewById(R.id.go2motivationalStory8);
        tvmotivationalStory9 = findViewById(R.id.go2motivationalStory9);
        tvmotivationalStory10 = findViewById(R.id.go2motivationalStory10);
        tvmotivationalStory1.setOnClickListener(this);
        tvmotivationalStory2.setOnClickListener(this);
        tvmotivationalStory3.setOnClickListener(this);
        tvmotivationalStory4.setOnClickListener(this);
        tvmotivationalStory5.setOnClickListener(this);
        tvmotivationalStory6.setOnClickListener(this);
        tvmotivationalStory7.setOnClickListener(this);
        tvmotivationalStory8.setOnClickListener(this);
        tvmotivationalStory9.setOnClickListener(this);
        tvmotivationalStory10.setOnClickListener(this);

    }



    private InterstitialAd newInterstitialAd() {
        InterstitialAd interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.original_StoryAppSecondInterstitialTwo_interstitial_unit_id));
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
            }

            @Override
            public void onAdClosed() {

            }
        });
        return interstitialAd;
    }

    private void showInterstitial() {
        // Show the ad if it's ready. Otherwise toast and reload the ad.
        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Toast.makeText(this, "Please ratings dijiye app ko!!", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        showInterstitial();

    }
    private void loadInterstitial() {
        // Disable the next level button and load the ad.

        AdRequest adRequest = new AdRequest.Builder().addTestDevice("4E8C8E4657F51B16C35B2BD4F079B653") .build();
        mInterstitialAd.loadAd(adRequest);
    }


    @Override
    public void onClick(View view) {
        if(view == tvmotivationalStory1)
        {
            showInterstitial();
            startActivity(new Intent(SelectMotivationalStories.this, MotivationalStory1.class));
        }
        if(view == tvmotivationalStory2)
        {
            showInterstitial();
            startActivity(new Intent(SelectMotivationalStories.this, MotivationalStory2.class));
        }
        if(view == tvmotivationalStory3)
        {
            showInterstitial();
            startActivity(new Intent(SelectMotivationalStories.this, MotivationalStory3.class));
        }
        if(view == tvmotivationalStory4)
        {
            showInterstitial();
            startActivity(new Intent(SelectMotivationalStories.this, MotivationalStory4.class));
        }
        if(view == tvmotivationalStory5)
        {
            showInterstitial();
            startActivity(new Intent(SelectMotivationalStories.this, MotivationalStory5.class));
        }
        if(view == tvmotivationalStory6)
        {
            showInterstitial();
            startActivity(new Intent(SelectMotivationalStories.this, MotivationalStory6.class));
        }
        if(view == tvmotivationalStory7)
        {
            showInterstitial();
            startActivity(new Intent(SelectMotivationalStories.this, MotivationalStory7.class));
        }
        if(view == tvmotivationalStory8)
        {
            showInterstitial();
            startActivity(new Intent(SelectMotivationalStories.this, MotivationalStory8.class));
        }
        if(view == tvmotivationalStory9)
        {
            showInterstitial();
            startActivity(new Intent(SelectMotivationalStories.this, MotivationalStory9.class));
        }
        if(view == tvmotivationalStory10)
        {
            showInterstitial();
            startActivity(new Intent(SelectMotivationalStories.this, MotivationalStory10.class));
        }
    }
}
