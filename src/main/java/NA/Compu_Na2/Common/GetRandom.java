package NA.Compu_Na2.Common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class GetRandom {
	//生成指定长度的随机字符串
	public static String getRandomString(int length){

	  String str="abcdef0123456789";

	  Random random=new Random();

	  StringBuffer sb=new StringBuffer();

	  for(int i=0;i<length;i++){

	    int number=random.nextInt(16);

	    sb.append(str.charAt(number));

	  }

	  return sb.toString();

	}
}