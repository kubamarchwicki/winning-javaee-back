var express = require('express')
var app = express()
var path = require('path')

app.use(express.static(path.join(__dirname, 'app')));

app.get('/*', function (req, res) {
  console.log('GET req: ' + req.protocol + '://' + req.get('host') + req.originalUrl)
  res.setHeader('Content-Type', 'application/json');
  res.end(JSON.stringify(
      [
          {"title":"First todo","order":1,"completed":false},
          {"title":"Second todo - which is done","order":2,"completed":true},
          {"title":"Not done todo","order":3,"completed":false}
      ]
  ));
})

var post = function(req, res) {
    console.log(req.method + ' req: ' + req.protocol + '://' + req.get('host') + req.originalUrl)
    var bodyStr = '';
    req.on("data",function(chunk){
        bodyStr += chunk.toString();
    });
    req.on("end",function(){
        console.log("   request body ==> " + bodyStr);
    });
    res.status(201)
    res.end()
}

app.post('/*', post);
app.put('/*', post);

var server = app.listen(3000, function () {
  var host = server.address().address
  var port = server.address().port

  console.log('Example app listening at http://%s:%s', host, port)

})
