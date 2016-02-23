var fs = require('fs');

exports.getTemps = function(req, res){
	var array = JSON.parse(fs.readFileSync('data2.json', 'utf8'));
	res.send(array);
}

