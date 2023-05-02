<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/model/CaidaLibreModel.java
package edu.example.myapplication.model;
========
package edu.upb.SemicolonDK.model;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/model/CaidaLibreModel.java

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
