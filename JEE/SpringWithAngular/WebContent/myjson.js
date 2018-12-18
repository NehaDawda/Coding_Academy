/**
 * _refreshPageData() will call automatically when page loaded
 *  Calling _refreshPageData() after every add & Remove of data
 */

var myWebservice=angular.module("myApp",[]);

myWebservice.controller("ServiceController", function($scope, $http) {
	_refreshPageData();
	//Check url according to your Application name & PORT
	function _refreshPageData(){
$http({
	method: 'GET',
	url: 'http://localhost:9090/SpringWithAngular/rest/countries.json'
		}).success(function(data)
			{
				
			$scope.posts = data; // response data 
			
			});
	}
$scope.form = {
		countryId : 1,
		countryName : "",
		population : ""
	
	};

$scope.add=function(){
	//Check url according to your Application name & PORT
	
	$http({
		method:'POST',
		url:'http://localhost:9090/SpringWithAngular/rest/countries/create/'+$scope.form.countryId+'/'+$scope.form.countryName+'/'+$scope.form.population
	}).success(function(data)
			{
			alert("DATA ADDED");	
			_refreshPageData();
			
			});
	
}
$scope.remove=function(data){
	
	//Check url according to your Application name & PORT	
	$http({
		method:'DELETE',
		url:'http://localhost:9090/SpringWithAngular/rest//countries/delete/'+data
	}).success(function(data)
			{
			alert('Data Deleted')	
			 _refreshPageData();
			
			});
	
}

	
		
	
	
});

