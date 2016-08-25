package zeptest.entities

sealed trait Shape
object Sphere extends Shape
object Cube extends Shape
object Cog extends Shape
object Bar extends Shape
object Sprocket extends Shape

sealed trait Material
object Plastic extends Material
object Steel extends Material
object Plutonium extends Material

case class WidgetModel(shape: Shape, material: Material)

object WidgetModels {
  val sprocketOne = WidgetModel(Sprocket, Plastic)
  val sprocketTwo = WidgetModel(Sprocket, Steel)
  val cogOneThousand = WidgetModel(Cog, Plutonium)
  val sphere = WidgetModel(Sphere, Steel)
}

