package com.example.lol_randomchampions;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class Btn1Activity extends AppCompatActivity {

    private static final Integer[] ChampImages={
            R.drawable.lol1,
            R.drawable.lol2,
            R.drawable.lol3,
            R.drawable.lol4,
            R.drawable.lol5,
            R.drawable.lol6,
            R.drawable.lol7,
            R.drawable.lol8,
            R.drawable.lol9,
            R.drawable.lol10,
            R.drawable.lol11,
            R.drawable.lol12,
            R.drawable.lol13,
            R.drawable.lol14,
            R.drawable.lol15,
            R.drawable.lol16,
            R.drawable.lol17,
            R.drawable.lol18,
            R.drawable.lol19,
            R.drawable.lol20,
            R.drawable.lol21,
            R.drawable.lol22,
            R.drawable.lol23,
            R.drawable.lol24,
            R.drawable.lol25,
            R.drawable.lol26,
            R.drawable.lol27,
            R.drawable.lol28,
            R.drawable.lol29,
            R.drawable.lol30,
            R.drawable.lol31,
            R.drawable.lol32,
            R.drawable.lol33,
            R.drawable.lol34,
            R.drawable.lol35,
            R.drawable.lol36,
            R.drawable.lol37,
            R.drawable.lol38,
            R.drawable.lol39,
            R.drawable.lol40,
            R.drawable.lol41,
            R.drawable.lol42,
            R.drawable.lol43,
            R.drawable.lol44,
            R.drawable.lol45,
            R.drawable.lol46,
            R.drawable.lol47,
            R.drawable.lol48,
            R.drawable.lol49,
            R.drawable.lol50,
            R.drawable.lol51,
            R.drawable.lol52,
            R.drawable.lol53,
            R.drawable.lol54,
            R.drawable.lol55,
            R.drawable.lol56,
            R.drawable.lol57,
            R.drawable.lol58,
            R.drawable.lol59,
            R.drawable.lol60,
            R.drawable.lol61,
            R.drawable.lol62,
            R.drawable.lol63,
            R.drawable.lol64,
            R.drawable.lol65,
            R.drawable.lol66,
            R.drawable.lol67,
            R.drawable.lol68,
            R.drawable.lol69,
            R.drawable.lol70,
            R.drawable.lol71,
            R.drawable.lol72,
            R.drawable.lol73,
            R.drawable.lol74,
            R.drawable.lol75,
            R.drawable.lol76,
            R.drawable.lol77,
            R.drawable.lol78,
            R.drawable.lol79,
            R.drawable.lol80,
            R.drawable.lol81,
            R.drawable.lol82,
            R.drawable.lol83,
            R.drawable.lol84,
            R.drawable.lol85,
            R.drawable.lol86,
            R.drawable.lol87,
            R.drawable.lol88,
            R.drawable.lol89,
            R.drawable.lol90,
            R.drawable.lol91,
            R.drawable.lol92,
            R.drawable.lol93,
            R.drawable.lol94,
            R.drawable.lol95,
            R.drawable.lol96,
            R.drawable.lol97,
            R.drawable.lol98,
            R.drawable.lol99,
            R.drawable.lol100,
            R.drawable.lol101,
            R.drawable.lol102,
            R.drawable.lol103,
            R.drawable.lol104,
            R.drawable.lol105,
            R.drawable.lol106,
            R.drawable.lol107,
            R.drawable.lol108,
            R.drawable.lol109,
            R.drawable.lol110,
            R.drawable.lol111,
            R.drawable.lol112,
            R.drawable.lol113,
            R.drawable.lol114,
            R.drawable.lol115,
            R.drawable.lol116,
            R.drawable.lol117,
            R.drawable.lol118,
            R.drawable.lol119,
            R.drawable.lol120,
            R.drawable.lol121,
            R.drawable.lol122,
            R.drawable.lol123,
            R.drawable.lol124,
            R.drawable.lol125,
            R.drawable.lol126,
            R.drawable.lol127,
            R.drawable.lol128,
            R.drawable.lol129,
            R.drawable.lol130,
            R.drawable.lol131,
            R.drawable.lol132,
            R.drawable.lol133,
            R.drawable.lol134,
            R.drawable.lol135,
            R.drawable.lol136,
            R.drawable.lol137,
            R.drawable.lol138,
            R.drawable.lol139,
            R.drawable.lol140,
            R.drawable.lol141,
            R.drawable.lol142,
            R.drawable.lol143,
            R.drawable.lol144,
            R.drawable.lol145,
            R.drawable.lol146,
            R.drawable.lol147,
            R.drawable.lol148
    };

    public static final int NUMBER=148; //롤 챔피언 수 일단 상수로 선언
    private TextView TextVIew_textview;
    private ImageView ImageView_ChampImage;
    ImageButton btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1); //화면 매칭

        TextVIew_textview=findViewById(R.id.TextVIew_textview);
        ImageView_ChampImage=findViewById(R.id.ImageView_ChampImage);

        Random rnd=new Random();
        int num=rnd.nextInt(NUMBER); //0<=num<NUMBER인 난수 생성

        String[] array=getResources().getStringArray(R.array.LOL_CHAMPIONS);
        TextVIew_textview.setText(array[num]);

        ImageView_ChampImage.setImageResource(ChampImages[num]); 

        btn_reset=findViewById(R.id.btn_reset);
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd=new Random();
                int num=rnd.nextInt(NUMBER); //0<=num<NUMBER인 난수 생성

                String[] array=getResources().getStringArray(R.array.LOL_CHAMPIONS);
                TextVIew_textview.setText(array[num]);

                ImageView_ChampImage.setImageResource(ChampImages[num]);
            }
        });

    }
    
}
