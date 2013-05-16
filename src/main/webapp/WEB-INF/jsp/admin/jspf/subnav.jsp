<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="subnavbar">

    <div class="subnavbar-inner">

        <div class="container">

            <ul class="mainnav">

                <li class="<% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/admin")) {%>active<% }%>">
                    <a href="/odds/admin">
                        <i class="icon-home"></i>
                        <span>Admin</span>

                    </a>
                </li>

                <li class="dropdown <% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/admin/users")) {%>active<% }%>">
                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="icon-group"></i>
                        <span>Users</span>
                        <b class="caret"></b>
                    </a>

                    <ul class="dropdown-menu">
                        <li><a href="/odds/admin/users">System Administrators</a></li>
                        <li><a href="/odds/admin/users">Orphanage Administrators</a></li>
                        <li><a href="/odds/admin/users">All Users</a></li>
                    </ul>
                </li>


                <li class="<% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/admin/orphanages")) {%>active<% }%> subnavbar-open-right">
                    <a href="/odds/admin/orphanages" class="dropdown-toggle">
                        <i class="icon-building"></i>
                        <span>Orphanages</span>
                    </a>
                </li>

                <li class="<% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/admin/donations")) {%>active<% }%> subnavbar-open-right">
                    <a href="/odds/admin/donations" class="dropdown-toggle">
                        <i class="icon-money"></i>
                        <span>Donations</span>
                    </a>
                </li>

                <li class="<% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/admin/reports")) {%>active<% }%> subnavbar-open-right">
                    <a href="/odds/admin/reports">
                        <i class="icon-bar-chart"></i>
                        <span>Reports</span>
                    </a>
                </li>

            </ul>

        </div> <!-- /container -->

    </div> <!-- /subnavbar-inner -->

</div> <!-- /subnavbar -->