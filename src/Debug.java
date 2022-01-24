public class Debug {
    private String class_being_debugged;

    public Debug(String class_being_debugged){
        this.class_being_debugged = class_being_debugged;
    }
    public void start_debug(){
        System.out.println("*** Debugging: " + this.class_being_debugged + " ***");
    }
}
