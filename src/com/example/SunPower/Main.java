package com.example.SunPower;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {
    /**
     * Called when the activity is first created.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        showCheckListEtap1();
    }

//    public final void showCheckListEtap1(){
//        CheckListEtape1Fragment checkListEtape1Fragment = new CheckListEtape1Fragment();
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.replace(R.id.mainContainerForFragment , checkListEtape1Fragment);
//        ft.commit();
//    }
}
