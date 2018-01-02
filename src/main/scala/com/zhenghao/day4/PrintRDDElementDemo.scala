package com.zhenghao.day4

import org.apache.spark.{SparkConf, SparkContext}

object PrintRDDElementDemo {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("PrintRDDElementDemo").setMaster("local[3]")
    val sc = new SparkContext(conf)

    val data = Array(1,2,3,4,5,6)
    val rdd = sc.parallelize(data, 3)

    // �������������ϣ���Ⱥ�²�����ʾ
    rdd.foreach(println)

    // �����������ϣ����ܻ�ľ����������ڴ�
    rdd.collect().foreach(println)

    rdd.take(4).foreach(println)
  }

}
