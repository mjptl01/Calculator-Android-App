package com.example.mycalculator;

public class CalcActivity {
    public double op1,op2 = 0.0;
    public boolean opr=false;
    public final String[] oprs = {"/","*","+","-"}; //acc to BO-DMAS
    public String currOp="";

    public double getSolution(double total){
        if(this.currOp=="")
        {
            total=this.op1;
        }
        else {
            if (currOp == oprs[0]) {
                try {
                    total = op1 / op2;
                } catch (ArithmeticException ar) {
                    ar.printStackTrace();
                }
            } else if (currOp == oprs[1]) {
                total = op1 * op2
                ;
            } else if (currOp == oprs[2]) {
                total = op1 + op2
                ;
            } else if (currOp == oprs[3]) {
                total = op1 - op2
                ;
            } else {
                total = 0.0;
            }
        }
        return total;
    }

    public CalcActivity() {
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public boolean isOpr() {
        return opr;
    }

    public void setOpr(boolean opr) {
        this.opr = opr;
    }

    public String[] getOprs() {
        return oprs;
    }

    public String getCurrOp() {
        return currOp;
    }

    public void setCurrOp(String currOp) {
        this.currOp = currOp;
    }
}
