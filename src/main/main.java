package main;

public class main {
    public static void main(String[] args){

        byte b2 = 0b10;
        byte b8 = 010;
        byte b10 = 10;
        byte b16 = 0x10;
        short q2 = 1000;
        short q8 = 11;
        short q10 = 24;
        short q16 = 16;
        int w2 = 0b1;
        int w8 = 0377;
        int w10 = 1_000_000;
        int w16 =  0xFF_FF;
        long e2 = 0b1L;
        long e8 = 01L;
        long e10 = 0L;
        long e16 = 0x10L;
        char r2 =  377;
        char r8 = 43;
        char r10 = 53;
        char r16 = 64;
        float t2= 0b1L;
        float t8 = 0377L;
        float t10 = 34.34f;
        float t16 = 0x12P2F;
        double y2 = 0b1L;
        double y8 = 01L;
        double y10 = 1E3;
        double y16 = 0xFP-2;

        int sumInt = w2 + w8 + w10 + w16;
        int sumByte = b2 + b8 + b10 + b16;
        double sumDouble = y2 + y8 + y10 + y16;
        int sumLong = (int) (e2 + e8 + e10 + e16);
        int sumShort = q2 + q8 + q10 + q16;
        float sumFloat = t2 + t8 + t10 + t16;
        int sumChar = r2 + r8 + r10 + r16;

        long result = (long)  (sumInt + sumByte + sumDouble + sumLong + sumFloat + sumShort + sumChar);
        System.out.println(result);

        System.out.println(convertToCelsius(result));
        System.out.println(convertToСentimeters(result));

    }

    public static double convertToCelsius(double degreeFahrenheit) {
        return (degreeFahrenheit - 32) * 5 / 9;
    }

    public static double convertToСentimeters(double inches){
        return inches * 2.54;
    }
}
