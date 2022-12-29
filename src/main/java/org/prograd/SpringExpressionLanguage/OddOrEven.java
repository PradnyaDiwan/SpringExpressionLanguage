package org.prograd.SpringExpressionLanguage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class OddOrEven {
    public String isOddOrEven(int number) {
        String type;
        if (number%2==0){
            type ="Even";
        }
        else
            type="Odd";

        StandardEvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setVariable("type",type);
        evaluationContext.setVariable("number",number);
        String exp = (String) new SpelExpressionParser()
                .parseExpression("'Number: ' + #number + ' is ' + #type").getValue(evaluationContext);
        System.out.println(exp);
        return type;
    }
}
