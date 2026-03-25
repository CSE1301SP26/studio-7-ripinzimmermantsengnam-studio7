public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 6);
        Fraction f2 = new Fraction(5, 10);
        Fraction f3 = f1.multiply(f2);
        System.out.println(f1.simplify());

    }


    public Fraction multiply(Fraction otherFraction){
        return new Fraction(this.numerator * otherFraction.numerator, this.denominator * otherFraction.denominator);
    }

    public Fraction reciprocal(){
        return new Fraction(denominator, numerator);
    }

    public Fraction simplify(){
        int i = 0;
        while(i<numerator-1){
            if(numerator % i == 0){
                numerator = numerator/i;
            }
            i += 1;
        }

        int j = 0;
          while(j<denominator-1){
            if(denominator % j == 0){
                denominator = denominator/j;
            }
            j += 1;
        }

        return new Fraction(numerator, denominator);
    }


}
