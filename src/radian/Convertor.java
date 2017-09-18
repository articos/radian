package radian;

public class Convertor {


    public static void degreeToRadian(double degree) {

        double converted = degree * Math.PI / 180;

        System.out.println(degree + "stupnu je " + converted + "rad");

    }


}
