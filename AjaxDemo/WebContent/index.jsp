<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#lv1,#lv2{
		width: 200px;
		height: 30px;
	}
</style>
<script type="text/javascript" src="jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url:"/AjaxDemo/channel",
			data:{"level":"1"},
			type:"get",
			dataType:"json",//数据返回格式
			success:function(json){
				console.log(json);
				 for (var i= 0;  i< json.length; i++) {
					var ch = json[i];
					$("#lv1").append("<option value='"+ch.code+"'>"+ch.name+"</option>");
				} 
			}
		});
	});
	$(function() {
		$("#lv1").on("change",function(){
			var patent=$(this).val();
			console.log(patent);
			$.ajax({
				url: "/AjaxDemo/channel",
				data: {"level" : "2" , "patent" : patent},
				dataType:"json",
				type:"get",
				success:function(json){
					console.log(json);
					$("#lv2>option").remove();
					for (var i = 0; i < json.length; i++) {
						var ch =json[i];
						$("#lv2").append("<option value='"+ch.code+"'>"+ch.name+"</option>");
					}
				}
			})
		});
	});
</script>
</head>
<body>
	<select id="lv1">
		<option selected="selected">请选择</option>
	</select>
	<select id="lv2"></select>
</body>
</html>