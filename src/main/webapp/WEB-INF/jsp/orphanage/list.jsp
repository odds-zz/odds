<%@include file="../../jspf/layout/header.jspf" %>
<%@include file="../../jspf/layout/banner/simple.jspf" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="main pad-top">
    <div class="container">
        <div class="row">
            <div class="span8">
                <div class="widget stacked ">
                    <div class="widget-header">
                        <i class="icon-building"></i>
                        <h3>Orphanages</h3>
                    </div> <!-- /widget-header -->
                    <div class="media-object">
                        <span class="span2">
                            <br>
                            <img src="../assets/img/orphanage/orphanage-inside.jpg" />
                        </span>
                        <span class="span5">
                            <br>
                            Orphanages...  One would think that those words would mean a safe place 
                            for children that have met with hardships,
                            or perhaps a warm dry place to sleep and have a hot meal until they can return to a functional family.  
                            Unfortunately, it usually means a shower that consists of a rusty sink running cold water, 
                            and toilets that are no more than a broken bowl requiring a bucket of water to flush. Many of the orphanages 
                            rely on their own resources and ingenuity to survive.  
                            Most of the buildings that house orphans require major changes to keep the roof from falling in on the 
                            heads of the poor children.
                            Your contribution gives these orphanages appliances, cooking stoves, washing machines, 
                            windows, doors, flooring, sinks, toilets, showers, just to name a few!! 
                            <a href="../news/orphanages">Please help now!</a>
                        </span>
                    </div>
                    <div class="widget-content">

                        <div class="orphanages-list">
                            <c:forEach var="orphanage" items="${orphanages}">
                                <div class="media">
                                    <a class="pull-left" href="/odds/orphanage/view/${orphanage.id}">
                                        <img class="media-object" data-src="holder.js/128x128" alt="64x64" style="width: 64px; height: 64px;" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAACqUlEQVR4Xu2Y60tiURTFl48STFJMwkQjUTDtixq+Av93P6iBJFTgg1JL8QWBGT4QfDX7gDIyNE3nEBO6D0Rh9+5z9rprr19dTa/XW2KHl4YFYAfwCHAG7HAGgkOQKcAUYAowBZgCO6wAY5AxyBhkDDIGdxgC/M8QY5AxyBhkDDIGGYM7rIAyBgeDAYrFIkajEYxGIwKBAA4PDzckpd+322243W54PJ5P5f6Omh9tqiTAfD5HNpuFVqvFyckJms0m9vf3EY/H1/u9vb0hn89jsVj8kwDfUfNviisJ8PLygru7O4TDYVgsFtDh9Xo9NBrNes9cLgeTybThgKenJ1SrVXGf1WoVDup2u4jFYhiPx1I1P7XVBxcoCVCr1UBfTqcTrVYLe3t7OD8/x/HxsdiOPqNGo9Eo0un02gHkBhJmuVzC7/fj5uYGXq8XZ2dnop5Mzf8iwMPDAxqNBmw2GxwOBx4fHzGdTpFMJkVzNB7UGAmSSqU2RoDmnETQ6XQiOyKRiHCOSk0ZEZQcUKlU8Pz8LA5vNptRr9eFCJQBFHq//szG5eWlGA1ywOnpqQhBapoWPfl+vw+fzweXyyU+U635VRGUBOh0OigUCggGg8IFK/teXV3h/v4ew+Hwj/OQU4gUq/w4ODgQrkkkEmKEVGp+tXm6XkkAOngmk4HBYBAjQA6gEKRmyOL05GnR99vbW9jtdjEGdP319bUIR8oA+pnG5OLiQoghU5OElFlKAtCGr6+vKJfLmEwm64aosd/XbDbbyIBSqSSeNKU+HXzlnFAohKOjI6maMs0rO0B20590n7IDflIzMmdhAfiNEL8R4jdC/EZIJj235R6mAFOAKcAUYApsS6LL9MEUYAowBZgCTAGZ9NyWe5gCTAGmAFOAKbAtiS7TB1Ng1ynwDkxRe58vH3FfAAAAAElFTkSuQmCC">
                                    </a>
                                    <div class="media-body">
                                        <h4 class="media-heading">
                                            <a href="/odds/orphanage/view/${orphanage.id}">
                                                ${orphanage.name}
                                            </a>
                                        </h4>
                                        ${orphanage.details}
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <section id="paginations">
                            <div class="pagination text-center">
                                <ul>
                                    <li><a href="javascript:;">Prev</a></li>
                                    <li class="active">
                                        <a href="javascript:;">1</a>
                                    </li>
                                    <li><a href="javascript:;">2</a></li>
                                    <li><a href="javascript:;">3</a></li>
                                    <li><a href="javascript:;">4</a></li>
                                    <li><a href="javascript:;">Next</a></li>
                                </ul>
                            </div>
                        </section>
                    </div> <!-- /widget-content -->
                </div> <!-- /widget -->
            </div> <!-- /span12 -->
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

            </div>
        </div> <!-- /row -->
    </div> <!-- /container -->
</div>

<%@include file="../../jspf/layout/footer.jspf" %>