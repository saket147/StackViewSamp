package com.example.saket.stackviewsamp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.StackView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StackView stk = (StackView)this.findViewById(R.id.StackCard);

        try {
            ArrayList<StackItems> items = new ArrayList<StackItems>();
            items.add(new StackItems("text1", this.getResources().getDrawable(R.drawable.hola)));
            items.add(new StackItems("text2", this.getResources().getDrawable(R.drawable.new_pic)));
            items.add(new StackItems("text3", this.getResources().getDrawable(R.drawable.profile)));
            items.add(new StackItems("text4", this.getResources().getDrawable(R.drawable.rbg)));
            items.add(new StackItems("text5", this.getResources().getDrawable(R.drawable.abc)));

            StackAdapter adapt = new StackAdapter(this, R.layout.item, items);

            stk.setAdapter(adapt);
        }catch (OutOfMemoryError error){
            error.printStackTrace();
        }
    }
}
