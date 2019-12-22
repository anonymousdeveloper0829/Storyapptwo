package lkprojects.storyappSecond;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import lkprojects.storyappSecond.storiesclasses.SelectCategories;
import lkprojects.storyappSecond.storiesclasses.Story11;
import lkprojects.storyappSecond.storiesclasses.Story12;
import lkprojects.storyappSecond.storiesclasses.Story13;
import lkprojects.storyappSecond.storiesclasses.Story14;
import lkprojects.storyappSecond.storiesclasses.Story15;
import lkprojects.storyappSecond.storiesclasses.Story16;
import lkprojects.storyappSecond.storiesclasses.Story17;
import lkprojects.storyappSecond.storiesclasses.Story18;
import lkprojects.storyappSecond.storiesclasses.Story19;
import lkprojects.storyappSecond.storiesclasses.Story20;
import lkprojects.storyappSecond.storiesclasses.Story21;
import lkprojects.storyappSecond.storiesclasses.Story22;
import lkprojects.storyappSecond.storiesclasses.Story23;
import lkprojects.storyappSecond.storiesclasses.Story24;
import lkprojects.storyappSecond.storiesclasses.Story25;
import lkprojects.storyappSecond.storiesclasses.Story26;
import lkprojects.storyappSecond.storiesclasses.Story27;
import lkprojects.storyappSecond.storiesclasses.Story28;
import lkprojects.storyappSecond.storiesclasses.Story29;
import lkprojects.storyappSecond.storiesclasses.Story30;
import lkprojects.storyappSecond.storiesclasses.Story31;
import lkprojects.storyappSecond.storiesclasses.Story32;
import lkprojects.storyappSecond.storiesclasses.Story33;
import lkprojects.storyappSecond.storiesclasses.Story34;
import lkprojects.storyappSecond.storiesclasses.Story35;
import lkprojects.storyappSecond.storiesclasses.Story36;
import lkprojects.storyappSecond.storiesclasses.Story37;
import lkprojects.storyappSecond.storiesclasses.Story38;
import lkprojects.storyappSecond.storiesclasses.Story39;
import lkprojects.storyappSecond.storiesclasses.Story40;
import lkprojects.storyappSecond.storiesclasses.Story41;
import lkprojects.storyappSecond.storiesclasses.Story42;
import lkprojects.storyappSecond.storiesclasses.Story43;
import lkprojects.storyappSecond.storiesclasses.Story44;
import lkprojects.storyappSecond.storiesclasses.Story45;
import lkprojects.storyappSecond.storiesclasses.Story46;
import lkprojects.storyappSecond.storiesclasses.Story47;
import lkprojects.storyappSecond.storiesclasses.Story48;
import lkprojects.storyappSecond.storiesclasses.Story49;
import lkprojects.storyappSecond.storiesclasses.Story50;
import lkprojects.storyappSecond.storiesclasses.Story51;
import lkprojects.storyappSecond.storiesclasses.Story52;
import lkprojects.storyappSecond.storiesclasses.Story53;
import lkprojects.storyappSecond.storiesclasses.Story54;
import lkprojects.storyappSecond.storiesclasses.Story55;
import lkprojects.storyappSecond.storiesclasses.Story56;
import lkprojects.storyappSecond.storiesclasses.Story57;
import lkprojects.storyappSecond.storiesclasses.Story58;
import lkprojects.storyappSecond.storiesclasses.Story59;
import lkprojects.storyappSecond.storiesclasses.Story60;
import lkprojects.storyappSecond.storiesclasses.Story61;
import lkprojects.storyappSecond.storiesclasses.Story62;
import lkprojects.storyappSecond.storiesclasses.Story63;
import lkprojects.storyappSecond.storiesclasses.Story64;
import lkprojects.storyappSecond.storiesclasses.Story65;
import lkprojects.storyappSecond.storiesclasses.Story66;
import lkprojects.storyappSecond.storiesclasses.Story67;
import lkprojects.storyappSecond.storiesclasses.Story68;
import lkprojects.storyappSecond.storiesclasses.Story69;
import lkprojects.storyappSecond.storiesclasses.Story70;
import lkprojects.storyappSecond.storiesclasses.Story71;
import lkprojects.storyappSecond.storiesclasses.StoryEight;
import lkprojects.storyappSecond.storiesclasses.StoryFive;
import lkprojects.storyappSecond.storiesclasses.StoryFour;
import lkprojects.storyappSecond.storiesclasses.StoryNine;
import lkprojects.storyappSecond.storiesclasses.StoryOne;
import lkprojects.storyappSecond.storiesclasses.StorySeven;
import lkprojects.storyappSecond.storiesclasses.StorySix;
import lkprojects.storyappSecond.storiesclasses.StoryTen;
import lkprojects.storyappSecond.storiesclasses.StoryThree;
import lkprojects.storyappSecond.storiesclasses.StoryTwo;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    TextView go2story1, go2story2, go2story3, go2story4, go2story5, go2story6, go2story7, go2story8, go2story9,go2story10, go2story11,go2story12;
    TextView go2story13, go2story14, go2story15, go2story16, go2story17, go2story18, go2story19, go2story20;
    TextView go2story21, go2story22, go2story23, go2story24, go2story25, go2story26, go2story27, go2story28, go2story29, go2story30;
    TextView go2story31, go2story32, go2story33, go2story34, go2story35, go2story36, go2story37, go2story38, go2story39, go2story40;
    TextView go2story41, go2story42, go2story43, go2story44, go2story45, go2story46, go2story47, go2story48, go2story49, go2story50;
    TextView go2story51, go2story52, go2story53, go2story54, go2story55, go2story56, go2story57, go2story58, go2story59, go2story60;
    TextView go2story61, go2story62, go2story63, go2story64, go2story65, go2story66, go2story67, go2story68, go2story69, go2story70, go2story71 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        go2story1 = findViewById(R.id.go2story1);
        go2story2 = findViewById(R.id.go2story2);
        go2story3 = findViewById(R.id.go2story3);
        go2story4 = findViewById(R.id.go2story4);
        go2story5 = findViewById(R.id.go2story5);
        go2story6 = findViewById(R.id.go2story6);
        go2story7 = findViewById(R.id.go2story7);
        go2story8 = findViewById(R.id.go2story8);
        go2story9 = findViewById(R.id.go2story9);
        go2story10 = findViewById(R.id.go2story10);
        go2story11 = findViewById(R.id.go2story11);
        go2story12 = findViewById(R.id.go2story12);
        go2story13 = findViewById(R.id.go2story13);
        go2story14 = findViewById(R.id.go2story14);
        go2story15 = findViewById(R.id.go2story15);
        go2story16 = findViewById(R.id.go2story16);
        go2story17 = findViewById(R.id.go2story17);
        go2story18 = findViewById(R.id.go2story18);
        go2story19 = findViewById(R.id.go2story19);
        go2story20 = findViewById(R.id.go2story20);
        go2story21 = findViewById(R.id.go2story21);
        go2story22 = findViewById(R.id.go2story22);
        go2story23 = findViewById(R.id.go2story23);
        go2story24 = findViewById(R.id.go2story24);
        go2story25 = findViewById(R.id.go2story25);
        go2story26 = findViewById(R.id.go2story26);
        go2story27 = findViewById(R.id.go2story27);
        go2story28 = findViewById(R.id.go2story28);
        go2story29 = findViewById(R.id.go2story29);
        go2story30 = findViewById(R.id.go2story30);
        go2story31 = findViewById(R.id.go2story31);
        go2story32 = findViewById(R.id.go2story32);
        go2story33 = findViewById(R.id.go2story33);
        go2story34 = findViewById(R.id.go2story34);
        go2story35 = findViewById(R.id.go2story35);
        go2story36 = findViewById(R.id.go2story36);
        go2story37 = findViewById(R.id.go2story37);
        go2story38 = findViewById(R.id.go2story38);
        go2story39 = findViewById(R.id.go2story39);
        go2story40 = findViewById(R.id.go2story40);
        go2story41 = findViewById(R.id.go2story41);
        go2story42 = findViewById(R.id.go2story42);
        go2story43 = findViewById(R.id.go2story43);
        go2story44 = findViewById(R.id.go2story44);
        go2story45 = findViewById(R.id.go2story45);
        go2story46 = findViewById(R.id.go2story46);
        go2story47 = findViewById(R.id.go2story47);
        go2story48 = findViewById(R.id.go2story48);
        go2story49 = findViewById(R.id.go2story49);
        go2story50 = findViewById(R.id.go2story50);
        go2story51 = findViewById(R.id.go2story51);
        go2story52 = findViewById(R.id.go2story52);
        go2story53 = findViewById(R.id.go2story53);
        go2story54 = findViewById(R.id.go2story54);
        go2story55 = findViewById(R.id.go2story55);
        go2story56 = findViewById(R.id.go2story56);
        go2story57 = findViewById(R.id.go2story57);
        go2story58 = findViewById(R.id.go2story58);
        go2story59 = findViewById(R.id.go2story59);
        go2story60 = findViewById(R.id.go2story60);
        go2story61 = findViewById(R.id.go2story61);
        go2story62 = findViewById(R.id.go2story62);
        go2story63 = findViewById(R.id.go2story63);
        go2story64 = findViewById(R.id.go2story64);
        go2story65 = findViewById(R.id.go2story65);
        go2story66 = findViewById(R.id.go2story66);
        go2story67 = findViewById(R.id.go2story67);
        go2story68 = findViewById(R.id.go2story68);
        go2story69 = findViewById(R.id.go2story69);
        go2story70 = findViewById(R.id.go2story70);
        go2story71 = findViewById(R.id.go2story71);

        go2story1.setSelected(true);
        go2story1.setOnClickListener(this);
        go2story2.setOnClickListener(this);
        go2story3.setOnClickListener(this);
        go2story4.setOnClickListener(this);
        go2story5.setOnClickListener(this);
        go2story6.setOnClickListener(this);
        go2story7.setOnClickListener(this);
        go2story8.setOnClickListener(this);
        go2story9.setOnClickListener(this);
        go2story10.setOnClickListener(this);
        go2story11.setOnClickListener(this);
        go2story12.setOnClickListener(this);
        go2story13.setOnClickListener(this);
        go2story14.setOnClickListener(this);
        go2story15.setOnClickListener(this);
        go2story16.setOnClickListener(this);
        go2story17.setOnClickListener(this);
        go2story18.setOnClickListener(this);
        go2story19.setOnClickListener(this);
        go2story20.setOnClickListener(this);
        go2story21.setOnClickListener(this);
        go2story22.setOnClickListener(this);
        go2story23.setOnClickListener(this);
        go2story24.setOnClickListener(this);
        go2story25.setOnClickListener(this);
        go2story26.setOnClickListener(this);
        go2story27.setOnClickListener(this);
        go2story28.setOnClickListener(this);
        go2story29.setOnClickListener(this);
        go2story30.setOnClickListener(this);
        go2story31.setOnClickListener(this);
        go2story32.setOnClickListener(this);
        go2story33.setOnClickListener(this);
        go2story34.setOnClickListener(this);
        go2story35.setOnClickListener(this);
        go2story36.setOnClickListener(this);
        go2story37.setOnClickListener(this);
        go2story38.setOnClickListener(this);
        go2story39.setOnClickListener(this);
        go2story40.setOnClickListener(this);
        go2story41.setOnClickListener(this);
        go2story42.setOnClickListener(this);
        go2story43.setOnClickListener(this);
        go2story44.setOnClickListener(this);
        go2story45.setOnClickListener(this);
        go2story46.setOnClickListener(this);
        go2story47.setOnClickListener(this);
        go2story48.setOnClickListener(this);
        go2story49.setOnClickListener(this);
        go2story50.setOnClickListener(this);
        go2story51.setOnClickListener(this);
        go2story52.setOnClickListener(this);
        go2story53.setOnClickListener(this);
        go2story54.setOnClickListener(this);
        go2story55.setOnClickListener(this);
        go2story56.setOnClickListener(this);
        go2story57.setOnClickListener(this);
        go2story58.setOnClickListener(this);
        go2story59.setOnClickListener(this);
        go2story60.setOnClickListener(this);
        go2story61.setOnClickListener(this);
        go2story62.setOnClickListener(this);
        go2story63.setOnClickListener(this);
        go2story64.setOnClickListener(this);
        go2story65.setOnClickListener(this);
        go2story66.setOnClickListener(this);
        go2story67.setOnClickListener(this);
        go2story68.setOnClickListener(this);
        go2story69.setOnClickListener(this);
        go2story70.setOnClickListener(this);
        go2story71.setOnClickListener(this);
//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,StoryOne.class));
//            }
//        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "https://play.google.com/store/apps/details?id=lkprojects.storyappSecond&hl=en";
                String shareContent1="\n Mazzedaar Hindi-English Kahaniya [2020]-Latest\n";
                String shareContent2=" Bhabi|Dewar|Saali|padosan|delhiwaliladki|hotelwali ladki|Motivational | Love| Breakup| Sad Stories \n";
                String shareContent3 = "\n ";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Mazzedaar Hindi-English Kahaniya [2020]-Latest");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareContent1+shareContent2+shareContent3+shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(MainActivity.this, SelectCategories.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

//        if (id == R.id.nav_camera) {
//            // Handle the camera action
//        } else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_slideshow) {
//
//        } else if (id == R.id.nav_manage) {
//
//        } else
            if (id == R.id.nav_share) {

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "https://play.google.com/store/apps/details?id=lkprojects.storyappSecond&hl=en";
                String shareContent1="\n Mazzedaar Hindi-English Kahaniya [2020]-Latest\n";
                String shareContent2="✦ Bhabi|Dewar|Saali|padosan|delhiwaliladki|hotelwali ladki|Breakup|Motivation|Money\n";
                String shareContent3 = "\n ";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Mazzedaar Hindi-English Kahaniya [2020]-Latest");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareContent1+shareContent2+shareContent3+shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));

        } else if (id == R.id.nav_more_apps) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=lkprojects.storyappSecond&hl=en"));
                startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view == go2story1) {
            startActivity(new Intent(MainActivity.this, StoryOne.class));
        }
        if (view == go2story2) {
            startActivity(new Intent(MainActivity.this,StoryTwo.class));
        }
        if (view == go2story3) {
            startActivity(new Intent(MainActivity.this,StoryThree.class));
        }
        if (view == go2story4) {
            startActivity(new Intent(MainActivity.this,StoryFour.class));
        }
        if (view == go2story5) {
            startActivity(new Intent(MainActivity.this,StoryFive.class));
        }
        if (view == go2story6) {
            startActivity(new Intent(MainActivity.this,StorySix.class));
        }
        if (view == go2story7) {
            startActivity(new Intent(MainActivity.this,StorySeven.class));
        }
        if (view == go2story8) {
            startActivity(new Intent(MainActivity.this,StoryEight.class));
        }if (view == go2story9) {
            startActivity(new Intent(MainActivity.this,StoryNine.class));
        }if (view == go2story10) {
            startActivity(new Intent(MainActivity.this,StoryTen.class));
        }if (view == go2story11) {
            startActivity(new Intent(MainActivity.this,Story11.class));
        }if (view == go2story12) {
            startActivity(new Intent(MainActivity.this,Story12.class));
        }if (view == go2story13) {
            startActivity(new Intent(MainActivity.this,Story13.class));
        }if (view == go2story14) {
            startActivity(new Intent(MainActivity.this,Story14.class));
        }if (view == go2story15) {
            startActivity(new Intent(MainActivity.this,Story15.class));
        }if (view == go2story16) {
            startActivity(new Intent(MainActivity.this,Story16.class));
        }if (view == go2story17) {
            startActivity(new Intent(MainActivity.this,Story17.class));
        }if (view == go2story18) {
            startActivity(new Intent(MainActivity.this,Story18.class));
        }if (view == go2story19) {
            startActivity(new Intent(MainActivity.this,Story19.class));
        }if (view == go2story20) {
            startActivity(new Intent(MainActivity.this,Story20.class));
        }if (view == go2story21) {
            startActivity(new Intent(MainActivity.this,Story21.class));
        }if (view == go2story22) {
            startActivity(new Intent(MainActivity.this,Story22.class));
        }if (view == go2story23) {
            startActivity(new Intent(MainActivity.this,Story23.class));
        }if (view == go2story24) {
            startActivity(new Intent(MainActivity.this,Story24.class));
        }if (view == go2story25) {
            startActivity(new Intent(MainActivity.this,Story25.class));
        }if (view == go2story26) {
            startActivity(new Intent(MainActivity.this,Story26.class));
        }if (view == go2story27) {
            startActivity(new Intent(MainActivity.this,Story27.class));
        }if (view == go2story28) {
            startActivity(new Intent(MainActivity.this,Story28.class));
        }if (view == go2story29) {
            startActivity(new Intent(MainActivity.this,Story29.class));
        }if (view == go2story30) {
            startActivity(new Intent(MainActivity.this,Story30.class));
        }if (view == go2story31) {
            startActivity(new Intent(MainActivity.this,Story31.class));
        }if (view == go2story32) {
            startActivity(new Intent(MainActivity.this,Story32.class));
        }if (view == go2story33) {
            startActivity(new Intent(MainActivity.this,Story33.class));
        }if (view == go2story34) {
            startActivity(new Intent(MainActivity.this,Story34.class));
        }if (view == go2story35) {
            startActivity(new Intent(MainActivity.this,Story35.class));
        }if (view == go2story36) {
            startActivity(new Intent(MainActivity.this,Story36.class));
        }if (view == go2story37) {
            startActivity(new Intent(MainActivity.this,Story37.class));
        }if (view == go2story38) {
            startActivity(new Intent(MainActivity.this,Story38.class));
        }if (view == go2story39) {
            startActivity(new Intent(MainActivity.this,Story39.class));
        }if (view == go2story40) {
            startActivity(new Intent(MainActivity.this,Story40.class));
        }if (view == go2story41) {
            startActivity(new Intent(MainActivity.this,Story41.class));
        }if (view == go2story42) {
            startActivity(new Intent(MainActivity.this,Story42.class));
        }if (view == go2story43) {
            startActivity(new Intent(MainActivity.this,Story43.class));
        }if (view == go2story44) {
            startActivity(new Intent(MainActivity.this,Story44.class));
        }if (view == go2story45) {
            startActivity(new Intent(MainActivity.this,Story45.class));
        }if (view == go2story46) {
            startActivity(new Intent(MainActivity.this,Story46.class));
        }if (view == go2story47) {
            startActivity(new Intent(MainActivity.this,Story47.class));
        }if (view == go2story48) {
            startActivity(new Intent(MainActivity.this,Story48.class));
        }if (view == go2story49) {
            startActivity(new Intent(MainActivity.this,Story49.class));
        }if (view == go2story50) {
            startActivity(new Intent(MainActivity.this,Story50.class));
        }if (view == go2story51) {
            startActivity(new Intent(MainActivity.this, Story51.class));
        }if (view == go2story52) {
            startActivity(new Intent(MainActivity.this, Story52.class));
        }if (view == go2story53) {
            startActivity(new Intent(MainActivity.this, Story53.class));
        }if (view == go2story54) {
            startActivity(new Intent(MainActivity.this, Story54.class));
        }if (view == go2story55) {
            startActivity(new Intent(MainActivity.this, Story55.class));
        }if (view == go2story56) {
            startActivity(new Intent(MainActivity.this, Story56.class));
        }if (view == go2story57) {
            startActivity(new Intent(MainActivity.this, Story57.class));
        }if (view == go2story58) {
            startActivity(new Intent(MainActivity.this, Story58.class));
        }if (view == go2story59) {
            startActivity(new Intent(MainActivity.this, Story59.class));
        }if (view == go2story60) {
            startActivity(new Intent(MainActivity.this, Story60.class));
        }
        if (view == go2story61) {
            startActivity(new Intent(MainActivity.this, Story61.class));
        }
        if (view == go2story62) {
            startActivity(new Intent(MainActivity.this, Story62.class));
        }
        if (view == go2story63) {
            startActivity(new Intent(MainActivity.this, Story63.class));
        }
        if (view == go2story64) {
            startActivity(new Intent(MainActivity.this, Story64.class));
        }
        if (view == go2story65) {
            startActivity(new Intent(MainActivity.this, Story65.class));
        }
        if (view == go2story66) {
            startActivity(new Intent(MainActivity.this, Story66.class));
        }
        if (view == go2story67) {
            startActivity(new Intent(MainActivity.this, Story67.class));
        }
        if (view == go2story68) {
            startActivity(new Intent(MainActivity.this, Story68.class));
        }
        if (view == go2story69) {
            startActivity(new Intent(MainActivity.this, Story69.class));
        }
        if (view == go2story70) {
            startActivity(new Intent(MainActivity.this, Story70.class));
        }
        if (view == go2story71) {
            startActivity(new Intent(MainActivity.this, Story71.class));
        }
        }
    }
