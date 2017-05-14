<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
			<td>操作</td>
		</tr>
	</thead>
	<tbody>
		<c:when test="${not empty userList}">
                  <c:forEach items="${userList}" var="user" varStatus="vs">
					<tr>
						<td>${user.uid}</td>
						<td>${user.name}</td>
						<td>${user.age}</td>
						<td>${user.sex}</td>
						<td>
					        <button class="btn btn-success " type="button" onclick="edit('${user.uid}');" title="编辑"><i class="fa fa-pencil"></i> <span class="bold"></span></button>
				            <button class="btn btn-danger " type="button" title="删除" onclick="del('${user.uid}','${user.uid}');"><i class="fa fa-trash-o"></i></button>
						</td>
					</tr>
			</c:forEach>
		</c:when>
	</tbody>
	<tfoot>
		<tr>
			<th colspan="13">
				<!-- 放批量操作按钮 -->
				<button data-toggle="button" class="btn btn-primary active" type="button" onclick="add();">新增</button>
			</th>
		</tr>
	</tfoot>
</table>
</body>
</html>