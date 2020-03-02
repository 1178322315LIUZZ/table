<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index3.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.validate.js"></script>
</head>
<body>
	<form action="/list.do" method="post">
	价格:<input type="text" name="p1" value="${c.p1 }">
	-<input type="text" name="p2" value="${c.p2 }">
	百分比:<input type="text" name="sale" value="${c.sale }">%
	排序:<select name="method">
			<option value="sales" ${c.method=="sales"?"selected":"" }>销售百分比</option>
			<option value="price" ${c.method=="price"?"selected":"" }>价格</option>
		</select>
		<select name="type">
			<option value="asc"  ${c.type=="asc"?"selected":"" }>正序</option>
			<option value="desc" ${c.type=="desc"?"selected":"" }>倒序</option>
		</select>
	<input type="submit" value="查询">
		<table>
			<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>价格</td>
			<td>百分比</td>
			</tr>
			<c:forEach items="${g }" var="c" varStatus="i">
				<tr>
				<td>${i.count }</td>
				<td>${c.name }</td>
				<td>${c.price }</td>
				<td>${c.sales }%</td>
				</tr>
			</c:forEach>
			<tr>
			<td colspan="100">
			<button name="pageNum" value="1">首页</button>
			<button name="pageNum" value="${pg.prePage==0?1:pg.prePage }">上一页</button>
			<button name="pageNum" value="${pg.nextPage==0?pg.pages:pg.nextPage }">下一页</button>
			<button name="pageNum" value="${pg.pages }">尾页</button>
			当前${pg.pageNum }页/共${pg.pages }页,共有${pg.total }条数据
			</td>
		</table>
	</form>
</body>
</html>