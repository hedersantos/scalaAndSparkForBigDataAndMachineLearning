// import SparkSession
import org.apache.spark.sql.SparkSession

// instantiate SparkSession
val spark = SparkSession.builder.getOrCreate()

// ingest CSV file
val df = spark.read.option("header","true").option("inferSchema","true").csv("private/data/CitiGroup2006_2008")

// print first 5 rows to stdout
df.head(5)

// iterate and print each dataframe row to stdout
for (row <- df.head(5)) {
    println(row)
}

// display dataframe column names
df.columns

// use describe() method to obtain basic dataframe statistics
df.describe().show()

// SELECT single column
df.select("Volume").show()

// SELECT multiple column
df.select($"Date",$"Close").show()

// create new column and save as new DataFrame
val df2 = df.withColumn("HighPlusLow",df("High")+df("Low"))

// print schema to stdout
df2.printSchema()

// SELECT column with alias
df2.select(df2("HighPlusLow").as("HPL"),df("Close")).show()

spark.stop()




