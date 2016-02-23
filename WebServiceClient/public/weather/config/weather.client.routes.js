'use strict';

angular.module('weathers').config(['$routeProvider',
	function($routeProvider) {
		$routeProvider.
		when('/', {
			templateUrl: '/weather/views/home.client.view.html',
			controller: 'WeatherController'
		}).
		when('/weather', {
			templateUrl: '/weather/views/weather.client.view.html',
			controller: 'WeatherController'
		}).
		when('/cities/', {
			templateUrl: '/weather/views/cities.client.view.html',
			controller: 'WeatherController'
		}).
		when('/cities/:cityName', {
			templateUrl: '/weather/views/city.client.view.html',
			controller: 'WeatherController'
		}).
		otherwise({
			redirectTo: '/'
		});
	
	}
]); 
