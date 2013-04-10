<%@include file="../../jspf/layout/header.jspf" %>

<%@include file="../../jspf/layout/banner/simple.jspf" %>

<link href="/odds/assets/css/help.css" media="screen" rel="stylesheet" type="text/css">

<div class="container" style="margin-top: 1em">
    <div class="row">
        <div class="span8">
            <div class="widget ">
                <div class="widget-header">
                    <i class="icon-user"></i>
                    <h3>Your Account</h3>
                </div> <!-- /widget-header -->
                <div class="widget-content">
                    <div class="tabbable">
                        <ul class="nav nav-tabs">
                            <li class="active">
                                <a href="#profile" data-toggle="tab">Profile</a>
                            </li>
                            <li class=""><a href="#settings" data-toggle="tab">Settings</a></li>
                        </ul>
                        <br>
                        <div class="tab-content">
                            <div class="tab-pane active" id="profile">
                                <form id="edit-profile" class="form-horizontal">
                                    <fieldset>

                                        <div class="control-group">
                                            <label class="control-label" for="username">Username</label>
                                            <div class="controls">
                                                <input type="text" class="input-medium disabled" id="username" value="goideate" disabled="">
                                                <p class="help-block">Your username is for logging in and cannot be changed.</p>
                                            </div> <!-- /controls -->
                                        </div> <!-- /control-group -->


                                        <div class="control-group">
                                            <label class="control-label" for="firstname">First Name</label>
                                            <div class="controls">
                                                <input type="text" class="input-medium" id="firstname" value="Rod">
                                            </div> <!-- /controls -->
                                        </div> <!-- /control-group -->


                                        <div class="control-group">
                                            <label class="control-label" for="lastname">Last Name</label>
                                            <div class="controls">
                                                <input type="text" class="input-medium" id="lastname" value="Howard">
                                            </div> <!-- /controls -->
                                        </div> <!-- /control-group -->


                                        <div class="control-group">
                                            <label class="control-label" for="email">Email Address</label>
                                            <div class="controls">
                                                <input type="text" class="input-large" id="email" value="rod.howard@example.com">
                                            </div> <!-- /controls -->
                                        </div> <!-- /control-group -->


                                        <br><br>

                                        <div class="control-group">
                                            <label class="control-label" for="password1">Password</label>
                                            <div class="controls">
                                                <input type="password" class="input-medium" id="password1" value="password">
                                            </div> <!-- /controls -->
                                        </div> <!-- /control-group -->


                                        <div class="control-group">
                                            <label class="control-label" for="password2">Confirm</label>
                                            <div class="controls">
                                                <input type="password" class="input-medium" id="password2" value="password">
                                            </div> <!-- /controls -->
                                        </div> <!-- /control-group -->



                                        <br>


                                        <div class="form-actions">
                                            <button type="submit" class="btn btn-primary">Save</button>
                                            <button class="btn">Cancel</button>
                                        </div> <!-- /form-actions -->
                                    </fieldset>
                                </form>
                            </div>

                            <div class="tab-pane" id="settings">
                                <form id="edit-profile2" class="form-horizontal">
                                    <fieldset>


                                        <div class="control-group">
                                            <label class="control-label" for="accounttype">Account Type</label>
                                            <div class="controls">
                                                <label class="radio">
                                                    <input type="radio" name="accounttype" value="option1" checked="checked" id="accounttype">
                                                    POP3
                                                </label>
                                                <label class="radio">
                                                    <input type="radio" name="accounttype" value="option2">
                                                    IMAP
                                                </label>
                                            </div>
                                        </div>
                                        <div class="control-group">
                                            <label class="control-label" for="accountusername">Account Username</label>
                                            <div class="controls">
                                                <input type="text" class="input-large" id="accountusername" value="rod.howard@example.com">
                                                <p class="help-block">Leave blank to use your profile email address.</p>
                                            </div>
                                        </div>
                                        <div class="control-group">
                                            <label class="control-label" for="emailserver">Email Server</label>
                                            <div class="controls">
                                                <input type="text" class="input-large" id="emailserver" value="mail.example.com">
                                            </div>
                                        </div>
                                        <div class="control-group">
                                            <label class="control-label" for="accountpassword">Password</label>
                                            <div class="controls">
                                                <input type="text" class="input-large" id="accountpassword" value="password">
                                            </div>
                                        </div>




                                        <div class="control-group">
                                            <label class="control-label" for="accountadvanced">Advanced Settings</label>
                                            <div class="controls">
                                                <label class="checkbox">
                                                    <input type="checkbox" name="accountadvanced" value="option1" checked="checked" id="accountadvanced">
                                                    User encrypted connection when accessing this server
                                                </label>
                                                <label class="checkbox">
                                                    <input type="checkbox" name="accounttype" value="option2">
                                                    Download all message on connection
                                                </label>
                                            </div>
                                        </div>


                                        <br>

                                        <div class="form-actions">
                                            <button type="submit" class="btn btn-primary">Save</button> <button class="btn">Cancel</button>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>
                        </div>
                    </div>
                </div> <!-- /widget-content -->
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
        </div> <!-- /span4 -->
    </div> <!-- /row -->
</div>

<%@include file="../../jspf/layout/footer.jspf" %>