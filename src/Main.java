public class Main {
    public static void main(String[] args) {
        Fraction A = new Fraction(7,12);
        A.print();
        System.out.println(A.getDenominator());


        Fraction B = new Fraction(5);
        B.print();

        Fraction C = new Fraction(5,9);
        C.print();

        Fraction D = new Fraction(2, 3, 4);
        D.print();

        Fraction E = new Fraction(D);
        E.print();

        Fraction I = new Fraction();
        I = I.mul(D , E);
        I.print();

        Fraction F = new Fraction();
        F = F.div(A, C);
        F.print();


    }
}