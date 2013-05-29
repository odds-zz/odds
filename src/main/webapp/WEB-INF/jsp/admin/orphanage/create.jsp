<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../../../jspf/layout/header.jspf" %>

<%@include file="../../../jspf/layout/banner/simple.jspf" %>

<%@include file="../jspf/subnav.jsp" %>

<div class="container">
    <div class="row-fluid">
        <div class="span8">
            <div class="widget ">
                <div class="widget-header">
                    <i class="icon-building"></i>
                    <h3>Create Orphanage</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <form:form id="edit-profile" class="form-horizontal" method="POST" command="orphanage" modelAttribute="orphanage">
                        <div class="form-interaction">
                            <c:if test="${success}">
                                <div class="alert alert-success">
                                    <button type="button" class="close" data-dismiss="alert">×</button>
                                    <strong>Success!</strong> Orphanage Center has been added to the system.
                                </div>
                            </c:if>  
                        </div>
                        <fieldset>
                            <div class="form-element control-group">
                                <form:label path="name" class="control-label">
                                    Orphanage name:
                                </form:label>
                                <div class="controls">
                                    <form:input path="name"class="input-xlarge" placeholder="Orphanage name" />
                                    <form:errors path="name" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="email" class="control-label">
                                    Email Address
                                </form:label>
                                <div class="controls">
                                    <form:input path="email" class="input-xlarge"placeholder="Orphanage email" />
                                    <form:errors path="email" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="phone" class="control-label">
                                    Phone
                                </form:label>
                                <div class="controls">
                                    <form:input path="phone" class="input-xlarge" placeholder="Orphanage phone" />
                                    <form:errors path="phone" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="region" class="control-label">
                                    Region
                                </form:label>
                                <div class="controls">
                                    <form:select path="region"  class="chosen">
                                        <form:option value="" label="Pick a Region"/>
                                        <form:options items="${regions}" />
                                    </form:select>
                                    <form:errors path="region" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="details" class="control-label">
                                    Orphanage details
                                </form:label>
                                <div class="controls">
                                    <form:textarea path="details" class="input-xlarge" rows="5" placeholder="Orphanage details" />
                                    <form:errors path="details" cssClass="error" />
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="details" class="control-label">
                                    Location on map:
                                </form:label>
                                <div class="controls">
                                    <div id="mapContainer" class="orphanage-map map-container">
                                    </div>
                                </div>
                            </div>
                            <div class="form-element control-group">
                                <form:label path="region" class="control-label">
                                    Administrator
                                </form:label>
                                <div class="controls">
                                    <form:select path="admin" class="chosen">
                                        <form:option value="" label="Choose an Admin"/>
                                        <form:options items="${users}" itemValue="id" itemLabel="firstname" />
                                    </form:select>
                                    <form:errors path="admin" cssClass="error" />
                                </div>
                            </div>
                            <br/>
                            <div class="form-actions">
                                <button type="submit" class="btn btn-primary">Save</button>
                                <button type="reset" class="btn">Cancel</button>
                            </div>
                        </fieldset>
                    </form:form>
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
            <% if (request.isUserInRole("ROLE_ADMIN")) {%>
            <div class="widget widget-box">
                <div class="widget-header">
                    <h3>Admin options</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <a href="/odds/admin/">
                        <button class="btn btn-large btn-primary">
                            Administrator Home
                        </button>
                    </a>
                </div> <!-- /widget-content -->
            </div> <!-- /widget-box -->
            <% }%>
        </div> <!-- /span4 -->
    </div>
</div>
<script>
    $(function() {
        $(".chosen").chosen();
    });
    var loadMap = function() {
        var latitude = "-6.7767206421047990";
        var longitude = "39.2426061630211650";
        var map = null;
        var markers = null;
        var pin = null;
        // define custom map event listeners
        function mapEvent(event) {
            var size = new OpenLayers.Size(36, 36);
            var offset = new OpenLayers.Pixel(-(size.w / 2), -size.h);
            var icon = new OpenLayers.Icon('/odds/assets/img/map/pin.png', size, offset);
            markers.removeMarker(pin);
            pin = new OpenLayers.Marker(map.getCenter(), icon);
            markers.addMarker(pin);
            var center = map.getCenter().clone();
            center.transform(map.getProjectionObject(), new OpenLayers.Projection("EPSG:4326"));
            var longitude = center.lon;
            var latitude = center.lat;
            $("input#latitude").attr({value: latitude});
            $("input#longitude").attr({value: longitude});
        }
        map = new OpenLayers.Map("mapContainer", {
            controls: [
                new OpenLayers.Control.Navigation(),
                new OpenLayers.Control.Zoom(),
                new OpenLayers.Control.ScaleLine()
            ], eventListeners: {
                "move": mapEvent
            }
        });
        map.addLayer(new OpenLayers.Layer.OSM());
        var lonLat = new OpenLayers.LonLat(longitude, latitude)
                .transform(
                new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
                new OpenLayers.Projection("EPSG:900913") // to Spherical Mercator Projection
                );
        var zoom = 15; // Zoom level
        var markers = new OpenLayers.Layer.Markers("Marker");
        map.addLayer(markers);
        // Setting the map center.
        map.setCenter(lonLat, zoom);
    };
    $.ajax({
        url: 'http://www.openlayers.org/api/OpenLayers.js',
        dataType: 'script',
        cache: true, // otherwise will get fresh copy every page load
        success: loadMap
    });
</script>
<style>
    .orphanage-map.map-container {
        background: beige; height: 300px; width: 500px; border: 1px solid #ccc;
    }
    .olMap img {
        max-width: none;
    }
</style>

<%@include file="../../../jspf/layout/footer.jspf" %>