<%@include file="../../jspf/layout/header.jspf" %>
<%@include file="../../jspf/layout/banner/simple.jspf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<link href="/odds/assets/css/signin.css" media="screen" rel="stylesheet" type="text/css">

<div class="account-container">

    <div class="content clearfix">

        <form name="f" action="<c:url value='/auth/check' />" method="POST">
            <h1>Sign In</h1>

            <div class="login-fields">

                <p>Sign in using your registered account:</p>

                <c:if test="${not empty error}">
                    <div class="errorblock">
                        Your login attempt was not successful, try again.<br /> Caused :
                        ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                    </div>
                </c:if>

                <div class="field">
                    <label for="email">
                        Email Address:
                    </label>
                    <input id="email" name="j_username" type="text" placeholder="Username" class="login username-field" />
                </div> <!-- /field -->

                <div class="field">
                    <label for="password">
                        Password:
                    </label>
                    <input id="password" name="j_password" type="password" placeholder="Password" class="login password-field" />
                </div>  <!-- /password -->

            </div> <!-- /login-fields -->

            <div class="login-actions">

                <span class="login-checkbox">
                    <input id="Field" name="Field" type="checkbox" class="field login-checkbox" value="First Choice" tabindex="4">
                    <label class="choice" for="Field">Keep me signed in</label>
                </span>

                <button name="submit" class="button btn btn-warning btn-large">Sign In</button>

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
        </form>
    </div> <!-- /content -->

</div>

<%@include file="../../jspf/layout/footer.jspf" %>