<%@include file="../../jspf/layout/header.jspf" %>

<%@include file="../../jspf/layout/banner/simple.jspf" %>

<%@include file="jspf/subnav.jsp" %>

<div class="container">
    <div class="row-fluid">
        <div class="span8">
            <div class="widget ">
                <div class="widget-header">
                    <i class="icon-building"></i>
                    <h3>Administrator Orphanages</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <table class="table table-bordered table-striped table-highlight">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Orphanage name</th>
                                <th>Administrator</th>
                                <th>Username</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>Michael</td>
                                <td>Jordan</td>
                                <td>@mjordan</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>Magic</td>
                                <td>Johnson</td>
                                <td>@mjohnson</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <!-- /widget-content -->
            </div> <!-- /widget -->
        </div> <!-- /span8 -->
        <div class="span4">
            <div class="widget widget-box">
                <div class="widget-header">
                    <h3>Extra Info</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                    <p> Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                </div> <!-- /widget-content -->
            </div> <!-- /widget-box -->
            <% if (request.isUserInRole("ROLE_ADMIN")) {%>
            <div class="widget widget-box">
                <div class="widget-header">
                    <h3>Admin options</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <a href="/odds/admin/orphanage/create">
                        <button class="btn btn-large btn-primary">
                            New Orphanage
                        </button>
                    </a>
                </div> <!-- /widget-content -->
            </div> <!-- /widget-box -->
            <% }%>
        </div> <!-- /span4 -->
    </div>
</div>

<%@include file="../../jspf/layout/footer.jspf" %>