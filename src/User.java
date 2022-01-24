public class User {
    private String name;
    private int id;
    private static int unique_id;

    //for debugging purposes.
    private final Boolean DEBUGGING = true;
    Debug user_debug = new Debug("User");

    public User(String name){
        this.setName(name);
        this.setId();

        if(DEBUGGING) {
            user_debug.start_debug();
            System.out.println("Creating object:" +
                    "\n\tname: " + this.name +
                    "\n\tid: " + this.id);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //this should only be used by the constructor
    private void setId() {
        this.id = User.unique_id;
        User.unique_id++;
    }

    public int getId() {
        return this.id;
    }



}
