package zeptest

import zeptest.entities.WidgetFactory

import scala.util.Random

/**
  * Created by am_dev on 8/25/16.
  */
object Main extends App {

  val factory = new WidgetFactory

  val widgets = factory.makeWidgets(20)

  println(widgets)

}
