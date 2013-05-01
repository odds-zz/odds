<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../../jspf/layout/header.jspf" %>

<%@include file="../../jspf/layout/banner/simple.jspf" %>

<div class="container">
    <div class="row-fluid">
        <div class="span12">
            <h1>Create Orphanage</h1>
            <form:form method="POST" command="orphanage" modelAttribute="orphanage">
                <div class="form-element">
                    <form:label path="name">
                        <span>Orphanage name:</span>
                        <form:input path="name" placeholder="Orphanage name" />
                    </form:label>
                    <form:errors path="name" cssClass="error" />
                </div>
                <div class="form-element">
                    <form:label path="details">
                        <span>Orphanage details</span>
                        <form:textarea path="details" placeholder="Orphanage details" />
                    </form:label>
                    <form:errors path="details" cssClass="error" />
                </div>
                <input class="btn" type="submit" />
            </form:form>
        </div>
    </div>
</div>


<%@include file="../../jspf/layout/footer.jspf" %>