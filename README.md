# SparkStreamingDemo
Demo of Spark Streaming using tcpsocket input source

This demo connect to localhost:7777 to fetch stream data, you can use netcan to start a tcp server like this:
```
nc -lkp 7777
<you can type something here, and spark will fetch and process you input>
```
After submit job to spark, type something to nc, and if everything is ok, you can see output from Spark.
