package com.bhubimoh.sparkusecasescenarios

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object ClickStreamSessionization {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[1]").getOrCreate()
    val dataDF = spark.read.option("header", true).csv("src/main/resources/data/clickstream.csv")
    dataDF.show()
  }
}
