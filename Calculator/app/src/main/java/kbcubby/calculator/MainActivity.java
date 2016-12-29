package kbcubby.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view){
        EditText op1 = (EditText) findViewById(R.id.op1);
            float v1 = Float.parseFloat(op1.getText().toString());
        EditText operator = (EditText) findViewById(R.id.operator);
            String oper = operator.getText().toString();
        EditText op2 = (EditText) findViewById(R.id.op2);
            float v2 = Float.parseFloat(op2.getText().toString());
        TextView result = (TextView) findViewById(R.id.result);

        float x;
        String y;
        switch (oper){
            case "+":
                x=v1+v2;
                y = Float.toString(x);
                break;
            case "-":
                x=v1-v2;
                y = Float.toString(x);
                break;
            case "*":
                x=v1*v2;
                y = Float.toString(x);
                break;
            case "/":
                x=v1/v2;
                y = Float.toString(x);
                break;
            case "^":
                x=(float)Math.pow((double)v1,(double)v2);
                y = Float.toString(x);
                break;
            default:
                y = "Invalid operator:\n+ - * / ^";
        }

        result.setText(y);
    }
}
