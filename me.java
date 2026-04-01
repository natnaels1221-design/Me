class Identity{
    int age;
    String name;
    String City;
    String job;
    String Hobby;
    public Identity(int age,String name,String City,String main_job,String Hobby){
        this.age=age;
        this.name=name;
        this.City=City;
        this.job=main_job;
        this.Hobby=Hobby;
    }
    public void introduction(){
        System.out.println("HI my name is "+name+" i am "+age+" years old"+" & i live in "+City+" my current main Job is "+job+" and last but least my Hobby is "+Hobby);
    }
}
public class foziacodes {

    public static void main(String[] args) {
        Identity me=new Identity(21,"Natnael_Andualem","nazreth","learning","playing guitar!!!!");
        me.introduction();
    }
}
