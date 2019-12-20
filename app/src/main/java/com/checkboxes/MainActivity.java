package com.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static CheckBox check1,check2,check3;
    private static Button btn_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        check1 = (CheckBox)findViewById(R.id.cbDog);
        check2 = (CheckBox)findViewById(R.id.cbCat);
        check3 = (CheckBox)findViewById(R.id.cbCow);
        btn_sbm = (Button)findViewById(R.id.btnSelect);

        btn_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Dog :").append(check1.isChecked());
                result.append("\n Cat :").append(check2.isChecked());
                result.append("\n Cow :").append(check3.isChecked());

                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
