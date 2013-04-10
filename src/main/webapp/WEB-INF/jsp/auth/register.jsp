<%@include file="../../jspf/layout/header.jspf" %>
<%@include file="../../jspf/layout/banner/simple.jspf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<link href="/odds/assets/css/signin.css" media="screen" rel="stylesheet" type="text/css">

<div class="account-container register">

    <div class="content clearfix">

        <form:form id="form" method="post" modelAttribute="formBean" cssClass="cleanform">
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
                <div id="message" class="error">Form has errors</div>
                <c:if test="${not empty message}">
                    <div id="message" class="success">${message}</div>
                </c:if>
                <s:bind path="*">
                    <c:if test="${status.error}">
                        <div id="message" class="error">Form has errors</div>
                    </c:if>
                </s:bind>
                <div class="field">
                    <form:label path="firstname">
                        First Name: <form:errors path="firstname" cssClass="error" />
                    </form:label>
                    <form:input path="firstname" placeholder="First Name" cssClass="login" />
                </div> <!-- /field -->

                <div class="field">
                    <form:label path="lastname">
                        Last Name: <form:errors path="lastname" cssClass="error" />
                    </form:label>
                    <form:input path="lastname" placeholder="Last Name" cssClass="login" />
                </div> <!-- /field -->

                <div class="field">
                    <form:label path="email">
                        Email Address: <form:errors path="email" cssClass="error" />
                    </form:label>
                    <form:input path="email" placeholder="Email" cssClass="login" />
                </div> <!-- /field -->

                <div class="field">
                    <form:label path="password">
                        Password: <form:errors path="password" cssClass="error" />
                    </form:label>
                    <form:input path="password" type="password" placeholder="Password" cssClass="login" />
                </div> <!-- /field -->

                <div class="field">
                    <form:label path="confirmPassword">
                        Confirm Password: <form:errors path="confirmPassword" cssClass="error" />
                    </form:label>
                    <form:input path="confirmPassword" type="password" placeholder="Confirm Password" cssClass="login" />
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
        <script type="text/javascript">
            $(document).ready(function() {
                $("#form").submit(function() {
                    $.post($(this).attr("action"), $(this).serialize(), function(html) {
                        $("#formsContent").replaceWith(html);
                        $('html, body').animate({scrollTop: $("#message").offset().top}, 500);
                    });
                    return false;
                });
            });
        </script>
    </div> <!-- /content -->

</div>
<script>
    MvcUtil = {};
    MvcUtil.showSuccessResponse = function(text, element) {
        MvcUtil.showResponse("success", text, element);
    };
    MvcUtil.showErrorResponse = function showErrorResponse(text, element) {
        MvcUtil.showResponse("error", text, element);
    };
    MvcUtil.showResponse = function(type, text, element) {
        var responseElementId = element.attr("id") + "Response";
        var responseElement = $("#" + responseElementId);
        if (responseElement.length == 0) {
            responseElement = $('<span id="' + responseElementId + '" class="' + type + '" style="display:none">' + text + '</span>').insertAfter(element);
        } else {
            responseElement.replaceWith('<span id="' + responseElementId + '" class="' + type + '" style="display:none">' + text + '</span>');
            responseElement = $("#" + responseElementId);
        }
        responseElement.fadeIn("slow");
    };
    MvcUtil.xmlencode = function(xml) {
        //for IE
        var text;
        if (window.ActiveXObject) {
            text = xml.xml;
        }
        // for Mozilla, Firefox, Opera, etc.
        else {
            text = (new XMLSerializer()).serializeToString(xml);
        }
        return text.replace(/\&/g, '&' + 'amp;').replace(/</g, '&' + 'lt;')
                .replace(/>/g, '&' + 'gt;').replace(/\'/g, '&' + 'apos;').replace(/\"/g, '&' + 'quot;');
    };
</script>
<script type="text/javascript">
    $(document).ready(function() {

        // Append '#' to the window location so "Back" returns to the selected tab
        // after a redirect or a full page refresh (e.g. Views tab).

        // However, note this general disclaimer about going back to previous tabs:
        // http://docs.jquery.com/UI/API/1.8/Tabs#Back_button_and_bookmarking

        $("a.textLink").click(function() {
            var link = $(this);
            $.ajax({url: link.attr("href"), dataType: "text", success: function(text) {
                    MvcUtil.showSuccessResponse(text, link);
                }, error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, link);
                }});
            return false;
        });

        $("a.utf8TextLink").click(function() {
            var link = $(this);
            $.ajax({url: link.attr("href"), dataType: "text", beforeSend: function(req) {
                    req.setRequestHeader("Accept", "text/plain;charset=UTF-8");
                }, success: function(text) {
                    MvcUtil.showSuccessResponse(text, link);
                }, error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, link);
                }});
            return false;
        });

        $("form.textForm").submit(function(event) {
            var form = $(this);
            var button = form.children(":first");
            $.ajax({type: "POST", url: form.attr("action"), data: "foo", contentType: "text/plain", dataType: "text", success: function(text) {
                    MvcUtil.showSuccessResponse(text, button);
                }, error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, button);
                }});
            return false;
        });

        $("#readForm").submit(function() {
            var form = $(this);
            var button = form.children(":first");
            $.ajax({type: "POST", url: form.attr("action"), data: "foo=bar&fruit=apple", contentType: "application/x-www-form-urlencoded", dataType: "text", success: function(text) {
                    MvcUtil.showSuccessResponse(text, button);
                }, error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, button);
                }});
            return false;
        });

        $("#writeForm").click(function() {
            var link = $(this);
            $.ajax({url: this.href, dataType: "text", beforeSend: function(req) {
                    req.setRequestHeader("Accept", "application/x-www-form-urlencoded");
                }, success: function(form) {
                    MvcUtil.showSuccessResponse(form, link);
                }, error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, link);
                }});
            return false;
        });

        $("form.readXmlForm").submit(function() {
            var form = $(this);
            var button = form.children(":first");
            $.ajax({type: "POST", url: form.attr("action"), data: "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><javaBean><foo>bar</foo><fruit>apple</fruit></javaBean>", contentType: "application/xml", dataType: "text", success: function(text) {
                    MvcUtil.showSuccessResponse(text, button);
                }, error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, button);
                }});
            return false;
        });

        $("a.writeXmlLink").click(function() {
            var link = $(this);
            $.ajax({url: link.attr("href"),
                beforeSend: function(req) {
                    if (!this.url.match(/\.xml$/)) {
                        req.setRequestHeader("Accept", "application/xml");
                    }
                },
                success: function(xml) {
                    MvcUtil.showSuccessResponse(MvcUtil.xmlencode(xml), link);
                },
                error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, link);
                }
            });
            return false;
        });

        $("form.readJsonForm").submit(function() {
            var form = $(this);
            var button = form.children(":first");
            var data = form.hasClass("invalid") ?
                    "{ \"foo\": \"bar\" }" :
                    "{ \"foo\": \"bar\", \"fruit\": \"apple\" }";
            $.ajax({type: "POST", url: form.attr("action"), data: data, contentType: "application/json", dataType: "text", success: function(text) {
                    MvcUtil.showSuccessResponse(text, button);
                }, error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, button);
                }});
            return false;
        });

        $("a.writeJsonLink").click(function() {
            var link = $(this);
            $.ajax({url: this.href,
                beforeSend: function(req) {
                    if (!this.url.match(/\.json$/)) {
                        req.setRequestHeader("Accept", "application/json");
                    }
                },
                success: function(json) {
                    MvcUtil.showSuccessResponse(JSON.stringify(json), link);
                },
                error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, link);
                }});
            return false;
        });

        $("#readAtom").submit(function() {
            var form = $(this);
            var button = form.children(":first");
            $.ajax({type: "POST", url: form.attr("action"), data: '<?xml version="1.0" encoding="UTF-8"?> <feed xmlns="http://www.w3.org/2005/Atom"><title>My Atom feed</title></feed>', contentType: "application/atom+xml", dataType: "text", success: function(text) {
                    MvcUtil.showSuccessResponse(text, button);
                }, error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, button);
                }});
            return false;
        });

        $("#writeAtom").click(function() {
            var link = $(this);
            $.ajax({url: link.attr("href"),
                beforeSend: function(req) {
                    req.setRequestHeader("Accept", "application/atom+xml");
                },
                success: function(feed) {
                    MvcUtil.showSuccessResponse(MvcUtil.xmlencode(feed), link);
                },
                error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, link);
                }
            });
            return false;
        });

        $("#readRss").submit(function() {
            var form = $(this);
            var button = form.children(":first");
            $.ajax({type: "POST", url: form.attr("action"), data: '<?xml version="1.0" encoding="UTF-8"?> <rss version="2.0"><channel><title>My RSS feed</title></channel></rss>', contentType: "application/rss+xml", dataType: "text", success: function(text) {
                    MvcUtil.showSuccessResponse(text, button);
                }, error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, button);
                }});
            return false;
        });

        $("#writeRss").click(function() {
            var link = $(this);
            $.ajax({url: link.attr("href"),
                beforeSend: function(req) {
                    req.setRequestHeader("Accept", "application/rss+xml");
                },
                success: function(feed) {
                    MvcUtil.showSuccessResponse(MvcUtil.xmlencode(feed), link);
                },
                error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, link);
                }
            });
            return false;
        });

        $("#byHeader").click(function() {
            var link = $(this);
            $.ajax({url: this.href, dataType: "text", beforeSend: function(req) {
                    req.setRequestHeader("FooHeader", "foo");
                }, success: function(form) {
                    MvcUtil.showSuccessResponse(form, link);
                }, error: function(xhr) {
                    MvcUtil.showErrorResponse(xhr.responseText, link);
                }});
            return false;
        });

    });
</script>
<%@include file="../../jspf/layout/footer.jspf" %>