<%@include file="../../../jspf/layout/header.jspf" %>

<%@include file="../../../jspf/layout/banner/simple.jspf" %>

<div class="container" style="margin-top: 1em">
    <div class="row-fluid">
        <div class="span8">
            <div class="widget ">
                <div class="widget-header">
                    <i class=" icon-building"></i>
                    <h3>Direct Deposit</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <div class='bank-list'>
                        <div class="media">
                            <a class="pull-left" href="/odds/orphanage/view/1">
                                <img class="media-object" data-src="" alt="64x64" style="width: 64px; height: 64px;" src="/odds/assets/img/bank/crdb.jpg">
                            </a>
                            <div class="media-body">
                                <h4 class="media-heading">
                                    <a href="#">
                                        CRDB Bank
                                    </a>
                                </h4>
                                Recipient:	 ODDS Children<br/>
                                Account number:	1014000<br/>
                                Bank code:	100 205 00<br/>
                                IBAN:	DE44 1002 0500 0003 2929 03<br/>
                                Swift/BIC:	BFSWDE33BER<br/>
                                Bank:	 CRDB Bank<br/>
                                Reason for payment:	Orphanage donation
                            </div>
                        </div>
                        <div class="media">
                            <a class="pull-left" href="/odds/orphanage/view/1">
                                <img class="media-object" data-src="holder.js/128x128" alt="64x64" style="width: 64px; height: 64px;" src="/odds/assets/img/bank/nbc.jpg">
                            </a>
                            <div class="media-body">
                                <h4 class="media-heading">
                                    <a href="#">
                                        NBC Bank
                                    </a>
                                </h4>
                                Recipient:	 ODDS Children<br/>
                                Account number:	1014000<br/>
                                Bank code:	100 205 00<br/>
                                IBAN:	DE44 1002 0500 0003 2929 03<br/>
                                Swift/BIC:	BFSWDE33BER<br/>
                                Bank:	 NBC Bank<br/>
                                Reason for payment:	Orphanage donation
                            </div>
                        </div>
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


<%@include file="../../../jspf/layout/footer.jspf" %>