package com.example.bca4semnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Main2Activity_abt extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_abt);

        TextView sendEmailNavdeep = findViewById(R.id.send_email_nav);
        sendEmailNavdeep.setMovementMethod(LinkMovementMethod.getInstance());

        TextView githubNavdeep = findViewById(R.id.github_navdeep);
        githubNavdeep.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkedInNavdeep = findViewById(R.id.linkedIn_navdeep);
        linkedInNavdeep.setMovementMethod(LinkMovementMethod.getInstance());

        TextView sendEmailNabeel = findViewById(R.id.send_email_nabeel);
        sendEmailNabeel.setMovementMethod(LinkMovementMethod.getInstance());

        TextView githubNabeel = findViewById(R.id.github_nabeel);
        githubNabeel.setMovementMethod(LinkMovementMethod.getInstance());

        TextView websiteNabeel = findViewById(R.id.website_nabeel);
        websiteNabeel.setMovementMethod(LinkMovementMethod.getInstance());

        TextView sendEmailMohit = findViewById(R.id.send_email_mohit);
        sendEmailMohit.setMovementMethod(LinkMovementMethod.getInstance());

        TextView githubMohit = findViewById(R.id.github_mohit);
        githubMohit.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
