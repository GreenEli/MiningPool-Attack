package Cen.Compu_Cen2;

import Cen.Compu_Cen2.Common.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
//import a.NoSuchAlgorithmException;
import java.util.Random;

//MiningPools_Cen{0.05,0.1,0.1}
public class MiningPool_Cen_10 {
    public static void main(String [] args){
    	System.out.println("Type:MiningPools_Cen{0.05,0.1,0.1} Confirm_Number:10");
//        MutliThread m1=new MutliThread("Window 1");
//        MutliThread m2=new MutliThread("Window 2");
//        MutliThread m3=new MutliThread("Window 3");
        MutliThread_Cen M1=new MutliThread_Cen("USER_1","MiningPool_1");
        MutliThread_Cen M2=new MutliThread_Cen("USER_2","MiningPool_1");
        MutliThread_Cen M3=new MutliThread_Cen("USER_3","MiningPool_1");
        MutliThread_Cen M4=new MutliThread_Cen("USER_4","MiningPool_1");
        MutliThread_Cen M5=new MutliThread_Cen("USER_5","MiningPool_1");
        MutliThread_Cen M6=new MutliThread_Cen("USER_6","MiningPool_2");
        MutliThread_Cen M7=new MutliThread_Cen("USER_7","MiningPool_2");
        MutliThread_Cen M8=new MutliThread_Cen("USER_8","MiningPool_2");
        MutliThread_Cen M9=new MutliThread_Cen("USER_9","MiningPool_2");
        MutliThread_Cen M10=new MutliThread_Cen("USER_10","MiningPool_2");
        MutliThread_Cen M11=new MutliThread_Cen("USER_11","MiningPool_2");
        MutliThread_Cen M12=new MutliThread_Cen("USER_12","MiningPool_2");
        MutliThread_Cen M13=new MutliThread_Cen("USER_13","MiningPool_2");
        MutliThread_Cen M14=new MutliThread_Cen("USER_14","MiningPool_2");
        MutliThread_Cen M15=new MutliThread_Cen("USER_15","MiningPool_2");
        MutliThread_Cen M16=new MutliThread_Cen("USER_16","MiningPool_3");
        MutliThread_Cen M17=new MutliThread_Cen("USER_17","MiningPool_3");
        MutliThread_Cen M18=new MutliThread_Cen("USER_18","MiningPool_3");
        MutliThread_Cen M19=new MutliThread_Cen("USER_19","MiningPool_3");
        MutliThread_Cen M20=new MutliThread_Cen("USER_20","MiningPool_3");
        MutliThread_Cen M21=new MutliThread_Cen("USER_21","MiningPool_3");
        MutliThread_Cen M22=new MutliThread_Cen("USER_22","MiningPool_3");
        MutliThread_Cen M23=new MutliThread_Cen("USER_23","MiningPool_3");
        MutliThread_Cen M24=new MutliThread_Cen("USER_24","MiningPool_3");
        MutliThread_Cen M25=new MutliThread_Cen("USER_25","MiningPool_3");
        MutliThread_Cen M26=new MutliThread_Cen("USER_26","Honest_Node");
        MutliThread_Cen M27=new MutliThread_Cen("USER_27","Honest_Node");
        MutliThread_Cen M28=new MutliThread_Cen("USER_28","Honest_Node");
        MutliThread_Cen M29=new MutliThread_Cen("USER_29","Honest_Node");
        MutliThread_Cen M30=new MutliThread_Cen("USER_30","Honest_Node");
        MutliThread_Cen M31=new MutliThread_Cen("USER_31","Honest_Node");
        MutliThread_Cen M32=new MutliThread_Cen("USER_32","Honest_Node");
        MutliThread_Cen M33=new MutliThread_Cen("USER_33","Honest_Node");
        MutliThread_Cen M34=new MutliThread_Cen("USER_34","Honest_Node");
        MutliThread_Cen M35=new MutliThread_Cen("USER_35","Honest_Node");
        MutliThread_Cen M36=new MutliThread_Cen("USER_36","Honest_Node");
        MutliThread_Cen M37=new MutliThread_Cen("USER_37","Honest_Node");
        MutliThread_Cen M38=new MutliThread_Cen("USER_38","Honest_Node");
        MutliThread_Cen M39=new MutliThread_Cen("USER_39","Honest_Node");
        MutliThread_Cen M40=new MutliThread_Cen("USER_40","Honest_Node");
        MutliThread_Cen M41=new MutliThread_Cen("USER_41","Honest_Node");
        MutliThread_Cen M42=new MutliThread_Cen("USER_42","Honest_Node");
        MutliThread_Cen M43=new MutliThread_Cen("USER_43","Honest_Node");
        MutliThread_Cen M44=new MutliThread_Cen("USER_44","Honest_Node");
        MutliThread_Cen M45=new MutliThread_Cen("USER_45","Honest_Node");
        MutliThread_Cen M46=new MutliThread_Cen("USER_46","Honest_Node");
        MutliThread_Cen M47=new MutliThread_Cen("USER_47","Honest_Node");
        MutliThread_Cen M48=new MutliThread_Cen("USER_48","Honest_Node");
        MutliThread_Cen M49=new MutliThread_Cen("USER_49","Honest_Node");
        MutliThread_Cen M50=new MutliThread_Cen("USER_50","Honest_Node");
        MutliThread_Cen M51=new MutliThread_Cen("USER_51","Honest_Node");
        MutliThread_Cen M52=new MutliThread_Cen("USER_52","Honest_Node");
        MutliThread_Cen M53=new MutliThread_Cen("USER_53","Honest_Node");
        MutliThread_Cen M54=new MutliThread_Cen("USER_54","Honest_Node");
        MutliThread_Cen M55=new MutliThread_Cen("USER_55","Honest_Node");
        MutliThread_Cen M56=new MutliThread_Cen("USER_56","Honest_Node");
        MutliThread_Cen M57=new MutliThread_Cen("USER_57","Honest_Node");
        MutliThread_Cen M58=new MutliThread_Cen("USER_58","Honest_Node");
        MutliThread_Cen M59=new MutliThread_Cen("USER_59","Honest_Node");
        MutliThread_Cen M60=new MutliThread_Cen("USER_60","Honest_Node");
        MutliThread_Cen M61=new MutliThread_Cen("USER_61","Honest_Node");
        MutliThread_Cen M62=new MutliThread_Cen("USER_62","Honest_Node");
        MutliThread_Cen M63=new MutliThread_Cen("USER_63","Honest_Node");
        MutliThread_Cen M64=new MutliThread_Cen("USER_64","Honest_Node");
        MutliThread_Cen M65=new MutliThread_Cen("USER_65","Honest_Node");
        MutliThread_Cen M66=new MutliThread_Cen("USER_66","Honest_Node");
        MutliThread_Cen M67=new MutliThread_Cen("USER_67","Honest_Node");
        MutliThread_Cen M68=new MutliThread_Cen("USER_68","Honest_Node");
        MutliThread_Cen M69=new MutliThread_Cen("USER_69","Honest_Node");
        MutliThread_Cen M70=new MutliThread_Cen("USER_70","Honest_Node");
        MutliThread_Cen M71=new MutliThread_Cen("USER_71","Honest_Node");
        MutliThread_Cen M72=new MutliThread_Cen("USER_72","Honest_Node");
        MutliThread_Cen M73=new MutliThread_Cen("USER_73","Honest_Node");
        MutliThread_Cen M74=new MutliThread_Cen("USER_74","Honest_Node");
        MutliThread_Cen M75=new MutliThread_Cen("USER_75","Honest_Node");
        MutliThread_Cen M76=new MutliThread_Cen("USER_76","Honest_Node");
        MutliThread_Cen M77=new MutliThread_Cen("USER_77","Honest_Node");
        MutliThread_Cen M78=new MutliThread_Cen("USER_78","Honest_Node");
        MutliThread_Cen M79=new MutliThread_Cen("USER_79","Honest_Node");
        MutliThread_Cen M80=new MutliThread_Cen("USER_80","Honest_Node");
        MutliThread_Cen M81=new MutliThread_Cen("USER_81","Honest_Node");
        MutliThread_Cen M82=new MutliThread_Cen("USER_82","Honest_Node");
        MutliThread_Cen M83=new MutliThread_Cen("USER_83","Honest_Node");
        MutliThread_Cen M84=new MutliThread_Cen("USER_84","Honest_Node");
        MutliThread_Cen M85=new MutliThread_Cen("USER_85","Honest_Node");
        MutliThread_Cen M86=new MutliThread_Cen("USER_86","Honest_Node");
        MutliThread_Cen M87=new MutliThread_Cen("USER_87","Honest_Node");
        MutliThread_Cen M88=new MutliThread_Cen("USER_88","Honest_Node");
        MutliThread_Cen M89=new MutliThread_Cen("USER_89","Honest_Node");
        MutliThread_Cen M90=new MutliThread_Cen("USER_90","Honest_Node");
        MutliThread_Cen M91=new MutliThread_Cen("USER_91","Honest_Node");
        MutliThread_Cen M92=new MutliThread_Cen("USER_92","Honest_Node");
        MutliThread_Cen M93=new MutliThread_Cen("USER_93","Honest_Node");
        MutliThread_Cen M94=new MutliThread_Cen("USER_94","Honest_Node");
        MutliThread_Cen M95=new MutliThread_Cen("USER_95","Honest_Node");
        MutliThread_Cen M96=new MutliThread_Cen("USER_96","Honest_Node");
        MutliThread_Cen M97=new MutliThread_Cen("USER_97","Honest_Node");
        MutliThread_Cen M98=new MutliThread_Cen("USER_98","Honest_Node");
        MutliThread_Cen M99=new MutliThread_Cen("USER_99","Honest_Node");
        MutliThread_Cen M100=new MutliThread_Cen("USER_100","Honest_Node");
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