<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<meta name=description content="Home">
<%@include file="/resources/themes/constats/modules/header.jsp"%>
</head>

<body class="container">
	<header class="header">
		<a href="#" class="logo">ConStats</a>
		<!-- Header Navbar -->
		<nav class="navbar navbar-static-top" role="navigation">
			<!-- toggle button -->
			<a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas"
				role="button"> <span class="sr-only">Sidebar</span> <span
				class="icon-bar"></span>
			</a>
			<div class="navbar-right">
				<ul class="nav navbar-nav">
					<!-- li message -->
					<li class="dropdown messages-menu">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="fa fa-envelope"></i> 
						<span class="label label-success">4</span>
					</a>
						<!-- ul message -->
						<ul class="dropdown-menu">
							
						</ul>
						<!-- end ul message -->
					</li>
					<!-- end li message -->
					<!-- li notification -->
					<li class="dropdown notifications-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-warning"></i>
                                <span class="label label-warning">10</span>
                            </a>
                            <ul class="dropdown-menu">
                            </ul>
                    </li>
                    <!-- end li notification -->
                    <!-- li user menu -->
                    <li class="dropdown user user-menu">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="glyphicon glyphicon-user"></i>
                                <span>Thanh Nhan<i class="caret"></i></span>
                            </a>
                            <ul class="dropdown-menu">
                            	<!-- User image -->
                                <li class="user-header bg-light-blue">
                                    <img src="<c:url value='/resources/themes/constats/images/avatar.png' />" class="img-circle" alt="User Image" />
                                    <p>
                                        Thanh Nhan - Web Developer
                                        <small>Member</small>
                                    </p>
                                </li>
                                
                                <!-- Menu Footer-->
                                <li class="user-footer">
                                    <div class="pull-left">
                                        <a href="#" class="btn btn-default btn-flat">Profile</a>
                                    </div>
                                    <div class="pull-right">
                                        <a href="#" class="btn btn-default btn-flat">Sign out</a>
                                    </div>
                                </li>
                            </ul>
					</li>
					<!-- end li user menu -->
				</ul>
				<!-- end ul nav menu -->
			</div>
		</nav>
	</header>
	<!-- start wrapper -->
	
	<div class="wrapper row-offcanvas row-offcanvas-left">
		<!-- Left side column -->
		<aside class="left-side sidebar-offcanvas">
		<!-- sidebar -->
			<section class="sidebar">
            	<!-- Sidebar user panel
            	<div class="user-panel">
            	//image
            	</div>
            	 -->
            	<!-- sidebar menu -->
            	 	<%@include file="include/sidebar.jsp"%>
                <!-- end sidebar menu -->
            </section>
            <!-- end sidebar -->
         </aside>
         <!-- Right side column -->
         <aside class="right-side">
         	<!-- Content Header (Page header) -->
            <section class="content-header">
               <h1>Dashboard
                   <small>Control panel</small>
               </h1>
               <div class="btn-group btn-add">
               	<button class="btn btn-success"><i class="glyphicon glyphicon-plus"></i> Add Server</button>
               </div>
            </section>
            <!--  End Content Header -->
            <!--  Main Content -->
            <section class="content">
            <div class="main-content">
            	<%@include file="include/maincontent.jsp"%>
            </div>
            </section>
            <!--  End Main Content -->
         </aside>
         <!-- end right column -->
     </div>
     <!-- end wrapper -->
     <footer class="footer">
     <%@include file="/resources/themes/constats/modules/footer.jsp"%>
     </footer>
</body>

</html>
