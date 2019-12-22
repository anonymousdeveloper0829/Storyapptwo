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
import lkprojects.storyappSecond.storiesclasses.LoveStory6;
import lkprojects.storyappSecond.storiesclasses.SelectCategories;

public class SelectLoveStories extends AppCompatActivity implements View.OnClickListener {
    protected void onStart() {
        super.onStart();

        ConnectivityManager ConnectionManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo networkInfo = ConnectionManager.getActiveNetworkInfo();
        if(networkInfo != null && networkInfo.isConnected()==true )
        {

        }
        else
        {
            Toast.makeText(SelectLoveStories.this, "Switch ON your internet!!!", Toast.LENGTH_LONG).show();

        }
    }
    private InterstitialAd mInterstitialAd;
    private TextView tvLoveStory1, tvLoveStory2, tvLoveStory3, tvLoveStory4, tvLoveStory5, tvLoveStory6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_love_stories);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        mInterstitialAd = newInterstitialAd();
        loadInterstitial();
        tvLoveStory1 = findViewById(R.id.go2loveStory1);
        tvLoveStory2 = findViewById(R.id.go2loveStory2);
        tvLoveStory3 = findViewById(R.id.go2loveStory3);
        tvLoveStory4 = findViewById(R.id.go2loveStory4);
        tvLoveStory5 = findViewById(R.id.go2loveStory5);
        tvLoveStory6 = findViewById(R.id.go2loveStory6);
        tvLoveStory1.setOnClickListener(this);
        tvLoveStory2.setOnClickListener(this);
        tvLoveStory3.setOnClickListener(this);
        tvLoveStory4.setOnClickListener(this);
        tvLoveStory5.setOnClickListener(this);
        tvLoveStory6.setOnClickListener(this);

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
        if(view == tvLoveStory1)
        {
            showInterstitial();
            startActivity(new Intent(SelectLoveStories.this, LoveStory1.class));
        }
        if(view == tvLoveStory2)
        {
            showInterstitial();
            startActivity(new Intent(SelectLoveStories.this, LoveStory2.class));
        }
        if(view == tvLoveStory3)
        {
            showInterstitial();
            startActivity(new Intent(SelectLoveStories.this, LoveStory3.class));
        }
        if(view == tvLoveStory4)
        {
            showInterstitial();
            startActivity(new Intent(SelectLoveStories.this, LoveStory4.class));
        }
        if(view == tvLoveStory5)
        {
            showInterstitial();
            startActivity(new Intent(SelectLoveStories.this, LoveStory5.class));
        }
        if(view == tvLoveStory6)
        {
            showInterstitial();
            startActivity(new Intent(SelectLoveStories.this, LoveStory6.class));
        }
    }
}
