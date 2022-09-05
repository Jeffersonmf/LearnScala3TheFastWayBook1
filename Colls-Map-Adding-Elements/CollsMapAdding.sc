//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsMapAdding.sc

val a = scala.collection.mutable.Map(1 -> "a")

// adding elements
a += (2 -> "b")                  // add using a tuple
a ++= Map(3 -> "c", 4 -> "d")    // add with another Map
a ++= List(5 -> "e", 6 -> "f")   // you can even add new pairs with a sequence

println(a)


a.clear
println(a)

a.clear
a += (2 -> "b")
println(a)


