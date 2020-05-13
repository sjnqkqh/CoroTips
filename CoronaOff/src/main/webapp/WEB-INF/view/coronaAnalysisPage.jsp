<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코로나 정보 유튜브</title>
<%@ include file="./header.jsp"%>

<style type="text/css">
body {
	background-color: #e6eeff;
}

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

#patientCardDiv {
	background-color: #ffffff;
	padding: 3%;
	width: 95%;
	margin-left: 2.5%;
	padding: 3%;
}
</style>
</head>
<body style="height: 75%;">
	<div id="statusDiv">

		<div id="patientCardDiv" class="card bg-light text-dark">
			<div class="status">
				현재 확진자
				<h3>${patientNumber.totalPatient }명</h3>
			</div>
			<div class="status">
				총 퇴원환자
				<h3>${patientNumber.curedPatient }명</h3>
			</div>
			<div class="status">
				총 사망자
				<h3>${patientNumber.deadPatient }명</h3>
			</div>
			<div class="status">
				완치 (격리 해제) 비율
				<h3>${curedPercent}%</h3>
			</div>
			<a style="margin-left: 1%; font-size: small;">최종 업데이트 시간 :
				${patientNumber.updateTime } </a>
		</div>
	</div>
	<br>


	<div id="patientCardDiv" class="card bg-light text-dark">
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