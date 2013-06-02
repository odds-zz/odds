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
                    <h3>Register a Physical Item Donated</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <form:form id="register-item" class="form-horizontal" method="POST" command="donation" modelAttribute="donation">
                        <div class="form-interaction">
                            <c:if test="${success}">
                                <div class="alert alert-success">
                                    <button type="button" class="close" data-dismiss="alert">×</button>
                                    <strong>Success!</strong> Item has been recorded to the system.
                                </div>
                            </c:if>
                        </div>
                        <fieldset>
                            <div class="form-element control-group">
                                <form:label path="name" class="control-label">
                                    Item name:
                                </form:label>
                                <div class="controls">
                                    <form:input path="name" class="input-xlarge" placeholder="Item name" />
                                    <form:errors path="name" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="donor" class="control-label">
                                    Name:
                                </form:label>
                                <div class="controls">
                                    <form:input path="donor" class="input-xlarge"  placeholder="First and Last name" />
                                    <form:errors path="donor" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="quantity" class="control-label">
                                    Quantity:
                                </form:label>
                                <div class="controls">
                                    <form:input path="quantity" class="input-xlarge"  placeholder="Quantity" />
                                    <form:errors path="quantity" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="size" class="control-label">
                                    Size:
                                </form:label>
                                <div class="controls">
                                    <form:input path="size" class="input-xlarge"  placeholder="Size" />
                                    <form:errors path="size" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="metric" class="control-label">
                                    Metric:
                                </form:label>
                                <div class="controls">
                                    <form:input path="metric" class="input-xlarge"  placeholder="Metric" />
                                    <form:errors path="metric" cssClass="error" />
                                </div>
                            </div>                                
                            <div class="form-element control-group">
                                <form:label path="details" class="control-label">
                                    Details:
                                </form:label>
                                <div class="controls">
                                    <form:textarea path="details" rows="5" class="input-xlarge"  placeholder="Message" />
                                    <form:errors path="details" cssClass="error" />
                                </div>
                            </div>      
                            <div class="form-element control-group">
                                <form:label path="orphanage" class="control-label">
                                    Orphanage Center
                                </form:label>
                                <div class="controls">
                                    <form:select path="orphanage" class="chosen">
                                        <form:option value="" label="Choose an Orphanage Center"/>
                                        <form:options items="${orphanages}" itemValue="id" itemLabel="name" />
                                    </form:select>
                                    <form:errors path="orphanage" cssClass="error" />
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