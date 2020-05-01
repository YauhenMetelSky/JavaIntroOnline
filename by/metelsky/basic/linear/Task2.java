package by.metelsky.basic.linear;

/*вычислить значение выражения по формуле
((b+sqr(b*b+4ac))/2a)-a*a*a*c+(1/(b*b))
 */


public class Task2 {
    public static void main(String[] args) {

        task2(1.0, 1.0, 1.0);
    }
    public static void task2(double a, double b, double c){
        double result;
        result =((b+Math.sqrt(Math.pow(b,2) + 4 * a * c))/(2 * a)) - Math.pow(a,3)* c +(Math.pow(b,-2));
        System.out.println(result);
    }
}
