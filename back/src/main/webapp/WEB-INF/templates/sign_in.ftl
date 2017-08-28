<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap Core CSS -->
  <link href="/resources/landing/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

  <title>Sign in</title>
</head>

<body>
<div class="container">
  <div class="row">
    <div class="col-md-4 col-md-offset-4" style="padding-top: 150px">
      <div class="login-panel panel panel-default">
        <div class="panel-heading">
          <h3 class="panel-title">Please Sign In</h3>
        </div>
        <div class="panel-body">
          <form action="/login/process" method="post">
            <fieldset>
              <div class="form-group">
                <input id="email" class="form-control" placeholder="E-mail" name="email" autofocus>
              </div>
              <div class="form-group">
                <input id="pass" class="form-control" placeholder="Password" name="password" type="password" value="">
              <#if error??>
                <p class="help-block">Bad credentials. Try again.</p>
              </#if>
              </div>
              <div class="form-group">
                <input id="sign_in" class="btn btn-block btn-success" type="submit" value="Sign in">
              </div>
            </fieldset>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>

<!-- Bootstrap Core JavaScript -->
<script src="/resources/landing/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

</body>

</html>
