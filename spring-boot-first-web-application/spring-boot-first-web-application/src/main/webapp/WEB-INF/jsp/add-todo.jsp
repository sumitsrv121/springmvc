<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<div class="container">
	Add todo page for ${name}
	<form:form method="post" modelAttribute="todo">
		<fieldset class="form-group">
			<form:label path="desc">Description</form:label>
			<form:input type="text" path="desc" class="form-control"
				required="required" />
			<form:errors path="desc" cssClass="text-warning"></form:errors>
		</fieldset>
		<fieldset>
			<form:label path="targetDate">Target Date</form:label>
			<form:input path="targetDate" type="text"
				class="form-control datepicker" />
			<form:errors path="targetDate" cssClass="text-warning"></form:errors>
		</fieldset>
		<fieldset>
			<form:label path="done">Complete</form:label>
			<form:checkbox path="done" clas="form-check-input" />
		</fieldset>
		<button class="btn btn-success">Add</button>
	</form:form>
</div>

<%@include file="common/footer.jspf"%>