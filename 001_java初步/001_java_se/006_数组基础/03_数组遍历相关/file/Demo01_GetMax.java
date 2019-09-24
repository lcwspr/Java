/*
* @Author: lcwspr
* @Date:   2019-09-02 13:57:58
* @Last Modified by:   lcwspr
* @Last Modified time: 2019-09-05 17:34:56
*/
public class Demo01_GetMax{
	public static void main(String [] args){
		int [] arr = {120, 119, 110, 528, 520};

		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}




