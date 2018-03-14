package server

import akka.http.scaladsl.model.{HttpResponse, StatusCodes}
import akka.http.scaladsl.server.Directives._

import scala.concurrent.Future

import scala.concurrent.ExecutionContext.Implicits.global
trait RouteApi {
  val routes = path("test" / "echo") {
    (post & entity(as[String])) { req =>
      complete {
        println(s"request acccepted: $req")
        Future {
          Thread.sleep(3000)
          HttpResponse(
            status = StatusCodes.OK,
            entity = "SUCCESS"
          )
        }
      }
    }
  }
}
