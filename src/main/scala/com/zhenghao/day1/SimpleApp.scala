package com.zhenghao.day1
import org.apache.spark.sql.SparkSession

object SimpleApp {

  def main(args: Array[String]): Unit = {
    val inputFile = "input/README.md"
    val spark = SparkSession.builder.appName("Simple Application").master("local[2]").getOrCreate()
    val textFile = spark.read.textFile(inputFile).cache()
    val numAs = textFile.filter(line => line.contains("a")).count()
    val numBs = textFile.filter(line => line.contains("b")).count()
    println(f"Lines with a: $numAs, Lines with b: $numBs")
    spark.stop()
  }

}
