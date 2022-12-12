public class NKuTel {
    public static void main(String[] args) {
        calculateCharge('r', 20);  // $5.00
        calculateCharge('r', 80);  // $7.00
        calculateCharge('c', 20);  // $4.00
        calculateCharge('c', 400); // $75.00
        calculateCharge('t', 400); // Invalid client type
        calculateCharge('c', -10); // Invalid number of minutes
        calculateCharge('c', -11000); // Invalid number of minutes
    }

    //    The local telephone company NkuTel offers long distance phone service to residential and commercial
//    customers with separate rate structures for the two types of customer. Residential customers are charged a
//    weekly rate of $5 plus 10 cents per minute for each minute over 60. Commercial customers are charged 20
//    cents per minute for the first 300 minutes and for each minute over 300, the rate is 15 cents per minute. NkuTel
//    has hired you to write a program that its accounting department can use to compute the weekly long distance
//    bill for a customer.
    static void calculateCharge(char type, int minutes) {

//    Ask the user to enter the type of account, r for a residential customer or c for a commercial customer. This
//    will be stored in a variable of type char. If the response is neither the letter r nor the letter c then give an error
//    message. You compare characters like you compare integers, using == for equality as in (type==‘r’)
//    and != for inequality as in (type!=‘r’) (assuming the variable is called type).
        // TODO: add check here

//    Ask the user to enter the number of minutes the customer used NkuTel
//    services for that given week and store that response in an int variable. Test to make sure the number of minutes
//    is valid (greater than or equal to 0 and less than or equal to the total number of minutes in 1 week – you will
//    have to compute this yourself). If the minutes is invalid, output an error message, otherwise continue.
        // TODO: add check here

//    If valid, continue by computing the cost. The structure for this computation will be a nested if-else structure.
//    First, you will have to see if the type is ‘r’ or ‘c’. If it is an ‘r’, then you will have to test to see if minutes is
//    less than or equal to 60 for one computation or greater than for another. You would similarly need to break
//    down the commercial customers between those less than or equal to 300 minutes and those greater than. Below
//    is a skeleton for what this code will look like.
//    After computing the cost, output the user’s type, total minutes and total cost.
        if (type == 'r') {
//    Residential customers are charged a weekly rate of $5 plus 10 cents per minute for each minute over 60.
            if (minutes <= 60) {
                // TODO: add code here
            } else // residential minutes over 60 here
            {
                // TODO: add code here
            }
        } else {
//    Commercial customers are charged 20 cents per minute for the first 300 minutes and
//    for each minute over 300, the rate is 15 cents per minute.
            if (minutes <= 300) {
                double cost;
                // TODO: add code here
            } else {
                double cost;
                // TODO: add code here
            }
        }

    }

}
