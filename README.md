A [Giter8][g8] template for showcasing one way and two way streaming in lagom.

# lagom-streaming
A basic application to implement one way and two way streaming in lagom

### One way streaming:
End point: /api/streaming/oneWay

In one way streaming, request will be mormal but response will be streamed.

### Two way streaming:
End point: /api/streaming/twoWay

In two way streaming, request and response both will be streamed.

# Clone the application
sbt new knoldus/lagom-streaming.g8

cd lagom-streaming/

sbt clean compile

# Run application
Hit the below command

sbt runAll

## Test the application
You need to hit the service from the websocket client and then by seeing the response 
you can verify the streaming.

----------------
Written in 2017​ by Rishi Khandelwal

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
