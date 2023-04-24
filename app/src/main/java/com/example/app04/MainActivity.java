package com.example.app04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {   // 画面作成用クラス（Activity）を継承

    // クリック処理の中身だけを別途「clickListener」という名前の変数として用意。
    // 用意と同時に中身のonClick()の定義も行っている。
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {    // 引数のview変数にはkクリックされたViewが渡される。
            Button btn = (Button)view;      // クリックされたViewをButtonクラスにキャスト（変換）
            // 画面下に表示される数秒のテキスト表示用処理
            // makeText()メソッドの引数には「Context、表示する文字、表示する長さ」を設定。ActivityはContextを継承しているので自身を渡している。
            // 最後にshow()メソッドで表示
            Toast.makeText(MainActivity.this, btn.getText().toString(),Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //各ボタンに対し、直接クリック処理を設定。
        findViewById(R.id.btn1).setOnClickListener(clickListener);  //btn1というIDのボタンに設定
        findViewById(R.id.btn2).setOnClickListener(clickListener);  //btn2というIDのボタンに設定
        findViewById(R.id.btn3).setOnClickListener(clickListener);  //btn3というIDのボタンに設定
        findViewById(R.id.btn4).setOnClickListener(clickListener);  //btn4というIDのボタンに設定
        findViewById(R.id.btn5).setOnClickListener(clickListener);  //btn5というIDのボタンに設定

    }

}