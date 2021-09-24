<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>查询金融链</title>
  <link rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
        integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
        crossorigin="anonymous">
</head>
<body style="background-image:url(images/Black.png);background-size:100% 100%;background-attachment:fixed;" >
<div class="container" >
  <img src="images/QiangGe.jpg" width=10% height=10% />
</div>
<div class="container">
  <div class="row" style="margin-top: 100px">
    <div class="col-md-4 col-md-offset-4">
      <div class="panel panel-primary" style="background-image:url(images/Black.png);background-size:100% 100%;background-attachment:fixed;">
        <div class="panel-heading">
          <span class="glyphicon glyphicon-plus"></span>矿池攻击跟踪系统
        </div>
        <div class="panel-body">
          <form action="Read.jsp" method="POST" name="registerForm" >
            <div class="form-group">
            <label for="">请选择矿池数据类型 </label>
              <select name="Attack_Type"  value="${Attack_Type}">     
  				<option value="ExperimentalData">-ExperimentalData-</option>
  				<option value="StatisticData">-StatisticData-</option>      
 			</select>
            </div>
            <div class="form-group">
              <label for="">请输入寻找类型 </label>
            	<select name="Find_Type"  value="${Find_Type}">     
  				<option value="NonPool">-NonPool-</option>
  				<option value="Pool_Ce_Dec">-Pool_Ce_Dec-</option>    
  				<option value="Pool_Cen">-Pool_Cen-</option>
  				<option value="Pool_Dec">-Pool_Dec-</option>    
 			</select>
            </div>
            <div class="form-group">
              <label for="">请输入数据集页码</label> <input type="text"
                                                class="form-control" name="Page_Number" placeholder="1，2，3……">
            </div>
            <button type="submit" class="btn btn-primary"
                    onclick="return checkForm()">开始查询</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
<script type="text/javascript">
  function checkForm() {
    var Attack_Type = registerForm.name.value;
    var Find_Type = registerForm.start_time.value;
    var Page_Number = registerForm.end_time.value;
    //alert(name + pwd + repwd);
    if (Attack_Type == "" || Attack_Type == null) {
      alert("请输入攻击类型");
      registerForm.Attack_Type.focus();
      return false;
    } else if (Find_Type == "" || Find_Type == null) {
      alert("请输入寻找类型");
      registerForm.Find_Type.focus();
      return false;
    } else if (Page_Number == "" || Page_Number == null) {
      alert("请输入页码");
      registerForm.Page_Number.focus();
      return false;
    }
    return true;
  }
</script>
</body>
</html>