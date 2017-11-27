#lagom-streaming
A basic application to implement one way and two way streaming in lagom

###One way streaming:
End point: /api/streaming/oneWay

In one way streaming, request will be mormal but response will be streamed.

###Two way streaming:
End point: /api/streaming/twoWay

In two way streaming, request and response both will be streamed.

#Run application
Hit the below command

mvn lagom:runAll

##Test the application
You need to hit the service from the websocket client and then by seeing the response 
you can verify the streaming.