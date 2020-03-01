<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코로나 정보 유튜브</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="./header.jsp"%>

<style type="text/css">
table  {
	width: 100%;
	margin-top: 5%;
	text-align: center;
}

.hospCity{
	width: 10%;
}
.hospTown{
	width: 17%;
}
#locText{
	margin-top: 20%;

}
</style>
</head>
<body style="height: 75%;">
	
	<input type="text" class="form-control" id="locText" name="locText" placeholder="원하시는 지역을 입력하세요!">

	<table id="hospTable" class="table-bordered">
		<thead>
			<tr>
				<th>시도</th>
				<th>시군구</th>
				<th>선별진료소</th>
				<th>전화번호</th>
			</tr>
	
		</thead>
		<tbody>
			<c:forEach items="${hospitalList}" var="hospital">
					<tr class="hospitalTr">
						<td class="hospCity">${hospital.hospCity}</td>
						<td class="hospTown">${hospital.hospTown}</td>
						<td class="hospName">${hospital.hospName}</td>
						<td class="hospTel">${hospital.hospTel}</td>
					</tr>
			</c:forEach> 
		</tbody>
	</table>


	<script type="text/javascript">
		$('document').ready(function() {
			$('#locText').keyup(function(){
				
                var k = $(this).val().replace(/ /g,'');
                $(this).val(k);
                $("#hospTable > tbody > tr").hide();
                var temp1 = $("#hospTable > tbody > tr > td:nth-child(4n+1):contains('" + k + "')");
                var temp2 = $("#hospTable > tbody > tr > td:nth-child(4n+2):contains('" + k + "')");
                
                temp1.parent().show();
                temp2.parent().show();
                })
		});
	</script>
</body>
</html>