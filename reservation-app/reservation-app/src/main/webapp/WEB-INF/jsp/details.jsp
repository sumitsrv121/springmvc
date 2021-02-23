<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>

<div class="container">
	<h3>Here is your booking details</h3>
	<div class="row">
		<div class="col-sm-6">
			<p class="text-danger list-group-item">Booking Id</p>
			<p class="list-group-item active">${booking.bookingId}</p>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-6">
			<p class="text-danger list-group-item">First Name</p>
			<p class="list-group-item active">${booking.firstName}</p>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-6">
			<p class="text-danger list-group-item">Last Name</p>
			<p class="list-group-item active">${booking.lastName}</p>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-6">
			<p class="text-danger list-group-item">Gender</p>
			<p class="list-group-item active">
				<c:out value="${booking.gender=='M' ? 'Male' : 'Female'}"></c:out>
			</p>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-6">
			<p class="text-danger list-group-item">Meal</p>
			<c:forEach items="${booking.food}" var="item">
				<ul>
					<li class="list-group-item disable">${item}</li>
				</ul>
			</c:forEach>

		</div>
	</div>
	<div class="row">
		<div class="col-sm-6">
			<p class="text-danger list-group-item">Origin Station</p>
			<p class="list-group-item active">${booking.leavingFrom}</p>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-6">
			<p class="text-danger list-group-item">Destination Station</p>
			<p class="list-group-item active">${booking.goingTo}</p>
		</div>
	</div>
</div>

<%@include file="common/footer.jspf"%>