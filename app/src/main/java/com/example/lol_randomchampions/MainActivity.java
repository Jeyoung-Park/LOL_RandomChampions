package com.example.lol_randomchampions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button  btn_OneChamp, btn_FiveChamp; // xml 파일에서 선언했던 변수의 자료형을 이용해 버튼을 전역변수로 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //화면 매칭

        btn_OneChamp=findViewById(R.id.btn_OneChamp); //화면에서 아이디를 찾아서 변수와 매칭, 컴포넌트를 찾음
        btn_FiveChamp=findViewById(R.id.btn_FiveChamp);

        btn_OneChamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Btn1Activity.class);
                startActivity(intent);
            }
        });
        btn_FiveChamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Btn5Activity.class);
                startActivity(intent);
            }
        });
    }

}
