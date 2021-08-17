## Line Intersection

Please, implement the method `intersection(Line)` in class [`Line`](src/main/java/com/epam/rd/autotasks/intersection/Line.java). It  must return a [`Point`](src/main/java/com/epam/rd/autotasks/intersection/Point.java) of intersection of two lines.
If lines coincide or do not intersect, the method must return null.
It may seem surprising that we use `int` for arguments and fields of coordinates.
The point is that using `double` will bring some extra complexity we want to avoid for this basic exercise.
All tests are selected in such a way as to induce calculations without remainders.

You may check your result in class [`Main`](src/main/java/com/epam/rd/autotasks/intersection/Main.java).

You may also run tests locally with Maven:
```shell
mvn clean test
```