<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="subnavbar">

    <div class="subnavbar-inner">

        <div class="container">

            <ul class="mainnav">

                <li class="<% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/statistics")) {%>active<% }%>">
                    <a href="/odds/statistics">
                        <i class="icon-home"></i>
                        <span>General</span>

                    </a>
                </li>

                <li class="<% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/statistics/orphanages")) {%>active<% }%> subnavbar-open-right">
                    <a href="/odds/statistics/orphanages" class="dropdown-toggle">
                        <i class="icon-building"></i>
                        <span>Orphanage Centers</span>
                    </a>
                </li>

                <li class="<% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/statistics/donations")) {%>active<% }%> subnavbar-open-right">
                    <a href="/odds/statistics/donations" class="dropdown-toggle">
                        <i class="icon-money"></i>
                        <span>Donations</span>
                    </a>
                </li>

                <li class="<% if (request.getAttribute("javax.servlet.forward.request_uri").equals("/odds/statistics/children")) {%>active<% }%> subnavbar-open-right">
                    <a href="/odds/statistics/children">
                        <i class="icon-bar-chart"></i>
                        <span>Children</span>
                    </a>
                </li>

            </ul>

            <ul class="mainnav pull-right">

                <li class=" active subnavbar-open-right">
                    <a href="/odds/statistics/children">
                        <i class="icon-bar-chart"></i>
                        <span>Children Statistics</span>
                    </a>
                </li>

            </ul>                    

        </div> <!-- /container -->

    </div> <!-- /subnavbar-inner -->

</div> <!-- /subnavbar -->