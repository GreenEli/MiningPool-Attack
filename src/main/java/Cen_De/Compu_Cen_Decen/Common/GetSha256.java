package Cen_De.Compu_Cen_Decen.Common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GetSha256 {
	/**
	* ����javaԭ����ժҪʵ��SHA256����
	* @param str ���ܺ�ı���
	* @return
	*/
	static String getSHA256StrJava(String str){
	 MessageDigest messageDigest;
	 String encodeStr = "";
	 try {
	  messageDigest = MessageDigest.getInstance("SHA-256");
	  messageDigest.update(str.getBytes("UTF-8"));
	  encodeStr = Byte2H.byte2Hex(messageDigest.digest());
	 } catch (NoSuchAlgorithmException e) {
	  e.printStackTrace();
	 } catch (UnsupportedEncodingException e) {
	  e.printStackTrace();
	 }
	 return encodeStr;
	}
}
