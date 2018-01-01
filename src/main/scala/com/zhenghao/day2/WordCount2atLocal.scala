package com.zhenghao.day2

import org.apache.spark.sql.SparkSession

object WordCount2atLocal {

  def main(args: Array[String]): Unit = {
    val inputFile = "input/README.md"

    val spark = SparkSession.builder()
                            .appName("WordCount2")
                            .master("local[2]")
                            .getOrCreate()
    // textFile��Dataset���Ƽ�ʹ��Dataset
    val textFile = spark.read.textFile(inputFile)
//    val wordCounts = textFile.flatMap(line => line.split(" ")).groupByKey(identity).count()
//    print(wordCounts)

  }

}
