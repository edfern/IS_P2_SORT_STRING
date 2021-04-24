package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.sort_string.services;

import java.util.Arrays;

public class SortString implements ISortString {
    @Override
    public void sortString(String[] args) {
        for(int i=0; i < args.length;i++){
            String input = args[i];
            char tempArray[] = input.toCharArray();
            Arrays.sort(tempArray);
            args[i] = new String(tempArray);
        }
    }
}
