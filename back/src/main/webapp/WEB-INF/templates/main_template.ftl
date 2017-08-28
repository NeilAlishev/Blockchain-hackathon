<#macro main title scripts=[] styles=[]>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>${title}</title>

  <!-- Bootstrap Core CSS -->
  <link href="/resources/landing/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
  <!-- MetisMenu CSS -->
  <link href="/resources/landing/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">
  <!-- Timeline CSS -->
  <link href="/resources/landing/dist/css/timeline.css" rel="stylesheet">
  <!-- Custom CSS -->
  <link href="/resources/landing/dist/css/sb-admin-2.css" rel="stylesheet">
  <!-- Morris Charts CSS -->
  <link href="/resources/landing/bower_components/morrisjs/morris.css" rel="stylesheet">
  <!-- Custom Fonts -->
  <link href="/resources/landing/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->

    <#list styles as style>
      <link rel="stylesheet" type="text/css" href="${style}">
    </#list>
</head>

<body>
<div id="wrapper">

  <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Employee!</a>
    </div>

    <ul class="nav navbar-top-links navbar-right">
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
          <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
        </a>
        <ul class="dropdown-menu dropdown-user">
          <li>
            <a href="#"><i class="fa fa-edit fa-fw"></i>Edit profile</a>
          </li>
          <li class="divider"></li>
          <li>
            <a href="/logout"><i class="fa fa-sign-out fa-fw"></i>Logout</a>
          </li>
        </ul>
      </li>
    </ul>
  </nav>

  <div style="margin:20px;">
      <@content/>

    <div class="row">
      <div class="col-lg-6" style="height: 300px">
      </div>
    </div>
  </div>

</div>

<!-- jQuery -->
<script src="/resources/landing/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="/resources/landing/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Metis Menu Plugin JavaScript -->
<script src="/resources/landing/bower_components/metisMenu/dist/metisMenu.min.js"></script>
<!-- Custom Theme JavaScript -->
<script src="/resources/landing/dist/js/sb-admin-2.js"></script>

    <#list scripts as script>
    <script type="application/javascript" src="${script}"></script>
    </#list>

</body>
</#macro>