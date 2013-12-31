package com.example.app.objects;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.app.R;


public class SettingsWrapper implements ISettings {
    Context context;
    SharedPreferences prefs;

    public SettingsWrapper(Context context) {
        this.context = context;
        prefs = context.getSharedPreferences("com.example.app", Context.MODE_PRIVATE);
    }

    String tagCode = "tagCode";
    @Override
    public String getTagCode() {
        return prefs.getString(tagCode, "");
    }
    @Override
    public void setTagCode(String s) {
        prefs.edit().putString(tagCode, s).commit();
    }

    @Override
    public String getBaseUrl() {
        return context.getString(R.string.baseUrl);
    }
}
