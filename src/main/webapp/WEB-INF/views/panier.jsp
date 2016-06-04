    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib prefix="s" uri="/struts-tags" %>
        <%-------------------------------------------------%>
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="initial-scale=1.0, user-scalable=yes"/>
        <title>Project - Accueil</title>

        <link rel="stylesheet" type="text/css" href="../../resources/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="../../resources/css/custom.css">
        </head>
        <body>

        <div class="container-fluid page">
        <div id="header">.
        <div class="col-xs-3 header">
        <img class="logo" src="../resources/img/logo.png" id="logo" alt="Logo Klesia"/>
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
        <li><a href="#">Nos produits</a></li>
        <li><a href="#">Commander </a></li>
        <li><a href="#">Qui sommes-nous ?</a></li>
        <li><a href="#">Contact</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
        <li>
        <a href="panier.html" title="Administration"><span
        class="glyphicon glyphicon-shopping-cart"></span> Panier</a>
        </li>
        <li>
        <a href="#" title="Administration"><span class="glyphicon glyphicon-cog"></span></a>
        </li>
        <li>
        <a href="connexion.html" title="Déconnexion"><span> Se Deconnecter</span></a>
        </li>
        </ul>
        </div>
        </nav>
        </div>

        <div class="clearfix"></div>


        <div class="row top" id="panier">
        <div class="col-xs-12 col-sm-offset-1 col-sm-10 ">
        <table class="table table-striped table-condensed table-responsive" id="panierTable">
        <tbody>
        <s:iterator value="panier">
        <tr>
        <td>
        <div class="col-md-11 col-xs-12">
        <img src="http://bulltyland.com/img/produit.jpg" alt="Image du produit" class="imgProduit">
        </div>
        </td>
        <td>
        <div class="actionProduit">
            <s:url action="supprimerproduitpanier" var="lien">
                <s:param name = "idproduit"><s:property value="id"></s:property></s:param>
            </s:url>
            <s:a href="%{lien}">
                <span class="glyphicon glyphicon-trash"></span>
            </s:a>

       <!-- <button type="submit" onclick="minus()"><span class="glyphicon glyphicon-trash"></span>
        </button>-->
        </div>
        </td>
        <td>
        <div class="quantiteProduitAcion">
        <div class="row">
        <div class="col-md-3 col-xs-12">
        <button type="submit" onclick="minus()"><span
        class="glyphicon glyphicon-minus-sign"></span></button>
        </div>
        <div class="col-md-3 col-xs-12">
        <button type="submit" onclick="plus()"><span
        class="glyphicon glyphicon-plus-sign"></span></button>
        </div>
        </div>

        </div>
        </td>
        <td>
        <div class="quantiteProduit">
        <input type="number" name="quantity" step="1" value="<s:property value="quantity"/>" min="1" max="10" style="width: 34px;">

        </div>
        </td>
        <td>
        <div class="blocInfo">
        <div class=" col-md-11 titreProduit">
        <p><s:property value="reference"/> </p>
        </div>
        <div class="col-md-10 descriptionProduit">
        <p>Ce superbe lit double au style intemporel s'intégrera aussi bien dans un intérieur
        moderne que dans un intérieur à la décoration plus classique
        Grâce à la sobriété de son design, il apportera de l'élégance à votre chambre en
        toute discrétion
        Ce lit en version 180x200 cm es pieds en bois</p>
        </div>
        </div>

        </td>
        <td style="width: 21%;">
        <div class="prixProduit">
        <p><s:property value="price"/><span class="glyphicon glyphicon-euro"></span></p>
        </div>
        </td>
        </tr>
        </s:iterator>

        <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td class="total">
        <p>Total commande</p>
        </td>
        <td style="width: 21%;" class="total">
        <div class="prixProduit">
        <p><s:property value="courant.panier.price"></s:property><span class="glyphicon glyphicon-euro"></span></p>
        </div>
        </td>
        </tr>

        </tbody>
        </table>
        </div>
        </div>


        </div>
        <script src="../resources/js/jquery-1.12.3.min.js"></script>
        <script src="../resources/js/bootstrap.min.js"></script>
        <script>
        function plus() {
        alert("il faut changer la focntion du JS pour qu'elle puisse incrementer la quantité , sinon utliser directement
        les buttons sur le champs de saisi");
        }
        function minus() {
        alert("il faut changer la focntion du JS pour qu'elle puisse decrementer la quantité , sinon utliser directement
        les buttons sur le champs de saisi");
        }

        </script>
        </body>
        </html>