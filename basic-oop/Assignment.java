public class Assignment {
  public int tasks;
  public String difficulty;
  public boolean submission;

  public Assignment() {
    this.tasks = 0;
    this.difficulty = "null";
    this.submission = false;
  }

  void printDetails() {
    System.out.println("Number of tasks: " + tasks);
    System.out.println("Difficulty level: " + difficulty);
    System.out.println("Submission required: " + submission);
  }

  String makeOptional() {
    if (submission) {
      submission = false;
      return "Assignment will not require submission";
    } else {
     return "Submission is already not required";
    }
  }
}