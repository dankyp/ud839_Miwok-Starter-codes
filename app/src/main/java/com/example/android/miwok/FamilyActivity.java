package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father/Dad", "Pa-te-ra/Ba-ba",R.drawable.family_father));
        words.add(new Word("Mother/Mum", "Me-te-ra/Ma-ma",R.drawable.family_mother));
        words.add(new Word("Brother", "adelfos",R.drawable.family_older_brother));
        words.add(new Word("Sister", "aderfee",R.drawable.family_older_sister));
        words.add(new Word("Grandmother", "Yiayia",R.drawable.family_grandmother));
        words.add(new Word("Grandfather", "Papou",R.drawable.family_grandfather));
        words.add(new Word("Male Cousin", "ksádelfos"));
        words.add(new Word("Female Cousin", "ksádelfi"));
        words.add(new Word("Husband", "andras"));
        words.add(new Word("Wife", "yinega"));
        words.add(new Word("Uncle", "otheios"));
        words.add(new Word("Aunt", "itheia"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView ListView = (ListView) findViewById(R.id.list);

        ListView.setAdapter(adapter);
    }
}

