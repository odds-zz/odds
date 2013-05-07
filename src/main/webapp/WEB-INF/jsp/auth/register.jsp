<%@include file="../../jspf/layout/header.jspf" %>
<%@include file="../../jspf/layout/banner/simple.jspf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<link href="/odds/assets/css/signin.css" media="screen" rel="stylesheet" type="text/css">

<div class="account-container register">

    <div class="content clearfix">

        <form:form id="form" method="post" command="user" modelAttribute="user" cssClass="cleanform">
            <h1>Create Your Account</h1>

            <div class="login-social">
                <p>Sign in using social network:</p>

                <div class="twitter-btn">
                    <a href="#" class="btn_1">Login with Twitter</a>
                </div>

                <div class="fb">
                    <a href="#" class="btn_2">Login with Facebook</a>
                </div>
            </div>

            <div class="login-fields">

                <p>Create your free account:</p>
                <s:bind path="*">
                    <c:if test="${status.error}">
                        <div class="alert alert-error">
                            <button type="button" class="close" data-dismiss="alert">×</button>
                            Form has been submitted with errors
                        </div>
                    </c:if>
                </s:bind>
                <div class="field">
                    <form:label path="firstname">
                        First Name:
                    </form:label>
                    <form:input path="firstname" placeholder="First Name" cssClass="login" />
                    <form:errors path="firstname" cssClass="error" />
                </div> <!-- /field -->

                <div class="field">
                    <form:label path="lastname">
                        Last Name:
                    </form:label>
                    <form:input path="lastname" placeholder="Last Name" cssClass="login" />
                    <form:errors path="lastname" cssClass="error" />
                </div> <!-- /field -->

                <div class="field">
                    <form:label path="username">
                        Username:
                    </form:label>
                    <form:input path="username" placeholder="Username" cssClass="login" />
                    <form:errors path="username" cssClass="error" />
                </div> <!-- /field -->

                <div class="field">
                    <form:label path="email">
                        Email Address:
                    </form:label>
                    <form:input path="email" placeholder="Email" cssClass="login" />
                    <form:errors path="email" cssClass="error" />
                </div> <!-- /field -->

                <div class="field">
                    <form:label path="password">
                        Password:
                    </form:label>
                    <form:input path="password" type="password" placeholder="Password" cssClass="login" />
                    <form:errors path="password" cssClass="error" />
                </div> <!-- /field -->

                <div class="field">
                    <form:label path="confirmPassword">
                        Confirm Password:
                    </form:label>
                    <form:input path="confirmPassword" type="password" placeholder="Confirm Password" cssClass="login" />
                    <form:errors path="confirmPassword" cssClass="error" />
                </div> <!-- /field -->

            </div> <!-- /registration-fields -->

            <div class="login-actions">

                <span class="login-checkbox">
                    <input id="Field" name="Field" type="checkbox" class="field login-checkbox" value="First Choice" tabindex="4">
                    <label class="choice" for="Field">I have read and agree with the Terms of Use.</label>
                </span>

                <button class="button btn btn-primary btn-large">Register</button>

            </div> <!-- .actions -->
        </form:form>
    </div> <!-- /content -->

</div>
<%@include file="../../jspf/layout/footer.jspf" %>