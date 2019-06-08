package com.example.internews;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class ContentActivity extends YouTubeBaseActivity {

    private static String url = "https://api.androidhive.info/facebook/firebase_analytics.html";

    private WebView webView;

    private static final String TAG = "MainActivity";
    TextView v_tag, v_title, v_content;

    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Log.d(TAG, "onCreate: Starting");



        Intent intent = getIntent();

        final int index = intent.getIntExtra("index",0);
        final String intentTag = intent.getStringExtra("tag");
        final String intentTitle = intent.getStringExtra("title");
        final String intentContent = intent.getStringExtra("content");

        webView = (WebView) findViewById(R.id.web_view);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launching facebook comments activity
                Intent intent = new Intent(ContentActivity.this, FbCommentsActivity.class);

                // passing the article url
                intent.putExtra("url", "https://www.androidhive.info/2016/06/android-firebase-integrate-analytics/");
                startActivity(intent);
            }
        });

        // loading web page
        webView.loadUrl(url);

        v_tag = (TextView) findViewById(R.id.v_tags);
        v_title = (TextView) findViewById(R.id.v_title);
        v_content = (TextView) findViewById(R.id.v_content);

        v_tag.setText(intentTag);
        v_title.setText(intentTitle);
        v_content.setText(intentContent);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlay);

        listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "Done initializing.");
                List<String> videoList = new ArrayList<String>();
                videoList.add("Lu_ndka-Kr0");
                videoList.add("YjN7kiPNBE8");
                videoList.add("eGGMqEhiNM8");
                videoList.add("lL8X9kDyVkw");
                videoList.add("-bm5IZ2Fg8c");
                videoList.add("HZPhQJ1_OFU");
                youTubePlayer.loadVideo(videoList.get(index));
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "Failed to initialize .");
            }
        };

        Log.d(TAG, "Initializing Youtube Player");
        youTubePlayerView.initialize(YoutubeConfig.getApiKey(), listener);


    }
}
