package com.example.teo.a18activitylifecycle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("lifecycle", "onCreated invoked"); //Hiển thị ở log một "gọi tạo nên"
    }

    //called when activity is becoming visible to the user;
    //Gọi khi hoạt động được hiển thị cho người sử dụng.
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked"); //Hiển thị ở log một "gọi bắt đầu"
    }

    //called when activity will start interacting with the user;
    //Gọi khi bắt hoạt động bắt dầu tương tác với người dùng
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onRemem invoked");
    }

    //called when activity is not visible to the user
    //Gọi khi hoạt động không hiển thi cho người dùng
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked");
    }

    //Called when activity is no longer visible to the user
    //Gọi khi hoạt động không còn (lâu hơn) hiển thị co người dùng
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "onStop invoked");
    }

    //Called after your activity is stopped, prior to start.
    //Gọi sau khi hoạt động của bạn dừng lại, trước bắt đầu.
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }

    //Called before the activity is destroyed
    //Gọi trước khi nó hoạt động bị hủy.
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy");
    }
}
