package javaexam.lambda;

public class LambdaDriver {
    public static void main(String[] args) {
        Calculate addWithAnonymous = new Calculate() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        System.out.println(addWithAnonymous.operation(1, 2));

        Calculate addWithLambda = (a, b) -> a + b;
        System.out.println(addWithLambda.operation(1, 2));


        Calculate subtractWithLambda = (a, b) -> a - b;
        System.out.println(subtractWithLambda.operation(4, 3));
    }
}
