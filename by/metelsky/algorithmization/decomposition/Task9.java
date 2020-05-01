package by.metelsky.algorithmization.decomposition;
/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */
public class Task9 {
    public static void main(String[] args) {
        int x =5;
        int y =4;
        int z =3;
        int t =6;
        double tetragonSquare = tetragonSquare(x,y,z,t);
        System.out.println("Площадь четырехугольника со сторонами: "+ x +" " + y +" "+z+" "+t+" =" + tetragonSquare);
    }
    static int halfPerimetr(int aSide, int bSide, int cSide, int dSide){
        int halfPerimetr = (aSide+ bSide + cSide+ dSide)/2;
        return halfPerimetr;
    }
    static double tetragonSquare(int aSide, int bSide, int cSide, int dSide) {
        double halfPerimetr = halfPerimetr(aSide,bSide,cSide,dSide);
        double square = Math.sqrt((halfPerimetr-aSide)*(halfPerimetr-bSide)*(halfPerimetr-cSide)*(halfPerimetr-dSide));
        return square;
    }
}
