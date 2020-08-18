package Two;

import Practice.ImagePrinting;

public class ImagePrinting {
	
	static void AvgFinder(int[][][] image) {
		
		for(int i=0; i<image.length; i++){
			
			for(int j=0; j<image[i].length; j++) {
				int avg = 0;
				
				for(int k=0; k<image[i][j].length; k++) {
					
					avg += image[i][j][k];
					
				}
				for(int k=0; k<image[i][j].length; k++) {
					
					System.out.print(avg/3+" ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		int[] pixel1 = {255, 0, 0}; // Red
		int[] pixel2 = {0, 255, 0}; // Green
		int[] pixel3 = {0, 0, 255}; // Blue
		
		int[] pixel4 = {125, 111, 255};
		int[] pixel5 = {225, 211, 155};
		int[] pixel6 = {135, 101, 25};
		
		int[] pixel7 = {15, 11, 125};
		int[] pixel8 = {25, 11, 205};
		int[] pixel9 = {12, 11, 115};
		
		int[][][] image = {
				{pixel1, pixel2, pixel3},
				{pixel4, pixel5, pixel6},
				{pixel7, pixel8, pixel9},
		};
		
		for(int i=0; i<image.length; i++){
			
			for(int j=0; j<image[i].length; j++) {
				
				for(int k=0; k<image[i][j].length; k++) {
					
					System.out.print(image[i][j][k]+" ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("\nNow Rotating The Image 90 Degree To Clockwise\n\n");
		
		

for(int i=0; i<image.length; i++){
	int k=0;
	while(k<3) {
			
			for(int j=image[i].length-1; j>=0; j--) {
				
				System.out.print(image[i][j][k]+" ");
			}
			System.out.println();
			k++;
		}
	System.out.println();
		
	}
System.out.println("\nNow GrayScale of the Image\n\n");
ImagePrinting.AvgFinder(image);
	}

}
