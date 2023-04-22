<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>FreeMarker</title>
    </head>
    <body>
        Hi FreeMarker,现在时间是${now}!
        <br>
        ${"Hi FreeMarker,现在时间是${now}!"}
        <br>
        ${"Hi FreeMarker,现在时间是"+ now +"!"}
        <br>
    </body>
</html>