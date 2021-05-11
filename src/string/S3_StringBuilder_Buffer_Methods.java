package string;
/*
Both string builder and string buffer have identical set of methods
Same as String
=================
length()
charAt(index)
indexOf(str);
indexOf(str, fromindex)
lastIndexOf(str)
lastIndexOf
substring(beginIndex)
chars() - gives you stream of integer

New Methods
================
append(x) - boolean, int, char, String, float, Object
insert(offset, x)
setCharAt(index, c)
deleteCharAt()
capacity()- capacity
replace()
reverse()
 */
public class S3_StringBuilder_Buffer_Methods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("dcba");
        System.out.println(sb.reverse());
        System.out.println(sb.append("efg"));
        sb.setCharAt(1,'h');
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.insert(0, "apple");
        System.out.println(sb);
    }
}
