//work in progress
public class JavaDrills {
    public static String flipOuterCase(String text)
    {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char l = chars.length-1;
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        System.out.println(flipOuterCase("Cat"));

    }
}
