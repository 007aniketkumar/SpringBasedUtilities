package com.ani.spelutility;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelComparison {


    public static void main(String[] args){

        //use spel for various comparisons.
        //for example :
        //a>b?a:b
        //a==""?true:false

        String name = "aniket";
       String name2 ="";
        String expression = name== name2?"true":"false";

        ExpressionParser parser = new SpelExpressionParser();

        String result= parser.parseExpression(expression).getValue(String.class);
        System.out.println("result is : "+result);



    }
}
