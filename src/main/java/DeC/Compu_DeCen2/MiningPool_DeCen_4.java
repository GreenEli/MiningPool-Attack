package DeC.Compu_DeCen2;
import DeC.Compu_DeCen2.Common.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

//MiningPools_DeCen<0.07,0.13,0.1,0.15>
public class MiningPool_DeCen_4 {
    public static void main(String [] args){
    	System.out.println("Type:MiningPools_DeCen<0.07,0.13,0.1,0.15> Confirm_Number:10");
//        MutliThread m1=new MutliThread("Window 1");
//        MutliThread m2=new MutliThread("Window 2");
//        MutliThread m3=new MutliThread("Window 3");
    	MutliThread_De M1=new MutliThread_De("USER_1","MiningPool_1");
        MutliThread_De M2=new MutliThread_De("USER_2","MiningPool_1");
        MutliThread_De M3=new MutliThread_De("USER_3","MiningPool_1");
        MutliThread_De M4=new MutliThread_De("USER_4","MiningPool_1");
        MutliThread_De M5=new MutliThread_De("USER_5","MiningPool_1");
        MutliThread_De M6=new MutliThread_De("USER_6","MiningPool_1");
        MutliThread_De M7=new MutliThread_De("USER_7","MiningPool_1");
        MutliThread_De M8=new MutliThread_De("USER_8","MiningPool_2");
        MutliThread_De M9=new MutliThread_De("USER_9","MiningPool_2");
        MutliThread_De M10=new MutliThread_De("USER_10","MiningPool_2");
        MutliThread_De M11=new MutliThread_De("USER_11","MiningPool_2");
        MutliThread_De M12=new MutliThread_De("USER_12","MiningPool_2");
        MutliThread_De M13=new MutliThread_De("USER_13","MiningPool_2");
        MutliThread_De M14=new MutliThread_De("USER_14","MiningPool_2");
        MutliThread_De M15=new MutliThread_De("USER_15","MiningPool_2");
        MutliThread_De M16=new MutliThread_De("USER_16","MiningPool_2");
        MutliThread_De M17=new MutliThread_De("USER_17","MiningPool_2");
        MutliThread_De M18=new MutliThread_De("USER_18","MiningPool_2");
        MutliThread_De M19=new MutliThread_De("USER_19","MiningPool_2");
        MutliThread_De M20=new MutliThread_De("USER_20","MiningPool_2");
        MutliThread_De M21=new MutliThread_De("USER_21","MiningPool_3");
        MutliThread_De M22=new MutliThread_De("USER_22","MiningPool_3");
        MutliThread_De M23=new MutliThread_De("USER_23","MiningPool_3");
        MutliThread_De M24=new MutliThread_De("USER_24","MiningPool_3");
        MutliThread_De M25=new MutliThread_De("USER_25","MiningPool_3");
        MutliThread_De M26=new MutliThread_De("USER_26","MiningPool_3");
        MutliThread_De M27=new MutliThread_De("USER_27","MiningPool_3");
        MutliThread_De M28=new MutliThread_De("USER_28","MiningPool_3");
        MutliThread_De M29=new MutliThread_De("USER_29","MiningPool_3");
        MutliThread_De M30=new MutliThread_De("USER_30","MiningPool_3");
        MutliThread_De M31=new MutliThread_De("USER_31","MiningPool_4");
        MutliThread_De M32=new MutliThread_De("USER_32","MiningPool_4");
        MutliThread_De M33=new MutliThread_De("USER_33","MiningPool_4");
        MutliThread_De M34=new MutliThread_De("USER_34","MiningPool_4");
        MutliThread_De M35=new MutliThread_De("USER_35","MiningPool_4");
        MutliThread_De M36=new MutliThread_De("USER_36","MiningPool_4");
        MutliThread_De M37=new MutliThread_De("USER_37","MiningPool_4");
        MutliThread_De M38=new MutliThread_De("USER_38","MiningPool_4");
        MutliThread_De M39=new MutliThread_De("USER_39","MiningPool_4");
        MutliThread_De M40=new MutliThread_De("USER_40","MiningPool_4");
        MutliThread_De M41=new MutliThread_De("USER_41","MiningPool_4");
        MutliThread_De M42=new MutliThread_De("USER_42","MiningPool_4");
        MutliThread_De M43=new MutliThread_De("USER_43","MiningPool_4");
        MutliThread_De M44=new MutliThread_De("USER_44","MiningPool_4");
        MutliThread_De M45=new MutliThread_De("USER_45","MiningPool_4");
        MutliThread_De M46=new MutliThread_De("USER_46","Honest_Node");
        MutliThread_De M47=new MutliThread_De("USER_47","Honest_Node");
        MutliThread_De M48=new MutliThread_De("USER_48","Honest_Node");
        MutliThread_De M49=new MutliThread_De("USER_49","Honest_Node");
        MutliThread_De M50=new MutliThread_De("USER_50","Honest_Node");
        MutliThread_De M51=new MutliThread_De("USER_51","Honest_Node");
        MutliThread_De M52=new MutliThread_De("USER_52","Honest_Node");
        MutliThread_De M53=new MutliThread_De("USER_53","Honest_Node");
        MutliThread_De M54=new MutliThread_De("USER_54","Honest_Node");
        MutliThread_De M55=new MutliThread_De("USER_55","Honest_Node");
        MutliThread_De M56=new MutliThread_De("USER_56","Honest_Node");
        MutliThread_De M57=new MutliThread_De("USER_57","Honest_Node");
        MutliThread_De M58=new MutliThread_De("USER_58","Honest_Node");
        MutliThread_De M59=new MutliThread_De("USER_59","Honest_Node");
        MutliThread_De M60=new MutliThread_De("USER_60","Honest_Node");
        MutliThread_De M61=new MutliThread_De("USER_61","Honest_Node");
        MutliThread_De M62=new MutliThread_De("USER_62","Honest_Node");
        MutliThread_De M63=new MutliThread_De("USER_63","Honest_Node");
        MutliThread_De M64=new MutliThread_De("USER_64","Honest_Node");
        MutliThread_De M65=new MutliThread_De("USER_65","Honest_Node");
        MutliThread_De M66=new MutliThread_De("USER_66","Honest_Node");
        MutliThread_De M67=new MutliThread_De("USER_67","Honest_Node");
        MutliThread_De M68=new MutliThread_De("USER_68","Honest_Node");
        MutliThread_De M69=new MutliThread_De("USER_69","Honest_Node");
        MutliThread_De M70=new MutliThread_De("USER_70","Honest_Node");
        MutliThread_De M71=new MutliThread_De("USER_71","Honest_Node");
        MutliThread_De M72=new MutliThread_De("USER_72","Honest_Node");
        MutliThread_De M73=new MutliThread_De("USER_73","Honest_Node");
        MutliThread_De M74=new MutliThread_De("USER_74","Honest_Node");
        MutliThread_De M75=new MutliThread_De("USER_75","Honest_Node");
        MutliThread_De M76=new MutliThread_De("USER_76","Honest_Node");
        MutliThread_De M77=new MutliThread_De("USER_77","Honest_Node");
        MutliThread_De M78=new MutliThread_De("USER_78","Honest_Node");
        MutliThread_De M79=new MutliThread_De("USER_79","Honest_Node");
        MutliThread_De M80=new MutliThread_De("USER_80","Honest_Node");
        MutliThread_De M81=new MutliThread_De("USER_81","Honest_Node");
        MutliThread_De M82=new MutliThread_De("USER_82","Honest_Node");
        MutliThread_De M83=new MutliThread_De("USER_83","Honest_Node");
        MutliThread_De M84=new MutliThread_De("USER_84","Honest_Node");
        MutliThread_De M85=new MutliThread_De("USER_85","Honest_Node");
        MutliThread_De M86=new MutliThread_De("USER_86","Honest_Node");
        MutliThread_De M87=new MutliThread_De("USER_87","Honest_Node");
        MutliThread_De M88=new MutliThread_De("USER_88","Honest_Node");
        MutliThread_De M89=new MutliThread_De("USER_89","Honest_Node");
        MutliThread_De M90=new MutliThread_De("USER_90","Honest_Node");
        MutliThread_De M91=new MutliThread_De("USER_91","Honest_Node");
        MutliThread_De M92=new MutliThread_De("USER_92","Honest_Node");
        MutliThread_De M93=new MutliThread_De("USER_93","Honest_Node");
        MutliThread_De M94=new MutliThread_De("USER_94","Honest_Node");
        MutliThread_De M95=new MutliThread_De("USER_95","Honest_Node");
        MutliThread_De M96=new MutliThread_De("USER_96","Honest_Node");
        MutliThread_De M97=new MutliThread_De("USER_97","Honest_Node");
        MutliThread_De M98=new MutliThread_De("USER_98","Honest_Node");
        MutliThread_De M99=new MutliThread_De("USER_99","Honest_Node");
        MutliThread_De M100=new MutliThread_De("USER_100","Honest_Node");
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
