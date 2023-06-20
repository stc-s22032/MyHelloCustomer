package jp.suntech.s22032.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン・オブジェクトの用意
        Button btClick = findViewById(R.id.btClick);
        Button btrClear = findViewById(R.id.btrClear);
        Button btnClear = findViewById(R.id.btnClear);


        //リスナ・オブジェクトの用意
        HelloCustomeListener Listener = new HelloCustomeListener();
        //ボタンにリスナを設定
        btClick.setOnClickListener(Listener);
        btrClear.setOnClickListener(Listener);
        btnClear.setOnClickListener(Listener);
    }
    private class HelloCustomeListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText r_input =findViewById(R.id.etResi);
            EditText n_input =findViewById(R.id.etName);
            TextView r_output =findViewById(R.id.tvrOutput);
            TextView n_output =findViewById(R.id.tvnOutput);

            int id = v.getId();

            if (id==R.id.btClick) {
                String r_inputStr = r_input.getText().toString();
                String n_inputStr = n_input.getText().toString();

                r_output.setText(r_inputStr);
                n_output.setText(n_inputStr);
            } else if (id==R.id.btrClear) {
                r_input.setText("");
                r_output.setText("");
            }else{
                n_input.setText("");
                n_output.setText("");
            }
        }
    }
}