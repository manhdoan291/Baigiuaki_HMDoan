package com.example.baigiuaki_hmdoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Goi cac thuoc tinh o trong file xml
    EditText et1,et2;
    ImageButton bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.dangnhap);
        et2 = findViewById(R.id.matkhau);
        bt = findViewById(R.id.btn_dangnhap);
        bt.setOnClickListener(new View.OnClickListener() {
            String tk = et1.getText().toString().trim();
            String mk = et2.getText().toString().trim();
            @Override
            public void onClick(View view) {
                if(checkaccount(tk,mk)){
                    startActivity(new Intent(MainActivity.this,LoginActivity.class));
                }
                else{
                    Toast.makeText(getApplicationContext(),"Thông tin đăng nhập chưa chính xác",Toast.LENGTH_LONG);
                }
            }//cai btn dang nhap toi cho may cai background long nhau co , so no k nhan, ong edit giao dien giong cua ong xem
        });
    }//deo hieu sao debug khong hien ra gì @@
    private boolean checkaccount(String acc,String pass){
        String tk="doanhd";
        String mk="675105021"; //nhap ma sinh vien cua o  vao
        if(tk.equals(acc) && mk.equals(pass))
            return true;
        else return false;
    }
}