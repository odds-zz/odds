<%@include file="../../jspf/layout/header.jspf" %>

<%@include file="../../jspf/layout/banner/simple.jspf" %>

<%@include file="jspf/subnav.jsp" %>

<div class="container">
    <div class="row-fluid">
        <div class="span12">

            <div class="widget">

                <div class="widget-header">
                    <i class="icon-star"></i>
                    <h3>Quick Stats</h3>
                </div> <!-- /widget-header -->

                <div class="widget-content">

                    <div class="stats">

                        <div class="stat">
                            <span class="stat-value">12,386</span>
                            Site Visits
                        </div> <!-- /stat -->

                        <div class="stat">
                            <span class="stat-value">9,249</span>
                            Unique Visits
                        </div> <!-- /stat -->

                        <div class="stat">
                            <span class="stat-value">70%</span>
                            New Visits
                        </div> <!-- /stat -->

                    </div> <!-- /stats -->


                    <div id="chart-stats" class="stats">

                        <div class="stat stat-chart">
                            <div id="donut-chart" class="chart-holder" style="padding: 0px; position: relative;"><canvas class="base" width="269" height="100"></canvas><canvas class="overlay" width="269" height="100" style="position: absolute; left: 0px; top: 0px;"></canvas><div class="legend"><div style="position: absolute; width: 55px; height: 72px; top: 5px; right: 5px; background-color: rgb(255, 255, 255); opacity: 0.85;"> </div><table style="position:absolute;top:5px;right:5px;;font-size:smaller;color:#545454"><tbody><tr><td class="legendColorBox"><div style="border:1px solid #ccc;padding:1px"><div style="width:4px;height:0;border:5px solid rgb(255,153,0);overflow:hidden"></div></div></td><td class="legendLabel">Series 1</td></tr><tr><td class="legendColorBox"><div style="border:1px solid #ccc;padding:1px"><div style="width:4px;height:0;border:5px solid rgb(34,34,34);overflow:hidden"></div></div></td><td class="legendLabel">Series 2</td></tr><tr><td class="legendColorBox"><div style="border:1px solid #ccc;padding:1px"><div style="width:4px;height:0;border:5px solid rgb(119,119,119);overflow:hidden"></div></div></td><td class="legendLabel">Series 3</td></tr></tbody></table></div></div> <!-- #donut -->
                        </div> <!-- /substat -->

                        <div class="stat stat-time">
                            <span class="stat-value">00:28:13</span>
                            Average Time on Site
                        </div> <!-- /substat -->

                    </div> <!-- /substats -->

                </div> <!-- /widget-content -->

            </div> <!-- /widget -->


            <div class="widget widget-nopad">

                <div class="widget-header">
                    <i class="icon-list-alt"></i>
                    <h3>Recent News</h3>
                </div> <!-- /widget-header -->

                <div class="widget-content">

                    <ul class="news-items">
                        <li>

                            <div class="news-item-detail">
                                <a href="/odds/admin/" class="news-item-title">Duis aute irure dolor in reprehenderit</a>
                                <p class="news-item-preview">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore.</p>
                            </div>

                            <div class="news-item-date">
                                <span class="news-item-day">08</span>
                                <span class="news-item-month">Mar</span>
                            </div>
                        </li>
                        <li>
                            <div class="news-item-detail">
                                <a href="/odds/admin/" class="news-item-title">Duis aute irure dolor in reprehenderit</a>
                                <p class="news-item-preview">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore.</p>
                            </div>

                            <div class="news-item-date">
                                <span class="news-item-day">08</span>
                                <span class="news-item-month">Mar</span>
                            </div>
                        </li>
                        <li>
                            <div class="news-item-detail">
                                <a href="/odds/admin/" class="news-item-title">Duis aute irure dolor in reprehenderit</a>
                                <p class="news-item-preview">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore.</p>
                            </div>

                            <div class="news-item-date">
                                <span class="news-item-day">08</span>
                                <span class="news-item-month">Mar</span>
                            </div>
                        </li>
                    </ul>

                </div> <!-- /widget-content -->

            </div> <!-- /widget -->


            <div class="widget">

                <div class="widget-header">
                    <i class="icon-file"></i>
                    <h3>Content</h3>
                </div> <!-- /widget-header -->

                <div class="widget-content">

                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>


                    <p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

                </div> <!-- /widget-content -->

            </div> <!-- /widget -->

        </div>
    </div>
</div>

<%@include file="../../jspf/layout/footer.jspf" %>