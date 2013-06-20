<%@include file="../../jspf/layout/header.jspf" %>

<%@include file="../../jspf/layout/banner/simple.jspf" %>

<%@include file="jspf/subnav.jsp" %>

<div class="container pad-top">

    <div class="row">

        <div class="span12">

            <div class="widget big-stats-container stacked">

                <div class="widget-content">

                    <div id="big_stats" class="cf">
                        <div class="stat">
                            <h4>No. of Orphanage Centers</h4>
                            <span class="value">${numberOrphanages}</span>
                        </div> <!-- .stat -->

                        <div class="stat">
                            <h4>No. of Children</h4>
                            <span class="value">${numberChildren}</span>
                        </div> <!-- .stat -->

                        <div class="stat">
                            <h4>Donations Today</h4>
                            <span class="value">${numberTodayDonations}</span>
                        </div> <!-- .stat -->

                        <div class="stat">
                            <h4>Donations this Year</h4>
                            <span class="value">${numberYearDonations}</span>
                        </div> <!-- .stat -->
                    </div>

                </div> <!-- /widget-content -->

            </div> <!-- /widget -->

        </div> <!-- /span12 -->

    </div> <!-- /row -->

    <div class="row">

        <div class="span6">

            <div class="widget stacked">

                <div class="widget-header">
                    <i class="icon-star"></i>
                    <h3>Orphanage Centers by Region</h3>
                </div> <!-- /widget-header -->

                <div class="widget-content">

                    <div id="pie-chart" class="chart-holder" style="padding: 0px; position: relative;"><canvas class="base" width="538" height="250"></canvas><canvas class="overlay" width="538" height="250" style="position: absolute; left: 0px; top: 0px;"></canvas><div class="legend"><table style="position:absolute;top:10px;right:5px;;font-size:smaller;color:#545454"><tbody><tr><td class="legendColorBox"><div style="border:1px solid #888;padding:1px"><div style="width:4px;height:0;border:5px solid rgb(255,153,0);overflow:hidden"></div></div></td><td class="legendLabel">Dar</td></tr><tr><td class="legendColorBox"><div style="border:1px solid #888;padding:1px"><div style="width:4px;height:0;border:5px solid rgb(34,34,34);overflow:hidden"></div></div></td><td class="legendLabel">Arusha</td></tr><tr><td class="legendColorBox"><div style="border:1px solid #888;padding:1px"><div style="width:4px;height:0;border:5px solid rgb(102,102,102);overflow:hidden"></div></div></td><td class="legendLabel">Mwanza</td></tr><tr><td class="legendColorBox"><div style="border:1px solid #888;padding:1px"><div style="width:4px;height:0;border:5px solid rgb(187,187,187);overflow:hidden"></div></div></td><td class="legendLabel">Others</td></tr></tbody></table></div></div>

                </div> <!-- /widget-content -->

            </div> <!-- /widget -->




        </div> <!-- /span6 -->


        <div class="span6">

            <div class="widget stacked">

                <div class="widget-header">
                    <i class="icon-list-alt"></i>
                    <h3></h3>
                </div> <!-- /widget-header -->

                <div class="widget-content">

                    <div id="bar-chart" class="chart-holder" style="padding: 0px; position: relative;"><canvas class="base" width="538" height="250"></canvas><canvas class="overlay" width="538" height="250" style="position: absolute; left: 0px; top: 0px;"></canvas><div class="tickLabels" style="font-size:smaller"><div class="xAxis x1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:center;left:41px;top:228px;width:48px">1.0</div><div class="tickLabel" style="position:absolute;text-align:center;left:94px;top:228px;width:48px">1.5</div><div class="tickLabel" style="position:absolute;text-align:center;left:147px;top:228px;width:48px">2.0</div><div class="tickLabel" style="position:absolute;text-align:center;left:200px;top:228px;width:48px">2.5</div><div class="tickLabel" style="position:absolute;text-align:center;left:254px;top:228px;width:48px">3.0</div><div class="tickLabel" style="position:absolute;text-align:center;left:307px;top:228px;width:48px">3.5</div><div class="tickLabel" style="position:absolute;text-align:center;left:360px;top:228px;width:48px">4.0</div><div class="tickLabel" style="position:absolute;text-align:center;left:413px;top:228px;width:48px">4.5</div><div class="tickLabel" style="position:absolute;text-align:center;left:466px;top:228px;width:48px">5.0</div></div><div class="yAxis y1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:right;top:210px;right:524px;width:14px">0</div><div class="tickLabel" style="position:absolute;text-align:right;top:174px;right:524px;width:14px">10</div><div class="tickLabel" style="position:absolute;text-align:right;top:138px;right:524px;width:14px">20</div><div class="tickLabel" style="position:absolute;text-align:right;top:102px;right:524px;width:14px">30</div><div class="tickLabel" style="position:absolute;text-align:right;top:65px;right:524px;width:14px">40</div><div class="tickLabel" style="position:absolute;text-align:right;top:29px;right:524px;width:14px">50</div><div class="tickLabel" style="position:absolute;text-align:right;top:-7px;right:524px;width:14px">60</div></div></div></div>

                </div> <!-- /widget-content -->

            </div> <!-- /widget -->

        </div> <!-- /span6 -->

    </div> <!-- /row -->




    <div class="row">

        <div class="span6">

            <div class="widget stacked widget-table">

                <div class="widget-header">
                    <span class="icon-list-alt"></span>
                    <h3>Orphanage Centers by Region</h3>
                </div> <!-- .widget-header -->

                <div class="widget-content">
                    <table class="table table-bordered table-striped">

                        <thead><tr>
                                <th>Referrer</th>
                                <th>Uniques</th>
                            </tr></thead>

                        <tbody><tr>
                                <td class="description"><a href="#">Dar es Salaam</a></td>
                                <td class="value"><span>12</span></td>
                            </tr>
                            <tr>
                                <td class="description"><a href="#">Arusha</a></td>
                                <td class="value"><span>7</span></td>
                            </tr>
                            <tr>
                                <td class="description"><a href="#">Mwanza</a></td>
                                <td class="value"><span>4</span></td>
                            </tr>
                            <tr>
                                <td class="description"><a href="#">Others</a></td>
                                <td class="value"><span>5</span></td>
                            </tr>
                        </tbody></table>

                </div> <!-- .widget-content -->

            </div> <!-- /widget -->

        </div> <!-- /span6 -->



        <div class="span6">

            <div class="widget stacked widget-table">

                <div class="widget-header">
                    <span class="icon-file"></span>
                    <h3>Most Recent Donations Items</h3>
                </div> <!-- .widget-header -->

                <div class="widget-content">
                    <table class="table table-bordered table-striped">

                        <thead><tr>
                                <th>Item</th>
                                <th>Quantity</th>
                            </tr></thead>

                        <tbody><tr>
                                <td class="description"><a href="javascript:;">Mchele</a></td>
                                <td class="value"><span>10</span></td>
                            </tr>
                            <tr>
                                <td class="description"><a href="javascript:;">Nguo</a></td>
                                <td class="value"><span>5</span></td>
                            </tr>
                        </tbody></table>

                </div> <!-- .widget-content -->

            </div>

        </div> <!-- /span6 -->
    </div> <!-- /row -->
</div>

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script type="text/javascript" src="/odds/components/flot/jquery.flot.js"></script>
<script type="text/javascript" src="/odds/components/flot/jquery.flot.pie.js"></script>
<script type="text/javascript" src="/odds/components/flot/jquery.flot.resize.js"></script>
<script type="text/javascript" src="/odds/assets/js/flot/jquery.flot.orderBars.js"></script>

<script>
    $(function() {
        var data = [];

        data[0] = {label: "Dar es Salaam ", data: 5};
        data[1] = {label: "Arusha ", data: 10};
        data[2] = {label: "Mwanza ", data: 25};
        data[3] = {label: "Others ", data: 10};

        $.plot($("#pie-chart"), data,
                {
                    colors: ["#F90", "#222", "#666", "#BBB"],
                    series: {
                        pie: {
                            show: true,
                            label: {
                                show: false,
                                formatter: function(label, series) {
                                    return '<div style="font-size:11px;text-align:center;padding:4px;color:white;">'
                                            + label +
                                            '<br/>' +
                                            Math.round(series.percent) + '%</div>';
                                },
                                threshold: 0.1
                            }
                        }
                    },
                    legend: {
                        show: true,
                        noColumns: 1, // number of colums in legend table
                        labelFormatter: null, // fn: string -> string
                        labelBoxBorderColor: "#888", // border color for the little label boxes
                        container: null, // container (as jQuery object) to put legend in, null means default on top of graph
                        position: "ne", // position of default legend container within plot
                        margin: [5, 10], // distance from grid edge to default legend container within plot
                        backgroundOpacity: 0 // set to 0 to avoid background
                    },
                    grid: {
                        hoverable: false,
                        clickable: false
                    },
                });

    });
    $(function() {
        var data = new Array();
        var ds = new Array();

        data.push([[1, 25], [2, 34], [3, 37], [4, 45], [5, 56]]);
        data.push([[1, 13], [2, 29], [3, 25], [4, 23], [5, 31]]);

        for (var i = 0, j = data.length; i < j; i++) {

            ds.push({
                data: data[i],
                grid: {
                    hoverable: true
                },
                bars: {
                    show: true,
                    barWidth: 0.2,
                    order: 1,
                    lineWidth: 0.5,
                    fillColor: {colors: [{opacity: 0.65}, {opacity: 1}]}
                }
            });
        }

        $.plot($("#bar-chart"), ds, {
            colors: ["#F90", "#222", "#666", "#BBB"]


        });
    });
</script>

<%@include file="../../jspf/layout/footer.jspf" %>
