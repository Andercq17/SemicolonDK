package com.example.myapplication.model;

public class CaidaLibreModel {

    public static String getH(double vo, double t){
        double res = vo*t + 9.8*t*t;
        return res+" m";
    }

    public static String getVoT(double vf, double t){
        double res = vf - 9.8*t;
        return res+" m/s";
    }

    public static String getVoH(double vf, double h){
        double res = Math.sqrt(vf*vf-2*9.8*h);
        return res+" m/s";
    }

    public static String getVfT(double vo, double t){
        double res = vo + 9.8*t;
        return res+" m/s";
    }

    public static String getVfH(double vo, double h){
        double res = Math.sqrt(vo*vo+2*9.8*h);
        return res+" m/s";
    }

    public static String getT(double vo, double vf){
        double res = (vf-vo)/9.8;
        return res+" s";
    }

}
