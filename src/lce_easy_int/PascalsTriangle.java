package lce_easy_int;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		System.out.println(generate(5));

	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> outerList = new ArrayList<>();
		List<Integer> innerList1 = new ArrayList<>();
		innerList1.add(1);
		outerList.add(innerList1);
		if(numRows>1) {
			List<Integer> innerList2 = new ArrayList<>();
			innerList2.add(1);
			innerList2.add(1);
			outerList.add(innerList2);
			if(numRows>2) {
				for(int i=2;i<numRows;i++) {
					List<Integer> innerListTemp = new ArrayList<>();
					innerListTemp.add(1);
					for(int j=1;j<i;j++) {
						innerListTemp.add(j, ((outerList.get(i-1).get(j-1))+(outerList.get(i-1).get(j))));
					}
					innerListTemp.add(i,1);
					outerList.add(innerListTemp);
				}
			}
		}
		return outerList;
	}

}
