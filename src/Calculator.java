public class Calculator {
    public int calculate(Integer first, Integer second, String operation) {

        switch (operation) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "/":
                return first / second;
            case "*":
                return first * second;
            default:
                System.out.println("Такая операция не поддерживается.");
                return -1;
        }
    }


}