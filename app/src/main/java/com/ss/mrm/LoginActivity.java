package com.ss.mrm;

 import android.content.Intent;
 import android.support.v7.app.AppCompatActivity;
  import android.os.Bundle;
 import android.util.Log;
import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;
 import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText metUserName,metPassword;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        setLoginListener();
    }



    private void initView() {
        metUserName= (EditText)findViewById(R.id.UserName);
        metPassword=(EditText)findViewById(R.id.Password);
        b= (Button) findViewById(R.id.LoginBtn);
    }


    private void setLoginListener() {
        MyListener listener= new MyListener(this,metUserName,metPassword);
        b.setOnClickListener(listener);
    }
    class MyListener implements View.OnClickListener{
        EditText etUserName,etPassword;
        LoginActivity activity;
        public MyListener(LoginActivity activity ,EditText etUserName,EditText etPassword){
            this.etUserName = etUserName;
            this.etPassword = etPassword;
            this.activity = activity;
        }

        @Override
        public void onClick(View v) {
            String strUserName = etUserName.getText().toString();
            String strPassword = etPassword.getText().toString();
            if(strUserName==""||strUserName.equals("")){
                etUserName.setError("用户名不为空！！！");
            }

            if(strPassword==""||strPassword.equals("")){
                etPassword.setError("密码不为空！！！");
            }
            Log.i("main", "用户名:" + strUserName + "密码：" + strPassword);
             Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
           // overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
        }
    }
}

