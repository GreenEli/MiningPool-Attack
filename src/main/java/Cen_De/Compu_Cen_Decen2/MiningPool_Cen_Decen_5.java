package Cen_De.Compu_Cen_Decen2;
import Cen_De.Compu_Cen_Decen2.Common.*;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;



//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import a.UnsupportedEncodingException;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.Random;
//MiningPools_Cen_Den<{0.04,0.06},0.01,0.04,0.05,{0.02,0.08}>
public class MiningPool_Cen_Decen_5 {
    public static void main(String [] args){
    	System.out.println("Type:MiningPools_Cen_Den<{0.04,0.06},0.01,0.04,0.05,{0.02,0.08}> Confirm_Number:10");
//        MutliThread m1=new MutliThread("Window 1");
//        MutliThread m2=new MutliThread("Window 2");
//        MutliThread m3=new MutliThread("Window 3");
        MutliThread_Cen_Den M1=new MutliThread_Cen_Den("USER_1","MiningPool_1");
        MutliThread_Cen_Den M2=new MutliThread_Cen_Den("USER_2","MiningPool_1");
        MutliThread_Cen_Den M3=new MutliThread_Cen_Den("USER_3","MiningPool_1");
        MutliThread_Cen_Den M4=new MutliThread_Cen_Den("USER_4","MiningPool_1");
        MutliThread_Cen_Den M5=new MutliThread_Cen_Den("USER_5","MiningPool_2");
        MutliThread_Cen_Den M6=new MutliThread_Cen_Den("USER_6","MiningPool_2");
        MutliThread_Cen_Den M7=new MutliThread_Cen_Den("USER_7","MiningPool_2");
        MutliThread_Cen_Den M8=new MutliThread_Cen_Den("USER_8","MiningPool_2");
        MutliThread_Cen_Den M9=new MutliThread_Cen_Den("USER_9","MiningPool_2");
        MutliThread_Cen_Den M10=new MutliThread_Cen_Den("USER_10","MiningPool_2");
        MutliThread_Cen_Den M11=new MutliThread_Cen_Den("USER_11","MiningPool_3");
        MutliThread_Cen_Den M12=new MutliThread_Cen_Den("USER_12","MiningPool_4");
        MutliThread_Cen_Den M13=new MutliThread_Cen_Den("USER_13","MiningPool_4");
        MutliThread_Cen_Den M14=new MutliThread_Cen_Den("USER_14","MiningPool_4");
        MutliThread_Cen_Den M15=new MutliThread_Cen_Den("USER_15","MiningPool_4");
        MutliThread_Cen_Den M16=new MutliThread_Cen_Den("USER_16","MiningPool_5");
        MutliThread_Cen_Den M17=new MutliThread_Cen_Den("USER_17","MiningPool_5");
        MutliThread_Cen_Den M18=new MutliThread_Cen_Den("USER_18","MiningPool_5");
        MutliThread_Cen_Den M19=new MutliThread_Cen_Den("USER_19","MiningPool_5");
        MutliThread_Cen_Den M20=new MutliThread_Cen_Den("USER_20","MiningPool_5");
        MutliThread_Cen_Den M21=new MutliThread_Cen_Den("USER_21","MiningPool_6");
        MutliThread_Cen_Den M22=new MutliThread_Cen_Den("USER_22","MiningPool_6");
        MutliThread_Cen_Den M23=new MutliThread_Cen_Den("USER_23","MiningPool_7");
        MutliThread_Cen_Den M24=new MutliThread_Cen_Den("USER_24","MiningPool_7");
        MutliThread_Cen_Den M25=new MutliThread_Cen_Den("USER_25","MiningPool_7");
        MutliThread_Cen_Den M26=new MutliThread_Cen_Den("USER_26","MiningPool_7");
        MutliThread_Cen_Den M27=new MutliThread_Cen_Den("USER_27","MiningPool_7");
        MutliThread_Cen_Den M28=new MutliThread_Cen_Den("USER_28","MiningPool_7");
        MutliThread_Cen_Den M29=new MutliThread_Cen_Den("USER_29","MiningPool_7");
        MutliThread_Cen_Den M30=new MutliThread_Cen_Den("USER_30","MiningPool_7");
        MutliThread_Cen_Den M31=new MutliThread_Cen_Den("USER_31","Honest_Node");
        MutliThread_Cen_Den M32=new MutliThread_Cen_Den("USER_32","Honest_Node");
        MutliThread_Cen_Den M33=new MutliThread_Cen_Den("USER_33","Honest_Node");
        MutliThread_Cen_Den M34=new MutliThread_Cen_Den("USER_34","Honest_Node");
        MutliThread_Cen_Den M35=new MutliThread_Cen_Den("USER_35","Honest_Node");
        MutliThread_Cen_Den M36=new MutliThread_Cen_Den("USER_36","Honest_Node");
        MutliThread_Cen_Den M37=new MutliThread_Cen_Den("USER_37","Honest_Node");
        MutliThread_Cen_Den M38=new MutliThread_Cen_Den("USER_38","Honest_Node");
        MutliThread_Cen_Den M39=new MutliThread_Cen_Den("USER_39","Honest_Node");
        MutliThread_Cen_Den M40=new MutliThread_Cen_Den("USER_40","Honest_Node");
        MutliThread_Cen_Den M41=new MutliThread_Cen_Den("USER_41","Honest_Node");
        MutliThread_Cen_Den M42=new MutliThread_Cen_Den("USER_42","Honest_Node");
        MutliThread_Cen_Den M43=new MutliThread_Cen_Den("USER_43","Honest_Node");
        MutliThread_Cen_Den M44=new MutliThread_Cen_Den("USER_44","Honest_Node");
        MutliThread_Cen_Den M45=new MutliThread_Cen_Den("USER_45","Honest_Node");
        MutliThread_Cen_Den M46=new MutliThread_Cen_Den("USER_46","Honest_Node");
        MutliThread_Cen_Den M47=new MutliThread_Cen_Den("USER_47","Honest_Node");
        MutliThread_Cen_Den M48=new MutliThread_Cen_Den("USER_48","Honest_Node");
        MutliThread_Cen_Den M49=new MutliThread_Cen_Den("USER_49","Honest_Node");
        MutliThread_Cen_Den M50=new MutliThread_Cen_Den("USER_50","Honest_Node");
        MutliThread_Cen_Den M51=new MutliThread_Cen_Den("USER_51","Honest_Node");
        MutliThread_Cen_Den M52=new MutliThread_Cen_Den("USER_52","Honest_Node");
        MutliThread_Cen_Den M53=new MutliThread_Cen_Den("USER_53","Honest_Node");
        MutliThread_Cen_Den M54=new MutliThread_Cen_Den("USER_54","Honest_Node");
        MutliThread_Cen_Den M55=new MutliThread_Cen_Den("USER_55","Honest_Node");
        MutliThread_Cen_Den M56=new MutliThread_Cen_Den("USER_56","Honest_Node");
        MutliThread_Cen_Den M57=new MutliThread_Cen_Den("USER_57","Honest_Node");
        MutliThread_Cen_Den M58=new MutliThread_Cen_Den("USER_58","Honest_Node");
        MutliThread_Cen_Den M59=new MutliThread_Cen_Den("USER_59","Honest_Node");
        MutliThread_Cen_Den M60=new MutliThread_Cen_Den("USER_60","Honest_Node");
        MutliThread_Cen_Den M61=new MutliThread_Cen_Den("USER_61","Honest_Node");
        MutliThread_Cen_Den M62=new MutliThread_Cen_Den("USER_62","Honest_Node");
        MutliThread_Cen_Den M63=new MutliThread_Cen_Den("USER_63","Honest_Node");
        MutliThread_Cen_Den M64=new MutliThread_Cen_Den("USER_64","Honest_Node");
        MutliThread_Cen_Den M65=new MutliThread_Cen_Den("USER_65","Honest_Node");
        MutliThread_Cen_Den M66=new MutliThread_Cen_Den("USER_66","Honest_Node");
        MutliThread_Cen_Den M67=new MutliThread_Cen_Den("USER_67","Honest_Node");
        MutliThread_Cen_Den M68=new MutliThread_Cen_Den("USER_68","Honest_Node");
        MutliThread_Cen_Den M69=new MutliThread_Cen_Den("USER_69","Honest_Node");
        MutliThread_Cen_Den M70=new MutliThread_Cen_Den("USER_70","Honest_Node");
        MutliThread_Cen_Den M71=new MutliThread_Cen_Den("USER_71","Honest_Node");
        MutliThread_Cen_Den M72=new MutliThread_Cen_Den("USER_72","Honest_Node");
        MutliThread_Cen_Den M73=new MutliThread_Cen_Den("USER_73","Honest_Node");
        MutliThread_Cen_Den M74=new MutliThread_Cen_Den("USER_74","Honest_Node");
        MutliThread_Cen_Den M75=new MutliThread_Cen_Den("USER_75","Honest_Node");
        MutliThread_Cen_Den M76=new MutliThread_Cen_Den("USER_76","Honest_Node");
        MutliThread_Cen_Den M77=new MutliThread_Cen_Den("USER_77","Honest_Node");
        MutliThread_Cen_Den M78=new MutliThread_Cen_Den("USER_78","Honest_Node");
        MutliThread_Cen_Den M79=new MutliThread_Cen_Den("USER_79","Honest_Node");
        MutliThread_Cen_Den M80=new MutliThread_Cen_Den("USER_80","Honest_Node");
        MutliThread_Cen_Den M81=new MutliThread_Cen_Den("USER_81","Honest_Node");
        MutliThread_Cen_Den M82=new MutliThread_Cen_Den("USER_82","Honest_Node");
        MutliThread_Cen_Den M83=new MutliThread_Cen_Den("USER_83","Honest_Node");
        MutliThread_Cen_Den M84=new MutliThread_Cen_Den("USER_84","Honest_Node");
        MutliThread_Cen_Den M85=new MutliThread_Cen_Den("USER_85","Honest_Node");
        MutliThread_Cen_Den M86=new MutliThread_Cen_Den("USER_86","Honest_Node");
        MutliThread_Cen_Den M87=new MutliThread_Cen_Den("USER_87","Honest_Node");
        MutliThread_Cen_Den M88=new MutliThread_Cen_Den("USER_88","Honest_Node");
        MutliThread_Cen_Den M89=new MutliThread_Cen_Den("USER_89","Honest_Node");
        MutliThread_Cen_Den M90=new MutliThread_Cen_Den("USER_90","Honest_Node");
        MutliThread_Cen_Den M91=new MutliThread_Cen_Den("USER_91","Honest_Node");
        MutliThread_Cen_Den M92=new MutliThread_Cen_Den("USER_92","Honest_Node");
        MutliThread_Cen_Den M93=new MutliThread_Cen_Den("USER_93","Honest_Node");
        MutliThread_Cen_Den M94=new MutliThread_Cen_Den("USER_94","Honest_Node");
        MutliThread_Cen_Den M95=new MutliThread_Cen_Den("USER_95","Honest_Node");
        MutliThread_Cen_Den M96=new MutliThread_Cen_Den("USER_96","Honest_Node");
        MutliThread_Cen_Den M97=new MutliThread_Cen_Den("USER_97","Honest_Node");
        MutliThread_Cen_Den M98=new MutliThread_Cen_Den("USER_98","Honest_Node");
        MutliThread_Cen_Den M99=new MutliThread_Cen_Den("USER_99","Honest_Node");
        MutliThread_Cen_Den M100=new MutliThread_Cen_Den("USER_100","Honest_Node");
//        m1.start();
//        m2.start();
//        m3.start();
        M1.start();
        M2.start();
        M3.start();
        M4.start();
        M5.start();
        M6.start();
        M7.start();
        M8.start();
        M9.start();
        M10.start();
        M11.start();
        M12.start();
        M13.start();
        M14.start();
        M15.start();
        M16.start();
        M17.start();
        M18.start();
        M19.start();
        M20.start();
        M21.start();
        M22.start();
        M23.start();
        M24.start();
        M25.start();
        M26.start();
        M27.start();
        M28.start();
        M29.start();
        M30.start();
        M31.start();
        M32.start();
        M33.start();
        M34.start();
        M35.start();
        M36.start();
        M37.start();
        M38.start();
        M39.start();
        M40.start();
        M41.start();
        M42.start();
        M43.start();
        M44.start();
        M45.start();
        M46.start();
        M47.start();
        M48.start();
        M49.start();
        M50.start();
        M51.start();
        M52.start();
        M53.start();
        M54.start();
        M55.start();
        M56.start();
        M57.start();
        M58.start();
        M59.start();
        M60.start();
        M61.start();
        M62.start();
        M63.start();
        M64.start();
        M65.start();
        M66.start();
        M67.start();
        M68.start();
        M69.start();
        M70.start();
        M71.start();
        M72.start();
        M73.start();
        M74.start();
        M75.start();
        M76.start();
        M77.start();
        M78.start();
        M79.start();
        M80.start();
        M81.start();
        M82.start();
        M83.start();
        M84.start();
        M85.start();
        M86.start();
        M87.start();
        M88.start();
        M89.start();
        M90.start();
        M91.start();
        M92.start();
        M93.start();
        M94.start();
        M95.start();
        M96.start();
        M97.start();
        M98.start();
        M99.start();
        M100.start();
    }
}