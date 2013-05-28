<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../../../jspf/layout/header.jspf" %>

<%@include file="../../../jspf/layout/banner/simple.jspf" %>

<%@include file="../jspf/subnav.jsp" %>
<div class="container" style="margin-top: 1em">
    <div class="row">
        <div class="span8">
            <div class="widget ">
                <div class="widget-header">
                    <i class="icon-building"></i>
                    <h3>Edit Orphanage</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <form:form id="edit-profile" class="form-horizontal" method="POST" command="orphanage" modelAttribute="orphanage">
                        <div class="form-interaction">
                            <div class="alert alert-success">
                                <button type="button" class="close" data-dismiss="alert">×</button>
                                <strong>Success!</strong> Orphanage Center information been updated.
                            </div>
                        </div>
                        <fieldset>
                            <div class="form-element control-group">
                                <form:label path="name" class="control-label">
                                    Orphanage name:
                                </form:label>
                                <div class="controls">
                                    <form:input path="name" placeholder="Orphanage name" />
                                    <form:errors path="name" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="email" class="control-label">
                                    Email Address
                                </form:label>
                                <div class="controls">
                                    <form:input path="email" placeholder="Orphanage email" />
                                    <form:errors path="email" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="phone" class="control-label">
                                    Phone
                                </form:label>
                                <div class="controls">
                                    <form:input path="phone" placeholder="Orphanage phone" />
                                    <form:errors path="phone" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="region" class="control-label">
                                    Region
                                </form:label>
                                <div class="controls">
                                    <form:select path="region"  class="chosen">
                                        <form:option value="" label="Pick a Region"/>
                                        <form:options items="${regions}" />
                                    </form:select>
                                    <form:errors path="region" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="details" class="control-label">
                                    Orphanage details
                                </form:label>
                                <div class="controls">
                                    <form:textarea path="details" placeholder="Orphanage details" />
                                    <form:errors path="details" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="region" class="control-label">
                                    Administrator
                                </form:label>
                                <div class="controls">
                                    <form:select path="admin" class="chosen">
                                        <form:option value="" label="Choose an Admin"/>
                                        <form:options items="${users}" itemValue="id" itemLabel="firstname" />
                                    </form:select>
                                    <form:errors path="admin" cssClass="error" />
                                </div>
                            </div>
                            <br/>
                            <div class="form-actions">
                                <button type="submit" class="btn btn-primary">Save</button>
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
        </div> <!-- /span4 -->
    </div> <!-- /row -->
</div>
<script>
    $(function() {
        $(".chosen").chosen();
    });
</script>

<%@include file="../../../jspf/layout/footer.jspf" %>