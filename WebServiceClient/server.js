// created by skim

'use strict';

var express = require('express');

var app = express();
app.use(express.static('public'));

// bower dependency for highcharts graph
app.use('/bower_components',  express.static(__dirname + '/bower_components'));

//require server routing
require('./app/routes/weather.server.routes.js')(app);

app.listen(3000);

console.log('Server running at http://localhost:3000/');

// export as an app
module.exports = app;