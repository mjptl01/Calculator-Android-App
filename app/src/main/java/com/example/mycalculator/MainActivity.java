package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    Button btnMemoryAdd, btnMemorySub, btnMemoryRecall, btnMemoryClear, btnClear, btnExponent,
            btnPercentage, btnPi, btnDivide, btnMultiply, btnSub, btnAdd, btnPoint, btnEquals;
    TextView tvSolution, tvResult;
    double memory=0.0;    boolean point=false;    CalcActivity c = new CalcActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSolution = findViewById(R.id.tvSolution);
        tvResult = findViewById(R.id.tvResult);

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);
        btnMemoryAdd = findViewById(R.id.btnMemoryAdd);
        btnMemorySub = findViewById(R.id.btnMemorySub);
        btnMemoryRecall = findViewById(R.id.btnMemoryRecall);
        btnMemoryClear = findViewById(R.id.btnMemoryClear);
        btnClear = findViewById(R.id.btnClear);
        btnExponent = findViewById(R.id.btnExponent);
        btnPercentage = findViewById(R.id.btnPercentage);
        btnPi = findViewById(R.id.btnPi);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnSub = findViewById(R.id.btnSub);
        btnAdd = findViewById(R.id.btnAdd);
        btnPoint = findViewById(R.id.btnPoint);
        btnEquals = findViewById(R.id.btnEquals);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSolution = tvSolution.getText().toString()+"1";
                tvSolution.setText(sSolution);

                String sResult = tvResult.getText().toString()+"1";
                tvResult.setText(sResult);
                if (c.opr==true){
                    c.op2 = Double.parseDouble(sResult);
                }
                else
                {
                    c.op1 = Double.parseDouble(sResult);
                }
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSolution = tvSolution.getText().toString()+"2";
                tvSolution.setText(sSolution);

                String sResult = tvResult.getText().toString()+"2";
                tvResult.setText(sResult);
                if (c.opr==true){
                    c.op2 = Double.parseDouble(sResult);
                }
                else
                {
                    c.op1 = Double.parseDouble(sResult);
                }
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSolution = tvSolution.getText().toString()+"3";
                tvSolution.setText(sSolution);

                String sResult = tvResult.getText().toString()+"3";
                tvResult.setText(sResult);
                if (c.opr==true){

                    c.op2 = Double.parseDouble(sResult);
                }
                else
                {
                    c.op1 = Double.parseDouble(sResult);
                }
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSolution = tvSolution.getText().toString()+"4";
                tvSolution.setText(sSolution);

                String sResult = tvResult.getText().toString()+"4";
                tvResult.setText(sResult);
                if (c.opr==true){
                    c.op2 = Double.parseDouble(sResult);
                }
                else
                {
                    c.op1 = Double.parseDouble(sResult);
                }
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSolution = tvSolution.getText().toString()+"5";
                tvSolution.setText(sSolution);

                String sResult = tvResult.getText().toString()+"5";
                tvResult.setText(sResult);
                if (c.opr==true){
                    c.op2 = Double.parseDouble(sResult);
                }
                else
                {
                    c.op1 = Double.parseDouble(sResult);
                }
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSolution = tvSolution.getText().toString()+"6";
                tvSolution.setText(sSolution);

                String sResult = tvResult.getText().toString()+"6";
                tvResult.setText(sResult);
                if (c.opr==true){
                    c.op2 = Double.parseDouble(sResult);
                }
                else
                {
                    c.op1 = Double.parseDouble(sResult);
                }
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSolution = tvSolution.getText().toString()+"7";
                tvSolution.setText(sSolution);

                String sResult = tvResult.getText().toString()+"7";
                tvResult.setText(sResult);
                if (c.opr==true){
                    c.op2 = Double.parseDouble(sResult);
                }
                else
                {
                    c.op1 = Double.parseDouble(sResult);
                }
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSolution = tvSolution.getText().toString()+"8";
                tvSolution.setText(sSolution);

                String sResult = tvResult.getText().toString()+"8";
                tvResult.setText(sResult);
                if (c.opr==true){
                    c.op2 = Double.parseDouble(sResult);
                }
                else
                {
                    c.op1 = Double.parseDouble(sResult);
                }
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSolution = tvSolution.getText().toString()+"9";
                tvSolution.setText(sSolution);

                String sResult = tvResult.getText().toString()+"9";
                tvResult.setText(sResult);
                if (c.opr==true){
                    c.op2 = Double.parseDouble(sResult);
                }
                else
                {
                    c.op1 = Double.parseDouble(sResult);
                }
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSolution = tvSolution.getText().toString()+"0";
                tvSolution.setText(sSolution);

                String sResult = tvResult.getText().toString()+"0";
                tvResult.setText(sResult);
                if (c.opr==true){
                    c.op2 = Double.parseDouble(sResult);
                }
                else
                {
                    c.op1 = Double.parseDouble(sResult);
                }
            }
        });

        btnMemoryAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = tvResult.getText().toString();
                memory += Double.parseDouble(s);
            }
        });

        btnMemorySub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = tvResult.getText().toString();
                memory -= Double.parseDouble(s);
            }
        });

        btnMemoryRecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = tvResult.getText().toString()+memory+"";
                String o = tvResult.getText().toString()+memory+"";
                tvSolution.setText(o);
                tvResult.setText(s);
                if(c.opr==true)
                {
                    c.op2 = Double.parseDouble(s);
                }
                else
                {
                    c.op1 =Double.parseDouble(s);
                }
            }
        });

        btnMemoryClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memory=0.0;
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSolution.setText(null);
                tvResult.setText(null);
                point=false;
                c.currOp="";
            }
        });

        btnExponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = tvResult.getText().toString();
                String sol = tvSolution.getText().toString();
                CalcActivity e = new CalcActivity();
                e.currOp = c.currOp;
                e.op1 = c.op1;
                e.op2 = c.op2;
                double d=0;
                d = e.getSolution(d);
                tvResult.setText(Math.exp(d)+"");
            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalcActivity e = new CalcActivity();
                e.op1 = c.op1;
                e.op2 = (c.op1*(c.op2/100));
                e.currOp = c.currOp;
                System.out.println("E:"+e.op1+" "+e.op2+" "+e.opr);
                double total=0.0;
                total = e.getSolution(total);
                tvResult.setText(total+"");
                tvSolution.setText(total+"");
            }
        });

        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = tvResult.getText().toString();
                double d;
                try {
                    d = Double.parseDouble(res);
                }
                catch (Exception e)
                {
                    d=1;
                }

                String sSolution = tvSolution.getText().toString()+"\u03C0";
                tvSolution.setText(sSolution);

                String sResult = tvResult.getText().toString()+"\u03C0";
                tvResult.setText(sResult);
                if (c.opr==true){
                    c.op2 = d*Math.PI;
                }
                else
                {
                    c.op1 = d*Math.PI;
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.opr=true;
                point=false;
                tvResult.setText(null);
                tvSolution.setText(tvSolution.getText()+"/");
                c.currOp = c.oprs[0];
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.opr=true;
                tvResult.setText(null);
                tvSolution.setText(tvSolution.getText()+"X");
                point=false;
                c.currOp = c.oprs[1];
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.opr=true;
                tvResult.setText(null);
                tvSolution.setText(tvSolution.getText()+"-");
                point=false;
                c.currOp = c.oprs[3];
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.opr=true;
                tvResult.setText(null);
                tvSolution.setText(tvSolution.getText()+"+");
                point=false;
                c.currOp = c.oprs[2];
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point)
                {
                    //Do nothing
                }
                else
                {
                    String res = tvResult.getText().toString()+".";
                    String sol = tvSolution.getText().toString()+".";
                    tvResult.setText(res);
                    tvSolution.setText(sol);
                    point=true;
                }
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    tvResult.setText(null);
                    double total = 0.0;
                    total = c.getSolution(total);
                    String sResult = tvResult.getText().toString()+total;tvResult.setText(sResult);
            }
        });
    }

}
