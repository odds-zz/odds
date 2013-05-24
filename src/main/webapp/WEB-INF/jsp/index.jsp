<%@include file="../jspf/layout/header.jspf" %>

<%@include file="../jspf/layout/banner/simple.jspf" %>

<div id="myCarousel" class="carousel slide">
    <div class="carousel-inner">
        <div class="item active">
            <img src="/odds/assets/img/carousel/slide-01.jpg" alt="">
            <div class="container">
                <div class="carousel-caption">
                    <h1>ODDS</h1>
                    <p class="lead">Orphanage Donation Distribution System.</p>
                    <a class="btn btn-large btn-primary" href="#">Sign up today</a>
                </div>
            </div>
        </div>
        <div class="item">
            <img src="/odds/assets/img/carousel/slide-02.jpg" alt="">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Start helping</h1>
                    <p class="lead">Orphans are around us and they need our care, friendship, love, our humanity.</p>
                    <a class="btn btn-large btn-primary" href="#">Learn more</a>
                </div>
            </div>
        </div>
        <div class="item">
            <img src="/odds/assets/img/carousel/slide-03.jpg" alt="">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Join the Conversation</h1>
                    <p class="lead">Lets share our stories, and create solutions to pressing problems in our communities.</p>
                    <a class="btn btn-large btn-primary" href="#">Browse gallery</a>
                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
        <i class="icon-arrow-left"></i>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
        <i class="icon-arrow-right"></i>
    </a>
</div>
<div class="container">
    <div class="row-fluid">
        <div class="span4">
            <a href="/odds/about">
                <h3><i class="icon-home"> About ODDS</i> </h3>
            </a>
            <p>Welcome to Orphanages Donation and Distribution System.
                This application is developed to create awareness of orphans in our community and
                enable donors to give what they have to orphans.

            </p>
            <p>
                To join the development team, use our contact information at the bottom of the page.</p>
        </div>
        <div class="span4">
            <h3><i class="icon-money"> Start helping!</i></h3>
            <p>Orphans are around us and they need our care, friendship, love, our humanity. . .<br />
                To donate to ODDS for distribution to orphanages, visit any sub-menu of the donation menu.</p>
            <p>To help a particular orphanage, visit it through the information menu at the top of the page.
                ODDS is not another scheme to pickpocket you. We care about orphans.

            </p>
        </div>
        <div class="span4">
            <h3><i class="icon-globe"> Join the Conversation</i></h3>
            <p>Lets share our stories, and create solutions to pressing problems in our communities.
            </p>
            <p>Lets join our hands in building our society.</p>
        </div>
    </div>
</div>
<style>
    /* CUSTOMIZE THE CAROUSEL
    -------------------------------------------------- */

    /* Carousel base class */
    .carousel .container {
        position: relative;
        z-index: 9;
    }

    .carousel-control {
        height: 80px;
        margin-top: 0;
        font-size: 42px;
        text-shadow: 0 1px 1px rgba(0,0,0,.4);
        background-color: transparent;
        border: 0;
        z-index: 10;
    }

    .carousel .item {
        height: 500px;
    }
    .carousel img {
        position: absolute;
        top: 0;
        left: 0;
        min-width: 100%;
        height: 500px;
    }

    .carousel-caption {
        background-color: transparent;
        position: static;
        max-width: 550px;
        padding: 0 20px;
        margin-top: 200px;
    }
    .carousel-caption h1,
    .carousel-caption .lead {
        margin: 0;
        line-height: 1.25;
        color: #fff;
        text-shadow: 0 1px 1px rgba(0,0,0,.4);
    }
    .carousel-caption .btn {
        margin-top: 10px;
    }
</style>


<%@include file="../jspf/layout/footer.jspf" %>
