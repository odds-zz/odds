<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../../../jspf/layout/header.jspf" %>

<%@include file="../../../jspf/layout/banner/simple.jspf" %>

<div class="container" style="margin-top: 1em">
    <div class="row-fluid">
        <div class="span8">
            <div class="widget ">
                <div class="widget-header">
                    <i class="icon-mobile-phone"></i>
                    <h3>Donation by Phone</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <form:form id="edit-profile" class="form-horizontal" method="POST" command="donation" modelAttribute="donation">
                        <fieldset>
                            <div class="form-element control-group">
                                <form:label path="amount" class="control-label">
                                    Amount:
                                </form:label>
                                <div class="controls">
                                    <form:input path="amount" placeholder="Orphanage name" />
                                    <form:errors path="amount" cssClass="error" />
                                </div>
                                <div class="form-actions">
                                    <button type="submit" class="btn btn-success"><i class=" icon-heart-empty"></i> Donate</button>
                                </div>
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
    </div>
</div>


<%@include file="../../../jspf/layout/footer.jspf" %>