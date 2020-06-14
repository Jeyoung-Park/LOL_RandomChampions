package com.example.lol_randomchampions;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Btn5Activity extends AppCompatActivity {

    public static final int NUMBER=148; //롤 챔피언 수 일단 상수로 선언
    TextView[] textview=new TextView[5];
    ImageButton btn_reset5;
    int[] arr=new int[5];

  /*  //배열의 각 요소를 -1으로 초기화
    void init_arr(int arr[], int size){
        for(int i=0;i<size;i++)
            arr[i]=-1;
    }
*/
    //배열 arr에 value값 추가
    void arr_add(int arr[], int index, int value){
        arr[index]=value;
    }

    //크기가 size인 배열 arr에 value가 있으면 false, 아니면 true
    boolean check_arr(int arr[], int size, int value){
        for(int i=0;i<size;i++){
            if(arr[i]==value)
                return false;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn5); //화면 매칭
        //init_arr(arr, 5);

        textview[0]=findViewById(R.id.textview1);
        textview[1]=findViewById(R.id.textview2);
        textview[2]=findViewById(R.id.textview3);
        textview[3]=findViewById(R.id.textview4);
        textview[4]=findViewById(R.id.textview5);

        Random rnd=new Random();

        for(int i=0;i<5;i++){
            int num=rnd.nextInt(NUMBER);

            String[] array=getResources().getStringArray(R.array.LOL_CHAMPIONS);
            while(true){
                if(i==0){
                    textview[i].setText(array[num]);
                    break;
                }
                textview[i].setText(array[num]);
                if(check_arr(arr, i+1, num))
                    break;
            }
            arr_add(arr, i, num);
        }

        btn_reset5=findViewById(R.id.btn_reset5);
        btn_reset5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  init_arr(arr, 5);

                Random rnd=new Random();

                for(int i=0;i<5;i++){
                    int num=rnd.nextInt(NUMBER);

                    String[] array=getResources().getStringArray(R.array.LOL_CHAMPIONS);
                    while(true){
                        if(i==0){
                            textview[i].setText(array[num]);
                            break;
                        }
                        textview[i].setText(array[num]);
                        if(check_arr(arr, i+1, num))
                            break;
                    }
                    arr_add(arr, i, num);
                }
            }
        });
    }
    
}
