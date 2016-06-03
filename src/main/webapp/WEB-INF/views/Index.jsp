<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=yes"/>
    <title>Project - Accueil</title>

    <link rel="stylesheet" type="text/css" href="../../../resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../../resources/css/custom.css">
</head>
<body>

<div class="container-fluid page">
    <div id="header">
        <div class="col-xs-3 header">
            <img class="logo" src="../../resources/img/logo.png" id="logo" alt="Logo Klesia"/>
        </div>
        <div class="col-xs-6 header">
            <p class="text-center titleAction">Page d'accueil - Choix du type d'articles</p>
        </div>
        <div class="col-xs-3 header">
            <p class="pull-right applicationName" id="applicationName"></p>
        </div>
    </div>

    <div class="clearfix"></div>

    <div id="navigation">
        <nav class="navbar">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#navbar-collapse" aria-expanded="false">
                    <span class="sr-only"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>

            <div class="collapse navbar-collapse" id="navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active">
                        <a href="#" title="Menu">
                            <span class="glyphicon glyphicon-home"></span><span> Menu</span>
                        </a>
                    </li>
                    <li>
                        <s:url action="nosproduits.action" var="link2"></s:url>
                        <s:a href="%{link2}" title="NosProduits"><span> Nos produits</span></s:a>
                    </li>
                    <li><s:url action="monpanier.action" var="link3"></s:url>
                        <s:a href="%{link3}" title="MonPanier"><span> Mon Panier</span></s:a></li>
                    <li><a href="#">Qui sommes-nous ?</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="#" title="Administration"><span class="glyphicon glyphicon-cog"></span></a>
                    </li>
                    <li>
                        <s:url action="preconnexion.action" var="link"></s:url>
                        <s:a href="%{link}" title="Connexion"><span> S'identitfier</span></s:a></li>


                    </li>
                </ul>
            </div>
        </nav>
    </div>

    <div class="clearfix"></div>


    <div class="row top" id="accueil">

        <div class="col-md-4 col-sm-12 div-actions">
            <s:url action="noschambres.action" var="link6">
                <s:param name="categorie" >chambre</s:param>

            </s:url>

            <s:a href="%{link6}" title="NosChambres">
                <h3 class="text-center actionText">Chambres à coucher </h3>
                <div class="col-xs-12 col-centered ">
                    <img class="img-responsive center-block actionImage" src="../../resources/img/index/chambres.jpg"
                         class="images-actions" alt="Simulation"/>
                </div>
            </s:a>
        </div>

        <div class="col-md-4 col-sm-12 div-actions">
            <s:url action="conceptioncuisine.action" var="link8">
                <s:param name="categorie" >cuisine</s:param>
            </s:url>

            <s:a href="%{link8}" title="NosCuisines">
                <h3 class="text-center actionText">Cuisines </h3>
                <div class="col-xs-12 col-centered ">
                    <img class="img-responsive center-block actionImage" src="../../resources/img/index/cuisine.jpg"
                         alt="Simulation"/>
                </div>
            </s:a>
        </div>

        <div class="col-md-4 col-sm-12 div-actions">
            <a href="#">
                <h3 class="text-center actionText">Meubles maison </h3>
                <div class="col-xs-12 col-centered ">
                    <img class="img-responsive center-block actionImage" src="../../resources/img/index/maison.jpg"
                         alt="Simulation"/>
                </div>
            </a>
        </div>

    </div>


</div>
<script src="../../resources/js/jquery-1.12.3.min.js"></script>
<script src="../../resources/js/bootstrap.min.js"></script>
</body>
</html>