Register a user:
================================================
curl -X POST http://localhost:8080/api/auth/register \
-H "Content-Type: application/json" \
-d '{"username":"user1","password":"password123"}'


Login to get JWT token:
==================================================
curl -X POST http://localhost:8080/api/auth/login \
-H "Content-Type: application/json" \
-d '{"username":"user1","password":"password123"}'


Access protected endpoint:
==================================================
curl -X GET http://localhost:8080/api/protected/hello \
-H "Authorization: Bearer YOUR_JWT_TOKEN_HERE"