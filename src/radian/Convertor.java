package radian;

public class Convertor {


    public static double degreeToRadian(double degree) {

        double converted = degree * Math.PI / 180;

//        System.out.println(degree + "stupnu je " + converted + "rad");


        return converted;

    }


}
