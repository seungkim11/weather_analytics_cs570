angular.module('weathers')
.controller('WeatherController', 
	['$scope', 'WeatherService', '$routeParams', function($scope, WeatherService, $routeParams) { 
		
		$scope.byCity = function(){
			var cityName = $routeParams.cityName;
			$scope.cityName = $routeParams.cityName;
			WeatherService.query(function (data) {
				
				// for gathering data for different cities
				var weatherObject = {
					date : [],
					Location : cityName,
					min : [],
					avg_temp : [],
					max : []
				};
				
				for (var i = 0; i < data.length; i++){
					var weather = data[i];

					if (weather.Location == cityName){

						// if location found, find the location

						if (weather.avg_temp != 0){

							weatherObject.date.push('2/' + weather.date + '/2016');
							weatherObject.min.push(weather.min);
							weatherObject.avg_temp.push(weather.avg_temp);
							weatherObject.max.push(weather.max);	
						}
					}
				}	

				$scope.chartConfig = {
					options: {
						chart: {
							type: 'column'
						}, 
						tooltip: {
							headerFormat: '<b>{point.x}</b><br/>',
							pointFormat: '{series.name}: {point.y}<br/>'
						},
						legend: {
							align: 'right',
							x: -30,
							verticalAlign: 'top',
							y: 25,
							floating: true,
							backgroundColor: (Highcharts.theme && Highcharts.theme.background2) || 'white',
							borderColor: '#CCC',
							borderWidth: 1,
							shadow: false
						},

						plotOptions: {
							column: {
								dataLabels: {
									enabled: true,
									color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',
									style: {
										textShadow: '0 0 3px black'
									}
								}
							}
						}
					},
					series: [{
						name: "Maximum",
						data: weatherObject.max
					}, {
						name: "Average",
						data: weatherObject.avg_temp
					}, {
						name: "Minimum",
						data: weatherObject.min
					}],
					title: {
						text: 'Temperature in ' + weatherObject.Location
					},
					loading: false,
					xAxis: {
						categories: weatherObject.date
					},
					
					yAxis: {
						min: 0,
						title: {
							text: 'City wise weekly temperature'
						},
						stackLabels: {
							enabled: true,
							style: {
								fontWeight: 'bold',
								color: (Highcharts.theme && Highcharts.theme.textColor) || 'gray'
							}
						}
					}
				};				
			})
		}

		$scope.allWeathers = function(){
			WeatherService.query(function (data) {
				// for checking locations
				var locationArray = [];

				// for gathering data for different cities
				var weatherObjects = [];

				for (var i = 0; i < data.length; i++){
					var weather = data[i];
					if (Object.keys(weather).length){
						var obj = {};
					// if new location
					if (weather.Location && !locationArray.includes(weather.Location)){
						locationArray.push(weather.Location);
						obj.Location = weather.Location;
						obj.date = ['2/' + weather.date + '/2016'];
						obj.min = [weather.min];
						obj.avg_temp = [weather.avg_temp];
						obj.max = [weather.max];
						weatherObjects.push(obj);
					} else {
						// if location found, find the location
						for (var j = 0; j < weatherObjects.length; j++){
							if (weatherObjects[j].Location == weather.Location){
								if (weather.avg_temp != 0){
									var weatherObject = weatherObjects[j];
									weatherObject.date.push('2/' + weather.date + '/2016');
									weatherObject.min.push(weather.min);
									weatherObject.avg_temp.push(weather.avg_temp);
									weatherObject.max.push(weather.max);		
								}
							}
						}
					}
					
				}	
			}
			
			$scope.chartConfigs = [];
			for (var i = 0; i < weatherObjects.length; i++){

				var config = {
					options: {
						chart: {
							type: 'column'
						}, 
						tooltip: {
							headerFormat: '<b>{point.x}</b><br/>',
							pointFormat: '{series.name}: {point.y}<br/>'
						},
						legend: {
							align: 'right',
							x: -30,
							verticalAlign: 'top',
							y: 25,
							floating: true,
							backgroundColor: (Highcharts.theme && Highcharts.theme.background2) || 'white',
							borderColor: '#CCC',
							borderWidth: 1,
							shadow: false
						},

						plotOptions: {
							column: {
								stacking: 'normal',
								dataLabels: {
									enabled: true,
									color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',
									style: {
										textShadow: '0 0 3px black'
									}
								}
							}
						}
					},
					series: [{
						name: "Maximum",
						data: weatherObjects[i].max
					}, {
						name: "Average",
						data: weatherObjects[i].avg_temp
					}, {
						name: "Minimum",
						data: weatherObjects[i].min
					}],
					title: {
						text: 'Temperature in ' + weatherObjects[i].Location
					},
					loading: false,
					xAxis: {
						categories: weatherObjects[i].date
					},
					
					yAxis: {
						min: 0,
						title: {
							text: 'City wise weekly temperature'
						},
						stackLabels: {
							enabled: true,
							style: {
								fontWeight: 'bold',
								color: (Highcharts.theme && Highcharts.theme.textColor) || 'gray'
							}
						}
					}
				};
				$scope.chartConfigs.push(config);
			}
		})
		}
	}
	]);
