package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColoursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Blue", "BLE"));
        words.add(new Word("Red", "KO-kino",R.drawable.color_red));
        words.add(new Word("Green", "PRA-sino",R.drawable.color_green));
        words.add(new Word("Yellow", "KI-trino",R.drawable.color_mustard_yellow));
        words.add(new Word("Black", "MA-vro",R.drawable.color_black));
        words.add(new Word("Pink", "ROZ"));
        words.add(new Word("Orange", "portoka-LI"));
        words.add(new Word("Brown", "ka-FE"));
        words.add(new Word("White", "AS-pro",R.drawable.color_white));
        words.add(new Word("Purple", "MOV/kia-NO"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView ListView = (ListView) findViewById(R.id.list);

        ListView.setAdapter(adapter);
    }
}





