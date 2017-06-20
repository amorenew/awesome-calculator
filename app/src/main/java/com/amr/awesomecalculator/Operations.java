package com.amr.awesomecalculator;

/**
 * Class for all calculator's operations
 */

public class Operations {

    /**
     * @param leftSide  the left operand of the plus sign
     * @param rightSide the right operand of the plus sign
     * @return the summation of both operands
     */

    public static double Add(double leftSide, double rightSide) {
        return leftSide + rightSide;
    }

    /**
     * @param leftSide  the left operand of the negative sign
     * @param rightSide the right operand of the negative sign
     * @return the subtraction of both operands
     */

    public static double Subtract(double leftSide, double rightSide) {
        return leftSide - rightSide;
    }

    /**
     * @param leftSide  the left operand of the Multiply sign
     * @param rightSide the right operand of the Multiply sign
     * @return the Multiplication of both operands
     */

    public static double Multiply(double leftSide, double rightSide) {
        return leftSide * rightSide;
    }

    /**
     * @param leftSide  the left operand of the divide sign
     * @param rightSide the right operand of the divide sign
     * @return the Division of both operands
     */

    public static double Divide(double leftSide, double rightSide) {
        return leftSide / rightSide;
    }

    /**
     * @param leftSide the left operand of the Mod sign
     * @param rightSide the right operand of the Mod sign
     * @return the rest of division of both operands
     */

    public static double Modulus(double leftSide, double rightSide) {
        return leftSide % rightSide;
    }


    /**
     * @param number you want to get cube root of it
     * @return the cube root of this number
     */

    public static double CubeRoot(double number) {
        return Math.cbrt(number);
    }

    /**
     * @param number you want to get square root of it
     * @return the square root of this number
     */

    public static double SquareRoot(double number) {
        return Math.sqrt(number);
    }

    /**
     * @return pi number which is equal -> 3.141592653589793
     */

    public static double PI() {
        return Math.PI;
    }

    /**
     * @param number the exponent to raise e to.
     * @return the value of e power number, where e is the base of the natural logarithms.
     */

    public static double Exponential(double number) {
        return Math.exp(number);
    }

    /**
     * @param number value
     * @return the natural logarithm (base e) of a double value
     */

    public static double Log(double number) {
        return Math.log(number);
    }

    /**
     * @param number value
     * @return the base 10 logarithm of a double value
     */

    public static double Log10(double number) {
        return Math.log10(number);
    }

    /**
     * @param number value
     * @return the base 10 logarithm of a double value
     */

    public static double Log2(double number) {
        return Math.log(number) / Math.log(2);
    }

    /**
     * @param number  value
     * @param LogBase the base of log
     * @return the base LogBase logarithm of a double value
     */

    public static double Log(double number, double LogBase) {
        return Math.log(number) / Math.log(LogBase);
    }

    /**
     * @param number an angle, in radians.
     * @return the trigonometric sine of an angle
     */

    public static double Sin(double number) {
        return Math.sin(number);
    }

    /**
     * @param number an angle, in radians.
     * @return the trigonometric cosine of an angle
     */

    public static double Cos(double number) {
        return Math.cos(number);
    }

    /**
     * @param number an angle, in radians.
     * @return the trigonometric tangent of an angle
     */

    public static double Tan(double number) {
        return Math.tan(number);
    }

    /**
     * @param number the value whose arc sine is to be returned.
     * @return the arc sine of a value; the returned angle is in the range -pi/2 through pi/2
     */

    public static double InverseSin(double number) {
        return Math.asin(number);
    }

    /**
     * @param number the value whose arc cosine  is to be returned.
     * @return the arc cosine  of a value; he returned angle is in the range 0.0 through pi
     */

    public static double InverseCos(double number) {
        return Math.acos(number);
    }

    /**
     * @param number the value whose arc tangent is to be returned.
     * @return the arc tangent of a value; the returned angle is in the range -pi/2 through pi/2.
     */

    public static double InverseTan(double number) {
        return Math.atan(number);
    }

    /**
     * @param number The number whose hyperbolic sine is to be returned.
     * @return The hyperbolic cosine of x is defined to be (e power(x) - e power(-x))/2
     * where e is Euler's number.
     */

    public static double Sinh(double number) {
        return Math.sinh(number);
    }

    /**
     * @param number The number whose hyperbolic cosine is to be returned.
     * @return the hyperbolic cosine of a double value. The hyperbolic cosine of x is defined to be (e power(x) + e power(-x))/2
     * where e is Euler's number.
     */

    public static double Cosh(double number) {
        return Math.cosh(number);
    }

    /**
     * @param number The number whose hyperbolic tangent is to be returned.
     * @return Returns the hyperbolic tangent of a double value. The hyperbolic tangent of x is defined to be
     * (e power(x) - e power(-x) ) / (e power(x) + e power(-x)) == sinh(x)/cosh(x)
     */

    public static double Tanh(double number) {
        return Math.tanh(number);
    }

    /**
     * @param base  the lower part of power
     * @param power the higher part of power
     * @return Returns the value of the first argument raised to the power of the second argument
     */

    public static double Power(double base, double power) {
        return Math.pow(base, power);
    }


}
