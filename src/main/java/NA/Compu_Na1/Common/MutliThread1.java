package NA.Compu_Na1.Common;

public class MutliThread1 extends Thread{
	private String Name;String Fake_Name;
	private int Confirm_Number=0;
	public static boolean runflag=true;
	public static int Confirm_Number_Malicious=0;
	public static int Confirm_Number_Honest=0;
    public MutliThread1(String name,String Fake_name){
        super(name);//���ø���������Ĺ��췽��
    	Name=name;
    	Fake_Name=Fake_name;
    }

    public void run(){
    	int max=1000000000,min=1;
    	String Sha=null;String Hash="0079c2b939460ac70a6edab186dfd3c09f9be5218d394c1603e8ff870d8a55fb";
    	String S_Hash,S_Cut;
//    	String Path = "G:\\Node_competition.txt";String ss = null;
//    	BufferedWriter bw;
//		try {
//			bw = new BufferedWriter(new FileWriter(Path));
//    	String Random1=RandomStringUtils.randomAlphanumeric(10);
    	while(runflag) {
//    		ran2 = (int) (Math.random()*(max-min)+min); 
    		S_Hash=GetRandom.getRandomString(30);
//        	Sha1=String.valueOf(ran2);
    	    Sha=GetSha256.getSHA256StrJava(S_Hash);
//    	    System.out.println("Nonce: "+S_Hash+"   Hash: "+Sha);
    	    S_Cut=Sha.substring(0, 64);
    	    
    	    /* ran2 = (int) (Math.random()*(max-min)+min); 
    		S_Hash=GetRandom.getRandomString(10);
//        	Sha1=String.valueOf(ran2);
    	    Sha=GetSha256.getSHA256StrJava(S_Hash);
//    	    System.out.println("Nonce: "+S_Hash+"   Hash: "+Sha);
    	    S_Cut=Sha.substring(0, 10);
    	    if(S_Cut.compareTo(Hash)<0) {
    	    	if(Fake_Name.equals("MiningPool_1")) {
    	    		Confirm_Number_Pool1++;
    	    		Confirm_Number_Pool2++;
            	    System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool1+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
//            	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
//    				bw.write(ss);bw.newLine();  //������
            	    if(Confirm_Number_Pool1==10) {
            	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool1+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful"+"  WINNER!!!");
            	    	runflag=false;
            	    }    	    		
    	    	}*/
    	    
    	    if(S_Cut.compareTo(Hash)<0) {
    	    	if(Fake_Name.equals("Honest_Node")) {
    	    		Confirm_Number_Honest++;
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Honest+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
//            	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
//    				bw.write(ss);bw.newLine();  //������
            	    if(Confirm_Number_Honest==5) {
            	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Honest+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful"+"  WINNER!!!");
            	    	runflag=false;
            	    }
    	    	}
    	    	if(Fake_Name.equals("Malicious_Node")) {
    	    		Confirm_Number_Malicious++;
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Malicious+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
//            	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
//    				bw.write(ss);bw.newLine();  //������
            	    if(Confirm_Number_Malicious==5) {
            	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Malicious+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful"+"  WINNER!!!");
            	    	runflag=false;
            	    }
    	    	}
//        	    break;
//        	    	 try {
//        	    		 int a,b;a=0;
//        	    		 b=5/a;
//        	    	 } catch (Exception e) {
//        	    	 System.out.printf("Game is Over!");
//        	    	 }
    	    }
    	    else {
    	    	if(Fake_Name.equals("Honest_Node")) {
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Honest+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" failed");
    	    	}
    	    	if(Fake_Name.equals("Malicious_Node")) {
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Malicious+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" failed");
    	    	}
//    	    	ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" failed";
//				bw.write(ss);bw.newLine();  //������
    	    }
    	}//bw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }
}
