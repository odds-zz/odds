<%@include file="../../jspf/layout/header.jspf" %>

<%@include file="../../jspf/layout/banner/simple.jspf" %>

<div class="container" style="margin-top: 1em">
    <div class="row-fluid">
        <div class="span8">
            <div class="widget ">
                <div class="widget-header">
                    <i class="icon-money"></i>
                    <h3>Make a Donation</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <p>Donate by Phone</p>
                    <p>Credit Card / Paypal</p>
                    <p>Direct Deposit</p>
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
                    <a href="/odds/donation/money/transfer">
                    <button class="btn btn-large btn-primary">
                        Give Money <i class="icon-money"></i>
                    </button>
                    </a>
                </div> <!-- /widget-content -->
            </div> <!-- /widget-box -->
            <% } %>
        </div> <!-- /span4 -->
    </div>
</div>


<%@include file="../../jspf/layout/footer.jspf" %>