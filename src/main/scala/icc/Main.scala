package icc

import icc.chatter.{Context, Knowledge}
import icc.chatter.Brain._

import scala.annotation.tailrec
import scala.io.StdIn

object Main extends App {
  @tailrec
  def loop(knowledge: Knowledge, context: Context) {
    val in = StdIn.readLine()

    loop(
      digest(knowledge, in),
      context /+ in
    )
  }

  loop(new Knowledge, new Context)
}
