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
                    <p>
                        Thank you for supporting Orphans in the country.
                        There are many ways of  donating . <br/>
                        In the following you can see the possibilities in more detail.
                    </p>
                    <div>
                        <h4>Donate by Phone</h4>
                        <p>You can donate using mobile money such as Tigo Pesa, Mpesa etc.</p>
                        <a href="/odds/donation/money/transfer/mobile">
                            <button class="btn btn-large btn-success">
                                <i class="icon-mobile-phone"></i> Donation by Phone
                            </button>
                        </a>
                    </div>
                    <div>
                        <h4>Credit Card</h4>
                        <p>You can donate online using your credit card e.g. CRDB's Mastercard.</p>
                        <a href="/odds/donation/money/transfer/creditcard">
                            <button class="btn btn-large btn-info">
                                <i class=" icon-credit-card"></i> Credit Card
                            </button>
                        </a>
                    </div>
                    <div>
                        <h4>Direct Deposit</h4>
                        <p>You can donate directly at a bank.</p>
                        <a href="/odds/donation/money/transfer/bank">
                            <button class="btn btn-large btn-primary">
                                <i class=" icon-arrow-right"></i> Direct Deposit
                            </button>
                        </a>
                    </div>
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
                    <a href="/odds/donation/money/transfer/creditcard">
                        <button class="btn btn-large btn-primary">
                            Give Money <i class="icon-money"></i>
                        </button>
                    </a>
                </div> <!-- /widget-content -->
            </div> <!-- /widget-box -->
            <% }%>
        </div> <!-- /span4 -->
    </div>
</div>


<%@include file="../../jspf/layout/footer.jspf" %>