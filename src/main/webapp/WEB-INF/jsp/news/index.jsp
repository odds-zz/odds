<%@include file="../../jspf/layout/header.jspf" %>

<%@include file="../../jspf/layout/banner/simple.jspf" %>

<div class="main pad-top">
    <div class="main-inner">
        <div class="container">
            <div class="row">
                <div class="span12">
                    <div class="widget">
                        <div class="widget-header">
                            <i class="icon-pushpin"></i>
                            <h3>News</h3>
                        </div> <!-- /widget-header -->
                        <div class="widget-content">
                            <div class="news-list">
                                <c:forEach var="entity" items="${news}">
                                    <h4>${entity.title}</h4>
                                    <p>
                                        ${entity.body}
                                    </p>
                                </c:forEach>
                            </div>
                        </div> <!-- /widget-content -->
                    </div> <!-- /widget -->
                </div> <!-- /span8 -->
            </div> <!-- /row -->
        </div> <!-- /container -->
    </div> <!-- /main-inner -->
</div>

<%@include file="../../jspf/layout/footer.jspf" %>