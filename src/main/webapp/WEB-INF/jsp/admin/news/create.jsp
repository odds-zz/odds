<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../../../jspf/layout/header.jspf" %>

<%@include file="../../../jspf/layout/banner/simple.jspf" %>

<%@include file="../jspf/subnav.jsp" %>

<div class="container">
    <div class="row-fluid">
        <div class="span8">
            <div class="widget ">
                <div class="widget-header">
                    <i class="icon-list-alt"></i>
                    <h3>Post news</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <form:form id="edit-profile" class="form-horizontal" method="POST" command="news" modelAttribute="news">
                        <fieldset >
                            <div class="form-element control-group">
                                <form:label path="title" class="control-label">
                                    Title:
                                </form:label>
                                <div class="controls" style="width:60%">
                                    <form:input path="title" class="input-block-level" placeholder="Orphanage name" />
                                    <form:errors path="title" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="body" class="control-label">
                                    Body:
                                </form:label>
                                <div class="controls" style="width:60%">
                                    <form:textarea path="body" class="input-block-level" placeholder="News" rows="10" />
                                    <form:errors path="body" cssClass="error" />
                                </div>
                            </div>
                            <br/>
                            <div class="form-actions">
                                <button type="submit" class="btn btn-primary">Post</button>
                                <button type="reset" class="btn">Cancel</button>
                            </div>
                        </fieldset>
                    </form:form>
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
                    <a href="/odds/admin/news">
                        <button class="btn btn-large btn-primary">
                            All news
                        </button>
                    </a>
                </div> <!-- /widget-content -->
            </div> <!-- /widget-box -->
            <% }%>
        </div> <!-- /span4 -->
    </div>
</div>
<script>
    $(function() {
        $(".chosen").chosen();
    });
</script>

<%@include file="../../../jspf/layout/footer.jspf" %>