<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src = "https://code.jquery.com/jquery-3.6.0.min.js"></script>

</head>
<body>
	<h1>아두이노 서버 요청 </h1>
	<form action="http://192.168.20.70" method="get">
		<input type = "text" name="name">
		<input type ="submit" value="전송">
	</form>
	<h2>아두이노 서버에 ajax로 요청</h2>
	<input type = "text" name = "name">
	<button id = "sendData">아두이노로 ajax통신</button>
	<br><br>
	<div>
		<p>sensor</p>
		<label>
			<input type ="radio" name = "flags" value = "on">ON
		</label>
		<label>
			<input type ="radio" name = "flags" value = "off">OFF
		</label>
	</div>	
	
	<!-- <div>
		<p>led</p>
		<label>
			<input type ="radio" name = "flag" value = "on">ON
		</label>
		<label>
			<input type ="radio" name = "flag" value = "off">OFF
		</label>
	</div>	
	
	<div>
		<p>speaker</p>
		<label>
			<input type ="radio" name = "flag1" value = "on">ON
		</label>
		<label>
			<input type ="radio" name = "flag1" value = "off">OFF
		</label>
	</div>	 -->
	<div id = "container">
	
	</div>
	
	<script>
	$("[name=flags]").click(e=>{
		
		$.ajax({
			url:"<%=request.getContextPath()%>/led",
			data:{"url":"sensor","flag":$(e.target).val()},
			success:data=>{
				alert(data);
			}
			
		})
		
		
	})
	
	
	<%-- 
		$("[name=flag1]").click(e=>{
			
			$.ajax({
				url:"<%=request.getContextPath()%>/led",
				data:{"url":"speaker","flag":$(e.target).val()},
				success:data=>{
					alert(data);
				}
				
			})
			
			
		})
	
	
	
		$("[name=flag]").click(e=>{
		
			$.ajax({
				url:"<%=request.getContextPath()%>/led",
				data:{"url":"led","flag":$(e.target).val()},
				success:data=>{
					alert(data);
				}
				
			})
			
			
		})
		 --%>
	
		$("#sendData").click (e=>{
			
			$.ajax({
				url : "<%=request.getContextPath()%>/ardu", 
				data: {"name":$(e.target).prev().val()},
				success:data=>{
						$("#container").html(data);					
				}
			})
		})
		
	</script>
	
</body>
</html>