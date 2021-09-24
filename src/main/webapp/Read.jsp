<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");//设置编码方式，防止中文乱码
String Attack_Type = request.getParameter("Attack_Type");
String Find_Type = request.getParameter("Find_Type");
String Page_Number = request.getParameter("Page_Number");
//变量声明 
java.lang.String strFileName; //文件名 
java.io.File objFile; //文件对象 
java.io.FileReader objFileReader; //读文件对象 
char[] chrBuffer = new char[10]; //缓冲 
int intLength; //实际读出的字符数(一个中文为一个字符) 

//设置待读文件名 
strFileName = "F:\\DataSet\\"+Attack_Type+"\\"+Find_Type+"\\"+Page_Number+".txt";



//创建文件对象 
objFile = new java.io.File(strFileName); 



//判断文件是否存在 
if(objFile.exists()){//文件存在 
//创建读文件对象 
objFileReader = new java.io.FileReader(objFile); 



//读文件内容 
while((intLength=objFileReader.read(chrBuffer))!=-1){ 
//输出 
out.write(chrBuffer,0,intLength); 
} 



//关闭读文件对象 
objFileReader.close(); 
} 
else{//文件不存在 
out.println("下列文件不存在："+strFileName); 
}
%>
</body>
</html>