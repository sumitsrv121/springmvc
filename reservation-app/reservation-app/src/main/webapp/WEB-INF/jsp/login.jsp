<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<div class="container">
	<font color="red">${error}</font>
	<form:form method="post" modelAttribute="user" class="form-group">
		<fieldset>
			<form:label path="userName">UserName</form:label>
			<form:input path="userName" type="text" class="form-control"
				required="required" />
		</fieldset>
		<fieldset>
			<form:label path="password">Password</form:label>
			<form:input path="password" type="password" class="form-control"
				required="required" />
		</fieldset>
		<button class="btn btn-success">login</button>
	</form:form>
</div>
<%@include file="common/footer.jspf"%>