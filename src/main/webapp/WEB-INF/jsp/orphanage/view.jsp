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
                        <h3>${orphanage.name}</h3
                        <p>
                        <h4>Contact:</h4>
                        Email: ${contact.email}<br>
                        Phone: ${contact.phone}
                        </p>
                        <p>
                        <h4>About:</h4>
                        ${orphanage.details}
                        </p>
                        <h4>Location on Map</h4>
                        <div class="btn-group pull-right" style="position: absolute;top: 40px; right: 15px;">
                            <a class="btn btn-primary" href="#"><i class="icon-user icon-white"></i> Orphanage Center</a>
                            <a class="btn btn-primary dropdown-toggle" data-toggle="dropdown" href="#"><span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="/odds/orphanage/edit/${orphanage.id}"><i class="icon-pencil"></i> Edit</a></li>
                                <li><a href="/odds/admin/orphanage/delete/${orphanage.id}"><i class="icon-trash"></i> Delete</a></li>
                                <li class="divider"></li>
                                <li><a href="/odds/admin/orphanages"><i class="i"></i> Administer all</a></li>
                            </ul>
                        </div>
                        <div id="mapContainer" class="orphanage-map map-container"></div>
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
<script>
    $(function() {
        $(".chosen").chosen();
    });
    var loadMap = function() {
        var latitude = "${address.latitude}";
        var longitude = "${address.longitude}";
        map = new OpenLayers.Map("mapContainer", {
            controls: [
                new OpenLayers.Control.Navigation(),
                new OpenLayers.Control.Zoom(),
                new OpenLayers.Control.ScaleLine()
            ]
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
        var size = new OpenLayers.Size(36, 36);
        var offset = new OpenLayers.Pixel(-(size.w / 2), -size.h);
        var icon = new OpenLayers.Icon('/odds/assets/img/map/pin.png', size, offset);
        markers.addMarker(new OpenLayers.Marker(lonLat, icon));
        markers.addMarker(new OpenLayers.Marker(lonLat, icon.clone()));
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

<%@include file="../../jspf/layout/footer.jspf" %>