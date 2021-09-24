package Cen_De.Compu_Cen_Decen2.Common;

public class MutliThread_Cen_Den extends Thread{
	private String Name;String Fake_Name;
	private int Confirm_Number=0;
	public static int Confirm_Number_Pool1=0;
	public static int Confirm_Number_Pool2=0;
	public static int Confirm_Number_Pool3=0;
	public static int Confirm_Number_Pool4=0;
	public static int Confirm_Number_Pool5=0;
	public static int Confirm_Number_Pool6=0;
	public static int Confirm_Number_Pool7=0;
	public static int Confirm_Number_Honest=0;
	public static boolean runflag=true;
    public MutliThread_Cen_Den(String name,String Fake_name){
        super(name);//调用父类带参数的构造方法
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
    	    if(S_Cut.compareTo(Hash)<0) {
    	    	if(Fake_Name.equals("MiningPool_1")) {
    	    		Confirm_Number_Pool1++;
    	    		Confirm_Number_Pool2++;
            	    System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool1+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
//            	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
//    				bw.write(ss);bw.newLine();  //换行用
            	    if(Confirm_Number_Pool1==10) {
            	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool1+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful"+"  WINNER!!!");
            	    	runflag=false;
            	    }    	    		
    	    	}
    	    	if(Fake_Name.equals("MiningPool_2")) {
    	    		Confirm_Number_Pool1++;
    	    		Confirm_Number_Pool2++;
            	    System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool2+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
//            	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
//    				bw.write(ss);bw.newLine();  //换行用
            	    if(Confirm_Number_Pool2==10) {
            	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool2+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful"+"  WINNER!!!");
            	    	runflag=false;
            	    }
    	    	}
    	    	if(Fake_Name.equals("MiningPool_3")) {
    	    		Confirm_Number_Pool3++;
            	    System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool3+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
//            	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
//    				bw.write(ss);bw.newLine();  //换行用
            	    if(Confirm_Number_Pool3==10) {
            	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool3+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful"+"  WINNER!!!");
            	    	runflag=false;
            	    }
    	    	}
    	    	if(Fake_Name.equals("MiningPool_4")) {
    	    		Confirm_Number_Pool4++;
            	    System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool4+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
//            	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
//    				bw.write(ss);bw.newLine();  //换行用
            	    if(Confirm_Number_Pool4==10) {
            	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool4+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful"+"  WINNER!!!");
            	    	runflag=false;
            	    }
    	    	}
    	    	if(Fake_Name.equals("MiningPool_5")) {
    	    		Confirm_Number_Pool5++;
            	    System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool5+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
//            	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
//    				bw.write(ss);bw.newLine();  //换行用
            	    if(Confirm_Number_Pool5==10) {
            	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool5+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful"+"  WINNER!!!");
            	    	runflag=false;
            	    }    	    		
    	    	}
    	    	if(Fake_Name.equals("MiningPool_6")) {
    	    		Confirm_Number_Pool6++;
    	    		Confirm_Number_Pool7++;
            	    System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool6+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
//            	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
//    				bw.write(ss);bw.newLine();  //换行用
            	    if(Confirm_Number_Pool6==10) {
            	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool6+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful"+"  WINNER!!!");
            	    	runflag=false;
            	    }    	    		
    	    	}
    	    	if(Fake_Name.equals("MiningPool_7")) {
    	    		Confirm_Number_Pool7++;
    	    		Confirm_Number_Pool6++;
            	    System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool7+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
//            	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
//    				bw.write(ss);bw.newLine();  //换行用
            	    if(Confirm_Number_Pool7==10) {
            	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool7+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful"+"  WINNER!!!");
            	    	runflag=false;
            	    }    	    		
    	    	}
    	    	if(Fake_Name.equals("Honest_Node")) {
    	    		Confirm_Number_Honest++;
            	    System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Honest+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
//            	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
//    				bw.write(ss);bw.newLine();  //换行用
            	    if(Confirm_Number_Honest==10) {
            	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Honest+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful"+"  WINNER!!!");
            	    	runflag=false;
            	    }
    	    	}
//    	    	//ran2=Integer.parseInt(Sha2);
//        	    Confirm_Number++;
//        	    System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" successful");
////        	    ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" successful";
////				bw.write(ss);bw.newLine();  //换行用
//        	    if(Confirm_Number==8) {
//        	    	runflag=false;
//        	    }
//        	    break;
//        	    	 try {
//        	    		 int a,b;a=0;
//        	    		 b=5/a;
//        	    	 } catch (Exception e) {
//        	    	 System.out.printf("Game is Over!");
//        	    	 }
    	    }
    	    else {
    	    	if(Fake_Name.equals("MiningPool_1")) {
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool1+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" failed");    	    		
    	    	}
    	    	if(Fake_Name.equals("MiningPool_2")) {
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool2+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" failed");
    	    	}
    	    	if(Fake_Name.equals("MiningPool_3")) {
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool3+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" failed");
    	    	}
    	    	if(Fake_Name.equals("MiningPool_4")) {
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool4+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" failed");
    	    	}
    	    	if(Fake_Name.equals("MiningPool_5")) {
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool5+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" failed");
    	    	}
    	    	if(Fake_Name.equals("MiningPool_6")) {
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool6+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" failed");
    	    	}
    	    	if(Fake_Name.equals("MiningPool_7")) {
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Pool7+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" failed");
    	    	}
    	    	if(Fake_Name.equals("Honest_Node")) {
    	    		System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number_Honest+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" failed");
    	    	}    	    	
//    	    	ss="Node: "+Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"   Result: "+" failed";
//				bw.write(ss);bw.newLine();  //换行用
//    	    	System.out.println("Node: "+Name+"  Type: "+Fake_Name+"  Nonce: "+S_Hash+"   Hash: "+S_Cut+"  Difficulty: "+Hash+"  Confirm_Number: "+Confirm_Number+"  Timestamp: "+System.currentTimeMillis()+"   Result: "+" failed");
    	    }
    	}//bw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }
}