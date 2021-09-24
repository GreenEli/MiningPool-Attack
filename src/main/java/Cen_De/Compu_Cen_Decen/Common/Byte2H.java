package Cen_De.Compu_Cen_Decen.Common;

public class Byte2H {
	/**
	* 将byte转为16进制
	* @param bytes
	* @return
	*/
	static String byte2Hex(byte[] bytes){
	 StringBuffer stringBuffer = new StringBuffer();
	 String temp = null;
	 for (int i=0;i<bytes.length;i++){
	  temp = Integer.toHexString(bytes[i] & 0xFF);
	  if (temp.length()==1){
	  //1得到一位的进行补0操作
	  stringBuffer.append("0");
	  }
	  stringBuffer.append(temp);
	 }
	 return stringBuffer.toString();
	}

}
