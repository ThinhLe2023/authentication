# authentication
This is repo to support a small company to expose an API for authentication

authentication flow:
	- microservice : 
		+ user_service: verify user/pass and other information.
		+ generate API key to support next other communication
	API POST /login -> get data from postGre DB => success/failed
	
	concern:
	- what DB to save User 's information : Postgre, MySQL, SQL Server,...
	- not consider performance now, we will do as simple as we need.
	
	TODO:
	- encrypted user_pw
	- Integrate with SSO
	- 2FA (2 factor authorization)
	- cache user information
	
