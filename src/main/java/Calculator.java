public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(){
        int a = add(3,5);
        int b = times(a, 3);
        int c = dif(b,3);
        return div(c,7);
    }
}
