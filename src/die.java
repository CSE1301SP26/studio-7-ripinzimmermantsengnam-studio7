public class die {
private int n;

public die(int n){
   this.n = n;
}

public static void main(String[] args) {
    die n1 = new die(6);
    System.out.println(n1.roll());
}

public int roll(){
    return (int) (Math.random() * n) + 1;
}


}
