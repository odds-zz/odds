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
                        <div class="form-interaction">
                            <c:if test="${success}">
                                <div class="alert alert-success">
                                    <button type="button" class="close" data-dismiss="alert">×</button>
                                    <strong>Success!</strong> Thank you, your donation has been received.
                                </div>
                            </c:if>
                        </div>
                        <fieldset>
                            <div class="form-element control-group">
                                <form:label path="amount" class="control-label">
                                    Amount:
                                </form:label>
                                <div class="controls" style="width:50%">
                                    <div class="item-content">
                                        <span>Donation amount (1000/= increments):</span>
                                        <span id="incrementAmount" style="border:0; color:#f6931f; font-weight:bold;"></span>
                                        <div id="incrementSlider" class="slider-primary" style="margin-top: 1em;"></div>
                                    </div>
                                    <form:hidden id="donationAmount" path="amount" placeholder="Donation" />
                                    <form:errors path="amount" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="donor" class="control-label">
                                    Name:
                                </form:label>
                                <div class="controls">
                                    <form:input path="donor" placeholder="First and Last name" />
                                    <form:errors path="donor" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="email" class="control-label">
                                    Email:
                                </form:label>
                                <div class="controls">
                                    <form:input path="email" placeholder="Email address" />
                                    <form:errors path="email" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="phone" class="control-label">
                                    Phone:
                                </form:label>
                                <div class="controls">
                                    <form:input path="phone" placeholder="Phone" />
                                    <form:errors path="phone" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="service" class="control-label">
                                    Service:
                                </form:label>
                                <div class="controls">
                                    <form:input path="service" placeholder="Telecom. company" />
                                    <form:errors path="service" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="message" class="control-label">
                                    Message
                                </form:label>
                                <div class="controls">
                                    <form:textarea path="message" placeholder="Message" />
                                    <form:errors path="message" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-actions">
                                <button type="submit" class="btn btn-success"><i class=" icon-heart-empty"></i> Donate</button>
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
            <% if (request.isUserInRole("ROLE_USER")) {%>
            <div class="widget widget-box">
                <div class="widget-header">
                    <h3>Donation options</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <a href="/odds/donation/money">
                        <button class="btn btn-large btn-primary">
                            <i class="icon-heart-empty"></i> Money Donation Options
                        </button>
                    </a>
                </div> <!-- /widget-content -->
            </div> <!-- /widget-box -->
            <% }%>               
        </div> <!-- /span4 -->
    </div>
</div>

<script>
    /*--------------------------------------------------
     Plugin: Slider
     --------------------------------------------------*/

    /* Increment Slider */
    $("#incrementSlider").slider({
        range: "min",
        value: 1000,
        min: 0,
        max: 500000,
        step: 1000,
        slide: function(event, ui) {
            $("#incrementAmount").text(ui.value + "/=");
            $("#donationAmount").val(ui.value);
        }
    });

    $("#incrementAmount").text($("#incrementSlider").slider("value") + "/=");
</script>

<%@include file="../../../jspf/layout/footer.jspf" %>