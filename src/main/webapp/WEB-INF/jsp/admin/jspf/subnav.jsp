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
                        <li><a href="/odds/admin/users">All Users</a></li>
                        <li><a href="/odds/admin/users/orphanageadmins">Orphanage Administrators</a></li>
                        <li><a href="/odds/admin/users/systemadmins">System Administrators</a></li>
                    </ul>
                </li>


                <li class="dropdown <% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/admin/orphanages")) {%>active<% }%> subnavbar-open-right">
                    <a href="/odds/admin/orphanages" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="icon-building"></i>
                        <span>Orphanages</span>
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="/odds/admin/orphanages">All Orphanage Centers</a></li>
                        <li><a href="/odds/admin/orphanages/pdf/rich">View PDF</a></li>
                    </ul>                    
                </li>

                <li class="dropdown <% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/admin/donations")) {%>active<% }%>">
                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="icon-money"></i>
                        <span>Donations</span>
                        <b class="caret"></b>
                    </a>

                    <ul class="dropdown-menu">
                        <li><a href="/odds/admin/donations"><i class="icon-credit-card"></i> Received Funds</a></li>
                        <li><a href="/odds/admin/donation/items"><i class="icon-coffee"></i> Physical Items</a></li>
                    </ul>
                </li>

                <li class="<% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/admin/reports")) {%>active<% }%> subnavbar-open-right">
                    <a href="/odds/admin/news">
                        <i class="icon-list-alt"></i>
                        <span>News</span>
                    </a>
                </li>

            </ul>

        </div> <!-- /container -->

    </div> <!-- /subnavbar-inner -->

</div> <!-- /subnavbar -->