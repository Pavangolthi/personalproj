package sample;

import java.awt.List;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkEx{
    public static void main(String args[]) {
         Set<String> set = new LinkedHashSet<String>();
         set.add("3");
         set.add("1");
         set.add("3");
         set.add("2");
         set.add("3");
         set.add("1");
                set.forEach(s -> System.out.print(s+"-"));
    }
}
