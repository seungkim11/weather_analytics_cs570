var weathers = require('../../app/controllers/weather.server.controller');

// Define the routes module' method
module.exports = function(app) {
	// Set up the 'weather' base routes 
	app.route('/api/weather')
	   .get(weathers.getTemps);
	   	
	// Set up the 'weather' parameter middleware   
	//app.param('locationId', weather.weatherByID);
};