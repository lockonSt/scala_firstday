package chapter01

class Student (name:String,age:Int){
  def printInfo():Unit = {
    println(this.name+" "+this.age+" " + Student.school)
  }
}

object Student{
  val school:String = "uva"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice",20)
    alice.printInfo()
  }
}