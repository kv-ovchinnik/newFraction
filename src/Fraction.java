public class Fraction {
    private int integer;
    private int numerator;
    private int denominator;

    //        Encapsulatin:

    public int getInteger(){
        return integer;
    }
    public int getNumerator(){
        return numerator;
    }
    public  int getDenominator(){
        return denominator;
    }

    public void setInteger(int integer){
        this.integer = integer;
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        if (denominator == 0)denominator =1;
        this.denominator = denominator;

    }
//                              costructor

    public Fraction(){
        setDenominator(1);
        System.out.println("DefaultConstructor:" + Integer.toHexString(this.hashCode()));
    }
    public Fraction(int integer){
        setInteger(integer);
        setNumerator(0);
        setDenominator(1);
        System.out.println("1ArgConstructor:\t" + this.hashCode());
    }

    public Fraction (int numerator, int denominator){
        setInteger(0);
        setNumerator(numerator);
        setDenominator(denominator);
        System.out.println("Constructor \t\t" + hashCode());
    }

    public Fraction (int integer, int numerator, int denominator) {
        setInteger(integer);
        setNumerator(numerator);
        setDenominator(denominator);
        System.out.println("Constructor \t\t" + hashCode());
    }

    public  Fraction (Fraction other){
        this.integer = other.integer;
        this.numerator = other.numerator;
        this.denominator = other.denominator;
        System.out.println("Copy \t" + hashCode());
    }
    //                            Methods:
    public void print(){
        if(integer !=0) System.out.print(integer);
        if(numerator !=0){
            if (integer != 0) System.out.print("(");
            System.out.print(numerator + "/" + denominator);
            if(integer != 0) System.out.print(")");
        }
        else if (integer == 0) System.out.print(0);
        System.out.println();
    }
    public Fraction mul (Fraction A, Fraction B){
        Fraction I = new Fraction( A.integer * B.integer, A.numerator * B.numerator, A.denominator * B.denominator );
        int i;
        for (i = 2; i <= I.numerator; i++) {
            if (I.numerator % i == 0 && I.denominator % i == 0) {
                I.numerator /= i;
                I.denominator /= i;
            }
        }
        return I;
    }


    public Fraction div(Fraction A, Fraction B) {
        Fraction F = new Fraction(A.numerator * B.denominator, A.denominator * B.numerator);
        int i;
        for (i = 2; i <= F.numerator; i++) {
            if (F.numerator % i == 0 && F.denominator % i == 0) {
                F.numerator /= i;
                F.denominator /= i;
                if (F.numerator > F.denominator){
                    F.numerator = F.numerator % F.denominator;
                    F.integer++;

                }
            }
        }
        return F;
    }

    /*public Fraction compareTo(Fraction A, Fraction B){
        Fraction S = new Fraction( )
    }*/

}




