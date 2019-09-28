package com.example.calcirelative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,bsub,bmul,bplus,bdiv,beq,bdel;
EditText e;
int c=0;
float num=0,num2=0;
int add=0,sub=0,mul=0,div=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bdot=findViewById(R.id.dot);
        bsub=findViewById(R.id.sub);
        bplus=findViewById(R.id.plus);
        bdiv=findViewById(R.id.div);
        bmul=findViewById(R.id.mul);
        bdel=findViewById(R.id.del);
        beq=findViewById(R.id.eq);
        e=findViewById(R.id.e1);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+".");

            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==1) {
                    num2 = Float.parseFloat(e.getText().toString());
                    if(add==1)
                    e.setText(num+num2+"");
                    if(sub==1)
                        e.setText(num-num2+"");
                    if(mul==1)
                        e.setText(num*num2+"");
                    if(div==1)
                        e.setText(num/num2+"");
                    add=0;
                    sub=0;
                    mul=0;
                    div=0;
                }
                num=Float.parseFloat(e.getText().toString());
                add=1;
                c=1;


                e.setText(null);

            }
        });
bsub.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(c==1) {
            num2 = Float.parseFloat(e.getText().toString());
            if(add==1)
                e.setText(num+num2+"");
            if(sub==1)
                e.setText(num-num2+"");
            if(mul==1)
                e.setText(num*num2+"");
            if(div==1)
                e.setText(num/num2+"");
            add=0;
            sub=0;
            mul=0;
            div=0;
        }
        num=Float.parseFloat(e.getText().toString());
        sub=1;
        c=1;
        e.setText(null);

    }
});
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==1) {
                    num2 = Float.parseFloat(e.getText().toString());
                    if(add==1)
                        e.setText(num+num2+"");
                    if(sub==1)
                        e.setText(num-num2+"");
                    if(mul==1)
                        e.setText(num*num2+"");
                    if(div==1)
                        e.setText(num/num2+"");
                    add=0;
                    sub=0;
                    mul=0;
                    div=0;
                }
                num=Float.parseFloat(e.getText().toString());
       mul=1;
       c=1;
                e.setText(null);

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==1) {
                    num2 = Float.parseFloat(e.getText().toString());
                    if(add==1)
                        e.setText(num+num2+"");
                    if(sub==1)
                        e.setText(num-num2+"");
                    if(mul==1)
                        e.setText(num*num2+"");
                    if(div==1)
                        e.setText(num/num2+"");
                    add=0;
                    sub=0;
                    mul=0;
                    div=0;
                }
                num=Float.parseFloat(e.getText().toString());
                div=1;
                c=1;
                e.setText(null);

            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(null);
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    num2 = Float.parseFloat(e.getText().toString());

                if(add==1)
                {
                    e.setText(num+num2+"");
                    add=0;
                }
                if(sub==1)
                {
                    e.setText(num-num2+"");
                    sub=0;
                }
                if(mul==1)
                {
                    e.setText(num*num2+"");
                    mul=0;
                }
                if(div==1)
                {
                    e.setText(num/num2+"");
                    div=0;
                }
            }
        });


    }
}
