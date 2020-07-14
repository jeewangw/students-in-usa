<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
  <ul class="navbar-nav ml-auto">
    <li class="nav-item active">
      <a class="nav-link" href="add_college">Add Colleges</a>
    </li>
    <li class="nav-item active">
      <a class="nav-link" href="add_student">Add Students</a>
    </li>
     <li class="nav-item active">
      <a class="nav-link" href="list_college">List Colleges</a>
    </li>
    <li class="nav-item active">
      <a class="nav-link" href="list_student">List Students</a>
    </li>
    <li class="nav-item active">
      <div class="dropdown">
		  <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
		    ${uname} 
		  </button>
		  <div class="dropdown-menu">
		  	<a class="dropdown-item" href="edit_user?id=${uid}">Update Profile</a>
		    <a class="dropdown-item" href="logout_user">Log Out</a>
		  </div>
	</div>
    </li>
  </ul>
</nav>