'use strict';

angular.module('weathers').factory('WeatherService', ['$resource',
	function($resource) {
		return $resource('api/weather');
	}]);