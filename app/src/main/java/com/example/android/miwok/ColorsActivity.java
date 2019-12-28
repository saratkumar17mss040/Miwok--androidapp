package com.example.android.miwok;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ColorsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new ColorsFragment()).commit();
    }
}

//    private  MediaPlayer mMediaPlayer;
//
//    private AudioManager mAudioManager;
//
//    AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener()
//    {
//        @Override
//        public  void onAudioFocusChange(int focusChange)
//        {
//            if(focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK || focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT)
//            {
//                mMediaPlayer.pause();
//                mMediaPlayer.seekTo(0);
//            }
//            else if(focusChange==AudioManager.AUDIOFOCUS_GAIN)
//                mMediaPlayer.start();
//            else if(focusChange==AudioManager.AUDIOFOCUS_LOSS)
//               releaseMediaPlayer();
//        }
//    };
//
//    private  MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mp) {
//            releaseMediaPlayer();
//        }
//    };
//
//
//
//
//    private void releaseMediaPlayer()
//    {
//        if(mMediaPlayer!=null)
//        {
//            mMediaPlayer.release();
//            mMediaPlayer=null;
//        }
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        releaseMediaPlayer();
//        Log.v("ColorsActivity","ColorsActivity_MediaPlayer_Released");
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.word_list);
//
//
//        final ArrayList<Word> Words = new ArrayList<>();
//
//        Words.add(new Word("red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
//        Words.add(new Word("green","chokokki",R.drawable.color_green,R.raw.color_green));
//        Words.add(new Word("brown","ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
//        Words.add(new Word("gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
//        Words.add(new Word("black","kululli",R.drawable.color_black,R.raw.color_black));
//        Words.add(new Word("white","kelelli",R.drawable.color_white,R.raw.color_white));
//        Words.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
//        Words.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
//
//        WordAdapter adapter = new WordAdapter(this,Words,R.color.category_colors);
//
//        ListView listView = findViewById(R.id.wordview);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Word word = Words.get(position);
//                releaseMediaPlayer();
//                mMediaPlayer=MediaPlayer.create(ColorsActivity.this,word.getAudioResourceId());
//                mMediaPlayer.start();
//            }
//        });
//        listView.setAdapter(adapter);
//
//    }

