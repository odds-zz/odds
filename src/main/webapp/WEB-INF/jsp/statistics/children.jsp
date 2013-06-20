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
                            <h4>No. of Orphanages</h4>
                            <span class="value">${numberOrphanages}</span>
                        </div> <!-- .stat -->

                        <div class="stat">
                            <h4>No. of Children</h4>
                            <span class="value">${numberChildren}</span>
                        </div> <!-- .stat -->

                        <div class="stat">
                            <h4>Street Children in Tanzania</h4>
                            <span class="value">24,400</span>
                        </div> <!-- .stat -->

                        <div class="stat">
                            <h4>Sponsored through ODDS</h4>
                            <span class="value">0</span>
                        </div> <!-- .stat -->
                    </div>

                </div> <!-- /widget-content -->

            </div> <!-- /widget -->

        </div> <!-- /span12 -->

    </div> <!-- /row -->

    <div class="row">

    </div> <!-- /row -->

</div>

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script type="text/javascript" src="/odds/components/flot/jquery.flot.js"></script>
<script type="text/javascript" src="/odds/components/flot/jquery.flot.pie.js"></script>
<script type="text/javascript" src="/odds/components/flot/jquery.flot.resize.js"></script>
<script type="text/javascript" src="/odds/assets/js/flot/jquery.flot.orderBars.js"></script>

<script type="text/javascript" src="/odds/assets/js/charts/pie.js"></script>
<script type="text/javascript" src="/odds/assets/js/charts/bar.js"></script>

<%@include file="../../jspf/layout/footer.jspf" %>
