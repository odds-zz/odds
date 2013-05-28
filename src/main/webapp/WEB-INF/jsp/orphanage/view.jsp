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
                        <h3>Orphanage</h3>
                    </div> <!-- /widget-header -->
                    <div class="widget-content">
                        ${orphanage.name}
                        <div class="btn-group pull-right">
                            <a class="btn btn-primary" href="#"><i class="icon-user icon-white"></i> Orphanage Center</a>
                            <a class="btn btn-primary dropdown-toggle" data-toggle="dropdown" href="#"><span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"><i class="icon-pencil"></i> Edit</a></li>
                                <li><a href="#"><i class="icon-trash"></i> Delete</a></li>
                                <li class="divider"></li>
                                <li><a href="#"><i class="i"></i> Assign admin</a></li>
                            </ul>
                        </div>
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
                <div class="widget widget-box">
                    <div class="widget-header">
                        <h3>Browse Orphanages</h3>
                    </div> <!-- /widget-header -->
                    <div class="widget-content">
                        <a href="/odds/orphanage/list">
                            <button class="btn btn-large btn-primary">
                                <i class="icon-building"></i> All Orphanages
                            </button>
                        </a>
                    </div> <!-- /widget-content -->
                </div>
            </div>
        </div> <!-- /row -->
    </div> <!-- /container -->
</div>

<%@include file="../../jspf/layout/footer.jspf" %>