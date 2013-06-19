<%@include file="../../jspf/layout/header.jspf" %>

<%@include file="../../jspf/layout/banner/simple.jspf" %>

<%@include file="jspf/subnav.jsp" %>

<div class="container">
    <div class="row-fluid">
        <div class="span8">
            <div class="widget ">
                <div class="widget-header">
                    <i class="icon-list-alt"></i>
                    <h3>Manage News</h3>
                </div> <!-- /widget-header -->
                <div class="widget widget-table action-table">
                    <table class="table table-bordered table-striped table-highlight">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Title</th>
                                <th>Body</th>
                                <th>Time</th>
                                <th>Operations</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="item" items="${news}" varStatus="status">
                                <tr>
                                    <td>${status.count}</td>
                                    <td>${item.title}</td>
                                    <td>${item.body}</td>
                                    <td>${item.time}</td>
                                    <td class="td-actions">
                                        <a href="/odds/admin/news/edit/${item.id}" class="btn btn-small btn-warning">
                                            <i class="btn-icon-only  icon-edit"></i>
                                        </a>
                                        <a href="/odds/admin/news/delete/${item.id}" onclick="return confirm('Are you sure want to delete?');" class="btn btn-small">
                                            <i class="btn-icon-only icon-trash"></i>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
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
                    <a href="/odds/admin/news/create">
                        <button class="btn btn-large btn-primary">
                            <i class="icon-list-alt"></i> Post news
                        </button>
                    </a>
                </div> <!-- /widget-content -->
            </div> <!-- /widget-box -->
            <% }%>
        </div> <!-- /span4 -->
    </div>
</div>

<%@include file="../../jspf/layout/footer.jspf" %>