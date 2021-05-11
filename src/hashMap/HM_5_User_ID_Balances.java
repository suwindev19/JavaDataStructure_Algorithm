package hashMap;
// User ID and their balances
import java.util.ArrayList;
class User{
    int id;
    int balance;
    User(int id, int balance){
        this.id = id;
        this.balance = balance;
    }
}
// Time O(n)
class UserList{
    ArrayList<User> array;
    UserList(){
        array = new ArrayList<>();
    }
    int get(int id){
        for(User x : array){
            if(x.id == id){
                return x.balance;
            }
        }
        return -1;
    }
    void set(int id, int balance){
        for(User x: array){
            if (x.id == id){
                x.balance = balance;
                return;
            }
        }
        array.add(new User(id, balance));
    }
}
public class HM_5_User_ID_Balances {
    public static void main(String[] args) {
        UserList userList = new UserList();
        userList.set(1, 100);
        userList.set(2, 2000);
        System.out.println(userList.get(1));
        userList.set(1,5000);
        System.out.println(userList.get(1));
    }
}
