package Asset.Managment.Asset.entity;

//public class Assign {
//
//    int i = 0;
//
//    int [] A = new int [5,6,7];
//
//    public int solution() {
//        Integer[] A = this.A;
//        Stream stream = Stream.of(A);
//        ArrayList<Integer> sortedArray = new ArrayList();
//        int i = 0;
//        stream.sorted().forEach(
//                o -> {
//                    if (!sortedArray.contains((Integer) o)) {
//                        sortedArray.add((Integer) o);
//                    }
//                }
//        );
//        int len = sortedArray.size();
//        if (sortedArray.get(len - 1) <= 0) {
//            return 1;
//        }
//        if (sortedArray.get(0) > 1) {
//            return 1;
//        }
//        if ((sortedArray.get(len - 1) - sortedArray.get(0)) == len - 1) {
//            return sortedArray.get(len - 1) + 1;
//        }
//        int key = sortedArray.get(0);
//        for (int s = 0; s < len; s++) {
//            if (sortedArray.get(s) != key) {
//                return key;
//            }
//            key = key + 1;
//        }
//        return 0;
//
//    }
//}