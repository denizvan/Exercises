public class NKuTel {
    public static void main(String[] args) {
        calculateCharge('r', 20);  // $5.00
        calculateCharge('r', 80);  // $7.00
        calculateCharge('c', 20);  // $4.00
        calculateCharge('c', 400); // $75.00
        calculateCharge('t', 400); // Invalid client type
        calculateCharge('c', -10); // Invalid number of minutes
        calculateCharge('c', 11000); // Invalid number of minutes
    }

    //    The local telephone company NkuTel offers long distance phone service to residential and commercial
//    customers with separate rate structures for the two types of customer. Residential customers are charged a
//    weekly rate of $5 plus 10 cents per minute for each minute over 60. Commercial customers are charged 20
//    cents per minute for the first 300 minutes and for each minute over 300, the rate is 15 cents per minute. NkuTel
//    has hired you to write a program that its accounting department can use to compute the weekly long distance
//    bill for a customer.
    static void calculateCharge(char type, int minutes) {
        System.out.println("type: " + type + " minutes: " + minutes);

//    Ask the user to enter the type of account, r for a residential customer or c for a commercial customer. This
//    will be stored in a variable of type char. If the response is neither the letter r nor the letter c then give an error
//    message. You compare characters like you compare integers, using == for equality as in (type==‘r’)
//    and != for inequality as in (type!=‘r’) (assuming the variable is called type).
        if (type != 'r' && type != 'c') {
            System.out.println("Error: Invalid client type: " + type);
            return;
        }

//    Ask the user to enter the number of minutes the customer used NkuTel
//    services for that given week and store that response in an int variable. Test to make sure the number of minutes
//    is valid (greater than or equal to 0 and less than or equal to the total number of minutes in 1 week – you will
//    have to compute this yourself). If the minutes is invalid, output an error message, otherwise continue.
        double minutesIn1Week = 60 * 24 * 7;
        if (!(minutes >= 0 && minutes <= (60 * 24 * 7))) {
            System.out.println("Error: Invalid minutes: " + minutes);
            return;
        }

//    If valid, continue by computing the cost. The structure for this computation will be a nested if-else structure.
//    First, you will have to see if the type is ‘r’ or ‘c’. If it is an ‘r’, then you will have to test to see if minutes is
//    less than or equal to 60 for one computation or greater than for another. You would similarly need to break
//    down the commercial customers between those less than or equal to 300 minutes and those greater than. Below
//    is a skeleton for what this code will look like.
//    After computing the cost, output the user’s type, total minutes and total cost.
        //    Commercial customers are charged 20 cents per minute for the first 300 minutes and
        //    for each minute over 300, the rate is 15 cents per minute.
        if (type == 'r') {
//    Residential customers are charged a weekly rate of $5 plus 10 cents per minute for each minute over 60.
            if (minutes <= 60) {
                double cost = (5);
                System.out.println(" Cost: " + cost);

                // residential minutes over 60 here
            } else {
                if (minutes >= 60) {
                    double cost = (5 + (minutes - 60) * 0.10);
                    System.out.println("Cost:" +cost);
                }

            }

        } else {
//    Commercial customers are charged 20 cents per minute for the first 300 minutes and
//    for each minute over 300, the rate is 15 cents per minute.
            double cost;
            if (minutes <= 300) {
                cost = (minutes * (0.20));

                System.out.println("Cost c < 300: " + cost);

            } else {
                cost = 300 * 0.20  + 0.15 * (minutes - 300);
                System.out.println("Cost: c > 300: " + cost);

 //15 cents for each minute over 300 plus 20 cents for the first 300 minutes.
            }
        }
    }
}