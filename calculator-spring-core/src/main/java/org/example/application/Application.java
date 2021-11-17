package org.example.application;

import org.example.config.RootConfiguration;
import org.example.entity.Calculator;
import org.example.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    private final static String CHOOSE_OPERATION_MENU = "\nВыберите операцию: \n1 - Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление\n";

    @Autowired
    private Calculator calculator;
    @Autowired
    private InputService inputService;

    private void getTwoNumbers(){
        System.out.print("Введите первое число: ");
        calculator.setFirstNumber(inputService.getNumber());
        System.out.print("Введите второе число: ");
        calculator.setSecondNumber(inputService.getNumber());
    }

    private void chooseAndComplyOperation(){
        System.out.print(CHOOSE_OPERATION_MENU);
        switch(inputService.checkNumber(4)){
            case 1: calculator.complyOperation("sum"); break;
            case 2: calculator.complyOperation("sub"); break;
            case 3: calculator.complyOperation("mul"); break;
            case 4: calculator.complyOperation("div"); break;
        }
    }

    public void run(){
        do{
            getTwoNumbers();
            chooseAndComplyOperation();
            System.out.println("\nРезультат: " + calculator.getSum());
        }while (!inputService.exit());
    }

    public static void main(String[] args) {
            ApplicationContext ac = new AnnotationConfigApplicationContext(RootConfiguration.class); /*Calculator calc = ac.getBean("calculator", Calculator.class); calc.run();*/
            Application application = ac.getBean("application", Application.class);
            application.run();
    }
}
