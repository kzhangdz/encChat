package com.example.p2pchat.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.p2pchat.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NavigationBar {
    private Activity activity;
    private BottomNavigationView bottomNavigationView;

    public NavigationBar(final Activity activity){
        setActivity(activity);

        setBottomNavigationView((BottomNavigationView) this.activity.findViewById(R.id.bottomNavigationView));

        //TODO: write the intent switch code. Will need to pass in user info
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_chats:
                                Toast.makeText(activity, "Chats", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.action_profile:
                                Toast.makeText(activity, "Profile", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return true;
                    }
                }
        );
    }

    private void openPage(){

    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public BottomNavigationView getBottomNavigationView() {
        return bottomNavigationView;
    }

    public void setBottomNavigationView(BottomNavigationView bottomNavigationView) {
        this.bottomNavigationView = bottomNavigationView;
    }
}
