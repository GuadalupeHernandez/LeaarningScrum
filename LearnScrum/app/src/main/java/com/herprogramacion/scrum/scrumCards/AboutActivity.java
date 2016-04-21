package com.herprogramacion.scrum.scrumCards;

import android.app.Activity;
import android.os.Bundle;

import com.herprogramacion.scrum.R;

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Preferences.setWindowFlags(this, false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }
}
