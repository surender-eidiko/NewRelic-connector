## New Relic Anypoint™ Connector


[New Relic Connector to connect to New Relic]

## Author
: 
Eidiko Systems Integrators.

## Supported Mule runtime versions
:
Mule 3.7.0

## New Relic supported versions
:
New Relic Version 1.0 and above.

## Service or application supported modules
Example: New Relic 

## Running the Demo

The Demo is used to get all the application services in New Relic. The New Relic connector gets the application services for the user whose authorization token is used to connect to it.

To get the application services, in connector properties select 'Get application service' operation and provide API key in Api_Key field in General.


To run the demo open a browser and type http://localhost:8081/. It will trigger the flow. And you will see the below reply in the browser

{
	"statusCode": "200",
	"statusMessage": null,
	"applications": [{
		"id": "19072630",
		"last_reported_at": "2016-09-06T11:40:43+00:00",
		"settings": {
			"app_apdex_threshold": "3.0",
			"enable_real_user_monitoring": "true",
			"use_server_side_config": "false",
			"end_user_apdex_threshold": "4.0"
		},
		"name": "TestFromMule",
		"application_summary": {
			"response_time": "0.0",
			"apdex_target": "3.0",
			"apdex_score": "0.0",
			"instance_count": "1",
			"error_rate": "0.0",
			"throughput": "0.0",
			"host_count": "1",
			"concurrent_instance_count": null
		},
		"links": {
			"application_hosts": ["19072631"],
			"servers": ["19082080"],
			"application": null,
			"application_host": null,
			"alert_policy": "493440",
			"application_instances": ["19072632"],
			"server": null
		},
		"reporting": "true",
		"end_user_summary": null,
		"health_status": "green",
		"language": "java"
	}]
}
