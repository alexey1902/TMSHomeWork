package org.example.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {

    private double firstNumber;
    private double secondNumber;
    private Double sum;

    private void sum(){
        sum = firstNumber + secondNumber;
    }

    private void sub(){
        sum = firstNumber-secondNumber;
    }

    private void mul(){
        sum = firstNumber*secondNumber;
    }

    private void div(){
        if(secondNumber!= 0){
            sum = firstNumber/secondNumber;
        }
        else{
            System.out.println("На ноль делить нельзя!");
            sum = null;
        }
    }

    public void complyOperation(String operation){
        switch (operation){
            case "sum": sum(); break;
            case "sub": sub(); break;
            case "div": div(); break;
            case "mul": mul(); break;
        }
    }
}
