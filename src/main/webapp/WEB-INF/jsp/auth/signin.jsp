<%@include file="../../jspf/layout/header.jspf" %>
<%@include file="../../jspf/layout/banner/simple.jspf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<link href="/odds/assets/css/signin.css" media="screen" rel="stylesheet" type="text/css">

<div class="account-container">

    <div class="content clearfix">

        <form:form id="form" method="post" modelAttribute="signinFormBean" cssClass="cleanform">
            <h1>Sign In</h1>

            <div class="login-fields">

                <p>Sign in using your registered account:</p>

                <div class="field">
                    <form:label path="email">
                        Email Address: <form:errors path="email" cssClass="error" />
                    </form:label>
                    <form:input path="email" placeholder="Email" cssClass="login username-field" />
                </div> <!-- /field -->

                <div class="field">
                    <form:label path="password">
                        Password: <form:errors path="password" cssClass="error" />
                    </form:label>
                    <form:input path="password" type="password" placeholder="Password" cssClass="login password-field" />
                </div> <!-- /password -->

            </div> <!-- /login-fields -->

            <div class="login-actions">

                <span class="login-checkbox">
                    <input id="Field" name="Field" type="checkbox" class="field login-checkbox" value="First Choice" tabindex="4">
                    <label class="choice" for="Field">Keep me signed in</label>
                </span>

                <button class="button btn btn-warning btn-large">Sign In</button>

            </div> <!-- .actions -->

            <div class="login-social">
                <p>Sign in using social network:</p>

                <div class="twitter-btn">
                    <a href="#" class="btn_1">Login with Twitter</a>
                </div>

                <div class="fb">
                    <a href="#" class="btn_2">Login with Facebook</a>
                </div>
            </div>
        </form:form>
    </div> <!-- /content -->

</div>

<%@include file="../../jspf/layout/footer.jspf" %>