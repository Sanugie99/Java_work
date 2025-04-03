package ex04_array;
import java.util.*;
public class Exam1 {

	public static void main(String[] args) {
		int[] iArr = new int[10];
		int sum = 0;
		//배열에 각각의 index에 1~10을 할당하고 총 합을 구하여 출력하세요.
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = i+1;
			sum += iArr[i];
		}
		
		System.out.printf("sum : %d\n",sum);
		
		Random r = new Random();
		//r.nextInt(30)+1
		
		//iArr에 각 index에 난수를 넣고
		//배열의 짝수 요소들의 총 합 구하기.
		sum = 0;
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = r.nextInt(30)+1;
			if(iArr[i] % 2 == 0) {
				sum += iArr[i];
			}
		}
		System.out.printf("iArr 난수 배열의 짝수의 총합 : %d\n",sum);
		
		int[] nums = {5, 7, 2, 9, 4, 10, 3};
		//배열에서 최대값과 최소값을 출력하는 프로그램 만들기
		int max = nums[0];
		int min = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}else if(nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.printf("최대값 %d, 최소값 %d\n",max,min);
		
		System.out.println("-----------------------");
		
		int[] nums2 = {1, 2, 1, 3, 2, 1, 4};
		int[] count = new int[5];
		//위 배열에서 각 숫자가 몇번 나왔는지 출력하시오
		for(int i = 0; i < nums2.length; i++) {
			count[nums2[i]]++;
		}
		for(int i = 1; i <= 4; i++) {
			System.out.printf("%d : %d번\n",i,count[i]);
		}
		
		int[] nums3 = {5, 3, 8, 4, 2};
		//오름차순으로 정리하세요
		//1. 버블 정렬
		//인접한 두 요소를 비교해 큰 값을 뒤로 보내는 정렬 방식
		for(int i = 0; i < nums3.length-1; i++) {
			for(int j = 0; j < nums3.length-1-i; j++) {
				if(nums3[j] > nums[j+1]) {
					int temp = nums3[j];
					nums3[j] = nums3[j+1];
					nums3[j+1] = temp;
				}
			}
		}
		System.out.println();
		
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		String myWord = "";
		for(int i = 0; i < cards.length; i++) {
			if((cards[i] >= 'A' && cards[i] <= 'Z') || (cards[i] >= 'a' && cards[i] <= 'z')) {
				myWord += cards[i];
			}
		}
		System.out.printf("단어 : %S\n",myWord);
		
		/*
		 * 키보드에서 배열의 길이를 입력 받는다.
		 * 입력받은 배열의 길이만큼 알파벳을 넣고 출력한다
		 * 배열의 길이 5
		 * ABCDE
		 * 
		 * 배열의 길이 3
		 * ABC
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이를 입력하세요 : ");
		int arrnum = sc.nextInt();
		
		char[] arrchar = new char[arrnum];
		char x = 'A';
		
		for(int i = 0; i < arrchar.length; i++) {
			arrchar[i] += x;
			System.out.print(arrchar[i]);
			x++;
		}
		System.out.println();
		
		/*
		 * 동전 개수 구하기
		 * 10 ~ 1000 사이의 난수 변수 담기
		 * 1의 자리는 반드시 0
		 * 발생된 난수를 각동전으로 바꿀 때 몇개씩 필요한지 판단하여 작성하기
		 * 가능한 동전의 갯수는 적게
		 */
		
		int[] coin = {500, 100, 50, 10};
		int money = r.nextInt(500)+1;
		money *= 10;
		System.out.printf("금액 : %d\n",money);
		for(int i = 0; i < coin.length; i++) {
			int X = money/coin[i];
			System.out.printf("%d원 : %d개\n",coin[i],X);
			money %= coin[i];
		}
		
		/*
		 * 로또번호 생성하기
		 * 1 ~ 45사이의 난수를 발생시켜 로또번호를 생성하는 프로그램 만들기.
		 */
		int[] lotto = new int[6];
		outer:for(int i = 0; i < lotto.length;) {
			lotto[i] = r.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
			}
			System.out.print(lotto[i]+" ");
			i++;
		}
		
	
		

	}

}
