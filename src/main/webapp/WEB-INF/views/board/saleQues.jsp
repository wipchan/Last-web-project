<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../setting/include.jsp"%>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
</head><body>
	<c:if test="${result > 0 }">
		<script type="text/javascript">
			alert("구매문의가 정상적으로 접수되었습니다.")
			location.href="/board/boardForm"
		</script>
	</c:if>
	<c:if test="${result == 0 }">
		<script type="text/javascript">
			alert("구매문의가 취소되었습니다.")
			history.go(-1)
		</script>
	</c:if>
</body>
</html>