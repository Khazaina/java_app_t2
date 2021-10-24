package com.example.khazaina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] digit={1,2,3,4,5,6,7,8,9};
    String[] a={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    String[] sentence={"I have one pen.","give me two cookies","I bought three jugs",
            "I have four pens.","give me five cookies","I bought six jugs",
            "I have seven pens.","give me eight cookies","I bought nine jugs"};
    EditText number;
    TextView Number,sen,dig;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.number);
        Number=findViewById(R.id.num);
        sen=findViewById(R.id.sen);
        dig=findViewById(R.id.digit);
        btn=findViewById(R.id.button);
    }
}