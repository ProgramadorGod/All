package sum;

public class Sum {
    public int a,b, result;
    public Sum(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void Operation(){
        result = a+b;
    }
    public void Print(){
        Operation();
        System.out.println("The result of the sum is: " + result);
    }

    public static void main(String[] args) {

    }
}
