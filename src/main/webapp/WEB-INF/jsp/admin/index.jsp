<%@include file="../../jspf/layout/header.jspf" %>

<%@include file="../../jspf/layout/banner/simple.jspf" %>

<%@include file="jspf/subnav.jsp" %>


<div class="main">

    <div class="main-inner">

        <div class="container">

            <div class="row">

                <div class="span6">

                    <div class="widget">

                        <div class="widget-header">
                            <i class="icon-star"></i>
                            <h3>Summary</h3>
                        </div> <!-- /widget-header -->

                        <div class="widget-content">

                            <div class="stats">

                                <div class="stat">
                                    <span class="stat-value">12,386</span>
                                    Number of Orphanage Centers
                                </div> <!-- /stat -->

                                <div class="stat">
                                    <span class="stat-value">9,249</span>
                                    Number of Donations
                                </div> <!-- /stat -->

                                <div class="stat">
                                    <span class="stat-value">0</span>
                                    Chidlren
                                </div> <!-- /stat -->

                            </div> <!-- /stats -->

                        </div> <!-- /widget-content -->

                    </div> <!-- /widget -->


                    <div class="widget widget-nopad">

                        <div class="widget-header">
                            <i class="icon-list-alt"></i>
                            <h3>Recent News</h3>
                        </div> <!-- /widget-header -->

                        <div class="widget-content">

                            <ul class="news-items">
                                <c:forEach var="item" items="${news}" varStatus="status">
                                    <li>

                                        <div class="news-item-detail">
                                            <a href="/odds/admin/" class="news-item-title">${item.title}</a>
                                            <p class="news-item-preview">${item.body}</p>
                                        </div>

                                        <div class="news-item-date">
                                            <span class="news-item-day">08</span>
                                            <span class="news-item-month">Mar</span>
                                        </div>
                                    </li>
                                </c:forEach>
                            </ul>

                        </div> <!-- /widget-content -->

                    </div> <!-- /widget -->


                    <div class="widget">


                    </div> <!-- /widget -->

                </div> <!-- /span6 -->


                <div class="span6">


                    <div class="widget">

                        <div class="widget-header">
                            <i class="icon-bookmark"></i>
                            <h3>Administration Sections</h3>
                        </div> <!-- /widget-header -->

                        <div class="widget-content">

                            <div class="shortcuts">
                                <a href="/odds/admin/users" class="shortcut">
                                    <i class="shortcut-icon icon-user"></i>
                                    <span class="shortcut-label">Users</span>
                                </a>
                                <a href="/odds/admin/orphanages" class="shortcut">
                                    <i class="shortcut-icon icon-building"></i>
                                    <span class="shortcut-label">Orphanages</span>
                                </a>
                                <a href="/odds/admin/donations" class="shortcut">
                                    <i class="shortcut-icon icon-credit-card"></i>
                                    <span class="shortcut-label">Donations</span>
                                </a>
                                <a href="/odds/admin/news" class="shortcut">
                                    <i class="shortcut-icon icon-list-alt"></i>
                                    <span class="shortcut-label">News</span>
                                </a>
                                <a href="/odds/statistics" class="shortcut">
                                    <i class="shortcut-icon icon-bar-chart"></i>
                                    <span class="shortcut-label">View Statistics</span>
                                </a>
                                <a href="/odds/admin/donations/items" class="shortcut">
                                    <i class="shortcut-icon icon-coffee"></i>
                                    <span class="shortcut-label">Physical Item</span>
                                </a>
                                <a href="/odds/admin/reports" class="shortcut">
                                    <i class="shortcut-icon icon-signal"></i>
                                    <span class="shortcut-label">Reports</span>
                                </a>
                                <a href="/odds/admin/media" class="shortcut">
                                </a>
                            </div> <!-- /shortcuts -->

                        </div> <!-- /widget-content -->

                    </div> <!-- /widget -->





                    <div class="widget widget-table action-table">

                        <div class="widget-header">
                            <i class="icon-th-list"></i>
                            <h3>Latest Donations</h3>
                        </div> <!-- /widget-header -->

                        <div class="widget-content">

                            <table class="table table-striped table-bordered">
                                <thead>
                                    <tr>
                                        <th>Donation</th>
                                        <th>Donor</th>
                                        <th class="td-actions"></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>400,000</td>
                                        <td>Kenneth Kataiwa</td>
                                        <td class="td-actions">
                                            <a href="/odds/admin/" class="btn btn-small btn-warning">
                                                <i class="btn-icon-only icon-ok"></i>
                                            </a>

                                            <a href="/odds/admin/" class="btn btn-small">
                                                <i class="btn-icon-only icon-remove"></i>
                                            </a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>

                        </div> <!-- /widget-content -->

                    </div> <!-- /widget -->

                    <div class="widget">

                        <div class="widget-header">
                            <i class="icon-signal"></i>
                            <h3>Chart</h3>
                        </div> <!-- /widget-header -->

                        <div class="widget-content">
                            <div id="area-chart" class="chart-holder" style="padding: 0px; position: relative;"><canvas class="base" width="538" height="250"></canvas><canvas class="overlay" width="538" height="250" style="position: absolute; left: 0px; top: 0px;"></canvas><div class="tickLabels" style="font-size:smaller"><div class="xAxis x1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:center;left:1px;top:228px;width:48px">0</div><div class="tickLabel" style="position:absolute;text-align:center;left:52px;top:228px;width:48px">10</div><div class="tickLabel" style="position:absolute;text-align:center;left:103px;top:228px;width:48px">20</div><div class="tickLabel" style="position:absolute;text-align:center;left:154px;top:228px;width:48px">30</div><div class="tickLabel" style="position:absolute;text-align:center;left:205px;top:228px;width:48px">40</div><div class="tickLabel" style="position:absolute;text-align:center;left:256px;top:228px;width:48px">50</div><div class="tickLabel" style="position:absolute;text-align:center;left:306px;top:228px;width:48px">60</div><div class="tickLabel" style="position:absolute;text-align:center;left:357px;top:228px;width:48px">70</div><div class="tickLabel" style="position:absolute;text-align:center;left:408px;top:228px;width:48px">80</div><div class="tickLabel" style="position:absolute;text-align:center;left:459px;top:228px;width:48px">90</div><div class="tickLabel" style="position:absolute;text-align:center;left:510px;top:228px;width:48px">100</div></div><div class="yAxis y1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:right;top:210px;right:520px;width:18px">0</div><div class="tickLabel" style="position:absolute;text-align:right;top:167px;right:520px;width:18px">20</div><div class="tickLabel" style="position:absolute;text-align:right;top:123px;right:520px;width:18px">40</div><div class="tickLabel" style="position:absolute;text-align:right;top:80px;right:520px;width:18px">60</div><div class="tickLabel" style="position:absolute;text-align:right;top:36px;right:520px;width:18px">80</div><div class="tickLabel" style="position:absolute;text-align:right;top:-7px;right:520px;width:18px">100</div></div></div></div>
                        </div> <!-- /widget-content -->

                    </div> <!-- /widget -->



                </div> <!-- /span6 -->

            </div> <!-- /row -->

        </div> <!-- /container -->

    </div> <!-- /main-inner -->

</div> <!-- /main -->


<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script type="text/javascript" src="/odds/components/flot/jquery.flot.js"></script>
<script type="text/javascript" src="/odds/components/flot/jquery.flot.pie.js"></script>
<script type="text/javascript" src="/odds/components/flot/jquery.flot.resize.js"></script>
<script type="text/javascript" src="/odds/assets/js/charts/area.js"></script>
<script type="text/javascript" src="/odds/assets/js/charts/donut.js"></script>



<%@include file="../../jspf/layout/footer.jspf" %>