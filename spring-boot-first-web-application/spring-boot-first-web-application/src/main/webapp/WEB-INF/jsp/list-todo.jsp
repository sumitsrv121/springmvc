<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<div class="container">
	<h1>Your Todos</h1>
	<table class="table table-striped">
		<caption>Your todos are</caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Date</th>
				<th>Completed</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td><c:out value="${todo.desc}"></c:out></td>
					<td><fmt:formatDate value="${todo.targetDate}"
							pattern="dd/MM/yyyy" /></td>
					<td><c:out value="${todo.done}"></c:out></td>
					<td><a href="/update-todo?id=${todo.id}" type="button"
						class="btn btn-primary">Update</a></td>
					<td><a href="/delete-todo?id=${todo.id}" type="button"
						class="btn btn-warning">Delete</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<div>
		<a class="button" href="/add-todo">Add a todo</a>
	</div>
</div>
<%@include file="common/footer.jspf"%>