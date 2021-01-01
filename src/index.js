const express = require('express');
const httpsrv = express();

var replyto = require('../src/replyto');

httpsrv.get("/", (req, res) => {
  res.send(replyto.replyTo(req.query.name));
});

httpsrv.listen(8000, function() {
  console.log("server started.");
});
