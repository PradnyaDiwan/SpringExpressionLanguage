package org.prograd.SpringExpressionLanguage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PrimeOrComposite {


    public String isPrimeOrComposite(int number) {
        String type="Prime";
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                type = "Composite";
		break;
            }
        }
        StandardEvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setVariable("type", type);
        evaluationContext.setVariable("number", number);
        String exp = (String) new SpelExpressionParser()
                .parseExpression("'Number: ' + #number + ' is ' + #type").getValue(evaluationContext);
        System.out.println(exp);
        return type;
        }
    }


