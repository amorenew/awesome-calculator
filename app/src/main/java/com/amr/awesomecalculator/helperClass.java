package com.amr.awesomecalculator;


public class helperClass {

    public static double Addition(double leftSide, double rightSide) {
        return leftSide + rightSide;
    }

    public static double Subtraction(double leftSide, double rightSide) {
        return leftSide - rightSide;
    }

    public static double Multiplication(double leftSide, double rightSide) {
        return leftSide * rightSide;
    }

    public static double Division(double leftSide, double rightSide) {
        return leftSide / rightSide;
    }

    public static double Modulus(double leftSide, double rightSide) {
        return leftSide % rightSide;
    }

    public static double CubeRoot(double number) {
        return Math.cbrt(number);
    }

    public static double SquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double PI() {
        return Math.PI;
    }

    public static double Exponential(double number) {
        return Math.exp(number);
    }

    public static double NaturalLogarithm(double number) {
        return Math.log(number);
    }

    public static double Base_10_Logarithm(double number) {
        return Math.log10(number);
    }

    //logb(n) = loge(n) / loge(b)
    public static double Base_2_Logarithm(double number) {
        return Math.log(number) / Math.log(2);
    }

    public static double AnyBaseLogarithm(double number, double base) {
        return Math.log(number) / Math.log(base);
    }

    public static double Sin(double number) {
        return Math.sin(number);
    }

    public static double Cos(double number) {
        return Math.cos(number);
    }

    public static double Tan(double number) {
        return Math.tan(number);
    }

    public static double Inverse_Sin(double number) {
        return Math.asin(number);
    }

    public static double Inverse_Cos(double number) {
        return Math.acos(number);
    }

    public static double Inverse_Tan(double number) {
        return Math.atan(number);
    }

    public static double Sinh(double number) {
        return Math.sinh(number);
    }

    public static double Cosh(double number) {
        return Math.cosh(number);
    }

    public static double Tanh(double number) {
        return Math.tanh(number);
    }


}
