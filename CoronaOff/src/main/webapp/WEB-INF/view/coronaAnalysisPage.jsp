<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코로나 정보 유튜브</title>
<%@ include file="./header.jsp"%>

<style type="text/css">
#statusDiv {
	width: 100%;
	margin-top: 20%;
}

.tumbTd {
	width: 30%;
	overflow: hidden;
}

.status {
	width: 96%;
	margin-left: 2%;
}

.table {
	width: 97%;
	margin-left: f1.5%;
	text-align: center;
}
</style>
</head>
<body style="height: 75%;">
	<div id="statusDiv">
		<h5>⊙코로나 바이러스-19 국내 환자 현황</h5>
		<div>
			<div class="status" style="background-color: #e6005c; color: white;">
				현재 확진자
				<h3>${patientNumber.totalPatient }명</h3>
			</div>
			<div class="status" style="background-color: #ff3300; color: white;">
				총 퇴원환자
				<h3>${patientNumber.curedPatient }명</h3>
			</div>
			<div class="status" style="background-color: #000000; color: white;">
				총 사망자
				<h3>${patientNumber.deadPatient }명</h3>
			</div>
			<a style="margin-left: 1%; font-size: small;">최종 업데이트 시간 : ${patientNumber.updateTime } </a>
		</div>
	</div>
	<br>
	<div class="container">
		<button type="button" class="btn btn-outline-dark" data-toggle="collapse"
			data-target="#sellerList">⊙추천 마스크 구매처</button>

		<div id="sellerList" class="collapse" style="margin-top: 3%">
			<c:forEach items="${maskSellerList}" var="maskSeller">
				<button class="btn btn-outline-secondary" onclick="location.href='${maskSeller.sellerHomePage}'" style="margin-top: 2%;">${maskSeller.sellerName}</button>
			</c:forEach>
			<br>
			
		</div>
	</div>

	<div style="margin-top: 10%;">
		<h5>⊙코로나 바이러스-19 지역별 환자 현황</h5>
		<table class="table">
			<thead>
				<tr>
					<th width="30%">지역</th>
					<th width="70%">환자 수</th>
				</tr>
			</thead>
			<tbody id="hover">
				<c:forEach items="${localStatus}" var="local">
					<tr class="hovertr">
						<td>${local.localName}</td>
						<td>${local.localNOP}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script type="text/javascript">
		$(document).ready(function() {

		});
	</script>

</body>
</html>