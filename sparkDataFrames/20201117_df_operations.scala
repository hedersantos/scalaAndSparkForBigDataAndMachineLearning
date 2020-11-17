
import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

// ingest CSV file
val df = spark.read.format("csv").option("header","true").option("inferSchema","true").load("private/data/CitiGroup2006_2008")

df.head(5)

/*
FILTERING DATA
*/

// $ (dollar sign) scala notation
df.filter($"Close">480).show()

// SQL notation
df.filter("Close > 480").show()

// Scala notation
df.filter($"Close" < 480 && $"High" < 480).show()

// SQL notation
df.filter("Close < 480 AND High < 480").show()


