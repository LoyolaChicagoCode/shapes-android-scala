package edu.luc.etl.cs313.scala.shapes.model

import android.graphics.Color

object fixtures {

  val simpleCircle = Circle(50)

  val simpleRectangle = Rectangle(80, 120)

  val simplePolygon = Polygon(
    Point(50, 50),
    Point(60, 100),
    Point(100, 110),
    Point(120, 60)
  )

  val simpleLocation = Location(70, 30, Rectangle(80, 120))

  val simpleFill = Fill(Rectangle(80, 120))

  val simpleOutline = Outline(Rectangle(80, 120));

  val simpleStroke = Stroke(Color.RED, Rectangle(80, 120));

  val simpleGroup = Group(
    Location(200, 100, Circle(50)),
    Location(400, 300, Rectangle(100, 50))
  )

  val complexGroup = Location(50, 100,
    Group(
      Circle(20),
      Rectangle(100, 200),
      Location(150, 50,
        Stroke(Color.RED,
          Fill(
            Group(
              Rectangle(50, 30),
              Outline(Rectangle(300, 60)),
              Stroke(Color.CYAN,
                Polygon(
                  Point(50, 50),
                  Point(60, 100),
                  Point(100, 110),
                  Point(120, 60)
                )
              ),
              Location(100, 200,
                Stroke(Color.MAGENTA,
                  Outline(Circle(50))
                )
              )
            )
          )
        )
      )
    )
  )
}