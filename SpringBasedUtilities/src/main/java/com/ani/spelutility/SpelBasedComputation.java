package com.ani.spelutility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.expression.MapAccessor;
import org.springframework.expression.PropertyAccessor;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpelBasedComputation {

	
	public static void main(String[] args) {
SpelExpressionParser expressionParser = new SpelExpressionParser();
		
		String expressionString  = "a+b-d";
		Map<String,Object> tempMap = new HashMap<>();
		tempMap.put("a", 10);
		tempMap.put("b", 10);
		tempMap.put("d", 10);
		List<PropertyAccessor> accessors =  new ArrayList<>();
		accessors.add(new MapAccessor());
		StandardEvaluationContext context =  new StandardEvaluationContext();
		context.setRootObject(tempMap);
		context.setVariables(tempMap);
		context.setPropertyAccessors(accessors);
		
		BigDecimal result  = expressionParser.parseExpression(expressionString).getValue(context,BigDecimal.class);

		System.out.println(result);
	}
}
