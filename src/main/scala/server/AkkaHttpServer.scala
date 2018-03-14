package server

import java.util.concurrent.Executors

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer

import scala.concurrent.ExecutionContext

object AkkaHttpServer extends App with RouteApi {
  implicit val system = ActorSystem()
  implicit val executor: ExecutionContext = system.dispatcher
  implicit val materializer: ActorMaterializer = ActorMaterializer()

  try {
    println("server started...")
    Http().bindAndHandle(handler = routes, interface = "localhost", port = 9001)
  } catch {
    case e: Exception => println(s"Server start error...$e")
  }
}
