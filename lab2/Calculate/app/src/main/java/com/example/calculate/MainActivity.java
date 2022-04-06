package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btAdd, btSub, btMul, btDiv, btDel, btEq;
    EditText edResult, edNumber;
    Integer lastvalue = 1, currentvalue, resultOfAll = 0;
    String operation;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getIdAllbutton();
        getNumberbtn();
        getOperationbtn();



    }






    public void getIdAllbutton()
    {
        btn0 = (Button) findViewById(R.id.btnum0);
        btn1 = (Button) findViewById(R.id.btnum1);
        btn2 = (Button) findViewById(R.id.btnum2);
        btn3 = (Button) findViewById(R.id.btnum3);
        btn4 = (Button) findViewById(R.id.btnum4);
        btn5 = (Button) findViewById(R.id.btnum5);
        btn6 = (Button) findViewById(R.id.btnum6);
        btn7 = (Button) findViewById(R.id.btnum7);
        btn8 = (Button) findViewById(R.id.btnum8);
        btn9 = (Button) findViewById(R.id.btnum9);

        btAdd = (Button) findViewById(R.id.btnAdd);
        btSub = (Button) findViewById(R.id.btnSubtr);
        btMul = (Button) findViewById(R.id.btnMulti);
        btDiv = (Button) findViewById(R.id.btnDivi);
        btDel = (Button) findViewById(R.id.btnDelete);

        btEq = (Button) findViewById(R.id.btnEqual);
        edNumber = (EditText) findViewById(R.id.EditTextNumber);
        edResult= (EditText) findViewById(R.id.EditTextResult);
    }
    public void getNumberbtn()
    {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNumber.setText(edNumber.getText().toString() + "0");
                currentvalue = Integer.parseInt(edNumber.getText().toString());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNumber.setText(edNumber.getText().toString() + "1");
                currentvalue = Integer.parseInt(edNumber.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNumber.setText(edNumber.getText().toString() + "2");
                currentvalue = Integer.parseInt(edNumber.getText().toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNumber.setText(edNumber.getText().toString() + "3");
                currentvalue = Integer.parseInt(edNumber.getText().toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNumber.setText(edNumber.getText().toString() + "4");
                currentvalue = Integer.parseInt(edNumber.getText().toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNumber.setText(edNumber.getText().toString() + "5");
                currentvalue = Integer.parseInt(edNumber.getText().toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNumber.setText(edNumber.getText().toString() + "6");
                currentvalue = Integer.parseInt(edNumber.getText().toString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNumber.setText(edNumber.getText().toString() + "7");
                currentvalue = Integer.parseInt(edNumber.getText().toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNumber.setText(edNumber.getText().toString() + "8");
                currentvalue = Integer.parseInt(edNumber.getText().toString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNumber.setText(edNumber.getText().toString() + "9");
                currentvalue = Integer.parseInt(edNumber.getText().toString());
            }
        });
    }
    public void getOperationbtn()
    {
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "+";
                checkValue();
                currentvalue = Integer.parseInt(edNumber.getText().toString());
                edNumber.setText(null);
                flag = true;
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "-";
                checkValue();
                currentvalue = Integer.parseInt(edNumber.getText().toString());
                edNumber.setText(null);
                flag = true;
            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "*";
                checkValue();
                currentvalue = Integer.parseInt(edNumber.getText().toString());
                edNumber.setText(null);
                flag = true;
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "/";
                checkValue();
                currentvalue = Integer.parseInt(edNumber.getText().toString());
                edNumber.setText(null);
                flag = true;
            }
        });
        btEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultOfAll = process(lastvalue, currentvalue);
                edResult.setText(String.valueOf(lastvalue)+ " " +operation+ " " + edNumber.getText().toString() + " = " + String.valueOf(resultOfAll));
                lastvalue = resultOfAll;
                currentvalue = Integer.parseInt(edNumber.getText().toString());


            }
        });
        btDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edNumber.getText().length()>0){
                    CharSequence name = edNumber.getText().toString();
                    edNumber.setText(name.subSequence(0,name.length()-1));

                }else{
                    edNumber.setText(null);
                    edResult.setText(null);
                    resultOfAll = 0;
                    flag = false;
                }
            }
        });


    }
    public void checkValue ()
    {
        if(flag == true)
        {
            lastvalue = resultOfAll;
        }
        else
        {
            lastvalue = currentvalue;
        }
    }


    public Integer process (Integer a, Integer b)
    {
        Integer preresult = 0;
        if(operation == "+")
        {
            preresult = a + b;
            edResult.setText(preresult.toString());
        }
        if(operation == "-")
        {
            preresult = a - b;
            edResult.setText(preresult.toString());
        }
        if(operation == "*")
        {
            preresult = a * b;
            edResult.setText(preresult.toString());
        }
        if(operation == "/")
        {
            preresult = a / b;
            edResult.setText(preresult.toString());
        }
        return preresult;
    }



}