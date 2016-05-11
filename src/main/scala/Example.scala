//object Tables extends {
//  // or just use object demo.Tables, which is hard-wired to the driver stated during generation
//  val profile = slick.driver.H2Driver
//} with demo.Tables


import scala.concurrent.Await
import scala.concurrent.duration._
import scala.language.postfixOps

import scala.concurrent.ExecutionContext.Implicits.global
import slick.codegen.SourceCodeGenerator
import slick.driver.SQLiteDriver


object Example extends App {
//  // connection info for a pre-populated throw-away, in-memory db for this demo, which is freshly initialized on every run
//  val url = "jdbc:h2:mem:test;INIT=runscript from 'src/main/sql/create.sql'"
//  val db = Database.forURL(url, driver = "org.h2.Driver")
//
//  // Using generated code. Our Build.sbt makes sure they are generated before compilation.
//  val q = Companies.join(Computers).on(_.id === _.manufacturerId)
//    .map { case (co, cp) => (co.name, cp.name) }
//
//  Await.result(db.run(q.result).map { result =>
//    println(result.groupBy { case (co, cp) => co }
//      .mapValues(_.map { case (co, cp) => cp })
//      .mkString("\n")
//    )
//  }, 60 seconds)
  
  
  
  SourceCodeGenerator.main(Array("slick.driver.SQLiteDriver", "org.sqlite.JDBC", "jdbc:sqlite:/db/salestock.db", "out", "model"))  
}
