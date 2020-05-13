<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>영업확인</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Gothic+A1:600&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
body, html {
	padding: 0;
	height: 100%;
	
    font-family: "Gothic A1", sans-serif;
   
}
</style>
</head>
<body>

	<nav class="navbar navbar-expand-bg navbar-light bg-light fixed-top">
		<a class="navbar-brand" href="coronaAnalysisPage" style="font-size: x-large;">코로팁스</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="coronaAnalysisPage">전국 환자 현황</a></li>
				<li class="nav-item"><a class="nav-link" href="patientListPage">환자별 이동 현황</a></li>
				<li class="nav-item"><a class="nav-link" href="hospitalListPage">선별 진료소</a></li>
				<li class="nav-item"><a class="nav-link" href="healthInfoPage">건강 정보</a></li>
			</ul>
			<br>
		<div>코로팁스는 신종 코로나 바이러스의 예방를 위한 정보를 제공하며, 확진자 현황 및 진료소 위치는 대한민국 보건복지부 자료를 토대로 업데이트됩니다.</div>
		<br>
		<div>해당 사태의 신속한 종결을 진심으로 바랍니다.</div>
		<div>개발자 양준렬 (sjn3649@gmail.com)</div>
		</div>
		
		
	</nav>

</body>
</html>