import Messages.MyData

fun main(args: Array<String>) {
  val myData = with(MyData.newBuilder()) {
    field1 = "test"
    field2 = true
    return@with build()
  }

  println("myData: $myData")
}
