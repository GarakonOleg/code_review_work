public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(){
        int n = dif(52, 42); // 10
        int m = times(2, 3); // 6
        int k = add(7,3); // 10
        int g = div(5,5); // 1

        int leftPart = times(n, m);  // 60
        int rightPart = div(k, g);   // 10

        return dif(leftPart, rightPart);
    }
}
