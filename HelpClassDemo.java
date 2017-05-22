// this program will display a help scenario for learning Java
class Help {
  void showMenu() {    
    System.out.println("Help on:");
    System.out.println(" 1. if");
    System.out.println(" 2. switch");
    System.out.println(" 3. for");
    System.out.println(" 4. while");
    System.out.println(" 5. do-while");
    System.out.println(" 6. break");
    System.out.println(" 7. continue");
    System.out.print("Choose one ('q' to quit): ");
  } 
    
  boolean isValid(int ch) {
    if (ch < '1' || ch > '7' && ch != 'q') return false;
    else return true;
  }
  
  void helpOn(int what) {
    switch(what) {
      case '1':
        System.out.println("The If:\n");
        System.out.println("If (condition) {statement;}")  ;
        System.out.println("Elseif (condition) {statement;}");
        System.out.println("Else {statement;}");
        break;
      case '2':
        System.out.println("The Switch:\n");
        System.out.println("switch (expression) {");
        System.out.println("  case constant:");
        System.out.println("    statement sequence;");
        System.out.println("    break;");
        System.out.println("  //...");
        System.out.println("}");
        break;
      case '3':
        System.out.println("The For:\n");
        System.out.println("for (init; condition; iteration) {statement;}");
        break;
      case '4':
        System.out.println("The While:\n");
      System.out.println("while (condition) {statement;}");
        break;
      case '5':
        System.out.println("The Do-While:\n");
        System.out.println("do {statement;} while (condition);");
        break;
      case '6':
        System.out.println("The Break:\n");
        System.out.println("break; or break label;");
        break;
      case '7':
        System.out.println("The Continue:\n");
        System.out.println("continue; or continue label;");
        break;
    }
  }
}

public class HelpClassDemo {

  public static void main(String[] args)
    throws java.io.IOException {
    char choice, ignore;
    Help hlpobj = new Help();

    for (;;) {
      do {
        hlpobj.showMenu();

        choice = (char) System.in.read();

        do {
          ignore = (char) System.in.read();
        } while (ignore != '\n');

      } while (!hlpobj.isValid(choice));
      

      if (choice == 'q') break;

      System.out.println();
      hlpobj.helpOn(choice);
      System.out.println();
    }   
  }  
}