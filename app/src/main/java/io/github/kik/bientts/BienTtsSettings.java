package io.github.kik.bientts;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import java.util.List;

public class BienTtsSettings extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.preferences_headers, target);
    }
}
