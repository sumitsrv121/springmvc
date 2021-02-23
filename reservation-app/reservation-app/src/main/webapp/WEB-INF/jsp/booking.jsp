<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>

<div class="container">
	<form:form class="form-group" modelAttribute="booking">
		<fieldset class="form-group">
			<form:label path="firstName">First Name</form:label>
			<form:input path="firstName" type="text" class="form-control" />
		</fieldset>

		<fieldset class="form-group">
			<form:label path="lastName">Last Name</form:label>
			<form:input path="lastName" type="text" class="form-control" />
		</fieldset>

		<fieldset class="form-group">
			<form:label path="gender">Gender</form:label>
			<em class="radio-inline">Male</em>
			<form:radiobutton path="gender" value="M" />
			<em class="radio-inline">Female</em>
			<form:radiobutton path="gender" value="F" />
			<em class="radio-inline">Others</em>
			<form:radiobutton path="gender" value="O" />
		</fieldset>

		<fieldset class="form-group form-check">
			<form:label path="food">Meal</form:label>
			<em class="checkbox-inline">Breakfast</em>
			<form:checkbox path="food" value="breakfast" />
			<em class="checkbox-inline">Lunch</em>
			<form:checkbox path="food" value="lunch" />
			<em class="checkbox-inline">Dinner</em>
			<form:checkbox path="food" value="dinner" />
			<em class="checkbox-inline">Snacks</em>
			<form:checkbox path="food" value="snack" />
		</fieldset>

		<fieldset class="form-group">
			<form:label path="leavingFrom">Leaving From</form:label>
			<form:select path="leavingFrom" class="form-control">
				<form:option value="Ghaziabad" label="Ghaziabad" />
				<form:option value="Modinagar" label="Modinagar" />
				<form:option value="Meerut" label="Meerut" />
				<form:option value="Amristar" label="Amristar" />
			</form:select>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="goingTo">Going to</form:label>
			<form:select path="goingTo" class="form-control">
				<form:option value="Ghaziabad" label="Ghaziabad" />
				<form:option value="Modinagar" label="Modinagar" />
				<form:option value="Meerut" label="Meerut" />
				<form:option value="Amristar" label="Amristar" />
			</form:select>
		</fieldset>

		<button class="btn btn-success">Book Ticket</button>
	</form:form>
</div>

<%@include file="common/footer.jspf"%>