
//fun main(){
//    println("Setup successful!")
//}
fun main(){
////// Create a data class Task
data class Task(val title: String, var isDone : Boolean )

////// Declare a mutable List of tasks
val tasks = mutableListOf(
 Task("Submit assignment", true) ,
 Task("Clean the house"  , false),
 Task("Attended the live session",true))

////// Loop through the tasks and print thier status using a conditional:
for(task in tasks){
 if(task.isDone==true) {
     println("✅ ${task.title}")
 }
 else {
     println("❌ ${task.title}")
   }
  }
    println("Just modification for the second commit")
}

























