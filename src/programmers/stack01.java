package programmers;

public class stack01 {
	public static void main(String args[]) {
		int prices[] = {1, 2, 3, 2, 3};
		int a[] = solution(prices);
		System.out.println(a);
	}
	
	public static int[] solution(int[] prices) {
		int answer[] = new int[prices.length];
				
		for(int i=0; i<prices.length-1; i++) {
        	for(int j=i+1; j<prices.length; j++) {
            	answer[i]++;
        		if(prices[i] > prices[j]) {
        			break;
        		}
        	}
        }
		
        return answer;
    }
}
