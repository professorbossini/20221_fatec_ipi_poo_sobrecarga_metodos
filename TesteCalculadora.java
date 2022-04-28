public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar());

        System.out.println(calc.somar(1));


        System.out.println(calc.somar(2, 3));

        System.out.println(calc.somar(1, 2, 3));

        System.out.println(calc.somar(1, 2, 3, 4, 5));



        // int a = 2, b = 3, c = 6;
        // String s1 = "54", s2 = "7";
        // Calculadora calc = new Calculadora();
        // int resInt = calc.somar(a, b);
        // System.out.println(resInt);
        // int resStr = calc.somar(s1, s2);
        // System.out.println(resStr);

        // System.out.println(calc.somar(2.5f, 4.2f));

        // System.out.println(calc.somar(1, 2, 3));

        // System.out.println (calc.somar("14", 2));

        // System.out.println(calc.somar(1, "13"));

        // calc.somar(2, 3);

        // calc.somar(1, 2, 3, 4, 3, 1, 2, 3, 4, 6, 5);

    }
}
