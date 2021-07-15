package teoria;

public class AprendendoProcessamentoDados {

    public static void main(String[] args) {

        int x1, y1;
        x1 = 5;
        y1 = 2 * x1;
        System.out.println(x1);
        System.out.println(y1);

        int x2;
        double y2;
        x2 = 5;
        y2 = 2 * x2;
        System.out.println(x2);
        System.out.println(y2);

        double b, B, h, area;
        b = 6.0;
/*
        // quando é double (ponto flutuante de precisão dupla),
        // coloca-se o .0 para indicar que é do tipo double
*/
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println(area);



        float b2, B2, h2, area2;
        b2 = 6f;
/*
        // quando é float (ponto flutuante de precisão simples),
        // coloca-se o f para indicar que é do tipo float
*/
        B2 = 8f;
        h2 = 5f;
        area2 = (b2 + B2) / 2f * h2; // a mesma coisa aqui, 2f = float
        System.out.println(area2);

        // casting (É a conversão explícita de um tipo de dado para outro.)

        int a, b3;
        double resultado;
        a = 5; b3 = 2;
        resultado = a / b3;
        System.out.println(resultado);
        // resultado = 2.0, mas o resultado deveria ser 2.5. Por que?
        // pq ele entende q a divisão entre dois int tem como resultado outro int.
        // como resolver?

        // fazendo um casting (conversão) do tipo de dado do resultado!

        int a2, b4;
        double resultado2;
        a2 = 5; b4 = 2;
        resultado2 = (double) a2 / b4; // pronto! agora o resultado é 2.5
        System.out.println(resultado2);

        // outro exemplo

        double z;
        int x;
        z = 5.0;
        // x = z; --> deixando assim, dá um erro de TypeMismatch: cannot convert from double to int
        x = (int) z; // agora fiz o casting!
        System.out.println(x);

    }
}
