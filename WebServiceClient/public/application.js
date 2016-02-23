'use strict';

var mainApplicationModuleName = 'weatherApp';

// Create the main application
var mainApplicationModule = angular.module(mainApplicationModuleName, 
	['ngResource', 'ngRoute', 'weathers', 'highcharts-ng']);

angular.element(document).ready(function() {
	angular.bootstrap(document, [mainApplicationModuleName]);
});