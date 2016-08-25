package com.demo.spark

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

object SparkStreamingDemo {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Spark Streaming Demo")
    val ssc = new StreamingContext(conf, Seconds(1))
    val lines = ssc.socketTextStream("localhost", 7777)
    val wordCount = lines.flatMap(_.split(" ")).count()

    wordCount.print()

    ssc.start()
    ssc.awaitTermination()
  }
}