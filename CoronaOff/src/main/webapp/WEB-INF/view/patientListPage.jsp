<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코로나 정보 유튜브</title>
<%@ include file="./header.jsp"%>

<style type="text/css">
#patientDiv {
	text-align: center;
	width: 100%;
	margin-top: 20%;
}

</style>

</head>
<body style="height: 75%;">


  <div id="patientDiv">

  
	<button type="button" class="btn btn-light btn-block" >
		 <div>
		 	<div style="width: 30%; float:left;">확진자 번호</div>
		 	<div style="width: 70%; float:left;">주요 지역</div>
		</div>	 
	</button>
	
	<c:forEach items="${patientList}" var="patient">
		<button type="button" class="btn btn-outline-dark btn-block" data-toggle="collapse" data-target="#div${patient.pnum}">
		 <div>
		 	<div style="width: 30%; float:left;">${patient.pnum}번환자</div>
		 	<div style="width: 70%; float:left;">${patient.plocate}</div>
		</div>	 
		</button>
		<div id="div${patient.pnum}" class="collapse" style="text-align: left; margin-left: 3%;">
			${patient.proute }
		</div>
	</c:forEach>
	  <a style="color: #ff5050;">환자 수의 폭증으로 더 이상 환자 개인의 이동경로를 반영하지 못하게 되었습니다. 죄송합니다. </a>
	  
</div>
	<script type="text/javascript">
		$(document).ready(function(){
			$(".btn-outline-dark").on('click',function(){
				$(" #patientDiv > .collapse").collapse('hide');
				$(this).next().collapse('show');
				});

			});
	</script>
</body>
</html>