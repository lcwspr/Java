/*
* @Author: lcwspr
* @Date:   2019-09-02 14:02:52
* @Last Modified by:   lcwspr
* @Last Modified time: 2019-09-02 14:09:45
*/
import java.util.Arrays;

public class Demo02_ReverseArr{
	public static void main(String[] args){
		int [] arr = {4, 35, 22, 1, 34, 53, 6, 35, 64};
		int start = 0;
		int end = arr.length - 1;
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start ++;
			end --;
		}
		System.out.println(Arrays.toString(arr));
	}
}