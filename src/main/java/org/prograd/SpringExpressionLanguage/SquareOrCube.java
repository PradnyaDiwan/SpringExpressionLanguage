package org.prograd.SpringExpressionLanguage;

import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class SquareOrCube {
    String type="";
    public String isSquareOrCube(int number) {
        int cubeRoot = (int) Math.round(Math.pow(number, 1.0/3.0));
        int squareRoot = (int)Math.sqrt(number);
        if (number==cubeRoot*cubeRoot*cubeRoot)
            type="Cube";
        else if(number==squareRoot*squareRoot)
            type="Square";
        else
            type="Neither square or cube";
        StandardEvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setVariable("type", type);
        evaluationContext.setVariable("number", number);
        String exp = (String) new SpelExpressionParser()
                .parseExpression("'Number: ' + #number + ' is ' + #type").getValue(evaluationContext);
        System.out.println(exp);
        return type;
    }
}
