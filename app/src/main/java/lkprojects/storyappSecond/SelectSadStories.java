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

import lkprojects.storyappSecond.storiesclasses.MotivationalStory1;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory2;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory3;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory4;
import lkprojects.storyappSecond.storiesclasses.MotivationalStory5;
import lkprojects.storyappSecond.storiesclasses.SadStory1;
import lkprojects.storyappSecond.storiesclasses.SadStory2;
import lkprojects.storyappSecond.storiesclasses.SadStory3;
import lkprojects.storyappSecond.storiesclasses.SadStory4;
import lkprojects.storyappSecond.storiesclasses.SadStory5;
import lkprojects.storyappSecond.storiesclasses.SadStory6;
import lkprojects.storyappSecond.storiesclasses.SelectCategories;

public class SelectSadStories extends AppCompatActivity implements View.OnClickListener {
    protected void onStart() {
        super.onStart();

        ConnectivityManager ConnectionManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo networkInfo = ConnectionManager.getActiveNetworkInfo();
        if(networkInfo != null && networkInfo.isConnected()==true )
        {

        }
        else
        {
            Toast.makeText(SelectSadStories.this, "Switch ON your internet!!!", Toast.LENGTH_LONG).show();

        }
    }
    private InterstitialAd mInterstitialAd;
    private TextView tvsadStory1, tvsadStory2, tvsadStory3, tvsadStory4, tvsadStory5, tvsadStory6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sad_stories);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        mInterstitialAd = newInterstitialAd();
        loadInterstitial();
        tvsadStory1 = findViewById(R.id.go2sadStory1);
        tvsadStory2 = findViewById(R.id.go2sadStory2);
        tvsadStory3 = findViewById(R.id.go2sadStory3);
        tvsadStory4 = findViewById(R.id.go2sadStory4);
        tvsadStory5 = findViewById(R.id.go2sadStory5);
        tvsadStory6 = findViewById(R.id.go2sadStory6);
        tvsadStory1.setOnClickListener(this);
        tvsadStory2.setOnClickListener(this);
        tvsadStory3.setOnClickListener(this);
        tvsadStory4.setOnClickListener(this);
        tvsadStory5.setOnClickListener(this);
        tvsadStory6.setOnClickListener(this);

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
        if(view == tvsadStory1)
        {
            showInterstitial();
            startActivity(new Intent(SelectSadStories.this, SadStory1.class));
        }
        if(view == tvsadStory2)
        {
            showInterstitial();
            startActivity(new Intent(SelectSadStories.this, SadStory2.class));
        }
        if(view == tvsadStory3)
        {
            showInterstitial();
            startActivity(new Intent(SelectSadStories.this, SadStory3.class));
        }
        if(view == tvsadStory4)
        {
            showInterstitial();
            startActivity(new Intent(SelectSadStories.this, SadStory4.class));
        }
        if(view == tvsadStory5)
        {
            showInterstitial();
            startActivity(new Intent(SelectSadStories.this, SadStory5.class));
        }
        if(view == tvsadStory6)
        {
            showInterstitial();
            startActivity(new Intent(SelectSadStories.this, SadStory6.class));
        }
    }
}
