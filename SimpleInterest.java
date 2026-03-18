// WAP to Calculate simpple interest using command line argument 

public class SimpleInterest {
    public static void main(String[] args) {
        
        // Check if proper arguments are passed
        if(args.length != 3){
            System.out.println("Usage: java Main <Principal> <Rate> <Time>");
            return;
        }

        // Convert command line arguments (String → double)
        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        // Calculate Simple Interest
        double si = (p * r * t) / 100;

        // Display result
        System.out.println("Simple Interest = " + si);
    }
}
