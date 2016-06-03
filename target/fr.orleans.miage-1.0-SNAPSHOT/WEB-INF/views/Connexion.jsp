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
                    <li>  <s:url action="nosproduits.action" var="link2" ></s:url>
                        <s:a href="%{link2}" title="NosProduits"><span> Nos produits</span></s:a></li>
                    <li>  <s:url action="monpanier.action" var="link3" ></s:url>
                        <s:a href="%{link3}" title="MonPanier"><span> Mon Panier</span></s:a></li>
                    <li><a href="#">Qui sommes-nous ?</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="#" title="Administration"><span class="glyphicon glyphicon-cog"></span></a>
                    </li>
                    <li>
                        <a href="#" title="Déconnexion"><span> S'identitfier</span></a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>

    <div class="clearfix"></div>


    <div class="row top" id="connexion">
        <div class="col-xs-12 col-sm-12 col-md-offset-2 col-md-8 connexion">
            <fieldset class="fieldset">
                <legend>Authentification</legend>
                <div class="col-xs-12">

                    <form action="connexion.action" class="form-horizontal" id="connexionForm">
                        <div class="row col-xs-12 col-centered">
                            <div class="form-group">
                                <label class="col-sm-5 control-label" for="inputUser"><i
                                        class="glyphicon glyphicon-user"></i> Utilisateur</label>

                                <div class="col-sm-6">
                                    <input class="form-control" name="login" type="text" id="inputUser"
                                           name="login" placeholder="Email utilisateur">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-5 control-label" for="inputPassword"><i
                                        class="glyphicon glyphicon-lock"></i> Mot de passe</label>

                                <div class="col-sm-6">
                                    <input class="form-control" type="password" id="inputPassword"
                                           name="password" placeholder="**********">
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-sm-offset-5 col-sm-10">
                                    <button type="submit" class="btn btn-default">S'identifier</button>
                                    <a href="#" id="linkRegister">S'inscrire</a>
                                </div>
                                <div>
                                </div>
                            </div>
                        </div>
                    </form>

                </div>
            </fieldset>


        </div>

    </div>
    <div class="clearfix"></div>

    <div class="row top" id="insciption" style="display:none;">
        <div class="col-xs-12 col-sm-12 col-md-offset-2 col-md-8 inscription">
            <fieldset class="fieldset">
                <legend>Inscription</legend>
                <div class="col-xs-12">

                    <form action="validerregistr.action" class="form-horizontal" id="inscriptionForm">
                        <div class="row col-xs-12 col-centered">
                            <div class="form-group">
                                <label class="col-sm-5 control-label" for="inputUser"><i
                                        class="glyphicon glyphicon-user"></i> Utilisateur</label>

                                <div class="col-sm-6">
                                    <input class="form-control" name="login" type="text" id="inputUser"
                                           placeholder="Email utilisateur">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-5 control-label" for="inputPassword"><i
                                        class="glyphicon glyphicon-lock"></i> Mot de passe</label>

                                <div class="col-sm-6">
                                    <input class="form-control" type="password" id="inputPassword"
                                           name="password" placeholder="**********">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-5 control-label" for="inputPassword"><i
                                        class="glyphicon glyphicon-lock"></i> Confirmation </label>

                                <div class="col-sm-6">
                                    <input class="form-control" type="password" id="inputPassword"
                                           name="" placeholder="**********" disabled>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-5 control-label" for="inputUser"><i
                                        class="glyphicon glyphicon-user"></i> Nom de famille</label>

                                <div class="col-sm-6">
                                    <input class="form-control" name="login" type="text" id="inputUser"
                                           name="firstName" placeholder="Nom ">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-5 control-label" for="inputUser"><i
                                        class="glyphicon glyphicon-user"></i> Prénom</label>

                                <div class="col-sm-6">
                                    <input class="form-control" name="login" type="text" id="inputUser"
                                           name="lastName" placeholder="Prénom ">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-5 control-label" for="inputUser"><i
                                        class="glyphicon glyphicon-user"></i> Adresse</label>

                                <div class="col-sm-6">
                                    <input class="form-control" name="login" type="text" id="inputUser"
                                           name="adresse" placeholder="Adresse">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-5 control-label" for="inputUser"><i
                                        class="glyphicon glyphicon-user"></i> Adresse de livraison</label>

                                <div class="col-sm-6">
                                    <input class="form-control" name="login" type="text" id="inputUser"
                                           name="adresseLivraison" placeholder="Adresse Livraison">
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-sm-offset-5 col-sm-10">
                                    <button type="submit" class="btn btn-default">S'enregistrer</button>
                                    <button type="reset" class="btn btn-default" id="linkCancel">Annuler</button>
                                </div>
                                <div>
                                </div>
                            </div>
                        </div>
                    </form>

                </div>
            </fieldset>


        </div>

    </div>


</div>
<script src="../../resources/js/jquery-1.12.3.min.js"></script>
<script src="../../resources/js/bootstrap.min.js"></script>
<script>
    $(function () {

        $("#linkRegister").click(function () {
            $("#insciption").show();
            $("#connexion").hide();
            return false;
        });

        $("#linkCancel").click(function () {
            $("#insciption").hide();
            $("#connexion").show();
            return false;
        });
    });


</script>
</body>
</html>