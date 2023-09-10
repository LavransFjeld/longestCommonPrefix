import java.sql.Array;

public class Main {

//    {"cir","car"}
    public String longestCommonPrefi(String[] strs) {

        String result = strs[0];
        int lowestCount = 0;
        if(strs.length == 1) {
            return strs[0];
        }
        for(int i=1;i<strs.length;i++) {
            int counter = 0;
            for(int j=0;j<strs[i].length();j++) {
                if(j < result.length()) {
                    if(result.charAt(j) == strs[i].charAt(j) && j == counter){
                        counter++;
                        System.out.println(result.charAt(j));
                    }
                }
            }
            if(i == 1) {
                lowestCount = counter;
            }
            if(counter < lowestCount) {
                lowestCount = counter;
            }
        }

        System.out.println(lowestCount);
        result = "";
        for(int i=0;i<lowestCount;i++) {
            result += strs[0].charAt(i);
        }


        return result;
    }
}






//    public String longestCommonPrefix(String[] strs) {
//        String result = "";
//        int counter = 0;
//        if(strs.length == 1) {
//            return strs[0];
//        }else {
//            for(int f=0;f<strs[0].length();f++) {
//                for(int i=0;i<strs.length;i++) {
//                    if(i == 0) {
//                        continue;
//                    }
//                    for(int j=0;j<strs[i].length();j++) {
//                        if(strs[0].charAt(0) != strs[i].charAt(0)){
//                            break;
//                        }
////                        System.out.println(j);
//                        if(strs[0].charAt(f) == strs[i].charAt(j)) {
//                            System.out.println(strs[i].charAt(j));
//                            System.out.println(i + "   " + j + "   " + counter);
//                            if(i == strs.length-1 && counter == j) {
//                                result += strs[i].charAt(j);
//                            }
//                            if(i == strs.length- 1) {
//                                counter++;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return result;
//    }