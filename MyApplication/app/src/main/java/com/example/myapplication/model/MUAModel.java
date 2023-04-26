package com.example.myapplication.model;

public class MUAModel {

    public static String getVfX(double vo, double a, double x){
        double res = Math.sqrt(vo*vo+2*a*x);
        return res+" m/s";
    }

    public static String getVfT(double vo, double a, double t){
        double res = vo + a*t;
        return res+" m/s";
    }

    public static String getXV(double vf, double vo, double t){
        double res = ((vf+vo)/2)*t;
        return res+" m";
    }

    public static String getXA(double vo, double t, double a){
        double res = vo*t + (a*t*t)/2;
        return res+" m";
    }

    public static String getAT(double vo, double t, double vf){
        double res = (vf-vo)/t;
        return res+" m/s^2";
    }

    public static String getAX(double vo, double x, double vf){
        double res = (vf*vf-vo*vo)/2*x;
        return res+" m/s^2";
    }

    public static String getTVX(double vo, double x, double vf){
        double res = (2*x)/(vf+vo);
        return res+" s";
    }

    public static String getTVA(double vo, double a, double vf){
        double res = (vf-vo)/a;
        return res+" s";
    }

    public static String getVoAX(double vf, double a, double x){
        double res = Math.sqrt((vf*vf)-2*a*x);
        return res+" m/s";
    }

    public static String getVoAT(double vf, double a, double t){
        double res = vf-a*t;
        return res+" m/s";
    }
}
