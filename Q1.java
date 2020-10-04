

public class Q1 {

	public static void main(String[] args) {
		float [] a=new float[args.length];
		float n =args.length;
        int i;
	float temp,sum=0;
		for( int k=0;k<n;k++) {
		  a[k]=Float.parseFloat(args[k]);
			
	}
		for(int l=0;l<n;l++)
		{
		for( i=0;i<n-1;i++) {
			if(Float.compare(a[i], a[i+1]) > 0) {
				 temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}}}
		for( int j=0;j<n;j++) {
			System.out.printf("%.2f ", a[j]);
			 sum = Float.sum(a[j],sum);
			}
		System.out.print("\nSum is ");
		System.out.printf("%.2f",sum);
		
}
}