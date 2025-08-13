public class pangramcheck {
public static void main(String args[]){
String input = "The quick brown fox jumps over a lazy dog";
input = input.toLowerCase();
int count = 0;
for (char ch = 'a';ch <= 'z'; ch++){
boolean found = false;
for(int i = 0; i < input.length(); i++){
char c = input.charAt(i);
if(c == ch){
found =true;
break;
}
}
if (found) {
count++;
}
}
if (count == 26) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}